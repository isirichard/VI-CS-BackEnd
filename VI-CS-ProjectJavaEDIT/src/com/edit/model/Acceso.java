package com.edit.model;

public class Acceso extends Referencial{
	
	public Acceso(int codigo, String descripcion, Estado estCod) {
		
		super(codigo, descripcion, estCod);
		
	}
	public Acceso() {
		
	}
	
	public int getCodigo() {
		return super.getCodigo();
	}
	public String getDescripcion() {
		return super.getDescripcion();
	}
	public Estado getEstCod() {
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
