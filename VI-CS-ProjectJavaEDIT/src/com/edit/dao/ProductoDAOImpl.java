package com.edit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.edit.model.Producto;

public class ProductoDAOImpl implements ProductoDAO{

	private Connection cx;
	public ProductoDAOImpl() {
		// TODO Auto-generated constructor stub
		cx = Conexion.conectar();
	}

	
	public String getProductoDescripcionPorId(int id) {
		String descripcion="a";
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM `producto` WHERE `ProdCod`="+id);
			
			while (resultSet.next()) {
				descripcion = resultSet.getString("ProdDes");
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return descripcion;
	}
	
	
	@Override
	public List<Producto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Producto t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Producto t) {
		// TODO Auto-generated method stub
		
	}

}
