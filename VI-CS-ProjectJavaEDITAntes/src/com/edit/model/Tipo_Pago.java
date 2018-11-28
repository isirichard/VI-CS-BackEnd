package com.edit.model;

public class Tipo_Pago {

	private int TipPagCod;
	private String TipPagDes;
	private Estado TipPagEst;
	
	
	
	public Tipo_Pago() {
		// TODO Auto-generated constructor stub
	}
	public int getCodigo() {
		return TipPagCod;
	}
	public void setCodigo(int tipPagCod) {
		TipPagCod = tipPagCod;
	}
	public String getDescripcion() {
		return TipPagDes;
	}
	public void setDescripcion(String tipPagDes) {
		TipPagDes = tipPagDes;
	}
	public Estado getEstado() {
		return TipPagEst;
	}
	public void setEEstado(Estado tipPagEst) {
		TipPagEst = tipPagEst;
	}
	
	
	
}
