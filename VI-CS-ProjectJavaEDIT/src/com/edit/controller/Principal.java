package com.edit.controller;

import com.edit.dao.Tipo_DocumentoDAOImpl;
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
import com.edit.view.FrmServicioCliente;
import com.edit.view.FrmTipoDOC;

public class Principal {
	public static void main(String args[]) {
		//::::::::::.......LOGIN.........::::::::
		Coordinador miCoordinador = new Coordinador();	
		UsuarioDAOImpl miUsuario = new UsuarioDAOImpl();
		FrmLogin miLogin = new FrmLogin();
		
		FrmTipoDOC miTipoDoc = new FrmTipoDOC();
		Tipo_DocumentoDAOImpl miTipoDocumento = new Tipo_DocumentoDAOImpl();
		
		//instanciando
		miLogin.setVisible(true);
			
		//establecemos las relaciones entre clases
		miLogin.setCoordinador(miCoordinador);
		miUsuario.setCoordinador(miCoordinador);
		
		miTipoDocumento.setCoordinador(miCoordinador);
		miTipoDoc.setCoordinador(miCoordinador);
		
		//enviarle una instancia de cada clase al coordinador
		miCoordinador.setFrmLogin(miLogin);
		miCoordinador.setUsuarioDAOImpl(miUsuario);
		
		miCoordinador.setFrmTipoDOC(miTipoDoc);
		miCoordinador.setTipo_DoumentoDAOImpl(miTipoDocumento);
		
		
		
	}
}
