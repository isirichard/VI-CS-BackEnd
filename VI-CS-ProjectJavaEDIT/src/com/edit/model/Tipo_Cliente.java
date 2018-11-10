package com.edit.model;

public class Tipo_Cliente {
	private int TipCliCod;
	private String TipCliDes;
	private Estado TipCliEst;
	
	public Tipo_Cliente() {
		
	}

	public int getCodigo() {
		return TipCliCod;
	}

	public void setCodigo(int tipCliCod) {
		this.TipCliCod = tipCliCod;
	}

	public String getDescripcion() {
		return TipCliDes;
	}

	public void setDescripcion(String tipCliDes) {
		this.TipCliDes = tipCliDes;
	}

	public Estado getEstado() {
		return TipCliEst;
	}

	public void setEstado(Estado tipCliEst) {
		this.TipCliEst = tipCliEst;
	}
	

}
