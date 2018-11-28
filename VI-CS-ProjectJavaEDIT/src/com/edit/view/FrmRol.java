package com.edit.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.edit.controller.Coordinador;
import com.edit.model.Acceso;
import com.edit.model.Tipo_Producto;

public class FrmRol extends JFrame{
	private JPanel JPRol,JPtabla;
	private JLabel lblRol;
	private JTextField txtRol,txtRolID;
	private JTable jtabla;
	private JScrollPane JSTabla;
	private JTabbedPane JTable;
	private JButton btnGuardar,btnSalir,btnBuscar;
	private JComboBox JCEstado;
	private Coordinador miCoordinador = new Coordinador();
	public FrmRol() {
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("ROL");
		setResizable(false);
		setSize(406, 468);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);
		
		//categoria productos
		JPRol=new JPanel();
		JPRol.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Rol", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		JPRol.setBounds(20, 30, 350, 115);
		getContentPane().add(JPRol);
		JPRol.setLayout(null);
		
		lblRol = new JLabel("ID: ");
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRol.setBounds(30, 25, 69, 14);
		JPRol.add(lblRol);
		
		txtRolID = new JTextField();
		txtRolID.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtRolID.setBounds(100, 20, 180, 25);
		JPRol.add(txtRolID);
		txtRolID.setColumns(10);
		

		//d
		lblRol = new JLabel("Descripcion: ");
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRol.setBounds(30, 55, 69, 14);
		JPRol.add(lblRol);
		
		txtRol = new JTextField();
		txtRol.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtRol.setBounds(100, 50, 180, 25);
		JPRol.add(txtRol);
		txtRol.setColumns(10);
		//d
		

		//estado
		lblRol = new JLabel("Estado: ");
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRol.setBounds(30, 85, 69, 14);
		JPRol.add(lblRol);
	
		JCEstado = new JComboBox();
		JCEstado.setBounds(100,80, 180, 25);
		JCEstado.addItem("ACTIVO");
		JCEstado.addItem("INACTIVO");
		JCEstado.setEnabled(false);
		JPRol.add(JCEstado);
		//estado
		
		
		
		
		
		
		
		//boton buscar
		btnBuscar=new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(290,38,37,25);
		JPRol.add(btnBuscar);
		
		
		//Table
		JPtabla = new JPanel();
		JPtabla.setBorder(new TitledBorder(null, "Tabla", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPtabla.setBounds(20, 141, 350, 188);
		getContentPane().add(JPtabla);
		JPtabla.setLayout(null);
		
		
		
		JSTabla = new JScrollPane();
		JSTabla.setBounds(30, 28, 300, 149);
		JPtabla.add(JSTabla);
		JSTabla.setViewportView(JTable);
		
		jtabla = new JTable() {
			public boolean isCellEditable(int rowIndex,int colIndex) {
				return false;
			}
		};
		
		
		/*
		jtabla.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null},
					{null, null, null},
					{null, null, null}
					
				},
				new String[] {
						"ID", "DESCRIPCION", "ESTADO"
						}
				));
		*/
		jtabla.setModel(new DefaultTableModel(
				datosTabla(),
				new String[] {
						"ID", "DESCRIPCION", "ESTADO"
						}
				));
		
		
		JSTabla.setViewportView(jtabla);
		
		
		
		
		
		
		
		
		//botones
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(94, 359, 80, 42);
		getContentPane().add(btnGuardar);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGuardarAccion(e);
			}
		});
		
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(216, 359, 80, 42);
		getContentPane().add(btnSalir);
			
		
	}
	
	private void btnGuardarAccion(ActionEvent e) {
		
		try {
		Acceso ac = new Acceso();
		ac.setCodigo(Integer.parseInt(txtRolID.getText()));
		ac.setDescripcion(txtRol.getText());
		miCoordinador.setAcceso(ac);
		System.out.println("INGRESO");
		}catch(Exception e1) {
			System.out.println(e1);
		}
	
		
		
		actualizarTabla();
		txtRolID.setText("");
		txtRol.setText("");
		
	}
	
	private String [] [] datosTabla() {
		List<Acceso> accesos = miCoordinador.getAccesos();
		String [][] arreglo = new String [accesos.size()][3];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo [i][0] =""+accesos.get(i).getCodigo();
			arreglo [i][1] =""+accesos.get(i).getDescripcion();
			arreglo [i][2] =""+accesos.get(i).getEstado().getDescripcion();
			System.out.println(arreglo[i][0]);
		}
		return arreglo;
	}
	
	private void actualizarTabla() {
		jtabla.setModel(new DefaultTableModel(
				datosTabla(),
				new String[] {
						"ID", "DESCRIPCION", "ESTADO"
						}
				));
		
		
		JSTabla.setViewportView(jtabla);
	}
	
	
}
