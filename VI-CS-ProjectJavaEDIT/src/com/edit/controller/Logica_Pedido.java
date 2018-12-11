package com.edit.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.edit.dao.Conexion;
import com.edit.model.Cliente;
import com.edit.model.Inventario;
import com.edit.model.Nota_Pedido;
import com.edit.model.Proveedor;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 * Esta clase Realiza todo lo necesario para el registro de un Pedido
 * @author Andre Cruz
 *
 */
public class Logica_Pedido {
	private Connection con=Conexion.conectar();
	/**
	 * este metodo realiza una asignacion al proveedor si lo encuentra devuelve true y si no devuelve false
	 * @param p
	 * @return
	 */
	public boolean BuscarProveedor(Proveedor p) {
		if(AsignarDatosCompletos(p)) {
			
			return true;
		}
		else {
			
			return false;
		}
		
		
	}
	/**
	 * este metodo asigna los datos del proveedor ya encontrado a la clase proveedor
	 * @param p
	 * @return
	 */
	private boolean AsignarDatosCompletos(Proveedor p) {
		boolean encontrado=false;
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
				encontrado=true;
				
			}
			
		}catch (Exception e) {
			System.out.println(e);
			encontrado=false;
			// TODO: handle exception
		}
		return encontrado;

	}
	/**
	 * este metodo asigna codigos del proveedor y codigos de persona (PerCod y ProvCod)
	 * @param p
	 */
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
	/**
	 * este metodo busca al proveedor y los guarda en un arreglo y muestra en la tabla
	 * @param s
	 * @return
	 */
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
	
	/**
	 * este metodo busca el SKU de un producto y asigna los datos a la clase Producto
	 * @param i
	 */
	public void buscarSKU(Inventario i) {
		String sql="select Inventario.ProdCod,Producto.ProdDes,Inventario.ProPreVen From Producto,Inventario "
				+ "where Producto.prodCod=Inventario.ProdCod and Producto.ProSKU='"+i.getProdCod().getProSKU()+"'";
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				i.getProdCod().setProdCod(rs.getInt("ProdCod"));
				
				i.getProdCod().setProdDes(rs.getString("ProdDes"));
				i.setProPreVen(rs.getDouble("ProPreVen"));
			}
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
	/**
	 * En este metodo es el que realiza toda la insercion de una nota de Pedido
	 * @param nota
	 */
	public void RegistrarNotaPedido(Nota_Pedido nota) {
		String sql="Insert Into Nota_Pedido_Cab(NotPedFecEmiDia,NotPedFecEmiMes,NotPedFecEmiAno,NotPedFecPagDia,NotPedFecPagMes,NotPedFecPagAño,"
				+ "NotPedFecRecDia,NotPedFecRecMes,ColCod,TipPagCod,PagCoD,RecCod,EstCod) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String sql3="select NotPedNro from Nota_Pedido_Cab order by NotPedNro desc limit 1";
		String sql2="Insert Into Nota_Pedido_Det(NotPedNro,NotPedCan,ProvCod,ProdCod)"
				+ " values (?,?,?,?)";
		try {
			int n2=-1;
			PreparedStatement pst= con.prepareStatement(sql);
			PreparedStatement pst2=con.prepareStatement(sql2);
//			PreparedStatement pst2;
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql3);
			
			pst.setInt(1, nota.getDocFecEmiDia());
			pst.setInt(2, nota.getDocFecEmiMes());
			pst.setInt(3, nota.getDocFecEmiAño());
			pst.setInt(4, nota.getFecPagoDia());
			pst.setInt(5, nota.getFecPagoMes());
			pst.setInt(6, nota.getFecPagoAño());
			pst.setInt(7, nota.getFecRecepcionDia());
			pst.setInt(8, nota.getFecRecepcionMes());
			pst.setInt(8, nota.getFecRecepcionAño());
			pst.setInt(9, nota.getColCod().getColCod());
			pst.setInt(10, nota.getPagCod().getCodigo());
			pst.setInt(11, nota.getRecibido().getPagCod());
			pst.setInt(12, nota.getEstadoPago().getPagCod());
			pst.setInt(13, 1);
			while(rs.next()) {
				nota.setCodNotPed(rs.getInt("NotPedNro"));
			}
			
			//nota detalle
			for(int i=0;i<nota.getInventario().size();i++) {
				System.out.println(nota.getCodNotPed());
				pst2.setInt(1,nota.getCodNotPed());
				pst2.setInt(2, nota.getCantidad());
//				pst2.setInt(2, nota.getInventario().get(i).getProvCod().getProvCod());
				pst2.setInt(3, nota.getProvCod().getProvCod());
				
				pst2.setInt(4,nota.getInventario().get(i).getProdCod().getProdCod() );
				n2=pst2.executeUpdate();
			}
			

			int n=pst.executeUpdate();

			if(n!=0) {
				JOptionPane.showMessageDialog(null,"Registro Exitoso");

				
				if(n2!=0) {
					JOptionPane.showMessageDialog(null,"Nota Registrado");
					
				}
			}
			}catch (Exception e) {
			System.out.println(e);
						// TODO: handle exception
		}
		
	}
	/**
	 * Registra el inventario en la Nota de Pedido
	 * @param nota
	 */
	public void registrarInventario(Nota_Pedido nota) {
		String sql="Insert Into Inventario(ProvCod,ProdCod,ProPreCom,ProPreVen,InvProStk) values(?,?,?,?,?)";
		try {
			PreparedStatement pst= con.prepareStatement(sql);
			
			for(int i=0;i<nota.getInventario().size();i++) {
				pst.setInt(1, nota.getProvCod().getProvCod());
				pst.setInt(2, nota.getInventario().get(i).getProdCod().getProdCod());
				pst.setDouble(3, nota.getInventario().get(i).getProPreCom());
				pst.setDouble(4, nota.getInventario().get(i).getProPreVen());
				pst.setInt(5, nota.getInventario().get(i).getStock());
			}
			
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
	}
	public void actualizarInventario() {
		
	}
	/**
	 * Imprime el reporte de la nota de pedido
	 */
	public void imprimirReporte() {
		Map p=new  HashMap();
		JasperReport report;
		JasperPrint print;
		try {
			report=JasperCompileManager.compileReport(new File("").getAbsolutePath()+"/src/Report/PRUEBA.jrxml");
			print=JasperFillManager.fillReport(report, p,con);
			JasperViewer view= new JasperViewer(print,false);
			view.setTitle("Nota Pedido");
			view.setVisible(true);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
}
