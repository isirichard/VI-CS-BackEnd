package com.edit.model;

public class Persona {

	private int PerCod;
	private Tipo_Documento PerTipDoc;
	private String PerNumDoc;
	private String PerNom;

	private String PerDir;
	private String PerTel;
	private String PerCel;
	private Estado PerEst;

	public Persona() {

	}

	public int getPerCod() {
		return PerCod;
	}

	public void setPerCod(int perCod) {
		PerCod = perCod;
	}

	public Tipo_Documento getPerTipDoc() {
		return PerTipDoc;
	}

	public void setPerTipDoc(Tipo_Documento perTipDoc) {
		PerTipDoc = perTipDoc;
	}

	public String getPerNumDoc() {
		return PerNumDoc;
	}

	public void setPerNumDoc(String perNumDoc) {
		PerNumDoc = perNumDoc;
	}

	public String getPerNom() {
		return PerNom;
	}

	public void setPerNom(String perNom) {
		PerNom = perNom;
	}

	public String getPerDir() {
		return PerDir;
	}

	public void setPerDir(String perDir) {
		PerDir = perDir;
	}

	public String getPerTel() {
		return PerTel;
	}

	public void setPerTel(String perTel) {
		PerTel = perTel;
	}

	public String getPerCel() {
		return PerCel;
	}

	public void setPerCel(String perCel) {
		PerCel = perCel;
	}

	public Estado getPerEst() {
		return PerEst;
	}

	public void setPerEst(Estado perEst) {
		PerEst = perEst;
	}
	

}
