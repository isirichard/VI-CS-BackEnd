package com.edit.model;

import java.util.ArrayList;
import java.util.Date;

public abstract class Documento {
	//cabecera
	private int DocCod;
	private Cliente CliCod;
	private Colaborador ColCod;
	private Date DocFecEmi;
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
	private double cantidad;
	
	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	public Documento() {
		
	}
	
	
	public Documento(int docCod, Cliente cliCod, Colaborador colCod, Date docFecEmi, Tipo_Pago pagCod,
			Referencial_booleano entRecCod, Estado estCod, ArrayList<Inventario> inventario,
			double montoUnitario, double montoParcial, double montoTotal) {
		super();
		DocCod = docCod;
		CliCod = cliCod;
		ColCod = colCod;
		DocFecEmi = docFecEmi;
		PagCod = pagCod;
		EntRecCod = entRecCod;
		this.estCod = estCod;
		this.inventario = inventario;
		
		this.montoParcial = montoParcial;
		this.montoTotal = montoTotal;
	}
	public int getDocCod() {
		return DocCod;
	}
	public void setDocCod(int docCod) {
		DocCod = docCod;
	}
	public Cliente getCliCod() {
		return CliCod;
	}
	public void setCliCod(Cliente cliCod) {
		CliCod = cliCod;
	}
	public Colaborador getColCod() {
		return ColCod;
	}
	public void setColCod(Colaborador colCod) {
		ColCod = colCod;
	}
	public Date getDocFecEmi() {
		return DocFecEmi;
	}
	public void setDocFecEmi(Date docFecEmi) {
		DocFecEmi = docFecEmi;
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
