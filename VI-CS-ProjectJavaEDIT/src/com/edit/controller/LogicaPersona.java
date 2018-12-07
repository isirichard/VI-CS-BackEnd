package com.edit.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import com.edit.dao.Conexion;
import com.edit.model.Acceso;
import com.edit.model.Cliente;
import com.edit.model.Colaborador;
import com.edit.model.Estado;
import com.edit.model.Persona;
import com.edit.model.Proveedor;
import com.edit.model.Tipo_Cliente;
import com.edit.model.Tipo_Documento;



public class LogicaPersona {
	private Connection con=Conexion.conectar();
	private String Sql="";
	public LogicaPersona() {

	}
	public void asignarDatosPersona(Persona p) {
		Sql="select TipDocCod,PerNro,PerNom,PerDir,PerTel,PerCel"
				+ " From Persona where PerCod='"+p.getPerCod()+"'";

		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(Sql);
			if(rs.next()) {
				Tipo_Documento doc=new Tipo_Documento();
				doc.setCodigo(rs.getInt("TipDocCod"));
				p.setPerTipDoc(doc);
				p.setPerNumDoc(rs.getString("PerNro"));
				p.setPerNom(rs.getString("PerNom"));
				p.setPerDir(rs.getString("PerDir"));
				p.setPerTel(rs.getString("PerTel"));
				p.setPerCel(rs.getString("PerCel"));

			}

		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
	public void asignarDatosCliente(Cliente c) {
		asignarDatosPersona(c);
		Sql="select TipCliCod,CliCup From Cliente where CliCod='"+c.getCliCod()+"'";


		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(Sql);
			if(rs.next()) {
				Tipo_Cliente tipo=new Tipo_Cliente();
				tipo.setCodigo(rs.getInt("TipCliCod"));
				c.setTipCliCod(tipo);
				c.setLinea(rs.getDouble("CliCup"));
				System.out.println(c.getPerNom());
			}

		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
	public void asignarDatosProveedor(Proveedor p) {
		asignarDatosPersona(p);

	}
	public void asignarDatosColaborador(Colaborador c) {
		asignarDatosPersona(c);
		Sql="Select ColUsu,ColPas,AccCod From Colaborador where ColCod='"+c.getColCod()+"'";
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(Sql);
			if(rs.next()) {
				c.setColUsu(rs.getString("ColUsu"));
				c.setColPas(rs.getString("ColPas"));
				Acceso acc=new Acceso();
				acc.setCodigo(rs.getInt("AccCod"));
				c.setAccCod(acc);
			}

		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

	}

	public boolean InsertarCliente(Cliente c) {

		Sql="insert into Persona(PerNro,PerNom,PerDir,PerTel,PerCel,TipDocCod, EstCod)"
				+ " values (?,?,?,?,?,?,?)";
		String sql2="INSERT INTO CLIENTE(PerCod,TipCliCod,CliCup) "
				+ "values ((select PerCod from Persona order by PerCod desc limit 1),?,?)";
		try {
			PreparedStatement pst= con.prepareStatement(Sql);
			PreparedStatement pst2=con.prepareStatement(sql2);


			pst.setString(1, c.getPerNumDoc());
			pst.setString(2, c.getPerNom());
			pst.setString(3, c.getPerDir());
			pst.setString(4, c.getPerTel());
			pst.setString(5, c.getPerCel());
			pst.setInt(6, c.getPerTipDoc().getCodigo());
			pst.setInt(7, 1);


			pst2.setInt(1, c.getTipCliCod().getCodigo());
			pst2.setDouble(2, c.getLinea());

			int n=pst.executeUpdate();

			if(n!=0) {

				int n2=pst2.executeUpdate();
				if(n2!=0) {
					JOptionPane.showMessageDialog(null,"Cliente Registrado");
					return true;
				}
			}
			else {
				return false;
			}


		}catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		return false;
	}

	public boolean InsertarProveedor(Proveedor c) {
		Sql="insert into Persona(PerNro,PerNom,PerDir,PerTel,PerCel,TipDocCod, EstCod)"
				+ " values (?,?,?,?,?,?,?)";
		//		String sql2="INSERT INTO Proveedor(PerCod,TipCliCod,EstCod) "
		//				+ "values ((select PerCod from Persona order by PerCod desc limit 1),?,?)";
		String sql2="INSERT INTO Proveedor(PerCod,EstCod) "
				+ "values ((select PerCod from Persona order by PerCod desc limit 1),?)";
		try {
			PreparedStatement pst= con.prepareStatement(Sql);
			PreparedStatement pst2=con.prepareStatement(sql2);


			pst.setString(1, c.getPerNumDoc());
			pst.setString(2, c.getPerNom());
			pst.setString(3, c.getPerDir());
			pst.setString(4, c.getPerTel());
			pst.setString(5, c.getPerCel());
			pst.setInt(6, c.getPerTipDoc().getCodigo());
			pst.setInt(7, 1);


			//			pst2.setInt(1, );
			pst2.setDouble(1, 1);

			int n=pst.executeUpdate();

			if(n!=0) {

				int n2=pst2.executeUpdate();
				if(n2!=0) {
					JOptionPane.showMessageDialog(null,"Cliente Registrado");
					return true;
				}
			}
			else {
				return false;
			}


		}catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		return false;
	}

	public boolean InsertarColaborador(Colaborador c) {
		Sql="insert into Persona(PerNro,PerNom,PerDir,PerTel,PerCel,TipDocCod, EstCod)"
				+ " values (?,?,?,?,?,?,?)";

		String sql2="INSERT INTO Colaborador(PerCod,ColUsu,ColPas,AccCod) "
				+ "values ((select PerCod from Persona order by PerCod desc limit 1),?,?,?)";
		try {
			PreparedStatement pst= con.prepareStatement(Sql);
			PreparedStatement pst2=con.prepareStatement(sql2);


			pst.setString(1, c.getPerNumDoc());
			pst.setString(2, c.getPerNom());
			pst.setString(3, c.getPerDir());
			pst.setString(4, c.getPerTel());
			pst.setString(5, c.getPerCel());
			pst.setInt(6, c.getPerTipDoc().getCodigo());
			pst.setInt(7, 1);


			//			pst2.setInt(1, );
			pst2.setString(1, c.getColUsu());
			pst2.setString(2, c.getColPas());
			pst2.setInt(3, c.getAccCod().getCodigo());

			int n=pst.executeUpdate();

			if(n!=0) {

				int n2=pst2.executeUpdate();
				if(n2!=0) {
					JOptionPane.showMessageDialog(null,"Colaborador Registrado");
					return true;
				}
			}
			else {
				return false;
			}


		}catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		return false;
	}

	public void asignarPerCod_PerCli(Cliente cliente) {

		ValidarPersona(cliente);
		String Sql2="Insert into Cliente(PerCod,TipCliCod,EstCod,CliCup) values(?,?,?,?)";
		try {
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery(Sql);
			PreparedStatement pst2=con.prepareStatement(Sql2);

			if(rs1.next()) {


				
				pst2.setInt(1,cliente.getPerCod());


				pst2.setInt(2, cliente.getTipCliCod().getCodigo());
				pst2.setInt(3, 1);
				pst2.setDouble(4, cliente.getLinea());
				pst2.executeUpdate();

				JOptionPane.showMessageDialog(null,"Cliente Creado");
			}


		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

	public void asignarPerCod_ProvCod(Proveedor p) {
		ValidarPersona(p);
		String Sql2="Insert into Proveedor(PerCod,EstCod) values(?,?)";
		try {
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery(Sql);
			PreparedStatement pst2=con.prepareStatement(Sql2);

			if(rs1.next()) {



				pst2.setInt(1,p.getPerCod());


				pst2.setInt(2, 1);
				pst2.executeUpdate();

				JOptionPane.showMessageDialog(null,"Proveedor Creado");
			}


		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

	public void asignarPerCod_ColCod(Colaborador c) {

		ValidarPersona(c);
		String Sql2="Insert into Colaborador(PerCod,ColUsu,ColPas,AccCod) values(?,?,?,?)";
		try {
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery(Sql);
			PreparedStatement pst2=con.prepareStatement(Sql2);

			if(rs1.next()) {



				pst2.setInt(1,c.getPerCod());
				pst2.setString(2,c.getColUsu());
				pst2.setString(3, c.getColPas());
				pst2.setInt(4, c.getAccCod().getCodigo());
				
				
				pst2.executeUpdate();

				JOptionPane.showMessageDialog(null,"Colaborador Creado");
			}


		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

	public boolean ValidarPersona(Persona p) {
		int resultado=0;
		String sql="select TipDocCod,PerNro, PerCod "
				+ " From Persona "
				+ "where Persona.TipDocCod='"+p.getPerTipDoc().getCodigo()+"' and Persona.PerNro='"+p.getPerNumDoc()+"'" ;

		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next()) {
				resultado=1;
				if(resultado==1) {
					p.setPerCod(rs.getInt("PerCod"));
					System.out.println(p.getPerCod());
					JOptionPane.showMessageDialog(null,"Persona Encontrada");
					return true;
				}
			}

		}catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		return false;

	}

	public boolean validarCliente(Cliente c) {
		int resultado=0;
		String sql1="select Persona.perCod,Cliente.PerCod, Persona.TipDocCod, Cliente.CliCod "
				+ "From Persona, Cliente"
				+ " where (Persona.TipDocCod='"+c.getPerTipDoc().getCodigo()+"' and Persona.PerNro='"+c.getPerNumDoc()+"') and Persona.perCod=Cliente.PerCod " ;

		try {
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery(sql1);
			//			
			if(rs1.next()) {
				resultado=1;
				if(resultado==1) {
					c.setPerCod(rs1.getInt("Persona.PerCod"));
					c.setCliCod(rs1.getInt("CliCod"));
					JOptionPane.showMessageDialog(null,"Cliente ya existe");
					return true;

				}
			}

						



		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
			return false;
		}
		return false;

	}

	public boolean validarProveedor(Proveedor c) {
		int resultado=0;
		String sql1="select Persona.perCod,Proveedor.PerCod, Persona.TipDocCod, Proveedor.ProvCod "
				+ "From Persona, Proveedor"
				+ " where (Persona.TipDocCod='"+c.getPerTipDoc().getCodigo()+"' and Persona.PerNro='"+c.getPerNumDoc()+"') and Persona.perCod=Proveedor.PerCod " ;

		try {
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery(sql1);
			//			
			if(rs1.next()) {
				resultado=1;
				if(resultado==1) {
					c.setPerCod(rs1.getInt("Persona.PerCod"));
					c.setProvCod(rs1.getInt("ProvCod"));
					JOptionPane.showMessageDialog(null,"Proveedor ya existe");
					return true;

				}
			}

						



		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
			return false;
		}
		return false;
	}



	public boolean validarColaborador(Colaborador c) {
		int resultado=0;
		String sql1="select Persona.perCod,Colaborador.PerCod, Persona.TipDocCod, Colaborador.ColCod "
				+ "From Persona, Colaborador"
				+ " where (Persona.TipDocCod='"+c.getPerTipDoc().getCodigo()+"' and Persona.PerNro='"+c.getPerNumDoc()+"') and Persona.perCod=Colaborador.PerCod " ;

		try {
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery(sql1);
			//			
			if(rs1.next()) {
				resultado=1;
				if(resultado==1) {
					c.setPerCod(rs1.getInt("Persona.PerCod"));
					c.setColCod(rs1.getInt("ColCod"));
					JOptionPane.showMessageDialog(null,"Colaborador ya existe");
					return true;

				}
			}

						



		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
			return false;
		}
		return false;

	}

	
	
	public boolean ModificarPersona(Persona p) {
		String sql="UPDATE Persona set PerNom=?, PerDir=?,PerCel=?,PerTel=? where PerCod="+p.getPerCod();
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,p.getPerNom());
			pst.setString(2,p.getPerDir() );
			pst.setString(3, p.getPerCel());
			pst.setString(4, p.getPerTel());

			int n=pst.executeUpdate();
			if(n!=0) {
				System.out.println("se Modifico una Persona "+p.getPerCod());
				return true;
			}
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return false;
	}
	public void ModificarCliente(Cliente cliente) {
		ModificarPersona(cliente);
//		String sql="UPDATE Persona set PerNom=?, PerDir=?,PerTel=?,PerCel=? where PerCod=?";
		String sql2="UPDATE Cliente set TipCliCod=?,CliCup=? where CliCod=?";
		try {
//			PreparedStatement pst=con.prepareStatement(sql);
			PreparedStatement pst2=con.prepareStatement(sql2);
//			pst.setString(1,cliente.getPerNom());
//			pst.setString(2,cliente.getPerDir() );
//			pst.setString(3, cliente.getPerCel());
//			pst.setString(4, cliente.getPerTel());
//			pst.setInt(5, cliente.getPercod());
			
			
			pst2.setInt(1, cliente.getTipCliCod().getCodigo());
			pst2.setDouble(2, cliente.getLinea());
			pst2.setInt(3, cliente.getCliCod());
			
//			int n=pst.executeUpdate();
			int n=pst2.executeUpdate();
			
				int n2=pst2.executeUpdate();
				if(n2!=0) {

					JOptionPane.showMessageDialog(null,"Datos Actualizados");
				}
			

		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}

	public void ModificarColaborador(Colaborador c) {
		String sql="UPDATE Persona set PerNom=?, PerDir=?,PerCel=?,PerTel=? where PerCod=?";
		String sql2="UPDATE Colaborador set ColUsu=?,ColPas=?,AccCod=? where ColCod=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			PreparedStatement pst2=con.prepareStatement(sql2);
			pst.setString(1,c.getPerNom());
			pst.setString(2,c.getPerDir() );
			pst.setString(3, c.getPerCel());
			pst.setString(4, c.getPerTel());
			pst.setInt(5, c.getPercod());
			pst2.setString(1, c.getColUsu());
			pst2.setString(2, c.getColPas());
			pst2.setInt(3, c.getAccCod().getCodigo());
			pst2.setInt(4, c.getColCod());
			System.out.println(c.getPerCod());
			int n=pst.executeUpdate();
			if(n!=0) {
				int n2=pst2.executeUpdate();
				if(n2!=0) {

					JOptionPane.showMessageDialog(null,"Datos Actualizados");
				}
			}

		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
	}

	

	public void ModificarProveedor(Proveedor p) {
		ModificarPersona(p);
	}

}
