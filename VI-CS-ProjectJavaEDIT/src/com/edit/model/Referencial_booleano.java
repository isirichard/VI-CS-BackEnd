package com.edit.model;

public abstract class Referencial_booleano {
	private int PagCod;
	private boolean PagDes;
	private Estado estCod;
	
	
	
	
	public Referencial_booleano(int pagCod, boolean pagDes, Estado estCod) {
		
		PagCod = pagCod;
		PagDes = pagDes;
		this.estCod = estCod;
	}
	
	public Referencial_booleano() {
		
	}
	public int getPagCod() {
		return PagCod;
	}
	public void setPagCod(int pagCod) {
		PagCod = pagCod;
	}
	public boolean isPagDes() {
		return PagDes;
	}
	public void setPagDes(boolean pagDes) {
		PagDes = pagDes;
	}
	public Estado getEstCod() {
		return estCod;
	}
	public void setEstCod(Estado estCod) {
		this.estCod = estCod;
	}
}
