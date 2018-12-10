package com.edit.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import com.edit.dao.Conexion;
import com.edit.model.Acceso;
import com.edit.model.Estado;
import com.edit.model.Marca;
import com.edit.model.Referencial;
import com.edit.model.Tipo_Cliente;
import com.edit.model.Tipo_Documento;
import com.edit.model.Tipo_Pago;
import com.edit.model.Tipo_Producto;


public class LogicaReferencial extends JFrame{

	private String Ssql="";
	private Connection con=Conexion.conectar();
	public LogicaReferencial(){
		
		
	}
	
	public void insert(JButton btn,Referencial r) {
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnGuardar(r);
				
			}
		});
	}
	
	
	
	public DefaultTableModel mostrarTodoReferencial(String tabla,String iniciales) {
		DefaultTableModel modelo;
		String []titulos = {"ID","Descripcion","Estado"};
		String []registro=new String[3];
		modelo=new DefaultTableModel(null, titulos) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		Ssql="select * FROM "+tabla;
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(Ssql);
			while(rs.next()) {
				registro[0]=rs.getString(iniciales+"Cod");
				registro[1]=rs.getString(iniciales+"Des");
				registro[2]=rs.getString("EstCod");
				modelo.addRow(registro);
			}
			return modelo;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return modelo;
	}
	
	public void btnGuardar(Referencial a) {
		if(a instanceof Acceso) {
			Ssql="insert into ACCESO (AccDes,EstCod) values (?,?)";

			try {
				PreparedStatement pst=con.prepareStatement(Ssql);
				//pst.setInt(1, a.getCodigo());
				pst.setString(1, a.getDescripcion());
				pst.setInt(2, a.getEstCod().getCodigo());
				pst.executeUpdate();



			}catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}
		if(a instanceof Tipo_Producto) {
			Ssql="insert into Tipo_Producto (TipProDes,EstCod) values (?,?)";

			try {
				PreparedStatement pst=con.prepareStatement(Ssql);
				//pst.setInt(1, a.getCodigo());
				pst.setString(1, a.getDescripcion());
				pst.setInt(2, a.getEstCod().getCodigo());
				pst.executeUpdate();



			}catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}
		if(a instanceof Estado) {
			Ssql="insert into Estado (estDes) values (?)";

			try {
				PreparedStatement pst=con.prepareStatement(Ssql);
				//pst.setInt(1, a.getCodigo());
				pst.setString(1, a.getDescripcion());
				
				pst.executeUpdate();



			}catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}
		if(a instanceof Marca) {
			Ssql="insert into Marca (MarDes,EstCod) values (?,?)";

			try {
				PreparedStatement pst=con.prepareStatement(Ssql);
				//pst.setInt(1, a.getCodigo());
				pst.setString(1, a.getDescripcion());
				pst.setInt(2, a.getEstCod().getCodigo());
				pst.executeUpdate();



			}catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}
		if(a instanceof Tipo_Cliente) {
			Ssql="insert into Tipo_Cliente (TipCliDes,EstCod) values (?,?)";

			try {
				PreparedStatement pst=con.prepareStatement(Ssql);
				//pst.setInt(1, a.getCodigo());
				pst.setString(1, a.getDescripcion());
				pst.setInt(2, a.getEstCod().getCodigo());
				pst.executeUpdate();



			}catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}
		if(a instanceof Tipo_Documento) {
			Ssql="insert into Tipo_Documento (TipDocDes,EstCod) values (?,?)";

			try {
				PreparedStatement pst=con.prepareStatement(Ssql);
				//pst.setInt(1, a.getCodigo());
				pst.setString(1, a.getDescripcion());
				pst.setInt(2, a.getEstCod().getCodigo());
				pst.executeUpdate();



			}catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}
		if(a instanceof Tipo_Pago) {
			Ssql="insert into 	Tipo_Pago (TipPagDes,EstCod) values (?,?)";

			try {
				PreparedStatement pst=con.prepareStatement(Ssql);
				//pst.setInt(1, a.getCodigo());
				pst.setString(1, a.getDescripcion());
				pst.setInt(2, a.getEstCod().getCodigo());
				pst.executeUpdate();



			}catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}

	}
	
	private ArrayList<String> MostrarJCombo(String Tabla,String Iniciales) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add(" ");
		String sql="Select "+Iniciales+"Des From "+ Tabla;
		try {
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery(sql);
			while(res.next()) {
				arr.add(res.getString(Iniciales+"Des"));
			}
			return arr;
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return arr;
	}
	
	private ArrayList<String> MostrarPerCombo(String Tabla,String Iniciales) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add(" ");
		String sql="Select " + Iniciales + "Nom From Persona, "+ Tabla +" where Persona.PerCod = Proveedor.PerCod";
		try {
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery(sql);
			while(res.next()) {
				arr.add(res.getString(Iniciales+"Non"));
			}
			return arr;
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return arr;
	}
	public void mostrarJCombo(String tabla,String ini,JComboBox jc) {
		ArrayList<String> arr=MostrarJCombo(tabla, ini);
		
		
		for(int i=0;i<arr.size();i++) {
			jc.addItem(arr.get(i));
		}
		
	}
	
	public void mostrarPCombo(String tabla,String ini,JComboBox jc) {
		ArrayList<String> arr=MostrarPerCombo(tabla, ini);
		
		
		for(int i=0;i<arr.size();i++) {
			jc.addItem(arr.get(i));
		}
		
	}

}
