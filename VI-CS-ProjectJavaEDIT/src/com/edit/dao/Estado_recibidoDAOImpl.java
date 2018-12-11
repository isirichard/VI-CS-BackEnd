package com.edit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.edit.model.Estado_recibido;

public class Estado_recibidoDAOImpl implements Estado_recibidoDAO{
	private Connection cx;
	public Estado_recibidoDAOImpl() {
		// TODO Auto-generated constructor stub
		cx = Conexion.conectar();
	}

	/**
	 * Este metodo sirve para mostrar el parametro descripcion de la tabla Estado recibido
	 * @param id - valor del parametro id de la tabla estado recibido
	 * @return - retorna la descripcion de la tabla estado recibido
	 */
	public int getEstadoRecibidoDescripcionPorId(int id) {
		int descripcion=-1;
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM `recibido` WHERE `RecCod`="+id);
			
			while (resultSet.next()) {
				descripcion = resultSet.getInt("RecDes");
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return descripcion;
	}
	
	
	@Override
	public List<Estado_recibido> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado_recibido listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Estado_recibido t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Estado_recibido t) {
		// TODO Auto-generated method stub
		
	}

}
