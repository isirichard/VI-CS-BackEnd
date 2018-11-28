package com.edit.controller;

import com.edit.dao.UsuarioDAOImpl;
import com.edit.model.Acceso;
import com.edit.model.Colaborador;
import com.edit.model.Estado;
import com.edit.model.Persona;
import com.edit.model.Tipo_Documento;
import com.edit.model.Usuario;

import java.util.List;

import javax.swing.JComboBox;

import com.edit.dao.AccesoDAOImpl;
import com.edit.dao.ColaboradorDAOImpl;
import com.edit.dao.PersonaDAOImpl;
import com.edit.view.FrmLogin;

public class Coordinador {

	private FrmLogin miLogin;
	private UsuarioDAOImpl miUsuario;
	private ColaboradorDAOImpl miColaborador;
    private PersonaDAOImpl miPersona;
    private AccesoDAOImpl miAcceso;
    private Persona persona;
    private Colaborador colaborador;
    private Usuario usuario;
    
    public Coordinador() {
    	this.miPersona = new PersonaDAOImpl();
    	this.miColaborador = new ColaboradorDAOImpl();
    	this.miAcceso = new AccesoDAOImpl();
    }
    
	public void setFrmLogin(FrmLogin miLogin) {
		this.miLogin = miLogin;	
	}
	public void setUsuarioDAOImpl(UsuarioDAOImpl miUsuario) {
		this.miUsuario = miUsuario;
		
	}
	public void setColaboradorDAOImpl(ColaboradorDAOImpl miColaborador ) {
		this.miColaborador=miColaborador;
	}
	
	public void setPersonaDAOImpl(PersonaDAOImpl miPersona) {
		this.miPersona=miPersona;
	}

	public void agregarUsuario(String txtUsuario,String txtContraseña,int AccCod) {
		try {
		this.usuario = new Usuario();
		usuario.setPassword(txtContraseña);
		usuario.setUsuario(txtUsuario);
		usuario.setColaborador(this.colaborador);
		miColaborador.agregar(this.usuario);
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
    public void agregarColaborador(int TipCodDoc,String txtNroDOC,String txtNombre,String txtApellido,String txtTelefono,String txtCelular,String JTDireccion) {
		try {
    	this.colaborador = new Colaborador();
		Acceso acceso = new Acceso();
		Estado estado = new Estado();
		estado.setCodigo(1);
		estado.setDescripcion("activo");
		acceso.setCodigo(1);
		acceso.setDescripcion("Administrador");
		acceso.setEstado(estado);
		colaborador.setAcceso(acceso);
		
		Tipo_Documento tipo = new Tipo_Documento();
		tipo.setCodigo(1);
		tipo.setDescripcion(1);
		
		colaborador.setApellido(txtApellido);
		colaborador.setDireccion(JTDireccion);
		colaborador.setEstado(estado);
		colaborador.setNombre(txtNombre);
		colaborador.setNumeroDocumento(txtNroDOC);
		colaborador.setTipoDocumento(tipo);
		colaborador.setCelular(txtCelular);
		colaborador.setTelefono(txtTelefono);
		miPersona.agregar((Persona)(colaborador));
		Persona aux = miPersona.UltimoRegistro();
		colaborador.setCodigo(aux.getCodigo());
		}catch(Exception e){
			e.getMessage();
		}
		
	}
	
	public List<Acceso> listarAccesos() {
		return this.miAcceso.listarTodos();
	}
	
	public int obtenerAcceso(String descripcion) {
		return this.miAcceso.idAcceso(descripcion);
		
	}
	public boolean validar(String text) {
		boolean estado = miUsuario.validar(text);
		return estado;
	}

}
