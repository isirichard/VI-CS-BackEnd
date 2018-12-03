package com.edit.model;

import java.util.Date;

public class Registro_Cambios_Cliente extends Registro_Cambios{
	private Cliente CliCod;
	
	
	public Registro_Cambios_Cliente() {
		
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
	public Cliente getCliCod() {
		return CliCod;
	}
	public void setCliCod(Cliente cliCod) {
		CliCod = cliCod;
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
