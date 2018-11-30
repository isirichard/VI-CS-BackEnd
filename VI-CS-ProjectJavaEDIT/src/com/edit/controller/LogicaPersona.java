package com.edit.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.edit.dao.Conexion;
import com.edit.model.Cliente;
import com.edit.model.Estado;
import com.edit.model.Persona;
import com.edit.model.Tipo_Documento;



public class LogicaPersona {
	private Connection con=Conexion.conectar();
	private String Sql="";
	public LogicaPersona() {
		
	}
	public void InsertarCliente(Cliente c) {
	
		Sql="INSERT INTO PERSONA(PerNro,PerNom,PerDir,PerTel,PerCel,TipDocCod,EstCod"
				+ " values (?,?,?,?,?,?,?)";
		String sql2="INSERT INTO CLIENTE(PerCod,TipCliCod,EstCod) "
				+ "values ((select PerCod from Persona order by PerCod desc limit 1),?,?)";
		try {
			PreparedStatement pst= con.prepareStatement(Sql);
			PreparedStatement pst2=con.prepareStatement(sql2);
			
			
			pst.setString(1, c.getPerNumDoc());
			pst.setString(2, c.getPerNom());
			pst.setString(3, c.getPerDir());
			pst.setString(4, c.getPerTel());
			pst.setString(5, c.getPerCel());
			pst.setInt(6, c.getPerTipDoc().getCodigo());
			pst.setInt(7, c.getPerEst().getCodigo());
			
			pst2.setInt(1, c.getTipCliCod().getCodigo());
			pst2.setInt(2, c.getEstCodCli().getCodigo());
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void ValidarPersona(Persona p) {
		int resultado=0;
		String sql="select Persona.perCod,Persona.TipDocCod,Persona.PerNro,Persona.PerNom,Persona.PerDir,Persona.PerTel,Persona.PerCel "
				+ "From Persona "
				+ "where Persona.TipDocCod='"+1+"' and Persona.PerNro='"+p.getPerNumDoc()+"'" ;
//		p.getPerTipDoc().getCodigo()
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next()) {
				resultado=1;
				if(resultado==1) {
					
					p.setPerCod(rs.getInt("PerCod"));
					Tipo_Documento tipo=new Tipo_Documento();
					tipo.setCodigo(rs.getInt("TipDocCod"));
					p.setPerTipDoc(tipo);
					p.setPerNumDoc(rs.getString("PerNro"));
					p.setPerNom(rs.getString("PerNom"));
					p.setPerDir(rs.getString("PerDir"));
					p.setPerTel(rs.getString("PerTel"));
					p.setPerCel(rs.getString("PerCel"));
					JOptionPane.showMessageDialog(null,"Persona Encontrada");
					
				}
			}
			
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
	}

}
