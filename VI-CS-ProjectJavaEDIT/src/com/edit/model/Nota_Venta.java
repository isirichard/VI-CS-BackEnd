package com.edit.model;

import java.util.ArrayList;
import java.util.Date;

public class Nota_Venta extends Documento {
	private int CodNotVen;
	private Date FecPago,FecEntrega;
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
		return super.getCliCod();
	}
	public void setCliCod(Cliente cliCod) {
		super.setCliCod(cliCod);
	}
	public Colaborador getColCod() {
		return super.getColCod();
	}
	public void setColCod(Colaborador colCod) {
		super.setColCod(colCod);
	}
	public Date getDocFecEmi() {
		return super.getDocFecEmi();
	}
	public void setDocFecEmi(Date docFecEmi) {
		super.setDocFecEmi(docFecEmi);
	}
	public Tipo_Pago getPagCod() {
		return super.getPagCod();
	}
	public void setPagCod(Tipo_Pago pagCod) {
		super.setPagCod(pagCod);
	}
	public Entregado getEntRecCod() {
		return (Entregado)(super.getEntRecCod());
	}
	public void setEntRecCod(Entregado entRecCod) {
		super.setEntRecCod(entRecCod);
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
