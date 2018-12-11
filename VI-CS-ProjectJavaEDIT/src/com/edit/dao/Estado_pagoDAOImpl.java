package com.edit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.edit.model.Estado_pago1;
import com.edit.model.NotaPedidoCab;

public class Estado_pagoDAOImpl implements Estado_pagoDAO{
	private Connection cx;
	public Estado_pagoDAOImpl() {
		// TODO Auto-generated constructor stub
		cx = Conexion.conectar();
	}

	public int getEstadoPagoDescripcionPorId(int id) {
		int descripcion=-1;
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM `estado_pago` WHERE `PagCod`="+id);
			
			while (resultSet.next()) {
				descripcion = resultSet.getInt("PagDes");
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return descripcion;
	}
	
	
	@Override
	public List<Estado_pago1> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado_pago1 listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Estado_pago1 t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Estado_pago1 t) {
		// TODO Auto-generated method stub
		
	}

}
