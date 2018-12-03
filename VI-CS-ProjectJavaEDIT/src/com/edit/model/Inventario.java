package com.edit.model;

public class Inventario {
	private Proveedor ProvCod; 
	private Producto ProdCod;
	private int ProPreCom;
	private int ProPreVen;
	
	
	public Inventario() {
		ProvCod=new Proveedor();
		ProdCod=new Producto();
	}
	
	public Proveedor getProvCod() {
		return ProvCod;
	}
	public void setProvCod(Proveedor provCod) {
		ProvCod = provCod;
	}
	public Producto getProdCod() {
		return ProdCod;
	}
	public void setProdCod(Producto prodCod) {
		ProdCod = prodCod;
	}
	public int getProPreCom() {
		return ProPreCom;
	}
	public void setProPreCom(int proPreCom) {
		ProPreCom = proPreCom;
	}
	public int getProPreVen() {
		return ProPreVen;
	}
	public void setProPreVen(int proPreVen) {
		ProPreVen = proPreVen;
	}
	

	
	

}
