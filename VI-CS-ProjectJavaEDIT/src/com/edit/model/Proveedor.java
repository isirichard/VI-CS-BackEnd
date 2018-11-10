package com.edit.model;

import java.util.ArrayList;

public class Proveedor extends Persona {
	private int ProvCod;
	private Estado ProvEst;
	private ArrayList<Nota_Pedido> ProvNotPed;
	
	public Proveedor() {
		super();
	}

	public int getCodigo() {
		return ProvCod;
	}

	public void setCodigo(int provCod) {
		this.ProvCod = provCod;
	}

	public Estado getEstado() {
		return ProvEst;
	}

	public void setEstado(Estado provEst) {
		this.ProvEst = provEst;
	}

	public ArrayList<Nota_Pedido> getNotaPedido() {
		return ProvNotPed;
	}

	public void setNotaPedido(ArrayList<Nota_Pedido> provNotPed) {
		this.ProvNotPed = provNotPed;
	}
	

}
