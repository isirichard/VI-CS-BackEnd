package com.edit.model;

public class Inventario {
	private Proveedor ProvCod; 
	private Producto ProdCod;
	private double ProPreCom;
	private double ProPreVen;
	private int stock;
	
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
	public double getProPreCom() {
		return ProPreCom;
	}
	public void setProPreCom(double proPreCom) {
		ProPreCom = proPreCom;
	}
	public double getProPreVen() {
		return ProPreVen;
	}
	public void setProPreVen(double proPreVen) {
		ProPreVen = proPreVen;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

	
	

}
