package com.edit.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.edit.model.Estado;
import com.edit.model.Persona;
import com.edit.model.Proveedor;
import com.edit.view.FrmBuscarProveedor;
import com.edit.view.FrmServicioProveedor;
/**
 *Esta clase buscara los datos del Proveedor
 *en la base de datos, lo referente a sus datos, actualizacion 
 *@author grupo
 */
public class BusquedaProveedorDAOImpl implements IBusquedaProveedorDAO {

	private Connection cx;
	String RUC = "as";
	private FrmBuscarProveedor nuevaBusqueda;
	protected FrmServicioProveedor datosRecibidosBusqueda;
	private Proveedor proveedor;
    /**
     * Este constructor iniciara una conexion
     */
	public BusquedaProveedorDAOImpl() {
		cx = Conexion.conectar();
		proveedor = new Proveedor();
	}
    /**
     * Permite recibir una cadena la cual sera en numero de documento
     * y buscar en la base de datos a traves del numero de documento del proveedor
     * @param doc - este sera en numero de documento del proveedor
     */
	@Override
	public Proveedor obtenerDatos(String doc) {
		System.out.println(doc);
		String sql = "SELECT proveedor.ProvCod, proveedor.PerCod, proveedor.ProDeuAct, proveedor.ProDeuAtr, proveedor.ProDeuTot, proveedor.ProCal, proveedor.EstCod, persona.TipDocCod, persona.PerNro, persona.PerNom, persona.PerDir, persona.PerTel, persona.PerCel"
				+ " FROM proveedor" + " INNER JOIN persona ON proveedor.PerCod = persona.PerCod" + " WHERE "
				+ "persona.PerNro = " + doc;

		try {

			Statement st = cx.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				proveedor.setPerCod(rs.getInt("ProvCod"));
				proveedor.setPerCod(rs.getInt("PerCod"));
				proveedor.setProDeuAct(rs.getDouble("ProDeuAct"));
				proveedor.setProDeuAtr(rs.getDouble("ProDeuAtr"));
				proveedor.setProDeuTot(rs.getDouble("ProDeuTot"));
				System.out.println("asdas" + rs.getString("ProCal"));

				System.out.println(rs.getInt("TipDocCod"));
				proveedor.setPerNumDoc((rs.getString("PerNro")));
				proveedor.setPerNom(rs.getString("PerNom"));
				proveedor.setPerDir(rs.getString("PerDir"));
				proveedor.setPerTel(rs.getString("PerTel"));
				proveedor.setPerCel(rs.getString("PerCel"));
				//cx.close();

			}

		} catch (Exception e) {
			System.out.println(e);

			// TODO: handle exception
		}
		return proveedor;

	}
    /**
     * Consultara el estado del proveedor en la base de datos
     * @param id - sera el codigo de estado del proveedor
     * @return - retornara la descripcion del estado
     */
	public String DescripcionEstado(int id) {
		String descrip = null;
		try {
			Statement st = cx.createStatement();
			String sql = "SELECT * FROM `estado` WHERE `EstCod`=" + id;

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

				descrip = rs.getString(2);
			}
			//cx.close();
		} catch (Exception e) {
			System.out.println("errorfsdfsdf");
		}

		return descrip;
	}
    /**
     * Este metodo se encargara de actualizar un registro en la base de datos
     * @param proveedor - este objeto contendra todos los datos a modificar
     */
	public void actualizarProveedor(Proveedor proveedor){
		System.out.println(proveedor.getPerCod());
			
			String sSQL = "UPDATE persona SET PerDir='"+ proveedor.getPerDir()+"', PerTel='"+proveedor.getPerTel()+"',PerCel='"+proveedor.getPerCel()+"' WHERE PerCod="+proveedor.getPerCod();
		int res = 0;
		 
		try
		{
			PreparedStatement st = cx.prepareStatement(sSQL);
			res = st.executeUpdate();
	      
			if(res==1) {
				JOptionPane.showMessageDialog(null, "Se ha actualizado los datos");
			}else {
				JOptionPane.showMessageDialog(null, "Ninguna modificacion realizada");
			}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	
	}
	

}
