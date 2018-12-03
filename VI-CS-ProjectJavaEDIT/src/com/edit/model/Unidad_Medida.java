package com.edit.model;

public class Unidad_Medida extends Referencial{
	
	public Unidad_Medida() {
		
	}
	public int getCodigo() {
		return super.getCodigo();
	}
	public String getDescripcion() {
		return super.getDescripcion();
	}
	public Estado getEstCod() {
		return  super.getEstCod();
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
