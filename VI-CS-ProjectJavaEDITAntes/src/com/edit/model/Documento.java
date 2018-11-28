package com.edit.model;

import java.util.Date;

public class Documento {

	private int DocNum;
	private Empresa DocEmp;
	private Colaborador DocCol;
	private Date FecEmi;
	private Pedido DocPed;
	private Estado DocEst;
	private Tipo_Pago DocTipPag;
	private Date DocFecVenCre;
	private int DocConDia;
	
	public int getNumeroDocumento() {
		return DocNum;
	}

	public void setNumeroDocumento(int docNum) {
		DocNum = docNum;
	}


	

	public Colaborador getColaborador() {
		return DocCol;
	}

	public void setColaborador(Colaborador docCol) {
		DocCol = docCol;
	}

	public Date getFechaEmision() {
		return FecEmi;
	}

	public void setFechaEmision(Date fecEmi) {
		FecEmi = fecEmi;
	}

	public Pedido getPedido() {
		return DocPed;
	}

	public void setPedido(Pedido docPed) {
		DocPed = docPed;
	}

	public Estado getEstado() {
		return DocEst;
	}

	public void setEstado(Estado docEst) {
		DocEst = docEst;
	}

	public Tipo_Pago getTipoPago() {
		return DocTipPag;
	}

	public void setTipoPago(Tipo_Pago docTipPag) {
		DocTipPag = docTipPag;
	}

	public Date getFechaVencimientoCredito() {
		return DocFecVenCre;
	}

	public void setFechaVencimientoCredito(Date docFecVenCre) {
		DocFecVenCre = docFecVenCre;
	}

	public int getDocConDia() {
		return DocConDia;
	}

	public void setDocConDia(int docConDia) {
		DocConDia = docConDia;
	}

	public Documento() {
		// TODO Auto-generated constructor stub
	}

public void Aprobacion() {
		
	}
	
public void ContadorDias() {
	
}


	
	
}
