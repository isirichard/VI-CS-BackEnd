package com.edit.model;

public class Persona {

	private int PerCod;
	private Tipo_Documento PerTipDoc;
	private String PerNumDoc;
	private String PerNom;
	private String PerApe;
	private String PerDir;
	private String PerTel;

	private String Celular;
	private Estado PerEst; //estado de registro
	

	private String PerCel;
	public String getCeluar() {
		return PerCel;
	}

	public void setCelular(String perCel) {
		PerCel = perCel;
	}

	private Estado PerEst;

	
	public Persona() {
		
	}

	
	public Persona(int perCod, Tipo_Documento perTipDoc, String perNumDoc, String perNom, String perApe, String perDir,
			String perTel, String celular, Estado perEst) {
		super();
		PerCod = perCod;
		
		PerTipDoc = perTipDoc;
		PerNumDoc = perNumDoc;
		PerNom = perNom;
		PerApe = perApe;
		PerDir = perDir;
		PerTel = perTel;
		Celular = celular;
		PerEst = perEst;
	}

	public int getCodigo() {
		return PerCod;
	}

	public void setCodigo(int perCod) {
		this.PerCod = perCod;
	}

	public Tipo_Documento getTipoDocumento() {
		return PerTipDoc;
	}

	public void setTipoDocumento(Tipo_Documento perTipDoc) {
		this.PerTipDoc = perTipDoc;
	}

	public String getNumeroDocumento() {
		return PerNumDoc;
	}

	public void setNumeroDocumento(String perNumDoc) {
		this.PerNumDoc = perNumDoc;
	}

	public String getNombre() {
		return PerNom;
	}

	public void setNombre(String perNom) {
		this.PerNom = perNom;
	}

	public String getApellido() {
		return PerApe;
	}

	public void setApellido(String perApe) {
		this.PerApe = perApe;
	}

	public String getDireccion() {
		return PerDir;
	}

	public void setDireccion(String perDir) {
		this.PerDir = perDir;
	}

	public String getTelefono() {
		return PerTel;
	}

	public void setTelefono(String perTel) {
		this.PerTel = perTel;
	}

	public Estado getEstado() {
		return PerEst;
	}

	public void setEstado(Estado perEst) {
		this.PerEst = perEst;
	}

	public String getCeluar() {
		// TODO Auto-generated method stub
		return Celular;
	}
	
}
