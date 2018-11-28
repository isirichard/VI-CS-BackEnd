package com.edit.dao;

import com.edit.model.Estado;
import com.edit.model.Persona;

public class App {
	public static void main(String[] args) {
		CRUD dao = new EstadoDAOImpl();
		//dao.listarTodos().forEach(x-> System.out.println(x.toString()));
		Estado est = new Estado();
		est.setCodigo(1);
		est.setDescripcion("A");
		dao.agregar(est);
	}
}
