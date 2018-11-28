package com.edit.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class FrmAumentoLinea extends JFrame{
	private JPanel jpDatosCliente,jpTipoCliente,jpLinea;
	private JLabel lblTipoDOC,lblNro,lblCliente,lblEstado1,lblEstado,lblTipoCliente1,lblTipoCliente,lblLineaActual,lblLineaNueva;
	private JTextField txtTipoDOC,txtNro,txtCliente,txtLineaActual,txtLineaNueva;
	private JButton btnBuscar,btnGuardar,btnSalir;
	
	public FrmAumentoLinea() {
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Aumento Linea");
		setResizable(false);
		setSize(419,325);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setIconImage(logo);
		
		
		
		
		jpDatosCliente = new JPanel();
		jpDatosCliente.setBounds(10, 11, 382, 96);
		jpDatosCliente.setBorder(new TitledBorder(null, "Datos Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(jpDatosCliente);
		jpDatosCliente.setLayout(null);
		
		lblTipoDOC = new JLabel("Tipo DOC:");
		lblTipoDOC.setForeground(new Color(33, 0, 99));
		lblTipoDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoDOC.setBounds(10, 25, 67, 14);
		jpDatosCliente.add(lblTipoDOC);
		
		lblCliente = new JLabel("Cliente:");
		lblCliente.setForeground(new Color(33, 0, 99));
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCliente.setBounds(10, 60, 46, 14);
		jpDatosCliente.add(lblCliente);
		
		lblNro = new JLabel("Nro:");
		lblNro.setForeground(new Color(33, 0, 99));
		lblNro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNro.setBounds(189, 25, 46, 14);
		jpDatosCliente.add(lblNro);
		
		txtTipoDOC = new JTextField();
		txtTipoDOC.setEditable(false);
		txtTipoDOC.setForeground(new Color(33, 0, 99));
		txtTipoDOC.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTipoDOC.setBounds(65, 20, 56, 25);
		jpDatosCliente.add(txtTipoDOC);
		txtTipoDOC.setColumns(10);
		
		txtNro = new JTextField();
		txtNro.setEditable(false);
		txtNro.setForeground(new Color(0, 0, 139));
		txtNro.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtNro.setColumns(10);
		txtNro.setBounds(223, 20, 149, 25);
		jpDatosCliente.add(txtNro);
		
		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		txtCliente.setForeground(new Color(33, 0, 99));
		txtCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCliente.setColumns(10);
		txtCliente.setBounds(66, 57, 306, 25);
		jpDatosCliente.add(txtCliente);
		
		btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(125, 20, 37, 23);
		jpDatosCliente.add(btnBuscar);
		
		jpTipoCliente = new JPanel();
		jpTipoCliente.setBounds(10, 118, 179, 96);
		jpTipoCliente.setBorder(new TitledBorder(null, "Tipo Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(jpTipoCliente);
		jpTipoCliente.setLayout(null);
		
		lblEstado1 = new JLabel("Estado:");
		lblEstado1.setForeground(new Color(33, 0, 99));
		lblEstado1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEstado1.setBounds(10, 25, 46, 14);
		jpTipoCliente.add(lblEstado1);
		
		lblTipoCliente1 = new JLabel("Tipo Cliente:");
		lblTipoCliente1.setForeground(new Color(33, 0, 99));
		lblTipoCliente1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoCliente1.setBounds(10, 60, 69, 14);
		jpTipoCliente.add(lblTipoCliente1);
		
		lblEstado = new JLabel("ACTIVO");
		lblEstado.setForeground(new Color(33, 0, 99));
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstado.setBounds(81, 25, 88, 14);
		jpTipoCliente.add(lblEstado);
		
		lblTipoCliente = new JLabel("CREDITO");
		lblTipoCliente.setForeground(new Color(33, 0, 99));
		lblTipoCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoCliente.setBounds(81, 60, 88, 14);
		jpTipoCliente.add(lblTipoCliente);
		
		jpLinea = new JPanel();
		jpLinea.setBounds(199, 118, 191, 96);
		jpLinea.setBorder(new TitledBorder(null, "Linea", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(jpLinea);
		jpLinea.setLayout(null);
		
		lblLineaActual = new JLabel("Linea Actual:");
		lblLineaActual.setForeground(new Color(33, 0, 99));
		lblLineaActual.setBounds(10, 25, 75, 14);
		jpLinea.add(lblLineaActual);
		
		lblLineaNueva = new JLabel("Linea Nueva:");
		lblLineaNueva.setForeground(new Color(33, 0, 99));
		lblLineaNueva.setBounds(10, 60, 75, 14);
		jpLinea.add(lblLineaNueva);
		
		txtLineaActual = new JTextField();
		txtLineaActual.setEditable(false);
		txtLineaActual.setForeground(new Color(33, 0, 99));
		txtLineaActual.setBounds(95, 20, 74, 25);
		jpLinea.add(txtLineaActual);
		txtLineaActual.setColumns(10);
		
		txtLineaNueva = new JTextField();
		txtLineaNueva.setForeground(new Color(33, 0, 99));
		txtLineaNueva.setColumns(10);
		txtLineaNueva.setBounds(95, 55, 74, 25);
		jpLinea.add(txtLineaNueva);
		
		btnGuardar = new JButton("");
		btnGuardar.setBounds(100, 225, 80, 42);
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		getContentPane().add(btnGuardar);
		
		btnSalir = new JButton("");
		btnSalir.setBounds(199, 225, 80, 42);
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		getContentPane().add(btnSalir);
	}
}
