package com.edit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.edit.model.Estado;
import com.edit.model.Persona;

public class EstadoDAOImpl implements EstadoDAO {
	private Connection cx;

	public EstadoDAOImpl() {
		cx = Conexion.conectar();
	}

	@Override
	public List<Estado> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Estado t) {
		try {
			String sql = "INSERT INTO ESTADO(EstCod, EstDes) VALUES (?,?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, t.getCodigo());
			preparedStatement.setString(2, t.getDescripcion());
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
	public void actualizar(Estado t) {
		// TODO Auto-generated method stub
		
	}

}
