package com.edit.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.edit.model.Persona;

public class PersonaDAOImpl implements IPersonaDAO {

	private Connection cx;

	public PersonaDAOImpl() {
		cx = Conexion.conectar();
	}

	@Override
	public void agregar(Persona persona) {
		try {
			String sql = "INSERT INTO PERSONA(TipDocCod, PerNro, PerNom, PerDir, PerTel, PerCel, EstCod) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);

			preparedStatement.setLong(1, persona.getTipoDocumento().getCodigo());
			preparedStatement.setString(2, persona.getNumeroDocumento());
			preparedStatement.setString(3, persona.getNombre());
			preparedStatement.setString(4, persona.getDireccion());
			preparedStatement.setString(5, persona.getTelefono());
			preparedStatement.setString(6, persona.getCeluar());
			preparedStatement.setLong(7, 1);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(int id) {
		try {
			String sql = "DELETE FROM PERSONA WHERE ID = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Persona persona) {
		try {
			String sql = "UPDATE PERSONA SET NOMBRES = ?, APELLIDOS = ? WHERE ID = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			// preparedStatement.setString(1, persona.getNombres());
			// preparedStatement.setString(2, persona.getApellidos());
			// preparedStatement.setInt(3, persona.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Persona> listarTodos() {
		List<Persona> personas = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Persona");
			while (resultSet.next()) {
				Persona persona = new Persona();
				// persona.setId(resultSet.getInt("id"));
				// persona.setNombres(resultSet.getString("nombres"));
				// persona.setApellidos(resultSet.getString("apellidos"));
				personas.add(persona);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return personas;
	}

	@Override
	public Persona listarPorId(int id) {
		Persona persona = new Persona();
		try {
			String query = "SELECT * FROM PERSONA WHERE ID =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				// persona.setId(resultSet.getInt("id"));
				// persona.setNombres(resultSet.getString("nombres"));
				// persona.setApellidos(resultSet.getString("apellidos"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persona;
	}

	public Persona UltimoRegistro() {
		Persona persona = new Persona();
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT*FROM persona order by PerCod desc limit 1");
            //System.out.println( resultSet.getInt("PerCod") + " " + resultSet.getString("PerNom")+" " +resultSet.getString("PerApe") );
			if(resultSet.next()){
			persona.setCodigo(resultSet.getInt("PerCod"));
			persona.setNombre(resultSet.getString("PerNom"));
		
			}
			  System.out.println("acabe de sacar");
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persona;
	}

}
