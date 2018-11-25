package com.edit.model;

public class Tipo_Documento {
	private int TipDocCod;
	private String TipDocDes;
	private Estado TipDocEst;
	
	public Tipo_Documento() {
	}
	

	public Tipo_Documento(int tipDocCod, String tipDocDes) {
		super();
		TipDocCod = tipDocCod;
		TipDocDes = tipDocDes;
	}


	public int getCodigo() {
		return TipDocCod;
	}

	public void setCodigo(int tipDocCod) {
		this.TipDocCod = tipDocCod;
	}

	public String getDescripcion() {
		return TipDocDes;
	}

	public void setDescripcion(String tipDocDes) {
		this.TipDocDes = tipDocDes;
	}

	public Estado getEstado() {
		return TipDocEst;
	}

	public void setEstado(Estado tipDocEst) {
		this.TipDocEst = tipDocEst;
	}
	

}
