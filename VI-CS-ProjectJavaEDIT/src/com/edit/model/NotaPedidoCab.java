package com.edit.model;

public class NotaPedidoCab {

	int NotPedNro;
	int NotPedFecEmiDia;
	int NotPedFecEmiMes;
	int NotPedFecEmiA�o;

	int NotPedFecPagDia;
	int NotPedFecPagMes;
	int NotPedFecPagA�o;
	
	
	int NotPedFecRecDia;
	int NotPedFecRecMes;
	int NotPedFecRecA�o;
	
	
	String NotPedFecPagEmiDia;
	String NotPedFecPagEmiMes;
	String NotPedFecPagEmiA�o;
	
	
	int ColCod;
	int TipPagCod;
	int PagCod;
	int RecCod;
	int EstCod;
	
	
	public String getFechaEmision() {
		return NotPedFecEmiDia+"/"+NotPedFecEmiMes+"/"+NotPedFecEmiA�o;
	}
	
	public String getFechaPagado() {
		return NotPedFecPagDia+"/"+NotPedFecPagMes+"/"+NotPedFecPagA�o;
	}
	
	public String getFechaRecibido() {
		return NotPedFecRecDia+"/"+NotPedFecRecMes+"/"+NotPedFecRecA�o;
	}
	
	
	public int getPagCod() {
		return PagCod;
	}

	public void setPagCod(int pagCod) {
		PagCod = pagCod;
	}

	@Override
	public String toString() {
		return "NotaPedidoCab [NotPedNro=" + NotPedNro + ", NotPedFecEmiDia=" + NotPedFecEmiDia + ", NotPedFecEmiMes="
				+ NotPedFecEmiMes + ", NotPedFecEmiA�o=" + NotPedFecEmiA�o + ", NotPedFecPagDia=" + NotPedFecPagDia
				+ ", NotPedFecPagMes=" + NotPedFecPagMes + ", NotPedFecPagA�o=" + NotPedFecPagA�o + ", NotPedFecRecDia="
				+ NotPedFecRecDia + ", NotPedFecRecMes=" + NotPedFecRecMes + ", NotPedFecRecA�o=" + NotPedFecRecA�o
				+ ", NotPedFecPagEmiDia=" + NotPedFecPagEmiDia + ", NotPedFecPagEmiMes=" + NotPedFecPagEmiMes
				+ ", NotPedFecPagEmiA�o=" + NotPedFecPagEmiA�o + ", ColCod=" + ColCod + ", TipPagCod=" + TipPagCod
				+ ", PagCoc=" + PagCod + ", RecCod=" + RecCod + ", EstCod=" + EstCod + "]";
	}





	public int getNotPedNro() {
		return NotPedNro;
	}





	public void setNotPedNro(int notPedNro) {
		NotPedNro = notPedNro;
	}





	public int getNotPedFecEmiDia() {
		return NotPedFecEmiDia;
	}





	public void setNotPedFecEmiDia(int notPedFecEmiDia) {
		NotPedFecEmiDia = notPedFecEmiDia;
	}





	public int getNotPedFecEmiMes() {
		return NotPedFecEmiMes;
	}





	public void setNotPedFecEmiMes(int notPedFecEmiMes) {
		NotPedFecEmiMes = notPedFecEmiMes;
	}





	public int getNotPedFecEmiA�o() {
		return NotPedFecEmiA�o;
	}





	public void setNotPedFecEmiA�o(int notPedFecEmiA�o) {
		NotPedFecEmiA�o = notPedFecEmiA�o;
	}





	public int getNotPedFecPagDia() {
		return NotPedFecPagDia;
	}





	public void setNotPedFecPagDia(int notPedFecPagDia) {
		NotPedFecPagDia = notPedFecPagDia;
	}





	public int getNotPedFecPagMes() {
		return NotPedFecPagMes;
	}





	public void setNotPedFecPagMes(int notPedFecPagMes) {
		NotPedFecPagMes = notPedFecPagMes;
	}





	public int getNotPedFecPagA�o() {
		return NotPedFecPagA�o;
	}





	public void setNotPedFecPagA�o(int notPedFecPagA�o) {
		NotPedFecPagA�o = notPedFecPagA�o;
	}





	public int getNotPedFecRecDia() {
		return NotPedFecRecDia;
	}





	public void setNotPedFecRecDia(int notPedFecRecDia) {
		NotPedFecRecDia = notPedFecRecDia;
	}





	public int getNotPedFecRecMes() {
		return NotPedFecRecMes;
	}





	public void setNotPedFecRecMes(int notPedFecRecMes) {
		NotPedFecRecMes = notPedFecRecMes;
	}





	public int getNotPedFecRecA�o() {
		return NotPedFecRecA�o;
	}





	public void setNotPedFecRecA�o(int notPedFecRecA�o) {
		NotPedFecRecA�o = notPedFecRecA�o;
	}





	public String getNotPedFecPagEmiDia() {
		return NotPedFecPagEmiDia;
	}





	public void setNotPedFecPagEmiDia(String notPedFecPagEmiDia) {
		NotPedFecPagEmiDia = notPedFecPagEmiDia;
	}





	public String getNotPedFecPagEmiMes() {
		return NotPedFecPagEmiMes;
	}





	public void setNotPedFecPagEmiMes(String notPedFecPagEmiMes) {
		NotPedFecPagEmiMes = notPedFecPagEmiMes;
	}





	public String getNotPedFecPagEmiA�o() {
		return NotPedFecPagEmiA�o;
	}





	public void setNotPedFecPagEmiA�o(String notPedFecPagEmiA�o) {
		NotPedFecPagEmiA�o = notPedFecPagEmiA�o;
	}





	public int getColCod() {
		return ColCod;
	}





	public void setColCod(int colCod) {
		ColCod = colCod;
	}





	public int getTipPagCod() {
		return TipPagCod;
	}





	public void setTipPagCod(int tipPagCod) {
		TipPagCod = tipPagCod;
	}





	public int getPagCoc() {
		return PagCod;
	}





	public void setPagCoc(int pagCoc) {
		PagCod = pagCoc;
	}





	public int getRecCod() {
		return RecCod;
	}





	public void setRecCod(int recCod) {
		RecCod = recCod;
	}





	public int getEstCod() {
		return EstCod;
	}





	public void setEstCod(int estCod) {
		EstCod = estCod;
	}





	public NotaPedidoCab() {
		// TODO Auto-generated constructor stub
	}

}
