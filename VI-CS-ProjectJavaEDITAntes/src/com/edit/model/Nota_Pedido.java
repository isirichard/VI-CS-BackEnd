package com.edit.model;

public class Nota_Pedido {
	private Proveedor NotPedProv;
	
	public Nota_Pedido() {}
	
	public Proveedor getProveedor() {
		return NotPedProv;
	}
	public void AprobarSalidaMercaderia(Proveedor NotPedProv) {
		this.NotPedProv=NotPedProv;
		
	}
}
