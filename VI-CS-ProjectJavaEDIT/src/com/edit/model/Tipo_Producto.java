package com.edit.model;

public class Tipo_Producto {
		private int TipProCod;
		private String TipProDes;
		private Estado TipProEst;
	
	public Tipo_Producto() {}
	
	public int getCodigo() {
		return TipProCod;
	}
	public String getDescripcion() {
		return TipProDes;
	}
	public Estado getEstado() {
		return TipProEst;
	}
	public void setCodigo(int TipProCod ) {
		this.TipProCod=TipProCod;
	}
	public void setDescripcion(String TipProDes) {
		this.TipProDes=TipProDes;
	}
	public void setEstado(Estado TipProEst) {
		this.TipProEst=TipProEst;
	}
	

}
