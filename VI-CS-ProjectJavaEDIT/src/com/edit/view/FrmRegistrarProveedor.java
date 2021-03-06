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
import com.edit.model.Proveedor;
import com.edit.model.Tipo_Documento;

public class FrmRegistrarProveedor extends JFrame{
	private JPanel JPDatoCliente,JPDireccion;
	private JLabel lblTipoDOC,lblNroDOC,lblEmpresa,lblTelefono,lblCelular,lblDireccion;
	private JTextField txtNroDOC,txtEmpresa,txtTelefono,txtCelular;
	private JComboBox JCTipoDOC,JCDepartamento,JCProvincia,JCDistrito;
	private JButton btnBuscar,btnGuardar,btnSalir;
	private JTabbedPane JTableta;
	private JTextArea JTDireccion;
	private Proveedor proveedor;
	private LogicaPersona logica;
	private LogicaReferencial logica2;
	private int Condicion=0;
	private Logica_TextField logica3;

	public FrmRegistrarProveedor() {
		logica3=new Logica_TextField();
		proveedor=new Proveedor();
		logica=new LogicaPersona();
		logica2=new LogicaReferencial();
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setSize(426, 478);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setIconImage(logo);
		getContentPane().setLayout(null);

		JPDatoCliente = new JPanel();
		JPDatoCliente.setBounds(10, 11, 390, 160);
		JPDatoCliente.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del Proveedor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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

		lblEmpresa = new JLabel("Empresa: ");
		lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEmpresa.setBounds(29, 65, 50, 25);
		JPDatoCliente.add(lblEmpresa);

		txtEmpresa = new JTextField();
		txtEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtEmpresa.setBounds(83,65, 259, 25);
		JPDatoCliente.add(txtEmpresa);
		txtEmpresa.setColumns(10);


		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTelefono.setBounds(29, 114, 46, 14);
		JPDatoCliente.add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTelefono.setBounds(83, 109, 89, 25);
		JPDatoCliente.add(txtTelefono);
		txtTelefono.setColumns(10);

		lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCelular.setBounds(182, 114, 46, 14);
		JPDatoCliente.add(lblCelular);

		txtCelular = new JTextField();
		txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCelular.setBounds(226, 109, 116, 25);
		JPDatoCliente.add(txtCelular);
		txtCelular.setColumns(10);

		btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(343, 23, 37, 25);
		JPDatoCliente.add(btnBuscar);

		JTableta = new JTabbedPane(JTabbedPane.TOP);
		JTableta.setBounds(10, 180, 390, 170);
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



		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(80, 375, 80, 42);
		getContentPane().add(btnGuardar);

		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(240, 375, 80, 42);
		getContentPane().add(btnSalir);
		logica2.mostrarJCombo("Tipo_Documento", "TipDoc", JCTipoDOC);
		logica3.acepta_Numeros(txtNroDOC);
		logica3.acepta_Numeros(txtCelular);
		logica3.acepta_Numeros(txtTelefono);
		btnBuscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Condicion=autogenerar();
			}
		});

		btnGuardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Tipo_Documento doc=new Tipo_Documento();
				doc.setCodigo(JCTipoDOC.getSelectedIndex());
				proveedor.setPerTipDoc(doc);
				proveedor.setPerNumDoc(txtNroDOC.getText());
				proveedor.setPerNom(txtEmpresa.getText());
				proveedor.setPerCel(txtCelular.getText());
				proveedor.setPerTel(txtTelefono.getText());
				proveedor.setPerDir(JTDireccion.getText());

				// TODO Auto-generated method stub
				if(Condicion==1) {


					logica.ModificarProveedor(proveedor);


				}
				if(Condicion==2) {




					logica.asignarPerCod_ProvCod(proveedor);
					logica.ModificarPersona(proveedor);





				}
				if(Condicion==3) {


					logica.InsertarProveedor(proveedor);


				}

			}


		});


	}
	

	
	public int autogenerar() {
		proveedor.setPerNumDoc(txtNroDOC.getText());
		Tipo_Documento doc=new Tipo_Documento();
		doc.setCodigo(JCTipoDOC.getSelectedIndex());
		proveedor.setPerTipDoc(doc);

		if(logica.validarProveedor(proveedor)) {
			
			llenarProveedor();
			
			return 1;
		}
		else {
			if(logica.ValidarPersona(proveedor)==true) {
				
				llenarProveedor();
				return 2;

			}
			else {
				System.out.println("cliente no existe ni persona");
				return 3;
			}
		}
		//		JCTipoDOC.setSelectedIndex(cliente.getPerTipDoc().getCodigo());

	}
	public void llenarProveedor() {
		logica.asignarDatosProveedor(proveedor);
		txtEmpresa.setText(proveedor.getPerNom());
		txtCelular.setText(proveedor.getPerCel());
		txtTelefono.setText(proveedor.getPerTel());
		JTDireccion.setText(proveedor.getPerDir());
		

	}
	public void limpiar() {
		txtEmpresa.setText("");
		txtCelular.setText("");
		txtTelefono.setText("");
		JTDireccion.setText("");
	}


}