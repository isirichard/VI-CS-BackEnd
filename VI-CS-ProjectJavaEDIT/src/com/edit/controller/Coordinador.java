package com.edit.controller;

import java.util.List;

import com.edit.dao.AccesoDAOImpl;
import com.edit.dao.Tipo_ProductoDAOImpl;
import com.edit.dao.UsuarioDAOImpl;
import com.edit.model.Acceso;
import com.edit.model.Tipo_Producto;
import com.edit.view.FrmLogin;

public class Coordinador {

	private FrmLogin miLogin;
	private UsuarioDAOImpl miUsuario;
	private Tipo_ProductoDAOImpl tipo_producto = new Tipo_ProductoDAOImpl() ;
	private AccesoDAOImpl ac = new AccesoDAOImpl();
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
	
	
	public void setTipoProducto(Tipo_Producto t) {
		tipo_producto.agregar(t);
		System.out.println("SETTIPOPRODUCTO");
	}
	
	
	//ACCESO
	public void setAcceso(Acceso a) {
		ac.agregar(a);
	}
	
	public List<Acceso> getAccesos() {
		return ac.listarTodos();
	}
	
	
	
	//ACCESO
	
	
	

}
