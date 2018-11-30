package com.edit.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.edit.dao.Conexion;
import com.edit.model.Acceso;
import com.edit.model.Cliente;
import com.edit.model.Colaborador;
import com.edit.model.Estado;
import com.edit.model.Persona;
import com.edit.model.Proveedor;
import com.edit.model.Tipo_Cliente;
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

	public boolean ValidarPersona(Persona p) {
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
					return true;
				}
			}

		}catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		return false;

	}

	public boolean validarCliente(Cliente c) {
		int resultado=0;
		String sql1="select Persona.perCod,Persona.TipDocCod,Persona.PerNro,Persona.PerNom,Persona.PerDir,Persona.PerTel,Persona.PerCel,Cliente.PerCod,Cliente.cliCod,Cliente.CliDip,Tipo_Cliente.TipCliDes,Cliente.TipCliCod  "
				+ "From Persona, Cliente,Tipo_Cliente "
				+ " where (Persona.TipDocCod='"+1+"' and Persona.PerNro='"+c.getPerNumDoc()+"') and Persona.perCod=Cliente.PerCod and Cliente.TipCliCod=Tipo_Cliente.TipCliCod" ;
		
		try {
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery(sql1);
//			
			if(rs1.next()) {
				resultado=1;
				if(resultado==1) {

					c.setPerCod(rs1.getInt("Persona.PerCod"));
					Tipo_Documento tipo=new Tipo_Documento();
					tipo.setCodigo(rs1.getInt("Persona.TipDocCod"));
					c.setPerTipDoc(tipo);
					Tipo_Cliente tipoCliente=new Tipo_Cliente();
					tipoCliente.setDescripcion(rs1.getString("Tipo_Cliente.TipCliDes"));
					tipoCliente.setCodigo(rs1.getInt("Cliente.TipCliCod"));
					c.setPerNumDoc(rs1.getString("Persona.PerNro"));
					c.setPerNom(rs1.getString("Persona.PerNom"));
					c.setPerDir(rs1.getString("Persona.PerDir"));
					c.setPerTel(rs1.getString("Persona.PerTel"));
					c.setPerCel(rs1.getString("Persona.PerCel"));
					c.setCliCod(rs1.getInt("Cliente.CliCod"));
					c.setLinea(rs1.getDouble("Cliente.CliDip"));
					c.setTipCliCod(tipoCliente);
					
					JOptionPane.showMessageDialog(null,"Cliente ya existe");
					return true;

				}
			}

//			



		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
			return false;
		}
		return false;

	}
	
	public boolean validarProveedor(Proveedor c) {
		int resultado=0;
		String sql1="select Persona.perCod,Persona.TipDocCod,Persona.PerNro,Persona.PerNom,Persona.PerDir,Persona.PerTel,Persona.PerCel,Proveedor.PerCod,Proveedor.ProvCod  "
				+ "From Persona, Proveedor"
				+ " where (Persona.TipDocCod='"+1+"' and Persona.PerNro='"+c.getPerNumDoc()+"') and Persona.perCod=Proveedor.PerCod" ;
		
		try {
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery(sql1);
//			
			if(rs1.next()) {
				resultado=1;
				if(resultado==1) {

					c.setPerCod(rs1.getInt("Persona.PerCod"));
					Tipo_Documento tipo=new Tipo_Documento();
					tipo.setCodigo(rs1.getInt("Persona.TipDocCod"));
					c.setPerTipDoc(tipo);
					c.setPerNumDoc(rs1.getString("Persona.PerNro"));
					c.setPerNom(rs1.getString("Persona.PerNom"));
					c.setPerDir(rs1.getString("Persona.PerDir"));
					c.setPerTel(rs1.getString("Persona.PerTel"));
					c.setPerCel(rs1.getString("Persona.PerCel"));
					c.setProvCod(rs1.getInt("Proveedor.ProvCod"));
					JOptionPane.showMessageDialog(null,"Proveedor ya existe");
					return true;

				}
			}

//			



		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
			return false;
		}
		return false;

	}

	
	public boolean validarColaborador(Colaborador c) {
		int resultado=0;
		String sql1="select Persona.perCod,Persona.TipDocCod,Persona.PerNro,Persona.PerNom,Persona.PerDir,Persona.PerTel,Persona.PerCel, "
				+ "Colaborador.PerCod,Colaborador.ColCod,Colaborador.ColUsu,Colaborador.ColPas, Acceso.accDes,Acceso.accCod "
				+ "From Persona, Colaborador,Acceso"
				+ " where (Persona.TipDocCod='"+1+"' and Persona.PerNro='"+c.getPerNumDoc()+"') and Persona.perCod=Colaborador.PerCod and Colaborador.AccCod=Acceso.AccCod" ;
		
		try {
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery(sql1);
//			
			if(rs1.next()) {
				resultado=1;
				if(resultado==1) {

					c.setPerCod(rs1.getInt("Persona.PerCod"));
					c.setColCod(rs1.getInt("Colaborador.ColCod"));
					Tipo_Documento tipo=new Tipo_Documento();
					tipo.setCodigo(rs1.getInt("Persona.TipDocCod"));
					c.setPerTipDoc(tipo);
					Acceso acceso=new Acceso();
					acceso.setDescripcion(rs1.getString("Acceso.accDes"));
					acceso.setCodigo(rs1.getInt("Acceso.accCod"));
					c.setPerNumDoc(rs1.getString("Persona.PerNro"));
					c.setPerNom(rs1.getString("Persona.PerNom"));
					c.setPerDir(rs1.getString("Persona.PerDir"));
					c.setPerTel(rs1.getString("Persona.PerTel"));
					c.setPerCel(rs1.getString("Persona.PerCel"));
					c.setColCod(rs1.getInt("Colaborador.ColCod"));
					c.setAccCod(acceso);
					c.setColUsu(rs1.getString("Colaborador.ColUsu"));
					c.setColPas(rs1.getString("Colaborador.ColPas"));
					JOptionPane.showMessageDialog(null,"Colaborador ya existe");
					return true;

				}
			}

//			



		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
			return false;
		}
		return false;

	}
}
