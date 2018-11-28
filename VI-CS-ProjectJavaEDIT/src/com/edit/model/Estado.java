package com.edit.model;

public class Estado {
	private int EstCod;
	private String EstDes;
	
	public Estado() {
		
	}

	public Estado(int estCod, String estDes) {
		super();
		EstCod = estCod;
		EstDes = estDes;
	}

	public int getCodigo() {
		return EstCod;
	}

	public void setCodigo(int estCod) {
		this.EstCod = estCod;
	}

	public String getDescripcion() {
		return EstDes;
	}

	public void setDescripcion(String estDes) {
		this.EstDes = estDes;
	}
	

}
