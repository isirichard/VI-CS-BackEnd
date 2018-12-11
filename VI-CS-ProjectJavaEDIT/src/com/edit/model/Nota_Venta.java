package com.edit.model;

import java.util.ArrayList;
import java.util.Date;

public class Nota_Venta extends Documento {
	private int CodNotVen;
	private Date FecPago,FecEntrega;
	private Cliente CliCod;
	private Entregado entregado;
	
	//detalle
	private double montoParcial;
	private double montoTotal;
	private int cantidad;
	
	public Date getFecPago() {
		return FecPago;
	}

	public void setFecPago(Date fecPago) {
		FecPago = fecPago;
	}

	public Date getFecEntrega() {
		return FecEntrega;
	}

	public void setFecEntrega(Date fecEntrega) {
		FecEntrega = fecEntrega;
	}

	

	public int getCodNotVen() {
		return CodNotVen;
	}

	public void setCodNotVen(int codNotVen) {
		CodNotVen = codNotVen;
	}
	public int getDocCod() {
		return super.getDocCod();
	}
	public void setDocCod(int docCod) {
		super.setDocCod(docCod);
	}
	public Cliente getCliCod() {
		return CliCod;
	}
	public void setCliCod(Cliente cliCod) {
		this.CliCod=cliCod;
	}
	public Colaborador getColCod() {
		return super.getColCod();
	}
	public void setColCod(Colaborador colCod) {
		super.setColCod(colCod);
	}
	public int getDocFecEmiDia() {
		return super.getDocFecEmiDia();
	}
	public int getDocFecEmiMes() {
		return super.getDocFecEmiMes();
	}
	public int getDocFecEmiAño() {
		return super.getDocFecEmiAño();
	}
	public void setDocFecEmiDia(int docFecEmiDia) {
		super.setDocFecEmiDia(docFecEmiDia);
	}
	
	public void setDocFecEmiMes(int docFecEmiMes) {
		super.setDocFecEmiMes(docFecEmiMes);
	}
	public void setDocFecEmi(int docFecEmiAño) {
		super.setDocFecEmiAño(docFecEmiAño);
	}
	public Tipo_Pago getPagCod() {
		return super.getPagCod();
	}
	public void setPagCod(Tipo_Pago pagCod) {
		super.setPagCod(pagCod);
	}
	
	public Entregado getEntregado() {
		return entregado;
	}

	public void setEntregado(Entregado entregado) {
		this.entregado = entregado;
	}

	public Estado getEstCod() {
		return super.getEstCod();
	}
	public void setEstCod(Estado estCod) {
		super.setEstCod(estCod);
	}
	public ArrayList<Inventario> getInventario() {
		return super.getInventario();
	}
	public void setInventario(ArrayList<Inventario> inventario) {
		super.setInventario(inventario);
	}
	public double getMontoUnitario(int tabla) {
		return super.getMontoUnitario(tabla);
	}
	public void setMontoUnitario(double montoUnitario) {
		super.setMontoUnitario(montoUnitario);
	}
	public double getMontoParcial(int tabla) {
		return super.getMontoParcial(tabla);
	}
	public void setMontoParcial(double montoParcial) {
		super.setMontoParcial(montoParcial);
	}
	public double getMontoTotal() {
		return super.getMontoTotal();
	}
	public void setMontoTotal(double montoTotal) {
		super.setMontoTotal(montoTotal);
	}
	public double getIGV() {
		return super.getIGV();
	}
}
