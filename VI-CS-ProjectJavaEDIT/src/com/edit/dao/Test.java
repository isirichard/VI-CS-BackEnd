package com.edit.dao;

import com.edit.model.Persona;
import java.util.List;



public class Test {

	public static void main(String[] args) {
		IPersonaDAO dao = new PersonaDAOImpl();
		Persona per = new Persona();
		
		//per.setNombres("Mito");
		//per.setApellidos("Code");
		//dao.agregar(per);
		
		List<Persona> lista = dao.listarTodos();
		//lista.forEach(x -> System.out.println(x.getId() + "-" + x.getNombres() + "-" + x.getApellidos()));
		
		for(Persona x : lista){
			//System.out.println(x.getId() + "-" + x.getNombres() + "-" + x.getApellidos());
		}
	}
}
