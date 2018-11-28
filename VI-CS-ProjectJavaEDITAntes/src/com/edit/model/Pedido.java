package com.edit.model;

import java.util.List;

public class Pedido {

	private List<Producto> DetProd;
	private int DetCan;
	private double DetPreTot;
	private Inventario DetInv;
	public List<Producto> getProductos() {
		return DetProd;
	}
	public void setProductos(List<Producto> detProd) {
		DetProd = detProd;
	}
	public int getCantidad() {
		return DetCan;
	}
	public void setCantidad(int detCan) {
		DetCan = detCan;
	}
	public double getTotal() {
		return DetPreTot;
	}
	public void setTotal(double detPreTot) {
		DetPreTot = detPreTot;
	}
	public Inventario getInventario() {
		return DetInv;
	}
	public void setInventario(Inventario detInv) {
		DetInv = detInv;
	}
	
	public void verificaStock() {
		
	}
	
	
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	

}
