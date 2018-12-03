package com.edit.model;

public class Tipo_Cliente extends Referencial{
	
	
	public Tipo_Cliente() {

		// TODO Auto-generated constructor stub
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
