package com.edit.dao;

import java.util.List;

import com.edit.model.Persona;

public interface CRUD<T> {
	public List<T> listarTodos();
	public T listarPorId(int id);
	public void agregar(T t);
	public void eliminar(int id);
	public void actualizar(T t);
		
}
