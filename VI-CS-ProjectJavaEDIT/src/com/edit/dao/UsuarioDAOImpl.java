package com.edit.dao;

import java.util.List;

import com.edit.controller.Coordinador;
import com.edit.model.Persona;
import com.edit.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO{

	private Coordinador miCoordinador;

<<<<<<< HEAD
=======
	@Override
	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> maraza

	@Override
	public void agregar(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int PersonaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
		
	}

	public boolean validar(String text) {
		System.out.println("Validando dotas en UsuarioDAOImpl");
		return false;
	}

	@Override
	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
