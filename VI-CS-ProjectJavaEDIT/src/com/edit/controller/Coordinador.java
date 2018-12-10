package com.edit.controller;

import java.util.ArrayList;
import java.util.List;

import com.edit.dao.Estado_pagoDAOImpl;
import com.edit.dao.Estado_recibidoDAOImpl;
import com.edit.dao.ProductoDAOImpl;
import com.edit.dao.UsuarioDAOImpl;
import com.edit.dao.notaPedidoCabDAOImpl;
import com.edit.dao.notaPedidoDetDAOImpl;
import com.edit.model.NotaPedidoCab;
import com.edit.model.NotaPedidoDet;
import com.edit.view.FrmLogin;

public class Coordinador {

	private FrmLogin miLogin;
	private UsuarioDAOImpl miUsuario;

	public void setFrmLogin(FrmLogin miLogin) {
		this.miLogin = miLogin;	
	}
	public void setUsuarioDAOImpl(UsuarioDAOImpl miUsuario) {
		this.miUsuario = miUsuario;
		
	}
	public boolean validar(String text) {
		boolean estado = miUsuario.validar(text);
		return estado;
	}

	public List<NotaPedidoCab> mostrarTodosMovAnteriores(){
		notaPedidoCabDAOImpl s = new notaPedidoCabDAOImpl();
		return s.listarTodos();
	}
	
	public List<NotaPedidoCab> mostrarTodosMovAnterioresColCod(int ColCod){
		notaPedidoCabDAOImpl s = new notaPedidoCabDAOImpl();
		return s.listarTodosPorColId(ColCod);
	}
	
	
	
	public List<NotaPedidoDet> mostrarTodosMovAnterioresPorProv(int idProv){
		notaPedidoDetDAOImpl s = new notaPedidoDetDAOImpl();
		return s.listarPorIdProv(idProv);
	}
	
	
	
	public List<NotaPedidoDet> mostrarTodosDetalles(){
		notaPedidoDetDAOImpl s = new notaPedidoDetDAOImpl();
		return s.listarTodos();
	}
	
	public int getEstadoPagoDescripcionPorId(int id) {
		Estado_pagoDAOImpl s = new Estado_pagoDAOImpl();
		return s.getEstadoPagoDescripcionPorId(id);
	}
	
	public int getEstadoRecibidoDescripcionPorId(int id) {
		Estado_recibidoDAOImpl s = new Estado_recibidoDAOImpl();
		return s.getEstadoRecibidoDescripcionPorId(id);
	}
	
	public String getDescripcionProductoPorId(int id) {
		ProductoDAOImpl s = new ProductoDAOImpl();
		return s.getProductoDescripcionPorId(id);
	}
	
	
	
}
