package com.edit.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import com.edit.dao.Conexion;
import com.edit.model.Cliente;
import com.edit.model.Proveedor;

public class Logica_Pedido {
	private Connection con=Conexion.conectar();
	public void BuscarProveedor(Proveedor p) {
		AsignarDatosCompletos(p);
		
	}
	private void AsignarDatosCompletos(Proveedor p) {
		String sql="SELECT Persona.PerCod,Persona.PerNom,Persona.PerDir,PerTel,PerCel,"
				+ "Proveedor.ProvCod "
				+ "FROM Proveedor, persona where (Persona.TipDocCod='"+p.getPerTipDoc().getCodigo()+"' and Persona.PerNro='"+p.getPerNumDoc()+"') "
				+ "AND (Persona.PerCod=proveedor.PerCod)";
		try {
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next()) {
				p.setProvCod(rs.getInt("ProvCod"));
				p.setPerCod(rs.getInt("PerCod"));
				p.setPerNom(rs.getString("PerNom"));
				p.setPerDir(rs.getString("PerDir"));
				p.setPerTel(rs.getString("PerTel"));
				p.setPerCel(rs.getString("PerCel"));
				
			}
			
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

	}
	private void AsignarCodigos(Proveedor p) {
		String sql="SELECT Persona.PerCod,Proveedor.ProvCod "
				+ "FROM Proveedor, persona where (Persona.TipDocCod='"+p.getPerTipDoc().getCodigo()+"' and Persona.PerNro='"+p.getPerNumDoc()+"') "
				+ "AND (Persona.PerCod=proveedor.PerCod)";
		try {
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next()) {
				p.setProvCod(rs.getInt("ProvCod"));
				p.setPerCod(rs.getInt("PerCod"));
				
			}
			
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
	public DefaultTableModel buscar(String s) {
		DefaultTableModel modelo;
		String []titulos = {"ID","Tipo_DOC","Numero DOC","Nombre"};
		String []registro=new String[4];
		modelo=new DefaultTableModel(null, titulos) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		String sql="select Proveedor.ProvCod,Tipo_Documento.TipDocDes,Persona.PerNro,Persona.PerNom FROM Proveedor,Tipo_Documento,Persona "
				+ " where Proveedor.perCod=Persona.PerCod and Persona.TipDocCod=Tipo_Documento.TipDocCod and upper(Persona.PerNom) LIKE upper('%"+s+"%')" ;
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				registro[0]=rs.getString("ProvCod");
				registro[1]=rs.getString("TipDocDes");
				registro[2]=rs.getString("PerNro");
				registro[3]=rs.getString("PerNom");
				modelo.addRow(registro);
			}
			return modelo;
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return modelo;
	}
	
}
