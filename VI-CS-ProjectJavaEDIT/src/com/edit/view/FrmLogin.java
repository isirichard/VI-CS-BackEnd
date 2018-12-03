package com.edit.view;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class FrmLogin extends JFrame {
	private JTextField txtUsuario;
	private JPasswordField txtcontraseña;
	private JLabel lblUsuario,lblContraseña,lblimagen;
	private JButton btnIngresar,btnCancelar;
	
	
	private static FrmLogin login;
	private FrmLogin() {
		
		
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
		txtUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				btnEnter(e);
			}
		});
		
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
//				validarAcceso(e);
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
		txtcontraseña.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				btnEnter(e);
			}
		});
		getContentPane().add(txtcontraseña);
		
	}
	private void btnIngresarAccion(ActionEvent e) {
		MDIPrincipal principal = new MDIPrincipal();
		principal.setVisible(true);
		setLocationRelativeTo(null);
		this.dispose();
	}
	
	public static FrmLogin iniciar() {
		if(login==null) {
			login= new FrmLogin();
		}
		return login;
	}
	
	private void btnCancelarAccion(ActionEvent e) {
		System.exit(0);
	}
	
//	private void validarAcceso(ActionEvent e) {
//		int resultado=0;
//		try {
//			String usuario=txtUsuario.getText();
//			String pass=String.valueOf(txtcontraseña.getPassword());
//			String sql="select * from Colaborador where UPPER(ColUsu) = UPPER('"+usuario+"') and ColPas='"+pass+"'";
//			Statement st=con.createStatement();
//			ResultSet rs=st.executeQuery(sql);
//			
//			
////			if(rs.next()) {
////				resultado=1;
////				if(resultado==1) {
////					colaborador.setColCod(rs.getInt("ColCod"));
////					colaborador.setColUsu(rs.getString("ColUsu"));
////					System.out.println(colaborador.getColUsu());
////					btnIngresarAccion(e);
////				}else {
////					JOptionPane.showMessageDialog(null,"ERROR EN EL ACCESO");
////				}
//				
//				 
//			}
//			else {
//				JOptionPane.showMessageDialog(null,"ERROR EN EL ACCESO");
//			}
//		}catch (Exception ex) {
//			System.out.println(ex);
//			// TODO: handle exception
//		}
//		
//	}
	
	private void btnEnter(KeyEvent e) {
		char tecla=e.getKeyChar();
		
		if(tecla==KeyEvent.VK_ENTER) {
			btnIngresar.doClick();
		}
	}
	
	
//	public Colaborador getColaborador() {
//		return colaborador;
//	}

}
