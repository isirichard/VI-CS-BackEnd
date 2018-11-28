package com.edit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.edit.model.Acceso;
import com.edit.model.Estado;
import com.edit.model.Persona;

public class AccesoDAOImpl implements AccesoDAO{
	private Connection cx;
	public AccesoDAOImpl() {
		// TODO Auto-generated constructor stub
		cx = Conexion.conectar();
	}

	@Override
	public List<Acceso> listarTodos() {
		// TODO Auto-generated method stub
		List<Acceso> accesos = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM acceso");
			
			
			
			while (resultSet.next()) {
				Acceso ac = new Acceso();
				ac.setCodigo(resultSet.getInt(1));
				ac.setDescripcion(resultSet.getString(2));
				Estado e= new Estado();
				//e.setCodigo(resultSet.getInt(3));
				
				e.setDescripcion(DescripcionEstado(resultSet.getInt(3)));
				ac.setEstado(e);
				
				
				accesos.add(ac);
			System.out.println(ac.getDescripcion());
			}
			
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accesos;	
		
	}

	public String DescripcionEstado(int id) {
		String descrip = null;
		try {
			Statement st = cx.createStatement();
			String sql = "SELECT * FROM `estado` WHERE `EstCod`="+id;
			ResultSet rs = st.executeQuery(sql);

			
			while(rs.next()) {
				
				descrip = rs.getString(2);
				
				
				
			}
		
		}catch(Exception e) {
			System.out.println("errorfsdfsdf");
		}
		return descrip;
	}
	
	
	@Override
	public Acceso listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Acceso t) {
		// TODO Auto-generated method stub
		try {
			String sql = "INSERT INTO ACCESO(AccCod, AccDes,EstCod) VALUES (?,?,?)";
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
	public void actualizar(Acceso t) {
		// TODO Auto-generated method stub
		
	}

}
