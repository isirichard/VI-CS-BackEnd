package com.edit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.edit.model.NotaPedidoCab;
import com.edit.model.NotaPedidoDet;

public class notaPedidoDetDAOImpl implements notaPedidoDetDAO{
	private Connection cx;
	public notaPedidoDetDAOImpl() {
		// TODO Auto-generated constructor stub
		cx = Conexion.conectar();
	}

	/**
	 * Este metodo muestra todo los movimientos anteriores de un proveedor
	 * @param id - valor que representa el id del proveedor
	 * @return - retorna una lista de los movimientos anteriores del proveedor
	 */
	public List<NotaPedidoDet> listarPorIdProv(int id) {
		// TODO Auto-generated method stub
		List<NotaPedidoDet> notapedidosDet = new ArrayList<NotaPedidoDet>();
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM `nota_pedido_det` WHERE `ProvCod` = "+id);
			int i=0;
			while (resultSet.next()) {
				NotaPedidoDet npd = new NotaPedidoDet();
				npd.setNotPedNro(resultSet.getInt("notPedNro"));
				npd.setNotPedCan(resultSet.getInt("notPedCan"));
				
				npd.setProvCod(resultSet.getInt("provCod"));
				npd.setProdCod(resultSet.getInt("prodCod"));
				
				npd.setNotPedTot(resultSet.getDouble("notPedTot"));
				npd.setNotPedPrePar(resultSet.getDouble("notPedPrePar"));
				npd.setNotPedSaldo(resultSet.getDouble("notPedSaldo"));
				
				notapedidosDet.add(npd);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notapedidosDet;
	}
	
	/**
	 * Este metodo lista todo los nota pedido detalle
	 */
	@Override
	public List<NotaPedidoDet> listarTodos() {
		// TODO Auto-generated method stub
		List<NotaPedidoDet> notapedidosDet = new ArrayList<NotaPedidoDet>();
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM nota_pedido_det");
			int i=0;
			while (resultSet.next()) {
				NotaPedidoDet npd = new NotaPedidoDet();
				npd.setNotPedNro(resultSet.getInt("notPedNro"));
				npd.setNotPedCan(resultSet.getInt("notPedCan"));
				
				npd.setProvCod(resultSet.getInt("provCod"));
				npd.setProdCod(resultSet.getInt("prodCod"));
				
				npd.setNotPedTot(resultSet.getDouble("notPedTot"));
				npd.setNotPedPrePar(resultSet.getDouble("notPedPrePar"));
				npd.setNotPedSaldo(resultSet.getDouble("notPedSaldo"));
				
				notapedidosDet.add(npd);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notapedidosDet;
	}

	@Override
	public NotaPedidoDet listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(NotaPedidoDet t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(NotaPedidoDet t) {
		// TODO Auto-generated method stub
		
	}

}
