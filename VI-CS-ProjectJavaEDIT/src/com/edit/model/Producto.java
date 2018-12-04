package com.edit.model;

public class Producto {
	private int ProdCod;
	private String ProdDes;
	private int ProSKU;
	private Tipo_Producto TipProCod;
	private int ProStk;//stock
	private Marca MarCod;
	private Unidad_Medida UniMedCod;
	private Estado EstCod;
	
	public Producto() {}

	public int getProdCod() {
		return ProdCod;
	}

	public void setProdCod(int prodCod) {
		ProdCod = prodCod;
	}

	public String getProdDes() {
		return ProdDes;
	}

	public void setProdDes(String prodDes) {
		ProdDes = prodDes;
	}
	
	public int getProSKU() {
		return ProSKU;
	}

	public void setProSKU(int proSKU) {
		ProSKU = proSKU;
	}

	public Tipo_Producto getTipProCod() {
		return TipProCod;
	}

	public void setTipProCod(Tipo_Producto tipProCod) {
		TipProCod = tipProCod;
	}

	public int getProStk() {
		return ProStk;
	}

	public void setProStk(int proStk) {
		ProStk = proStk;
	}

	public Marca getMarCod() {
		return MarCod;
	}

	public void setMarCod(Marca marCod) {
		MarCod = marCod;
	}

	public Unidad_Medida getUniMedCod() {
		return UniMedCod;
	}

	public void setUniMedCod(Unidad_Medida uniMedCod) {
		UniMedCod = uniMedCod;
	}

	public Estado getEstCod() {
		return EstCod;
	}

	public void setEstCod(Estado estCod) {
		EstCod = estCod;
	}
	
	
	

}
