package com.edit.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class FrmHistorialVenta extends JFrame{
	private JPanel JPDatosCliente,JPFecha,JPTabla;
	private JLabel lblTipoDoc,lblNro,lblCliente,lblDireccion,lblFechaEmision,lblFechaVencimiento,lblAl_1,lblAl_2;
	private JComboBox JCTipoDoc;
	private JDateChooser JDEmision1,JDEmision2,JDVencimiento1,JDVencimiento2;
	private JCheckBox JCkEmision, JCkVencimiento;
	private JScrollPane JSTabla;
	private JTable JTabla;
	private JTextField txtNro,txtCliente,txtDireccionCli;
	private JButton btnBuscar,btnSalir;
	public FrmHistorialVenta() {
		setTitle("Historial de Ventas");
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		
		setIconImage(logo);
		setSize(835,585);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		JPDatosCliente = new JPanel();
		JPDatosCliente.setBorder(new TitledBorder(null, "Datos Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPDatosCliente.setBounds(10, 11, 390, 131);
		getContentPane().add(JPDatosCliente);
		JPDatosCliente.setLayout(null);
		
		lblTipoDoc = new JLabel("Tipo DOC:");
		lblTipoDoc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoDoc.setBounds(10, 25, 58, 14);
		JPDatosCliente.add(lblTipoDoc);
		
		lblCliente = new JLabel("Cliente:");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCliente.setBounds(10, 62, 46, 14);
		JPDatosCliente.add(lblCliente);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDireccion.setBounds(10, 100, 50, 14);
		JPDatosCliente.add(lblDireccion);
		
		JCTipoDoc = new JComboBox();
		JCTipoDoc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JCTipoDoc.setBounds(78, 22, 57, 25);
		JPDatosCliente.add(JCTipoDoc);
		
		txtNro = new JTextField();
		txtNro.setEditable(false);
		txtNro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNro.setBounds(78, 57, 237, 25);
		JPDatosCliente.add(txtNro);
		txtNro.setColumns(10);
		
		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		txtCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCliente.setBounds(78, 95, 237, 25);
		JPDatosCliente.add(txtCliente);
		txtCliente.setColumns(10);
		
		lblNro = new JLabel("Nro:");
		lblNro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNro.setBounds(145, 25, 46, 14);
		JPDatosCliente.add(lblNro);
		
		txtDireccionCli = new JTextField();
		txtDireccionCli.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDireccionCli.setBounds(181, 20, 134, 25);
		JPDatosCliente.add(txtDireccionCli);
		txtDireccionCli.setColumns(10);
		
		JPFecha = new JPanel();
		JPFecha.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Fecha", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		JPFecha.setBounds(410, 11, 399, 131);
		getContentPane().add(JPFecha);
		JPFecha.setLayout(null);
		
		lblFechaEmision = new JLabel("Fecha Emision:");
		lblFechaEmision.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFechaEmision.setBounds(10, 25, 94, 14);
		JPFecha.add(lblFechaEmision);
		
		lblFechaVencimiento = new JLabel("Fecha Vencimiento:");
		lblFechaVencimiento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFechaVencimiento.setBounds(10, 72, 94, 14);
		JPFecha.add(lblFechaVencimiento);
		

		JDEmision1 = new JDateChooser();
		JDEmision1.setBounds(114, 20, 108, 25);
		JPFecha.add(JDEmision1);
		
		lblAl_1 = new JLabel("al: ");
		lblAl_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAl_1.setBounds(232, 25, 21, 14);
		JPFecha.add(lblAl_1);
		
		lblAl_2 = new JLabel("al: ");
		lblAl_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAl_2.setBounds(232, 72, 21, 14);
		JPFecha.add(lblAl_2);
		
		JDEmision2 = new JDateChooser();
		JDEmision2.setBounds(114, 67, 108, 25);
		JPFecha.add(JDEmision2);
		
		JDVencimiento1 = new JDateChooser();
		JDVencimiento1.setBounds(257, 67, 108, 25);
		JPFecha.add(JDVencimiento1);
		
		JCkEmision = new JCheckBox("");
		JCkEmision.setBounds(366, 20, 27, 23);
		JPFecha.add(JCkEmision);
		
		JDVencimiento2 = new JDateChooser();
		JDVencimiento2.setBounds(257, 20, 108, 25);
		JPFecha.add(JDVencimiento2);
		
		JCkVencimiento = new JCheckBox("");
		JCkVencimiento.setBounds(366, 67, 27, 23);
		JPFecha.add(JCkVencimiento);
		
		JPTabla = new JPanel();
		JPTabla.setBorder(new TitledBorder(null, "Tabla", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPTabla.setBounds(10, 153, 790, 340);
		getContentPane().add(JPTabla);
		JPTabla.setLayout(null);
		
		JSTabla = new JScrollPane();
		JSTabla.setBounds(10, 27, 770, 302);
		JPTabla.add(JSTabla);
		
		JTabla = new JTable();
		JTabla.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		JSTabla.setViewportView(JTabla);
		JTabla.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		btnBuscar = new JButton("");
		btnBuscar.setBounds(299, 504, 44, 25);
		getContentPane().add(btnBuscar);
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		
		btnSalir = new JButton("");
		btnSalir.setBounds(413, 504, 44, 25);
		getContentPane().add(btnSalir);
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/salida(1).png")));

	}
}
