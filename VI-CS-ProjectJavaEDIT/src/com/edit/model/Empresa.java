package com.edit.model;


public class Empresa extends Persona{
	private int EmpCod;
	private Estado estCodEmp;

	public Estado getEstCodEmp() {
		return estCodEmp;
	}
	public void setEstCodEmp(Estado estCodEmp) {
		this.estCodEmp = estCodEmp;
	}
	public int getEmpCod() {
		return EmpCod;
	}
	public void setEmpCod(int EmpCod) {
		this.EmpCod = EmpCod;
	}
	
	public Empresa() {

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
	public Estado getEstCod() {
		return super.getPerEst();
	}
	public void setEstCod(Estado estCod) {
		super.setPerEst(estCod);
	}

}
