package com.edit.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.edit.controller.LogicaPersona;
import com.edit.model.Colaborador;

public class FrmRegistrarColaborador extends JFrame{
	private JPanel JPDatoCliente,JPDireccion,JPTipoCliente;
	private JLabel lblTipoDOC,lblNroDOC,lblNombre,lblApellido,lblTelefono,lblCelular,lblDireccion,lblUsuario,lblContraseña,lblTipoAcceso;
	private JTextField txtNroDOC,txtNombre,txtApellido,txtTelefono,txtCelular,txtLineaCredito,txtUsuario;
	private JPasswordField txtContraseña;
	private JComboBox JCTipoDOC,JCDepartamento,JCProvincia,JCDistrito,JCTipoAcceso;
	private JButton btnBuscar,btnGuardar,btnSalir;
	private JTabbedPane JTableta;
	private JTextArea JTDireccion;
	private Colaborador colaborador;
	private LogicaPersona logica;
	
	public FrmRegistrarColaborador() {
		colaborador=new Colaborador();
		logica=new LogicaPersona();
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setSize(426, 478);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setIconImage(logo);
		getContentPane().setLayout(null);
		
		JPDatoCliente = new JPanel();
		JPDatoCliente.setBounds(10, 11, 390, 170);
		JPDatoCliente.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del Colaborador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(JPDatoCliente);
		JPDatoCliente.setLayout(null);
		
		lblTipoDOC = new JLabel("Tipo DOC:");
		lblTipoDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoDOC.setBounds(29, 26, 55, 14);
		JPDatoCliente.add(lblTipoDOC);
		
		JCTipoDOC = new JComboBox();
		JCTipoDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JCTipoDOC.setBounds(83, 23, 69, 25);
		JPDatoCliente.add(JCTipoDOC);
		
		lblNroDOC = new JLabel("Nro DOC:");
		lblNroDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNroDOC.setBounds(163, 26, 46, 14);
		JPDatoCliente.add(lblNroDOC);
		
		txtNroDOC = new JTextField();
		txtNroDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNroDOC.setBounds(217, 23, 125, 25);
		JPDatoCliente.add(txtNroDOC);
		txtNroDOC.setColumns(10);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNombre.setBounds(29, 61, 46, 14);
		JPDatoCliente.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNombre.setBounds(83, 56, 259, 25);
		JPDatoCliente.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtApellido.setBounds(83, 95, 259, 25);
		JPDatoCliente.add(txtApellido);
		txtApellido.setColumns(10);
		
		lblApellido = new JLabel("Apellidos:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblApellido.setBounds(29, 100, 46, 14);
		JPDatoCliente.add(lblApellido);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTelefono.setBounds(29, 135, 46, 14);
		JPDatoCliente.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTelefono.setBounds(83, 130, 89, 25);
		JPDatoCliente.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCelular.setBounds(182, 135, 46, 14);
		JPDatoCliente.add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCelular.setBounds(226, 131, 116, 25);
		JPDatoCliente.add(txtCelular);
		txtCelular.setColumns(10);
		
		btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(343, 23, 37, 25);
		JPDatoCliente.add(btnBuscar);
		
		JTableta = new JTabbedPane(JTabbedPane.TOP);
		JTableta.setBounds(10, 194, 390, 170);
		getContentPane().add(JTableta);
		JTableta.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		JPDireccion = new JPanel();
		JTableta.addTab("Direccion", null, JPDireccion, null);
		JPDireccion.setLayout(null);
		
		JCDepartamento = new JComboBox();
		JCDepartamento.setBounds(10, 11, 102, 25);
		JPDireccion.add(JCDepartamento);
		
		JCProvincia = new JComboBox();
		JCProvincia.setBounds(122, 11, 102, 25);
		JPDireccion.add(JCProvincia);
		
		JCDistrito = new JComboBox();
		JCDistrito.setBounds(234, 11, 102, 25);
		JPDireccion.add(JCDistrito);
		
		lblDireccion = new JLabel("Direccion: ");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDireccion.setBounds(10, 49, 64, 14);
		JPDireccion.add(lblDireccion);
		
		JTDireccion = new JTextArea();
		JTDireccion.setBounds(10, 69, 338, 59);
		JPDireccion.add(JTDireccion);
		
		//segundo panel en pestaña
		
		JPTipoCliente = new JPanel();
		JTableta.addTab("Tipo Acceso", null, JPTipoCliente, null);
		JPTipoCliente.setLayout(null);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUsuario.setBounds(10, 21, 66, 14);
		JPTipoCliente.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(80, 16, 118, 25);
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JPTipoCliente.add(txtUsuario);
		
		lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblContraseña.setBounds(10, 64, 79, 14);
		JPTipoCliente.add(lblContraseña);
		
		txtLineaCredito = new JTextField();
		txtLineaCredito.setBounds(80, 59, 118, 25);
		JPTipoCliente.add(txtLineaCredito);
		txtLineaCredito.setColumns(10);
		
		lblTipoAcceso=new JLabel("Tipo Acceso:");
		lblTipoAcceso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoAcceso.setBounds(10, 107, 66, 14);
		JPTipoCliente.add(lblTipoAcceso);
		
		JCTipoAcceso =new JComboBox();
		JCTipoAcceso.setBounds(80, 101, 118, 25);
		JPTipoCliente.add(JCTipoAcceso);
		
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(95, 382, 80, 42);
		getContentPane().add(btnGuardar);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(220, 382, 80, 42);
		getContentPane().add(btnSalir);
		btnBuscar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				validar();
				
			}
		});
		

	}
	public void validar() {
		colaborador.setPerNumDoc(txtNroDOC.getText());
		if(logica.validarColaborador(colaborador)) {
			
		}
		else {
			if(logica.ValidarPersona(colaborador)) {
				
			}
		}
		
	}
	
}