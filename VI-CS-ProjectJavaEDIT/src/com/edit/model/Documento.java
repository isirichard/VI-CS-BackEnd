package com.edit.model;

import java.util.ArrayList;
import java.util.Date;

public abstract class Documento {
	//cabecera
	private int DocCod;
	private Persona CliCod;
	private Colaborador ColCod;
	private int DocFecEmiDia,DocFecEmiMes,DocFecEmiA�o;
	
	private Tipo_Pago PagCod;
	private Referencial_booleano EntRecCod;//entregado/recibidocodigo
	private Estado estCod;
	
	//detalle
//	private ArrayList<Producto> productos;
	private final double IGV=0.18;
	private ArrayList<Inventario> inventario;
//	private double montoUnitario;
	private double montoParcial;
	private double montoTotal;
	private int cantidad;
	
	public int getCantidad() {
		return cantidad;
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
	public Persona getCliCod() {
		return CliCod;
	}
	public void setCliCod(Persona cliCod) {
		CliCod = cliCod;
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


	public int getDocFecEmiA�o() {
		return DocFecEmiA�o;
	}


	public void setDocFecEmiA�o(int docFecEmiA�o) {
		DocFecEmiA�o = docFecEmiA�o;
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
	public Referencial_booleano getEntRecCod() {
		return EntRecCod;
	}
	public void setEntRecCod(Referencial_booleano entRecCod) {
		EntRecCod = entRecCod;
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
