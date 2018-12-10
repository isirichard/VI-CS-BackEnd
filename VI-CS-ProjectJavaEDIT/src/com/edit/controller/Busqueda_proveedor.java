package com.edit.controller;

import java.sql.Connection;

import com.edit.dao.Conexion;
import com.edit.view.FrmBuscarProveedor;

public class Busqueda_proveedor {
	private Connection cx;
	private FrmBuscarProveedor nuevaBusqueda;
	public Busqueda_proveedor() {
		cx = Conexion.conectar();
	}
	
	public void actualizarProveedor(){
		

	}
	

}
