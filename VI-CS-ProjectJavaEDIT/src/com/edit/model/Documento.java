package com.edit.model;

import java.util.ArrayList;
import java.util.Date;

public abstract class Documento {
	//cabecera
	private int DocCod;
	private Estado_Pago estadoPago;
	private Colaborador ColCod;
	private int DocFecEmiDia,DocFecEmiMes,DocFecEmiAño;
	
	private Tipo_Pago PagCod;
	
	private Estado estCod;
	
	//detalle
//	private ArrayList<Producto> productos;
	private final double IGV=0.18;
	private ArrayList<Inventario> inventario;
//	private double montoUnitario;
	private double montoParcial;
	private double montoTotal;
	private int cantidad;
	
	
	
	
	@Override
	public String toString() {
		return "Documento [DocCod=" + DocCod + ", estadoPago=" + estadoPago + ", ColCod=" + ColCod + ", DocFecEmiDia="
				+ DocFecEmiDia + ", DocFecEmiMes=" + DocFecEmiMes + ", DocFecEmiAño=" + DocFecEmiAño + ", PagCod="
				+ PagCod + ", estCod=" + estCod + ", IGV=" + IGV + ", inventario=" + inventario + ", montoParcial="
				+ montoParcial + ", montoTotal=" + montoTotal + ", cantidad=" + cantidad + "]";
	}


	public int getCantidad() {
		return cantidad;
	}
	

	public Estado_Pago getEstadoPago() {
		return estadoPago;
	}


	public void setEstadoPago(Estado_Pago estadoPago) {
		this.estadoPago = estadoPago;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public Documento() {
		
	}
	
	
	
	public int getDocCod() {
		return DocCod;
	}
	public void setDocCod(int docCod) {
		DocCod = docCod;
	}
	
	public Colaborador getColCod() {
		return ColCod;
	}
	public void setColCod(Colaborador colCod) {
		ColCod = colCod;
	}
	
	public int getDocFecEmiDia() {
		return DocFecEmiDia;
	}


	public void setDocFecEmiDia(int docFecEmiDia) {
		DocFecEmiDia = docFecEmiDia;
	}


	public int getDocFecEmiMes() {
		return DocFecEmiMes;
	}


	public void setDocFecEmiMes(int docFecEmiMes) {
		DocFecEmiMes = docFecEmiMes;
	}


	public int getDocFecEmiAño() {
		return DocFecEmiAño;
	}


	public void setDocFecEmiAño(int docFecEmiAño) {
		DocFecEmiAño = docFecEmiAño;
	}


	public double getMontoParcial() {
		return montoParcial;
	}


	public Tipo_Pago getPagCod() {
		return PagCod;
	}
	public void setPagCod(Tipo_Pago pagCod) {
		PagCod = pagCod;
	}
	
	public Estado getEstCod() {
		return estCod;
	}
	public void setEstCod(Estado estCod) {
		this.estCod = estCod;
	}
	public ArrayList<Inventario> getInventario() {
		return inventario;
	}
	public void setInventario(ArrayList<Inventario> inventario) {
		this.inventario = inventario;
	}
	public double getMontoUnitario(int contadorTabla) {
		return inventario.get(contadorTabla).getProPreVen();
	}
	public void setMontoUnitario(double montoUnitario) {
		
	}
	public double getMontoParcial(int contadorTabla) {
		return getMontoUnitario(contadorTabla)*getCantidad();
	}
	public void setMontoParcial(double montoParcial) {
		this.montoParcial = montoParcial;
	}
	public double getMontoTotal() {
		double suma=0.0;
		for(int i=0;i<inventario.size();i++) {
			suma+=getMontoParcial(i);
		}
		return suma;
		
	}
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	public double getIGV() {
		return IGV;
	}
	
	
	
}
