package com.edit.model;

public class Tipo_Documento {
	private int TipDocCod;
	private int TipDocDes;
	private Estado TipDocEst;
	
	public Tipo_Documento() {
		
	}

	public int getCodigo() {
		return TipDocCod;
	}

	public void setCodigo(int tipDocCod) {
		this.TipDocCod = tipDocCod;
	}

	public int getDescripcion() {
		return TipDocDes;
	}

	public void setDescripcion(int tipDocDes) {
		this.TipDocDes = tipDocDes;
	}

	public Estado getEstado() {
		return TipDocEst;
	}

	public void setEstado(Estado tipDocEst) {
		this.TipDocEst = tipDocEst;
	}
	

}
