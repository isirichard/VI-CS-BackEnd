package com.edit.model;

import java.util.List;

public class Pedido {

	private List<Producto> DetProd;
	private int DetCan;
	private double DetPreTot;
	private Inventario DetInv;
	public List<Producto> getDetProd() {
		return DetProd;
	}
	public void setDetProd(List<Producto> detProd) {
		DetProd = detProd;
	}
	public int getDetCan() {
		return DetCan;
	}
	public void setDetCan(int detCan) {
		DetCan = detCan;
	}
	public double getDetPreTot() {
		return DetPreTot;
	}
	public void setDetPreTot(double detPreTot) {
		DetPreTot = detPreTot;
	}
	public Inventario getDetInv() {
		return DetInv;
	}
	public void setDetInv(Inventario detInv) {
		DetInv = detInv;
	}
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	

}
