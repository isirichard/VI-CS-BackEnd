package com.edit.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class FrmBloqueoProveedor extends JFrame {
	JLabel lblTipoDOC,lblNroDOC,lblProveedor,lblApellido,lblEstado;
	JPanel jpDatosCliente,jpEstado;
	JTextField txtTipoDOC,txtNroDOC,txtNombre,txtApellido;
	JComboBox jcEstado;
	JButton btnGuardar,btnSalir;
	public FrmBloqueoProveedor() {
		
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Bloquear Proveedor");
		setResizable(false);
		setSize(410,348);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setIconImage(logo);
		
		
		
		
		jpDatosCliente = new JPanel();
		jpDatosCliente.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Proveedor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		jpDatosCliente.setBounds(10, 11, 375, 143);
		getContentPane().add(jpDatosCliente);
		jpDatosCliente.setLayout(null);
		
		lblTipoDOC = new JLabel("Tipo DOC:");
		lblTipoDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoDOC.setBounds(10, 25, 59, 14);
		jpDatosCliente.add(lblTipoDOC);
		
		lblNroDOC = new JLabel("Nro DOC:");
		lblNroDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNroDOC.setBounds(169, 25, 46, 14);
		jpDatosCliente.add(lblNroDOC);
		
		lblProveedor = new JLabel("Proveedor:");
		lblProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblProveedor.setBounds(10, 62, 60, 14);
		jpDatosCliente.add(lblProveedor);
		
//		lblApellido = new JLabel("Apellidos:");
//		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		lblApellido.setBounds(10, 104, 46, 14);
//		jpDatosCliente.add(lblApellido);
		
		txtTipoDOC = new JTextField();
		txtTipoDOC.setEditable(false);
		txtTipoDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTipoDOC.setBounds(63, 20, 63, 25);
		jpDatosCliente.add(txtTipoDOC);
		txtTipoDOC.setColumns(10);
		
		txtNroDOC = new JTextField();
		txtNroDOC.setEditable(false);
		txtNroDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNroDOC.setColumns(10);
		txtNroDOC.setBounds(225, 22, 125, 25);
		jpDatosCliente.add(txtNroDOC);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNombre.setColumns(10);
		txtNombre.setBounds(63, 59, 287, 25);
		jpDatosCliente.add(txtNombre);
//		
//		txtApellido = new JTextField();
//		txtApellido.setEditable(false);
//		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		txtApellido.setColumns(10);
//		txtApellido.setBounds(63, 99, 287, 25);
//		jpDatosCliente.add(txtApellido);
//		
		jpEstado = new JPanel();
		jpEstado.setBorder(new TitledBorder(null, "Estado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpEstado.setBounds(10, 165, 375, 70);
		getContentPane().add(jpEstado);
		jpEstado.setLayout(null);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEstado.setBounds(10, 29, 46, 14);
		jpEstado.add(lblEstado);
		
		jcEstado = new JComboBox();
		jcEstado.setBounds(63, 24, 180, 25);
		jpEstado.add(jcEstado);
		
		btnGuardar = new JButton("");
		btnGuardar.setBounds(99, 246, 80, 42);
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		getContentPane().add(btnGuardar);
		
		btnSalir = new JButton("");
		btnSalir.setBounds(215, 246, 80, 40);
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		getContentPane().add(btnSalir);
	}

}
