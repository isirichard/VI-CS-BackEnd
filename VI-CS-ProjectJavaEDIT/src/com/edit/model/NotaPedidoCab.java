package com.edit.model;

public class NotaPedidoCab {

	int NotPedNro;
	int NotPedFecEmiDia;
	int NotPedFecEmiMes;
	int NotPedFecEmiAño;

	int NotPedFecPagDia;
	int NotPedFecPagMes;
	int NotPedFecPagAño;
	
	
	int NotPedFecRecDia;
	int NotPedFecRecMes;
	int NotPedFecRecAño;
	
	
	String NotPedFecPagEmiDia;
	String NotPedFecPagEmiMes;
	String NotPedFecPagEmiAño;
	
	
	int ColCod;
	int TipPagCod;
	int PagCod;
	int RecCod;
	int EstCod;
	
	
	public String getFechaEmision() {
		return NotPedFecEmiDia+"/"+NotPedFecEmiMes+"/"+NotPedFecEmiAño;
	}
	
	public String getFechaPagado() {
		return NotPedFecPagDia+"/"+NotPedFecPagMes+"/"+NotPedFecPagAño;
	}
	
	public String getFechaRecibido() {
		return NotPedFecRecDia+"/"+NotPedFecRecMes+"/"+NotPedFecRecAño;
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
				+ NotPedFecEmiMes + ", NotPedFecEmiAño=" + NotPedFecEmiAño + ", NotPedFecPagDia=" + NotPedFecPagDia
				+ ", NotPedFecPagMes=" + NotPedFecPagMes + ", NotPedFecPagAño=" + NotPedFecPagAño + ", NotPedFecRecDia="
				+ NotPedFecRecDia + ", NotPedFecRecMes=" + NotPedFecRecMes + ", NotPedFecRecAño=" + NotPedFecRecAño
				+ ", NotPedFecPagEmiDia=" + NotPedFecPagEmiDia + ", NotPedFecPagEmiMes=" + NotPedFecPagEmiMes
				+ ", NotPedFecPagEmiAño=" + NotPedFecPagEmiAño + ", ColCod=" + ColCod + ", TipPagCod=" + TipPagCod
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





	public int getNotPedFecEmiAño() {
		return NotPedFecEmiAño;
	}





	public void setNotPedFecEmiAño(int notPedFecEmiAño) {
		NotPedFecEmiAño = notPedFecEmiAño;
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





	public int getNotPedFecPagAño() {
		return NotPedFecPagAño;
	}





	public void setNotPedFecPagAño(int notPedFecPagAño) {
		NotPedFecPagAño = notPedFecPagAño;
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





	public int getNotPedFecRecAño() {
		return NotPedFecRecAño;
	}





	public void setNotPedFecRecAño(int notPedFecRecAño) {
		NotPedFecRecAño = notPedFecRecAño;
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





	public String getNotPedFecPagEmiAño() {
		return NotPedFecPagEmiAño;
	}





	public void setNotPedFecPagEmiAño(String notPedFecPagEmiAño) {
		NotPedFecPagEmiAño = notPedFecPagEmiAño;
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
