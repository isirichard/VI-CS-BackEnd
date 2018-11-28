package com.edit.model;

public class Empresa {

	private int EmpCod;
	private String EmoNom;
	private Persona EmpGer;
	private Estado EmpEst;
	
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}


	public int getEmpCod() {
		return EmpCod;
	}


	public void setEmpCod(int empCod) {
		EmpCod = empCod;
	}


	public String getEmoNom() {
		return EmoNom;
	}


	public void setEmoNom(String emoNom) {
		EmoNom = emoNom;
	}


	public Persona getEmpGer() {
		return EmpGer;
	}


	public void setEmpGer(Persona empGer) {
		EmpGer = empGer;
	}


	public Estado getEmpEst() {
		return EmpEst;
	}


	public void setEmpEst(Estado empEst) {
		EmpEst = empEst;
	}

	
	
}
