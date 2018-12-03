package com.edit.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.edit.controller.LogicaReferencial;
import com.edit.model.Acceso;
import com.edit.model.Estado;

public class FrmRefRol extends JFrame{
	private JPanel JPRol,JPtabla;
	private JLabel lblRol;
	private JTextField txtRol;
	private JScrollPane JSTabla;
	private JTable JTable;
	private JButton btnGuardar,btnSalir,btnBuscar;
	private LogicaReferencial logica;
	private Acceso acceso;
	private Estado estado;
	
	public FrmRefRol() {
		acceso=new Acceso();
		logica=new LogicaReferencial();
		estado=new Estado();
		JTable=new JTable();
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
		JPRol.setBounds(20, 30, 350, 100);
		getContentPane().add(JPRol);
		JPRol.setLayout(null);
		
		lblRol = new JLabel("Descripcion: ");
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRol.setBounds(30, 41, 69, 14);
		JPRol.add(lblRol);
		
		txtRol = new JTextField();
		txtRol.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtRol.setBounds(100, 38, 180, 25);
		JPRol.add(txtRol);
		txtRol.setColumns(10);
		
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
		
		//botones
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(94, 359, 80, 42);
		getContentPane().add(btnGuardar);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(216, 359, 80, 42);
		getContentPane().add(btnSalir);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acceso.setDescripcion(txtRol.getText().toUpperCase());
				estado.setCodigo(1);
				acceso.setEstCod(estado);
				logica.btnGuardar(acceso);
				mostrarTabla();
				txtRol.setText("");
			}
		});
		mostrarTabla();
			
		
	}
	public void mostrarTabla() {
		JTable.setModel(logica.mostrarTodoReferencial("Acceso","Acc"));
	}
	
	
}
