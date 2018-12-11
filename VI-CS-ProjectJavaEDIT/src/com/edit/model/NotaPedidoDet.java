package com.edit.model;

public class NotaPedidoDet {

	int NotPedNro;
	int NotPedCan;
	int ProvCod;
	int ProdCod;
	double NotPedTot;
	double NotPedPrePar;
	double NotPedSaldo;
	
	
	
	@Override
	public String toString() {
		return "NotaPedidoDet [NotPedNro=" + NotPedNro + ", NotPedCan=" + NotPedCan + ", ProvCod=" + ProvCod
				+ ", ProdCod=" + ProdCod + ", NotPedTot=" + NotPedTot + ", NotPedPrePar=" + NotPedPrePar
				+ ", NotPedSaldo=" + NotPedSaldo + "]";
	}



	public int getNotPedNro() {
		return NotPedNro;
	}



	public void setNotPedNro(int notPedNro) {
		NotPedNro = notPedNro;
	}



	public int getNotPedCan() {
		return NotPedCan;
	}



	public void setNotPedCan(int notPedCan) {
		NotPedCan = notPedCan;
	}



	public int getProvCod() {
		return ProvCod;
	}



	public void setProvCod(int provCod) {
		ProvCod = provCod;
	}



	public int getProdCod() {
		return ProdCod;
	}



	public void setProdCod(int prodCod) {
		ProdCod = prodCod;
	}



	public double getNotPedTot() {
		return NotPedTot;
	}



	public void setNotPedTot(double notPedTot) {
		NotPedTot = notPedTot;
	}



	public double getNotPedPrePar() {
		return NotPedPrePar;
	}



	public void setNotPedPrePar(double notPedPrePar) {
		NotPedPrePar = notPedPrePar;
	}



	public double getNotPedSaldo() {
		return NotPedSaldo;
	}



	public void setNotPedSaldo(double notPedSaldo) {
		NotPedSaldo = notPedSaldo;
	}



	public NotaPedidoDet() {
		// TODO Auto-generated constructor stub
	}

}
