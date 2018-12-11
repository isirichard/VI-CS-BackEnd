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

	/**
	 * Este metodo sirve para listar todos los pedidos cabecera
	 */
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
	
	/**
	  * Este metodo muestra todo los movimientos anteriores en base al Colaborador
	 * @param ColCod - valor que representa el id del colaborador
	 * @return - retorna una lista de los movimientos anteriores en base al colaborador
	 */
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




	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
