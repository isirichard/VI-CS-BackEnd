package com.edit.controller;

import com.edit.dao.UsuarioDAOImpl;
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

}
