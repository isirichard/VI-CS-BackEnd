package com.edit.model;

public class Marca extends Referencial{
	public Marca(int codigo, String descripcion, Estado estCod) {

		super(codigo, descripcion, estCod);

	}
	public Marca() {

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

