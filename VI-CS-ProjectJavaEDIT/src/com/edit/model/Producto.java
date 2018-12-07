package com.edit.model;

public class Producto {
	private int ProdCod;
	private String ProdDes;
	
	private Tipo_Producto TipProCod;
	
	private Marca MarCod;
	private Unidad_Medida UniMedCod;
	private Estado EstCod;
	private String proSKU;
	
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

	public Tipo_Producto getTipProCod() {
		return TipProCod;
	}

	public void setTipProCod(Tipo_Producto tipProCod) {
		TipProCod = tipProCod;
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

	public String getProSKU() {
		return proSKU;
	}

	public void setProSKU(String proSKU) {
		this.proSKU = proSKU;
	}
	
	
	
	

}
