package com.edit.dao;

import java.sql.Connection;
import java.util.List;

import com.edit.model.Persona;
import com.edit.model.Producto;

public class ProductoDAOImpl implements ProductoDAO{

	
	public ProductoDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Producto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Producto t) {
		// TODO Auto-generated method stub
		/*INSERTAR
		try {
		PreparedStatement pst1 = cn.prepareStatement("INSERT INTO probtabla (probId,probName,probLastName) VALUES (?,?,?)");
		//PreparedStatement pst1 = cn.prepareStatement("INSERT INTO `probtabla` (`probId`, `probName`, `probLastName`) VALUES (NULL, 'xddd', 'dx')");
		pst1.setString(1,null);
		pst1.setString(2, "DIEdGO");
		pst1.setString(3, "Maraza");
		pst1.executeUpdate();
		System.out.println("SE GUARDO EL USUARIO");
		}catch(Exception e) {
			System.out.println("NO SE PUDO INGRESAR"+e);
		}
		
*/		

	}

	@Override
	public void eliminar(int PersonaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Producto t) {
		// TODO Auto-generated method stub
		
	}

}
