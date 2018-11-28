package com.edit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.edit.model.Persona;
import com.edit.model.Tipo_Producto;

public class Tipo_ProductoDAOImpl implements Tipo_ProductoDAO{

	private Connection cx;
	
	public Tipo_ProductoDAOImpl() {
		// TODO Auto-generated constructor stub
		cx = Conexion.conectar();
	}

	@Override
	public List<Tipo_Producto> listarTodos() {
		// TODO Auto-generated method stub
		
		List<Tipo_Producto> Tipos = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM tipo_producto");
			while (resultSet.next()) {
				Tipo_Producto persona = new Tipo_Producto();
				//persona.setId(resultSet.getInt("id"));
				//persona.setNombres(resultSet.getString("nombres"));
				//persona.setApellidos(resultSet.getString("apellidos"));
				Tipos.add(persona);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Tipos;
		
	}

	@Override
	public Tipo_Producto listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Tipo_Producto t) {
		// TODO Auto-generated method stub
		try {
			String sql = "INSERT INTO TIPO_PRODUCTO(TipProCod, TipProDes,EstCod) VALUES (?,?,?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1,t.getCodigo());
			preparedStatement.setString(2, t.getDescripcion());
			preparedStatement.setInt(3,1);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public void eliminar(int PersonaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Tipo_Producto t) {
		// TODO Auto-generated method stub
		
	}

}
