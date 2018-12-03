package com.edit.model;

public abstract class Referencial {
	
	private int codigo;
	private String descripcion;
	private Estado estCod;
	public Referencial(int codigo, String descripcion, Estado estCod) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.estCod = estCod;
	}
	public Referencial() {
		
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Estado getEstCod() {
		return estCod;
	}
	public void setCodigo(int co) {
		codigo=co;
	}
	public void setDescripcion(String s) {
		descripcion=s;
	}
	public void setEstCod(Estado es) {
		estCod=es;
	}
	
	

}
