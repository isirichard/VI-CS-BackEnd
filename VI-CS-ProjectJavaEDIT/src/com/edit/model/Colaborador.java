package com.edit.model;

public class Colaborador extends Persona {

	private int ColCod;
	private Acceso ColAcc;
	
	
	public int getCodigo() {
		return ColCod;
	}


	public void setCodigo(int colCod) {
		ColCod = colCod;
	}


	public Acceso getAcceso() {
		return ColAcc;
	}


	public void setAcceso(Acceso colAcc) {
		ColAcc = colAcc;
	}


	public Colaborador() {
		// TODO Auto-generated constructor stub
	}

}
