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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class FrmServicioProveedor extends JFrame{
	private JButton btnHistorialProveedor, btnBloquearProveedor,btnHistorialCambios,btnBuscar,btnGuardar,btnSalir;
	private JPanel JPDatosProveedor, JPInformacionCuenta,JPInformacionSaldo,JPDeuda,JPDireccion;
	private JLabel lblTipoDOC,lblDocumento,lblProveedor,lblApellidos,lblTipoProveedor_1,lblTipoProveedor,lblEstadoProveedor_1,lblEstadoProveeodr,
	lblLineaPermitida_1,lblLinea,lblDeudaActual,lblDeudaAtrasada_1,lblDeudaActual_1,lblDeudaAtrasada,lblDeudaTotal_1,lblDeudaTotal,
	lblCalificacionDeuda,lblTelefono,lblCelular;
	private JTextField txtTipoDoc,txtDocumento,txtNombres,txtApellidos,txtTelefono,txtCelular;
	private JComboBox JCDepartamento,JCProvincia,JCDistrito;
	private JTextArea JTADireccion;

	public FrmServicioProveedor() {
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Servicio Al Proveedor");
		setResizable(false);
		setSize(642,556);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setIconImage(logo);

		btnHistorialProveedor = new JButton("Historial Proveedor");
		btnHistorialProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnHistorialProveedor.setBounds(10, 11, 130, 38);
		getContentPane().add(btnHistorialProveedor);

		btnBloquearProveedor = new JButton("Bloquear Proveedor");
		btnBloquearProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBloquearProveedor.setBounds(250, 11, 130, 38);
		getContentPane().add(btnBloquearProveedor);

		
		btnHistorialCambios = new JButton("Historial Cambios");
		btnHistorialCambios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnHistorialCambios.setBounds(490, 11, 130, 38);
		getContentPane().add(btnHistorialCambios);

		JPDatosProveedor = new JPanel();
		JPDatosProveedor.setForeground(Color.BLUE);
		JPDatosProveedor.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Proveedor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPDatosProveedor.setBounds(10, 60, 610, 108);
		getContentPane().add(JPDatosProveedor);
		JPDatosProveedor.setLayout(null);

		lblTipoDOC = new JLabel("Tipo Documento:");
		lblTipoDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoDOC.setBounds(10, 21, 81, 14);
		JPDatosProveedor.add(lblTipoDOC);

		lblDocumento = new JLabel("Documento:");
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDocumento.setBounds(10, 57, 81, 14);
		JPDatosProveedor.add(lblDocumento);

		txtTipoDoc = new JTextField();
		txtTipoDoc.setEditable(false);
		txtTipoDoc.setText("RUC");
		txtTipoDoc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTipoDoc.setBounds(101, 16, 94, 25);
		JPDatosProveedor.add(txtTipoDoc);
		txtTipoDoc.setColumns(10);

		txtDocumento = new JTextField();
		txtDocumento.setEditable(false);
		txtDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(101, 52, 132, 25);
		JPDatosProveedor.add(txtDocumento);

		btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(200, 16, 33, 25);
		JPDatosProveedor.add(btnBuscar);

		lblProveedor = new JLabel("Proveedor:");
		lblProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblProveedor.setBounds(279, 39, 55, 14);
		JPDatosProveedor.add(lblProveedor);

//		lblApellidos = new JLabel("Apellidos:");
//		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		lblApellidos.setBounds(279, 57, 46, 14);
//		JPDatosProveedor.add(lblApellidos);

		txtNombres = new JTextField();
		txtNombres.setEditable(false);
		txtNombres.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNombres.setBounds(335, 35, 259, 25);
		JPDatosProveedor.add(txtNombres);
		txtNombres.setColumns(10);

//		txtApellidos = new JTextField();
//		txtApellidos.setEditable(false);
//		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		txtApellidos.setColumns(10);
//		txtApellidos.setBounds(335, 54, 259, 25);
//		JPDatosProveedor.add(txtApellidos);

		JPInformacionCuenta = new JPanel();
		JPInformacionCuenta.setBorder(new TitledBorder(null, "Informacion Cuenta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPInformacionCuenta.setBounds(10, 179, 197, 127);
		getContentPane().add(JPInformacionCuenta);
		JPInformacionCuenta.setLayout(null);

		lblTipoProveedor_1 = new JLabel("Tipo Proveedor:");
		lblTipoProveedor_1.setForeground(new Color(33, 00, 99));
		lblTipoProveedor_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoProveedor_1.setBounds(10, 26, 78, 14);
		JPInformacionCuenta.add(lblTipoProveedor_1);

		lblTipoProveedor = new JLabel("CREDITO");
		lblTipoProveedor.setForeground(new Color(33, 00, 99));
		lblTipoProveedor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoProveedor.setBounds(109, 26, 62, 14);
		JPInformacionCuenta.add(lblTipoProveedor);

		lblEstadoProveedor_1 = new JLabel("Estado Proveedor:");
		lblEstadoProveedor_1.setForeground(new Color(33, 00, 99));
		lblEstadoProveedor_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEstadoProveedor_1.setBounds(10, 59, 78, 14);
		JPInformacionCuenta.add(lblEstadoProveedor_1);

		lblEstadoProveeodr = new JLabel("ACTIVO");
		lblEstadoProveeodr.setForeground(new Color(33, 00, 99));
		lblEstadoProveeodr.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstadoProveeodr.setBounds(109, 59, 62, 14);
		JPInformacionCuenta.add(lblEstadoProveeodr);

//		lblLineaPermitida_1 = new JLabel("Linea Permitida:");
//		lblLineaPermitida_1.setForeground(new Color(33, 00, 99));
//		lblLineaPermitida_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		lblLineaPermitida_1.setBounds(10, 90, 78, 14);
//		JPInformacionCuenta.add(lblLineaPermitida_1);

//		lblLinea = new JLabel("2000");
//		lblLinea.setForeground(new Color(33, 00, 99));
//		lblLinea.setFont(new Font("Tahoma", Font.BOLD, 11));
//		lblLinea.setBounds(109, 90, 62, 14);
//		JPInformacionCuenta.add(lblLinea);

		JPInformacionSaldo = new JPanel();
		JPInformacionSaldo.setBorder(new TitledBorder(null, "Informacion Saldo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPInformacionSaldo.setBounds(217, 179, 206, 127);
		getContentPane().add(JPInformacionSaldo);
		JPInformacionSaldo.setLayout(null);
		
		lblDeudaActual_1 = new JLabel("Deuda Actual:");
		lblDeudaActual_1.setForeground(new Color(33, 00, 99));
		lblDeudaActual_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDeudaActual_1.setBounds(10, 26, 78, 14);
		JPInformacionSaldo.add(lblDeudaActual_1);

		lblDeudaAtrasada_1 = new JLabel("Deuda Atrasada:");
		lblDeudaAtrasada_1.setForeground(new Color(33, 00, 99));
		lblDeudaAtrasada_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDeudaAtrasada_1.setBounds(10, 59, 90, 14);
		JPInformacionSaldo.add(lblDeudaAtrasada_1);

		

		lblDeudaTotal_1 = new JLabel("Deuda Total:");
		lblDeudaTotal_1.setForeground(new Color(33, 00, 99));
		lblDeudaTotal_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDeudaTotal_1.setBounds(10, 90, 78, 14);
		JPInformacionSaldo.add(lblDeudaTotal_1);

		lblDeudaActual = new JLabel("1800");
		lblDeudaActual.setForeground(new Color(33, 00, 99));
		lblDeudaActual.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeudaActual.setBounds(98, 26, 62, 14);
		JPInformacionSaldo.add(lblDeudaActual);

		lblDeudaAtrasada = new JLabel("200");
		lblDeudaAtrasada.setForeground(new Color(33, 00, 99));
		lblDeudaAtrasada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeudaAtrasada.setBounds(98, 59, 62, 14);
		JPInformacionSaldo.add(lblDeudaAtrasada);

		lblDeudaTotal = new JLabel("2000");
		lblDeudaTotal.setForeground(new Color(255, 00, 00));
		lblDeudaTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeudaTotal.setBounds(98, 90, 62, 14);
		JPInformacionSaldo.add(lblDeudaTotal);

		JPDeuda = new JPanel();
		JPDeuda.setBorder(new TitledBorder(null, "Deuda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPDeuda.setBounds(433, 179, 187, 127);
		getContentPane().add(JPDeuda);
		JPDeuda.setLayout(null);

		lblCalificacionDeuda = new JLabel("DEUDA ATRASADA");
		lblCalificacionDeuda.setForeground(new Color(255, 00, 00));
		lblCalificacionDeuda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCalificacionDeuda.setBounds(10, 51, 167, 24);
		JPDeuda.add(lblCalificacionDeuda);

		JPDireccion = new JPanel();
		JPDireccion.setBorder(new TitledBorder(null, "Direccion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPDireccion.setBounds(10, 317, 610, 117);
		getContentPane().add(JPDireccion);
		JPDireccion.setLayout(null);

		JCDepartamento = new JComboBox();
		JCDepartamento.setBounds(10, 23, 126, 25);
		JPDireccion.add(JCDepartamento);

		JCProvincia = new JComboBox();
		JCProvincia.setBounds(163, 23, 126, 25);
		JPDireccion.add(JCProvincia);

		JCDistrito = new JComboBox();
		JCDistrito.setBounds(322, 23, 126, 25);
		JPDireccion.add(JCDistrito);

		JTADireccion = new JTextArea();
		JTADireccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JTADireccion.setBounds(10, 60, 438, 44);
		JPDireccion.add(JTADireccion);

		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTelefono.setBounds(478, 28, 46, 14);
		JPDireccion.add(lblTelefono);

		lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCelular.setBounds(478, 76, 46, 14);
		JPDireccion.add(lblCelular);

		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTelefono.setBounds(534, 25, 68, 25);
		JPDireccion.add(txtTelefono);
		txtTelefono.setColumns(10);

		txtCelular = new JTextField();
		txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCelular.setColumns(10);
		txtCelular.setBounds(534, 70, 68, 25);
		JPDireccion.add(txtCelular);

		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(202, 445, 80, 42);
		getContentPane().add(btnGuardar);

		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(368, 445, 80, 42);
		getContentPane().add(btnSalir);

		btnHistorialProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHistorialProveedor(e);
			}
		});
		btnHistorialCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHistorialCambios(e);
			}
		});
		btnBloquearProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBloquearProveedor(e);
			}
		});



	}
	private void btnHistorialProveedor(ActionEvent e) {
		FrmHistorialProveedor principal = new FrmHistorialProveedor();
		principal.setVisible(true);
		setLocationRelativeTo(null);
	}
	private void btnHistorialCambios(ActionEvent e) {
		FrmHistorialCambiosProveedor h = new FrmHistorialCambiosProveedor();
		h.setVisible(true);
		setLocationRelativeTo(null);
	}
	private void btnBloquearProveedor(ActionEvent e) {
		FrmBloqueoProveedor principal = new FrmBloqueoProveedor();
		principal.setVisible(true);
		setLocationRelativeTo(null);

	}

}
