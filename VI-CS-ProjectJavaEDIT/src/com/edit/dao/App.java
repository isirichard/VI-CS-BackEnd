package com.edit.dao;

import com.edit.model.Estado;
import com.edit.model.Persona;

public class App {
	public static void main(String[] args) {
		CRUD dao = new EstadoDAOImpl();
		//dao.listarTodos().forEach(x-> System.out.println(x.toString()));
		//Codigo internos para estado
		Estado estActivo = new Estado();
		estActivo.setCodigo(1);
		estActivo.setDescripcion("A");
		dao.agregar(estActivo);
		Estado estInactivo = new Estado();
		estInactivo.setCodigo(2);
		estInactivo.setDescripcion("I");
		dao.agregar(estInactivo);
		Estado estAsterisco = new Estado();
		estAsterisco.setCodigo(3);
		estAsterisco.setDescripcion("*");
		dao.agregar(estAsterisco);
	}
}
