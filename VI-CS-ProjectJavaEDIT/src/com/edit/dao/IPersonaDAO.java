package com.edit.dao;

import java.util.List;

import com.edit.model.Persona;

public interface IPersonaDAO {

	void agregar(Persona Persona);

	public void eliminar(int PersonaId);

	public void actualizar(Persona Persona);

	public List<Persona> listarTodos();

	public Persona listarPorId(int id);
}
