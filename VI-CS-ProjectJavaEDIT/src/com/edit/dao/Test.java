package com.edit.dao;

import com.edit.model.Estado;
import com.edit.model.Persona;
import com.edit.model.Tipo_Documento;

import java.util.List;



public class Test {

	public static void main(String[] args) {
		
		
		
		IPersonaDAO dao = new PersonaDAOImpl();
		Persona per = new Persona();
		Estado est = new Estado();
		Tipo_Documento documento = new Tipo_Documento();
		documento.setCodigo(1);
		documento.setDescripcion(1);
		documento.setEstado(est);
		
		est.setCodigo(1);
		est.setDescripcion("activo");
		
		per.setNombre("Mito");
		per.setApellido("Code");
		per.setDireccion("calle venezuela");
		per.setEstado(est);
		per.setTelefono("322322");
		per.setNumeroDocumento("48200011");
		per.setTipoDocumento(documento);
		dao.agregar(per);
		
		
		List<Persona> lista = dao.listarTodos();
		//lista.forEach(x -> System.out.println(x.getId() + "-" + x.getNombres() + "-" + x.getApellidos()));
		
		for(Persona x : lista){
			//System.out.println(x.getId() + "-" + x.getNombres() + "-" + x.getApellidos());
		}
	}
}
