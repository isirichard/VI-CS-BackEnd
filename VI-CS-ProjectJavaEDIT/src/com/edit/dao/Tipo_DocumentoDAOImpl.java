package com.edit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.edit.controller.Coordinador;
import com.edit.model.Tipo_Documento;

public class Tipo_DocumentoDAOImpl implements Tipo_DocumentoDAO {
private Connection cx;
private Coordinador miCoordinador;
	
	public Tipo_DocumentoDAOImpl() {
		cx = Conexion.conectar();
	}
	
	

	@Override
	public List<Tipo_Documento> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tipo_Documento listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Tipo_Documento t) {
		// TODO Auto-generated method stub
		try {
			String sql = "INSERT INTO TIPO_DOCUMENTO(TipDocCod, TipDocDes, EstCod ) VALUES (?,?,?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			
			preparedStatement.setInt(1, t.getCodigo());
			preparedStatement.setString(2, t.getDescripcion());
		//	preparedStatement.setInt(3, t.getEstado().getCodigo());
			preparedStatement.setInt(3, 1);
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Tipo_Documento t) {
		// TODO Auto-generated method stub
		
	}



	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}



	

}
