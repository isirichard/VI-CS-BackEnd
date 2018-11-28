package com.edit.controller;

import com.edit.dao.UsuarioDAOImpl;
import com.edit.view.FrmCategoriaProductos;
import com.edit.view.FrmEmpresa;
import com.edit.view.FrmHistorialVenta;
import com.edit.view.FrmLogin;
import com.edit.view.FrmRegistrarColaborador;
import com.edit.view.FrmRegistrarProducto;
import com.edit.view.FrmRegistrarProveedor;
import com.edit.view.FrmRegistroCliente;
import com.edit.view.FrmRegistroPedido;
import com.edit.view.FrmRegistroVenta;
import com.edit.view.FrmRol;
import com.edit.view.FrmServicioCliente;

public class Principal {
	public static void main(String args[]) {
		
		//::::::::::.......LOGIN.........::::::::
		Coordinador miCoordinador;
		UsuarioDAOImpl miUsuario;
		FrmLogin miLogin;
		
		//instanciando
		miLogin = new FrmLogin();
		miLogin.setVisible(true);
		FrmRol d = new FrmRol();
		d.setVisible(true);
		
		miUsuario = new UsuarioDAOImpl();
		miCoordinador = new Coordinador();		
	
		
		//establecemos las relaciones entre clases
		miLogin.setCoordinador(miCoordinador);
		miUsuario.setCoordinador(miCoordinador);
		
		
		//enviarle una instancia de cada clase al coordinador
		miCoordinador.setFrmLogin(miLogin);
		miCoordinador.setUsuarioDAOImpl(miUsuario);
		
	}
}
