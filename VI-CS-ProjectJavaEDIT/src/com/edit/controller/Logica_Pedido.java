package com.edit.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
}
