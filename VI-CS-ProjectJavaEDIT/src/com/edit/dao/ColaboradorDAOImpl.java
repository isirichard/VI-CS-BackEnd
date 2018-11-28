package com.edit.dao;

<<<<<<< HEAD
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
=======
import java.util.List;

import com.edit.model.Colaborador;
import com.edit.model.Persona;

public class ColaboradorDAOImpl implements ColaboradorDAO{

	public ColaboradorDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Colaborador> listarTodos() {
>>>>>>> e24174e866ff4dc0a173328f6ae678157ad3720f
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public Usuario listarPorId(int id) {
=======
	public Colaborador listarPorId(int id) {
>>>>>>> e24174e866ff4dc0a173328f6ae678157ad3720f
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
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
=======
	public void agregar(Colaborador t) {
		// TODO Auto-generated method stub
>>>>>>> e24174e866ff4dc0a173328f6ae678157ad3720f
		
	}

	@Override
<<<<<<< HEAD
	public void eliminar(int id) {
=======
	public void eliminar(int PersonaId) {
>>>>>>> e24174e866ff4dc0a173328f6ae678157ad3720f
		// TODO Auto-generated method stub
		
	}

	@Override
<<<<<<< HEAD
	public void actualizar(Usuario t) {
=======
	public void actualizar(Colaborador t) {
>>>>>>> e24174e866ff4dc0a173328f6ae678157ad3720f
		// TODO Auto-generated method stub
		
	}

<<<<<<< HEAD


=======
>>>>>>> e24174e866ff4dc0a173328f6ae678157ad3720f
}
