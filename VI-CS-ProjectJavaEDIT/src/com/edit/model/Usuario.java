package com.edit.model;

public class Usuario {
	private String Usu;
	private String Pas;
	private Colaborador Usucol;
	
	public Usuario(){
		
	}
	
	public Colaborador getColaborador() {
		return Usucol;
	}

	public void setColaborador(Colaborador usucol) {
		Usucol = usucol;
	}

	public String getUsuario() {
		return Usu;
	}
	
	public String getPassword() {
		return Pas;
	}
	
	public void setUsuario(String _Usu) {
		Usu = _Usu;
	}
	public void setPassword(String _Pas) {
		Pas = _Pas;
	}
	
	public void VerificarIngreso() {
		
	}
	public void verificarColaborador(){
		
	}
	
		
	
}
