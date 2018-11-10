package com.edit.model;

import java.util.ArrayList;

public class Cliente extends Persona {
	private int CliCod;
	private Tipo_Cliente CliTip;
	private ArrayList<Nota_Venta> CliNotVen;
	private double CliLinCre;
	
	public Cliente() {
		super();
	}

	public int getCodigo() {
		return CliCod;
	}

	public void setCodigo(int cliCod) {
		this.CliCod = cliCod;
	}

	public Tipo_Cliente getTipoCliente() {
		return CliTip;
	}

	public void setTipoCliente(Tipo_Cliente cliTip) {
		this.CliTip = cliTip;
	}

	public ArrayList<Nota_Venta> getNotasVenta() {
		return CliNotVen;
	}

	public void setNotasVenta(ArrayList<Nota_Venta> cliNotVen) {
		this.CliNotVen = cliNotVen;
	}
	
	public String toString() {
		
	}
	

	public double getCliLinCre() {
		return CliLinCre;
	}

	public void setCliLinCre(double cliLinCre) {
		CliLinCre = cliLinCre;
	}
	
	

}
