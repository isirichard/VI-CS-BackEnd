package com.edit.model;

public class Estado_recibido {

	
	int RecCod;
	int RecDes;
	int EstCod;
	@Override
	public String toString() {
		return "Estado_recibido [RecCod=" + RecCod + ", RecDes=" + RecDes + ", EstCod=" + EstCod + "]";
	}
	public int getRecCod() {
		return RecCod;
	}
	public void setRecCod(int recCod) {
		RecCod = recCod;
	}
	public int getRecDes() {
		return RecDes;
	}
	public void setRecDes(int recDes) {
		RecDes = recDes;
	}
	public int getEstCod() {
		return EstCod;
	}
	public void setEstCod(int estCod) {
		EstCod = estCod;
	}
	
	
}
