package com.edit.model;

import java.util.Date;

public class Registro_Cambios_Proveedor extends Registro_Cambios{
	private Proveedor ProCod;


	public Registro_Cambios_Proveedor() {

	}
	public int getRegCamCod() {
		return super.getRegCamCod();
	}
	public void setRegCamCod(int regCamCod) {
		super.setRegCamCod(regCamCod);
	}
	public String getRegCamDes() {
		return super.getRegCamDes();
	}
	public void setRegCamDes(String regCamDes) {
		super.setRegCamDes(regCamDes);
	}
	public Proveedor getProCod() {
		return ProCod;
	}
	public void setProCod(Proveedor ProCod) {
		this.ProCod = ProCod;
	}
	public Colaborador getColCod() {
		return super.getColCod();
	}
	public void setColCod(Colaborador colCod) {
		super.setColCod(colCod);
	}
	public void setRegCamFec(Date regCamFec) {
		super.setRegCamFec(regCamFec);
	}
	public Date getRegCamFec() {
		return super.getRegCamFec();
	}


}
