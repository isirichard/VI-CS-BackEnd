package com.edit.model;

public class Estado_pago {

	
	int PagCod;
	int PagDes;
	int EstCod;
	
	
	public int getPagCod() {
		return PagCod;
	}


	public void setPagCod(int pagCod) {
		PagCod = pagCod;
	}


	public int getPagDes() {
		return PagDes;
	}


	public void setPagDes(int pagDes) {
		PagDes = pagDes;
	}


	public int getEstCod() {
		return EstCod;
	}


	public void setEstCod(int estCod) {
		EstCod = estCod;
	}


	@Override
	public String toString() {
		return "Estado_pago [PagCod=" + PagCod + ", PagDes=" + PagDes + ", EstCod=" + EstCod + "]";
	}


	public Estado_pago() {
		// TODO Auto-generated constructor stub
	}

}
