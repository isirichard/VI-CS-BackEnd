package com.edit.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class FrmTipoDOC extends JFrame{
	private JPanel JPTipoDOC,JPtabla;
	private JLabel lblTipoDOC;
	private JTextField txtTipoDOC;
	private JScrollPane JSTabla;
	private JTabbedPane JTable;
	private JButton btnGuardar,btnSalir,btnBuscar;
	
	public FrmTipoDOC() {
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Tipo DOC");
		setResizable(false);
		setSize(406, 468);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);
		
		//categoria productos
		JPTipoDOC=new JPanel();
		JPTipoDOC.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo DOC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		JPTipoDOC.setBounds(20, 30, 350, 100);
		getContentPane().add(JPTipoDOC);
		JPTipoDOC.setLayout(null);
		
		lblTipoDOC = new JLabel("Descripcion: ");
		lblTipoDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoDOC.setBounds(30, 41, 69, 14);
		JPTipoDOC.add(lblTipoDOC);
		
		txtTipoDOC = new JTextField();
		txtTipoDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTipoDOC.setBounds(100, 38, 180, 25);
		JPTipoDOC.add(txtTipoDOC);
		txtTipoDOC.setColumns(10);
		
		btnBuscar=new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(290,38,37,25);
		JPTipoDOC.add(btnBuscar);
		
		
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
			
		
	}
	
	
}
