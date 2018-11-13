package com.edit.model;

public class Producto {
	private int ProdCod;
	private String ProdDes;
	private Proveedor ProdTipPro;
	private Tipo_Producto ProdTipPro2;
	private int ProdCan;
	private double ProdPre;
	
	public Producto() {}
	
	public String getDescripcion() {
		return ProdDes;
	}
	public Proveedor getProveedor() {
		return ProdTipPro;
	}
	public Proveedor Tipo_Producto() {
		return ProdTipPro;
	}
	public int getCantidad() {
		return ProdCan;
	}
	public double getPrecio() {
		return ProdPre;
	}
	

}
