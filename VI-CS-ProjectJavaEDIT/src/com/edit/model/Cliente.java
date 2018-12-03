package com.edit.model;

public class Cliente extends Persona{
	private int CliCod;
	private Estado EstCodCli;
	private Tipo_Cliente TipCliCod;
	private double Linea,LineaDisponible,DeudaTotal,DeudaVencida,DeudanoVencida;
	private String Calificacion;
	
	public double getLinea() {
		return Linea;
	}
	public void setLinea(double linea) {
		Linea = linea;
	}
	public double getLineaDisponible() {
		return LineaDisponible;
	}
	public void setLineaDisponible(double lineaDisponible) {
		LineaDisponible = lineaDisponible;
	}
	public double getDeudaTotal() {
		return DeudaTotal;
	}
	public void setDeudaTotal(double deudaTotal) {
		DeudaTotal = deudaTotal;
	}
	public double getDeudaVencida() {
		return DeudaVencida;
	}
	public void setDeudaVencida(double deudaVencida) {
		DeudaVencida = deudaVencida;
	}
	public double getDeudanoVencida() {
		return DeudanoVencida;
	}
	public void setDeudanoVencida(double deudanoVencida) {
		DeudanoVencida = deudanoVencida;
	}
	public String getCalificacion() {
		return Calificacion;
	}
	public void setCalificacion(String calificacion) {
		Calificacion = calificacion;
	}
	public Tipo_Cliente getTipCliCod() {
		return TipCliCod;
	}
	public void setTipCliCod(Tipo_Cliente tipCliCod) {
		TipCliCod = tipCliCod;
	}
	public Estado getEstCodCli() {
		return EstCodCli;
	}
	public void setEstCodCli(Estado estCodCli) {
		EstCodCli = estCodCli;
	}
	public int getCliCod() {
		return CliCod;
	}
	public void setCliCod(int cliCod) {
		CliCod = cliCod;
	}
	
	public Cliente() {
		
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