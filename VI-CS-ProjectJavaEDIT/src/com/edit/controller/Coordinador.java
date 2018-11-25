package com.edit.controller;


import com.edit.dao.Tipo_DocumentoDAOImpl;
import com.edit.dao.UsuarioDAOImpl;
import com.edit.model.Tipo_Documento;
import com.edit.view.FrmLogin;
import com.edit.view.FrmTipoDOC;

public class Coordinador {

	private FrmLogin miLogin;
	private UsuarioDAOImpl miUsuario;
	
	private Tipo_DocumentoDAOImpl miTipoDocumento= new Tipo_DocumentoDAOImpl();
	private FrmTipoDOC miFrmTipoDOC;

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
	
	
	
	public void setTipo_DoumentoDAOImpl(Tipo_DocumentoDAOImpl miTipoDocumento) {
		this.miTipoDocumento=miTipoDocumento;
	}
	public void registrarTipoDoc(String text, String text2) {
		System.out.println(text +" asd" +text2);
		//int numEntero = Integer.parseInt(text);
		//this.miTipoDocumento.agregar(new Tipo_Documento(numEntero,text2));	
	}
	public void setFrmTipoDOC(FrmTipoDOC miFrmTipoDOC) {
		this.miFrmTipoDOC = miFrmTipoDOC;
		
	}
	public void agregar(String a, String a2) {
		// TODO Auto-generated method stub
		int numEntero = Integer.parseInt(a);
		Tipo_Documento aa=new Tipo_Documento(numEntero,a2);
		miTipoDocumento.agregar(aa);
	}

}
