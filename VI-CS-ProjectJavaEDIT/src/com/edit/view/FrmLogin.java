package com.edit.view;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class FrmLogin extends JFrame {
	private JTextField txtUsuario;
	private JPasswordField txtcontraseña;
	private JLabel lblUsuario,lblContraseña,lblimagen;
	private JButton btnIngresar,btnCancelar;
	public FrmLogin() {
		setTitle("LOGIN");
		setSize(300, 420);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setLocationRelativeTo(null);
		//getContentPane().setBackground(UIManager.getColor("Button.background"));
		setResizable(false);
		setIconImage(logo);
		
		
		
		lblimagen = new JLabel("");
		lblimagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Usuario.png")));
		lblimagen.setBounds(85, 33, 150, 162);
		getContentPane().add(lblimagen);
		
		lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUsuario.setBounds(38, 222, 46, 14);
		getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(85, 219, 163, 21);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContraseña = new JLabel("Contrase\u00F1a: ");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblContraseña.setBounds(20, 264, 63, 14);
		getContentPane().add(lblContraseña);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnIngresar.setBounds(38, 319, 89, 23);
		getContentPane().add(btnIngresar);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIngresarAccion(e);
			}
		});
		
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCancelar.setBounds(159, 319, 89, 23);
		getContentPane().add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelarAccion(e);
			}
		});
		
		txtcontraseña = new JPasswordField();
		txtcontraseña.setBounds(85, 261, 163, 21);
		getContentPane().add(txtcontraseña);
		
	}
	private void btnIngresarAccion(ActionEvent e) {
		MDIPrincipal principal = new MDIPrincipal();
		principal.setVisible(true);
		setLocationRelativeTo(null);
		this.dispose();
	}
	private void btnCancelarAccion(ActionEvent e) {
		System.exit(0);
	}
}
