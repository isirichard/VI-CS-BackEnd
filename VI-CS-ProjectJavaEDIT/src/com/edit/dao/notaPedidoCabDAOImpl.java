package com.edit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.edit.model.NotaPedidoCab;
import com.edit.model.Persona;

public class notaPedidoCabDAOImpl  implements notaPedidoCabDAO{

	private Connection cx;

	public notaPedidoCabDAOImpl() {
		cx = Conexion.conectar();
	}

	public void agregar(Persona persona) {
		try {
			String sql = "INSERT INTO PERSONA(nombres, apellidos) VALUES (?,?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			//preparedStatement.setString(1, persona.getNombres());
			//preparedStatement.setString(2, persona.getApellidos());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
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

	
	public void actualizar(Persona persona) {
		try {
			String sql = "UPDATE PERSONA SET NOMBRES = ?, APELLIDOS = ? WHERE ID = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			//preparedStatement.setString(1, persona.getNombres());
			//preparedStatement.setString(2, persona.getApellidos());
			//preparedStatement.setInt(3, persona.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	

	
	public Persona listarPorIrd(int id) {
		Persona persona = new Persona();
		try {
			String query = "SELECT * FROM PERSONA WHERE ID =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				//persona.setId(resultSet.getInt("id"));
				//persona.setNombres(resultSet.getString("nombres"));
				//persona.setApellidos(resultSet.getString("apellidos"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persona;
	}

	@Override
	public NotaPedidoCab listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(NotaPedidoCab t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(NotaPedidoCab t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NotaPedidoCab> listarTodos() {
		// TODO Auto-generated method stub
		List<NotaPedidoCab> notapedidosCab = new ArrayList<NotaPedidoCab>();
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM nota_pedido_cab");
			int i=0;
			while (resultSet.next()) {
				NotaPedidoCab npc = new NotaPedidoCab();
				npc.setNotPedNro(resultSet.getInt("notPedNro"));
				npc.setNotPedFecEmiDia(resultSet.getInt("notPedFecEmiDia"));
				npc.setNotPedFecEmiMes(resultSet.getInt("notPedFecEmiMes"));
				npc.setNotPedFecEmiAño(resultSet.getInt("notPedFecEmiAno"));
				
				npc.setNotPedFecPagDia(resultSet.getInt("notPedFecPagDia"));
				npc.setNotPedFecPagMes(resultSet.getInt("notPedFecPagMes"));
				npc.setNotPedFecPagAño(resultSet.getInt("notPedFecPagAño"));
				
				npc.setNotPedFecRecDia(resultSet.getInt("notPedFecRecDia"));
				npc.setNotPedFecRecMes(resultSet.getInt("notPedFecRecMes"));
				npc.setNotPedFecRecAño(resultSet.getInt("notPedFecRecAño"));
				
				
				npc.setNotPedFecPagEmiDia(resultSet.getString("notPedFecPagEmiDia"));
				npc.setNotPedFecPagEmiMes(resultSet.getString("notPedFecPagEmiMes"));
				npc.setNotPedFecPagEmiAño(resultSet.getString("notPedFecPagEmiAño"));

				
				npc.setColCod(resultSet.getInt("colCod"));
				npc.setTipPagCod(resultSet.getInt("tipPagCod"));
				npc.setPagCoc(resultSet.getInt("pagCod"));
				npc.setRecCod(resultSet.getInt("recCod"));
				npc.setEstCod(resultSet.getInt("estCod"));
				//persona.setId(resultSet.getInt("id"));
				//persona.setNombres(resultSet.getString("nombres"));
				//persona.setApellidos(resultSet.getString("apellidos"));
				notapedidosCab.add(npc);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notapedidosCab;
	}
	
	public List<NotaPedidoCab> listarTodosPorColId(int ColCod) {
		// TODO Auto-generated method stub
		List<NotaPedidoCab> notapedidosCab = new ArrayList<NotaPedidoCab>();
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM `nota_pedido_cab` WHERE `ColCod` = "+ColCod);
			
			while (resultSet.next()) {
				NotaPedidoCab npc = new NotaPedidoCab();
				npc.setNotPedNro(resultSet.getInt("notPedNro"));
				npc.setNotPedFecEmiDia(resultSet.getInt("notPedFecEmiDia"));
				npc.setNotPedFecEmiMes(resultSet.getInt("notPedFecEmiMes"));
				npc.setNotPedFecEmiAño(resultSet.getInt("notPedFecEmiAno"));
				
				npc.setNotPedFecPagDia(resultSet.getInt("notPedFecPagDia"));
				npc.setNotPedFecPagMes(resultSet.getInt("notPedFecPagMes"));
				npc.setNotPedFecPagAño(resultSet.getInt("notPedFecPagAño"));
				
				npc.setNotPedFecRecDia(resultSet.getInt("notPedFecRecDia"));
				npc.setNotPedFecRecMes(resultSet.getInt("notPedFecRecMes"));
				npc.setNotPedFecRecAño(resultSet.getInt("notPedFecRecAño"));
				
				
				npc.setNotPedFecPagEmiDia(resultSet.getString("notPedFecPagEmiDia"));
				npc.setNotPedFecPagEmiMes(resultSet.getString("notPedFecPagEmiMes"));
				npc.setNotPedFecPagEmiAño(resultSet.getString("notPedFecPagEmiAño"));

				
				npc.setColCod(resultSet.getInt("colCod"));
				npc.setTipPagCod(resultSet.getInt("tipPagCod"));
				npc.setPagCoc(resultSet.getInt("pagCod"));
				npc.setRecCod(resultSet.getInt("recCod"));
				npc.setEstCod(resultSet.getInt("estCod"));
				//persona.setId(resultSet.getInt("id"));
				//persona.setNombres(resultSet.getString("nombres"));
				//persona.setApellidos(resultSet.getString("apellidos"));
				notapedidosCab.add(npc);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notapedidosCab;
	}

	
	
	
}
