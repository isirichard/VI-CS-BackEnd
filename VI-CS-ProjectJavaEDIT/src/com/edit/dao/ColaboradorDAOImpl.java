package com.edit.dao;

import java.sql.PreparedStatement;
import java.util.List;

import com.edit.model.Colaborador;
import com.edit.model.Usuario;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class ColaboradorDAOImpl implements ColaboradorDAO {
	private Connection cx;
	public ColaboradorDAOImpl() {
		cx = Conexion.conectar();
	}


	@Override
	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Usuario t) {
		try {
			String sql = "INSERT INTO COLABORADOR(PerCod, ColUsu, ColPas, AccCod, EstCod) VALUES (?,?,?,?,?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);

			preparedStatement.setLong(1, t.getColaborador().getCodigo());
			preparedStatement.setString(2, t.getUsuario());
			preparedStatement.setString(3, t.getPassword());
			preparedStatement.setLong(4, t.getColaborador().getAcceso().getCodigo());
			preparedStatement.setLong(5, 1);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Usuario t) {
		// TODO Auto-generated method stub
		
	}



}
