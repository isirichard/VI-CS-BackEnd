package com.edit.model;

public class Inventario {
	private Proveedor ProvCod; 
	private Producto ProdCod;
	private int ProPreCom;
	private int ProPreVen;
	private int ProStk;
	
	
	public Inventario() {
		ProvCod=new Proveedor();
		ProdCod=new Producto();
	}
	
	public Proveedor getProv() {
		return ProvCod;
	}
	public void setProv(Proveedor provCod) {
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

	public int getProStk() {
		return ProStk;
	}

	public void setProStk(int proStk) {
		ProStk = proStk;
	}
	

	
	

}
