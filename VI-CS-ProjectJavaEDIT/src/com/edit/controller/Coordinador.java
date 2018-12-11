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

	
	
	/**
	 * Este metodo muestra todo los movimientos anteriores en base al Colaborador
	 * @param ColCod - valor que representa el id del colaborador
	 * @return - retorna una lista de los movimientos anteriores en base al colaborador
	 */
	public List<NotaPedidoCab> mostrarTodosMovAnterioresColCod(int ColCod){
		notaPedidoCabDAOImpl s = new notaPedidoCabDAOImpl();
		return s.listarTodosPorColId(ColCod);
	}
	
	
	/**
	 * Este metodo muestra todo los movimientos anteriores de un proveedor
	 * @param idProv - valor que representa el id del proveedor
	 * @return - retorna una lista de los movimientos anteriores del proveedor
	 */
	public List<NotaPedidoDet> mostrarTodosMovAnterioresPorProv(int idProv){
		notaPedidoDetDAOImpl s = new notaPedidoDetDAOImpl();
		return s.listarPorIdProv(idProv);
	}
	
	/**
	 * Este metodo permite mostrar todos los detalles
	 * @return - una lista de la tabla Nota pedido Det
	 */
	public List<NotaPedidoDet> mostrarTodosDetalles(){
		notaPedidoDetDAOImpl s = new notaPedidoDetDAOImpl();
		return s.listarTodos();
	}
	
	/**
	 * Este metodo sirve para mostrar el parametro descripcion de la tabla Estado pago
	 * @param id - valor del parametro id de la tabla estado pago
	 * @return - retorna la descripcion de la tabla estado pago
	 */
	public int getEstadoPagoDescripcionPorId(int id) {
		Estado_pagoDAOImpl s = new Estado_pagoDAOImpl();
		return s.getEstadoPagoDescripcionPorId(id);
	}
	
	/**
	 * Este metodo sirve para mostrar el parametro descripcion de la tabla Estado recibido
	 * @param id - valor del parametro id de la tabla estado recibido
	 * @return - retorna la descripcion de la tabla estado recibido
	 */
	public int getEstadoRecibidoDescripcionPorId(int id) {
		Estado_recibidoDAOImpl s = new Estado_recibidoDAOImpl();
		return s.getEstadoRecibidoDescripcionPorId(id);
	}
	
	/**
	 * Este metodo sirve para mostrar el parametro descripcion de la tabla producto
	 * @param id - valor del parametro id de la tabla producto
	 * @return - retorna la descripcion de la tabla producto
	 */
	public String getDescripcionProductoPorId(int id) {
		ProductoDAOImpl s = new ProductoDAOImpl();
		return s.getProductoDescripcionPorId(id);
	}
	
	
	
}
