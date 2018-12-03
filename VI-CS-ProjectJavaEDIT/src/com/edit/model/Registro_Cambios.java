package com.edit.model;

import java.util.Date;

public abstract class Registro_Cambios {
	private int RegCamCod;
	private String RegCamDes;
	private Colaborador ColCod;
	private Date RegCamFec;
	public Date getRegCamFec() {
		return RegCamFec;
	}

	public void setRegCamFec(Date regCamFec) {
		RegCamFec = regCamFec;
	}

	public Registro_Cambios() {
		
	}
	
	public Registro_Cambios(int regCamCod, String regCamDes, Colaborador colCod) {
		super();
		RegCamCod = regCamCod;
		RegCamDes = regCamDes;
		ColCod = colCod;
	}

	public int getRegCamCod() {
		return RegCamCod;
	}
	public void setRegCamCod(int regCamCod) {
		RegCamCod = regCamCod;
	}
	public String getRegCamDes() {
		return RegCamDes;
	}
	public void setRegCamDes(String regCamDes) {
		RegCamDes = regCamDes;
	}
	public Colaborador getColCod() {
		return ColCod;
	}
	public void setColCod(Colaborador colCod) {
		ColCod = colCod;
	}

	
}
