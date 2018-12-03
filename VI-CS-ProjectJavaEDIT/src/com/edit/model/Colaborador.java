package com.edit.model;



public class Colaborador extends Persona{
	private int ColCod;
	private String ColUsu,ColPas;
	private Acceso accCod;
	private Estado estCodCol;

	public String getColUsu() {
		return ColUsu;
	}
	public void setColUsu(String colUsu) {
		ColUsu = colUsu;
	}
	public String getColPas() {
		return ColPas;
	}
	public void setColPas(String colPas) {
		ColPas = colPas;
	}
	public Acceso getAccCod() {
		return accCod;
	}
	public void setAccCod(Acceso accCod) {
		this.accCod = accCod;
	}
	public Estado getEstCodCol() {
		return estCodCol;
	}
	public void setEstCodCol(Estado estCodCol) {
		this.estCodCol = estCodCol;
	}
	public int getColCod() {
		return ColCod;
	}
	public void setColCod(int ColCod) {
		this.ColCod = ColCod;
	}
	
	public Colaborador() {

	}
	public int getPercod() {
		return super.getPerCod();
	}
	public void setPercod(int percod) {
		super.setPerCod(percod);
	}
	public Tipo_Documento getTipDocCod() {
		return super.getPerTipDoc();
	}
	public void setTipDocCod(Tipo_Documento tipDocCod) {
		super.setPerTipDoc(tipDocCod);
	}
	public String getPerNom() {
		return super.getPerNom();
	}
	public void setPerNom(String perNom) {
		super.setPerNom(perNom);
	}
	public String getPerDir() {
		return super.getPerDir();
	}
	public void setPerDir(String perDir) {
		super.setPerDir(perDir);
	}
	public String getPerTel() {
		return super.getPerCel();
	}
	public void setPerTel(String perTel) {
		super.setPerTel(perTel);
	}
	public String getPerCel() {
		return super.getPerCel();
	}
	public void setPerCel(String perCel) {
		super.setPerCel(perCel);
	}
	public Estado getPerEstCod() {
		return super.getPerEst();
	}
	public void setPerEstCod(Estado estCod) {
		super.setPerEst(estCod);
	}
}
