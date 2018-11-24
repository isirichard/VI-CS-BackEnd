package com.edit.dao;

import java.util.List;

import com.edit.model.Persona;

public interface CRUD<T> {
	public List<Persona> listarTodos();
	public Persona listarPorId(int id);
	public void agregar(T t);
	public void eliminar(int PersonaId);
	public void actualizar(T t);
		
}
