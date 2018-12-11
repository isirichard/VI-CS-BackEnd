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
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.edit.controller.LogicaPersona;
import com.edit.controller.LogicaReferencial;
import com.edit.controller.Logica_TextField;
import com.edit.model.Acceso;
import com.edit.model.Cliente;
import com.edit.model.Estado;
import com.edit.model.Tipo_Cliente;
import com.edit.model.Tipo_Documento;

public class FrmRegistroCliente extends JFrame{
	private JPanel JPDatoCliente,JPDireccion,JPTipoCliente;
	private JLabel lblTipoDOC,lblNroDOC,lblNombre,lblApellido,lblTelefono,lblCelular,lblDireccion,lblTipoCliente,lblLineaCredito;
	private JTextField txtNroDOC,txtNombre,txtApellido,txtTelefono,txtCelular,txtLineaCredito;
	private JComboBox JCTipoDOC,JCDepartamento,JCProvincia,JCDistrito,JCTipoCliente;
	private JButton btnBuscar,btnGuardar,btnSalir;
	private JTabbedPane JTableta;
	private JTextArea JTDireccion;
	private Cliente cliente;
	private Tipo_Documento tipoDocumento=new Tipo_Documento();
	private Tipo_Cliente tipoCliente=new Tipo_Cliente();
	private Estado estado=new Estado();
	private LogicaPersona logica;
	private int Condicion=0;
	private LogicaReferencial logica2;
	private Logica_TextField logica3;
	
	public FrmRegistroCliente() {
		cliente=new Cliente();
		logica = new LogicaPersona();
		logica2=new LogicaReferencial();
		logica3=new Logica_TextField();
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setSize(426, 478);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setIconImage(logo);
		getContentPane().setLayout(null);
		
		JPDatoCliente = new JPanel();
		JPDatoCliente.setBounds(10, 11, 390, 170);
		JPDatoCliente.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		logica3.acepta_Numeros(txtNroDOC);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		lblNombre.setBounds(29, 61, 46, 14);
		lblNombre.setBounds(29, 81, 46, 14);
		JPDatoCliente.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		txtNombre.setBounds(83, 56, 259, 25);
		txtNombre.setBounds(83, 80, 259, 25);
		JPDatoCliente.add(txtNombre);
		txtNombre.setColumns(10);
		
//		txtApellido = new JTextField();
//		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		txtApellido.setBounds(83, 95, 259, 25);
//		JPDatoCliente.add(txtApellido);
//		txtApellido.setColumns(10);
		
//		lblApellido = new JLabel("Apellidos:");
//		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		lblApellido.setBounds(29, 100, 46, 14);
//		JPDatoCliente.add(lblApellido);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTelefono.setBounds(29, 135, 46, 14);
		JPDatoCliente.add(lblTelefono);
		
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTelefono.setBounds(83, 130, 89, 25);
		JPDatoCliente.add(txtTelefono);
		txtTelefono.setColumns(10);
		logica3.acepta_Numeros(txtTelefono);
		
		lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCelular.setBounds(182, 135, 46, 14);
		JPDatoCliente.add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCelular.setBounds(226, 131, 116, 25);
		JPDatoCliente.add(txtCelular);
		txtCelular.setColumns(10);
		logica3.acepta_Numeros(txtCelular);
		
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
		JTableta.addTab("TipoCliente", null, JPTipoCliente, null);
		JPTipoCliente.setLayout(null);
		
		lblTipoCliente = new JLabel("Tipo Cliente:");
		lblTipoCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoCliente.setBounds(10, 21, 66, 14);
		JPTipoCliente.add(lblTipoCliente);
		
		JCTipoCliente = new JComboBox();
		JCTipoCliente.setBounds(99, 16, 118, 25);
		JPTipoCliente.add(JCTipoCliente);
		logica2.mostrarJCombo("Tipo_Cliente", "TipCli", JCTipoCliente);
		
		lblLineaCredito = new JLabel("Linea de Credito");
		lblLineaCredito.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblLineaCredito.setBounds(10, 64, 79, 14);
		JPTipoCliente.add(lblLineaCredito);
		
		txtLineaCredito = new JTextField();
		txtLineaCredito.setBounds(99, 59, 118, 25);
		JPTipoCliente.add(txtLineaCredito);
		txtLineaCredito.setColumns(10);
		logica3.acepta_Numeros(txtLineaCredito);
		
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(68, 382, 80, 42);
		getContentPane().add(btnGuardar);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(196, 382, 80, 42);
		getContentPane().add(btnSalir);
		logica2.mostrarJCombo("Tipo_Documento", "TipDoc", JCTipoDOC);
		buscarExistencia();
		Guardar();
		
		
		
		

	}
	public int autogenerar() {
		inicio();
		
		
		if(logica.validarCliente(cliente)==true) {
			
			llenarCliente();

			return 1;
		}
		else {
			if(logica.ValidarPersona(cliente)==true) {
				
				llenarPersona();
				return 2;
				
			}
			else {
				
				return 3;
			}
		}
		
		
	}
	public void llenarPersona() {
		logica.asignarDatosPersona(cliente);
		txtNombre.setText(cliente.getPerNom());
		txtCelular.setText(cliente.getPerCel());
		txtTelefono.setText(cliente.getPerTel());
		txtNroDOC.setText(cliente.getPerNumDoc());
		
		JTDireccion.setText(cliente.getPerDir());
		
		
		
	}
	public void llenarCliente() {
		logica.asignarDatosCliente(cliente);
		txtNombre.setText(cliente.getPerNom());
		txtCelular.setText(cliente.getPerCel());
		txtTelefono.setText(cliente.getPerTel());
		txtNroDOC.setText(cliente.getPerNumDoc());
		txtLineaCredito.setText(""+cliente.getLinea());
		JTDireccion.setText(cliente.getPerDir());
		JCTipoCliente.setSelectedIndex(cliente.getTipCliCod().getCodigo());
	}
	public void limpiar() {
		txtNombre.setText("");
		txtCelular.setText("");
		txtTelefono.setText("");
		
		txtLineaCredito.setText("");
		JCTipoCliente.setSelectedIndex(0);
	}
	public void inicio() {
		tipoDocumento.setCodigo(JCTipoDOC.getSelectedIndex());
		cliente.setPerNumDoc(txtNroDOC.getText());
		cliente.setPerTipDoc(tipoDocumento);
	}
	public void buscarExistencia() {
		btnBuscar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				limpiar();
				Condicion=autogenerar();
				
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void Guardar() {
btnGuardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("CONDICION : "+Condicion);
				cliente.setPerNom(txtNombre.getText());
				
				cliente.setPerCel(txtCelular.getText());
				cliente.setPerTel(txtTelefono.getText());
				
				cliente.setPerDir(JTDireccion.getText());
				
				cliente.setLinea(Double.parseDouble(txtLineaCredito.getText()));
				Tipo_Cliente acc=new Tipo_Cliente();
				acc.setCodigo(JCTipoCliente.getSelectedIndex());
				cliente.setTipCliCod(acc);
				if(Condicion==1) {
					
					logica.ModificarCliente(cliente);
					
					
					
				}
				if(Condicion==2) {
					
					
					logica.asignarPerCod_PerCli(cliente);
					logica.ModificarPersona(cliente);
					
					
					
					
					
				}
				if(Condicion==3) {
					logica.InsertarCliente(cliente);
					
					
					
				}
				
			}
		});
	}
	
}

