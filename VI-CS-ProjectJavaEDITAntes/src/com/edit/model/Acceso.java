package com.edit.model;

public class Acceso {

	private int AccCod;
	private String AccDes;
	private Estado AccEst;
	
	public Acceso() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return AccCod;
	}

	public void setCodigo(int accCod) {
		AccCod = accCod;
	}

	public String getDescripcion() {
		return AccDes;
	}

	public void setDescripcion(String accDes) {
		AccDes = accDes;
	}

	public Estado getEstado() {
		return AccEst;
	}

	public void setEstado(Estado accEst) {
		AccEst = accEst;
	}

	
	
}
