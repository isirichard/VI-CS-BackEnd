package com.edit.dao;

import com.edit.model.Persona;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;



public class Test {
	public static Persona UltimoRegistro() {
		 Connection cx;
		cx = Conexion.conectar();
		Persona persona = new Persona();
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT*FROM persona order by PerCod desc limit 1");
            //System.out.println( resultSet.getInt("PerCod") + " " + resultSet.getString("PerNom")+" " +resultSet.getString("PerApe") );
			if(resultSet.next()){
			persona.setCodigo(resultSet.getInt("PerCod"));
			persona.setNombre(resultSet.getString("PerNom"));
			persona.setApellido(resultSet.getString("PerApe"));
			}
			  System.out.println("acabe de sacar");
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persona;
	}
	public static void main(String[] args) {
		
		Persona p = UltimoRegistro();
		
		System.out.println(p.getCodigo());
		//IPersonaDAO dao = new PersonaDAOImpl();
		//Persona per = new Persona();
		
		//per.setNombres("Mito");
		//per.setApellidos("Code");
		//dao.agregar(per);
		
		//List<Persona> lista = dao.listarTodos();
		//lista.forEach(x -> System.out.println(x.getId() + "-" + x.getNombres() + "-" + x.getApellidos()));
		
		//for(Persona x : lista){
			//System.out.println(x.getId() + "-" + x.getNombres() + "-" + x.getApellidos());
		//}
	}
}
