package com.edit.model;

import java.util.ArrayList;

public class Proveedor extends Persona {
	private int ProvCod;
	private Estado ProvEst;
	private double ProDeuAct,ProDeuAtr,ProDeuTot;
	private String ProCal;
	private ArrayList<Nota_Pedido> ProvNotPed;
	
	public Proveedor() {
		super();
	}

	public int getProvCod() {
		return ProvCod;
	}

	public void setProvCod(int provCod) {
		ProvCod = provCod;
	}

	public Estado getProvEst() {
		return ProvEst;
	}

	public void setProvEst(Estado provEst) {
		ProvEst = provEst;
	}

	public double getProDeuAct() {
		return ProDeuAct;
	}

	public void setProDeuAct(double proDeuAct) {
		ProDeuAct = proDeuAct;
	}

	public double getProDeuAtr() {
		return ProDeuAtr;
	}

	public void setProDeuAtr(double proDeuAtr) {
		ProDeuAtr = proDeuAtr;
	}

	public double getProDeuTot() {
		return ProDeuTot;
	}

	public void setProDeuTot(double proDeuTot) {
		ProDeuTot = proDeuTot;
	}

	public String getProCal() {
		return ProCal;
	}

	public void setProCal(String proCal) {
		ProCal = proCal;
	}

	public ArrayList<Nota_Pedido> getProvNotPed() {
		return ProvNotPed;
	}

	public void setProvNotPed(ArrayList<Nota_Pedido> provNotPed) {
		ProvNotPed = provNotPed;
	}

	

}
