package com.edit.model;



public class Tipo_Pago extends Referencial{

	private int TipPagCod;
	private String TipPagDes;
	private Estado TipPagEst;
	
	
	
	public Tipo_Pago() {
		// TODO Auto-generated constructor stub
	}
	public int getCodigo() {
		return super.getCodigo();
	}
	public String getDescripcion() {
		return super.getDescripcion();
	}
	public Estado getKFEstCod() {
		return (Estado) super.getEstCod();
	}
	public void setCodigo(int co) {
		super.setCodigo(co);
	}
	public void setDescripcion(String s) {
		super.setDescripcion(s);
	}
	public void setEstCod(Estado es) {
		super.setEstCod(es);

	}
	
	
}
