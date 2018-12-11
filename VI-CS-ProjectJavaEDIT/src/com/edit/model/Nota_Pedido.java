package com.edit.model;

import java.util.ArrayList;
import java.util.Date;

public class Nota_Pedido extends Documento{
	
	private int CodNotPed;
	private int FecRecepcionDia,FecRecepcionMes,FecRecepcionAño;
	private int FecPagoDia,FecPagoMes,FecPagoAño;
	private Proveedor provCod;
	private Recibido recibido;
	

	

	@Override
	public String toString() {
		return super.toString()+ " Nota_Pedido [CodNotPed=" + CodNotPed + ", FecRecepcionDia=" + FecRecepcionDia + ", FecRecepcionMes="
				+ FecRecepcionMes + ", FecRecepcionAño=" + FecRecepcionAño + ", FecPagoDia=" + FecPagoDia
				+ ", FecPagoMes=" + FecPagoMes + ", FecPagoAño=" + FecPagoAño + ", provCod=" + provCod + ", recibido="
				+ recibido + "]";
	}

	public Proveedor getProvCod() {
		return provCod;
	}

	public void setProvCod(Proveedor provCod) {
		this.provCod = provCod;
	}

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

	public int getFecRecepcionAño() {
		return FecRecepcionAño;
	}

	public void setFecRecepcionAño(int fecRecepcionAño) {
		FecRecepcionAño = fecRecepcionAño;
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

	public int getFecPagoAño() {
		return FecPagoAño;
	}

	public void setFecPagoAño(int fecPagoAño) {
		FecPagoAño = fecPagoAño;
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
	public void setDocFecEmiMes(int docFecEmiDia) {
		super.setDocFecEmiMes(docFecEmiDia);
	}
	public void setDocFecEmiAño(int docFecEmiDia) {
		super.setDocFecEmiAño(docFecEmiDia);
	}
	public Tipo_Pago getPagCod() {
		return super.getPagCod();
	}
	public void setPagCod(Tipo_Pago pagCod) {
		super.setPagCod(pagCod);
	}
	
	public Recibido getRecibido() {
		return recibido;
	}

	public void setRecibido(Recibido recibido) {
		this.recibido = recibido;
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
	public Estado_Pago getEstadoPago() {
		return super.getEstadoPago();
	}
	public void setEstadoPago(Estado_Pago estadoPago) {
		super.setEstadoPago(estadoPago);
	}

	
}
