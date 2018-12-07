package com.edit.model;

import java.util.ArrayList;
import java.util.Date;

public class Nota_Pedido extends Documento{
	private int CodNotPed;
	private int FecRecepcionDia,FecRecepcionMes,FecRecepcionA�o;
	private int FecPagoDia,FecPagoMes,FecPagoA�o;
	
	
	

	

	public int getFecRecepcionDia() {
		return FecRecepcionDia;
	}

	public void setFecRecepcionDia(int fecRecepcionDia) {
		FecRecepcionDia = fecRecepcionDia;
	}

	public int getFecRecepcionMes() {
		return FecRecepcionMes;
	}

	public void setFecRecepcionMes(int fecRecepcionMes) {
		FecRecepcionMes = fecRecepcionMes;
	}

	public int getFecRecepcionA�o() {
		return FecRecepcionA�o;
	}

	public void setFecRecepcionA�o(int fecRecepcionA�o) {
		FecRecepcionA�o = fecRecepcionA�o;
	}

	public int getFecPagoDia() {
		return FecPagoDia;
	}

	public void setFecPagoDia(int fecPagoDia) {
		FecPagoDia = fecPagoDia;
	}

	public int getFecPagoMes() {
		return FecPagoMes;
	}

	public void setFecPagoMes(int fecPagoMes) {
		FecPagoMes = fecPagoMes;
	}

	public int getFecPagoA�o() {
		return FecPagoA�o;
	}

	public void setFecPagoA�o(int fecPagoA�o) {
		FecPagoA�o = fecPagoA�o;
	}

	public Nota_Pedido() {

	}

	public int getCodNotPed() {
		return CodNotPed;
	}

	public void setCodNotPed(int codNotVen) {
		CodNotPed = codNotVen;
	}
	public int getDocCod() {
		return super.getDocCod();
	}
	public void setDocCod(int docCod) {
		super.setDocCod(docCod);
	}
	public Proveedor getCliCod() {
		return (Proveedor) super.getCliCod();
	}
	public void setCliCod(Proveedor cliCod) {
		super.setCliCod(cliCod);
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
	public int getDocFecEmiA�o() {
		return super.getDocFecEmiA�o();
	}
	public void setDocFecEmiDia(int docFecEmiDia) {
		super.setDocFecEmiDia(docFecEmiDia);
	}
	public void setDocFecEmiMes(int docFecEmiDia) {
		super.setDocFecEmiMes(docFecEmiDia);
	}
	public void setDocFecEmiA�o(int docFecEmiDia) {
		super.setDocFecEmiA�o(docFecEmiDia);
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
