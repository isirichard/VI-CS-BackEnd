package com.edit.model;

public class Colaborador {

	private int ColCod;
	private Acceso ColAcc;
	private String ColUsu;
	private String ColPass;
	
	
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


	public String getColUsu() {
		return ColUsu;
	}


	public void setColUsu(String colUsu) {
		ColUsu = colUsu;
	}


	public String getColPass() {
		return ColPass;
	}


	public void setColPass(String colPass) {
		ColPass = colPass;
	}
	

}
