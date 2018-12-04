package com.edit.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.edit.dao.Conexion;
import com.edit.model.Cliente;
import com.edit.model.Inventario;
import com.edit.model.Producto;

public class LogicaProducto {
	private Connection con=Conexion.conectar();
	private String Sql="", sql2, sql3;
	
	public LogicaProducto() {
		
	}
	public boolean InsertarProducto(Inventario i) {
		
//	Crear el Producto en la BD
		/*
		 * NOTA: ProdSku no está en la BD como un atributo de Producto, ¡Revisar!
		 */
		Sql="INSERT INTO PRODUCTO(ProdDes,ProdSku,TipProCod,MarCod,ProStk,UniMedCod,EstCod"
				+ " values (?,?,?,?,?,?,?)";
//	Agregar al Inventario seleccionando el Proveedor y Producto 
		sql2="INSERT INTO INVENTARIO(ProvCod,ProdCod,ProPreCom,ProPreVen,InvProStk) "
				+ "values ((select ProvCod from Proveedor order by ProvCod desc limit 1),"
				+ "(select ProdCod from Producto order by ProdCod desc limit 1),?,?,?)";
//	Seleccionar el stok actal para sumarlo al stok ingresado
		sql3 = "select InvProStk From Inventario where ProvCod='" + i.getProv().getProvCod() 
				+ "' AND ProdCod='" + i.getProdCod().getProdCod() + "'";
		try {
//	Ingresar el producto llamando desde el inventario ingresado en FrmRegistrarProducto
			PreparedStatement pst = con.prepareStatement(Sql);
			pst.setString(1, i.getProdCod().getProdDes());
			pst.setInt(2, i.getProdCod().getProSKU());
			pst.setInt(3, i.getProdCod().getTipProCod().getCodigo());
			pst.setInt(4, i.getProdCod().getMarCod().getCodigo());
			pst.setInt(5, i.getProdCod().getProStk());
			pst.setInt(6, i.getProdCod().getUniMedCod().getCodigo());
			pst.setInt(7, 1);
			pst.executeUpdate();
//			System.out.println("registra producto");
			
//	Agregar al Inventario el producto
			PreparedStatement pst2 = con.prepareStatement(sql2);
			pst2.setInt(1, i.getProv().getProvCod());
			pst2.setInt(2, i.getProdCod().getProdCod());
			pst2.setInt(3, i.getProPreCom());
			pst2.setInt(4, i.getProPreVen());
			
			System.out.println("registra producto en el inventario");
			Statement st = con.createStatement();
			
//	Aquí se hace la agregación del stok en el inventario en el caso de haber un stok anteriormente 
			ResultSet rs1 = st.executeQuery(sql3);
			if(rs1.next()) {
				
				i.setProStk(rs1.getInt("InvProStk") + i.getProdCod().getProStk());
				pst2.setInt(5, i.getProdCod().getProStk());
				pst2.executeUpdate();
				
				JOptionPane.showMessageDialog(null,"Producto Creado");
			}


		}catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		return false;
	}

}
