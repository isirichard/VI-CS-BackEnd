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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class FrmHistorialCambiosProveedor extends JFrame{
	private JPanel jpCliente,jpFecha,jpHistorial;
	private JLabel lblTipoDOC,lblNro,lblCliente,lblDireccion,lblDistrito,lblDesde,lblHasta;
	private JTextField txtTipoDOC,txtNro,txtCliente,txtDireccion,txtDistrito;
	private JDateChooser jdDesde,jdHasta;
	private JTable tabla;
	private JScrollPane jsTabla;
	private JButton btnFiltrar;

	public FrmHistorialCambiosProveedor() {
		
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Historial Cambios");
		setResizable(false);
		setSize(778,663);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setIconImage(logo);
		
	

		jpCliente = new JPanel();
		jpCliente.setBorder(new TitledBorder(null, "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpCliente.setBounds(10, 11, 750, 118);
		getContentPane().add(jpCliente);
		jpCliente.setLayout(null);

		lblTipoDOC = new JLabel("Tipo DOC:");
		lblTipoDOC.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDOC.setBounds(10, 24, 68, 14);
		jpCliente.add(lblTipoDOC);

		lblCliente = new JLabel("Cliente:");
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCliente.setBounds(10, 60, 68, 14);
		jpCliente.add(lblCliente);

		lblNro = new JLabel("Nro:");
		lblNro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNro.setBounds(146, 24, 46, 14);
		jpCliente.add(lblNro);

		txtTipoDOC = new JTextField();
		txtTipoDOC.setForeground(Color.BLUE);
		txtTipoDOC.setEditable(false);
		txtTipoDOC.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTipoDOC.setBounds(69, 19, 67, 25);
		jpCliente.add(txtTipoDOC);
		txtTipoDOC.setColumns(10);

		txtNro = new JTextField();
		txtNro.setForeground(Color.BLUE);
		txtNro.setEditable(false);
		txtNro.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtNro.setColumns(10);
		txtNro.setBounds(183, 19, 125, 25);
		jpCliente.add(txtNro);

		txtCliente = new JTextField();
		txtCliente.setForeground(Color.BLUE);
		txtCliente.setEditable(false);
		txtCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCliente.setColumns(10);
		txtCliente.setBounds(69, 57, 239, 25);
		jpCliente.add(txtCliente);

		txtDireccion = new JTextField();
		txtDireccion.setForeground(Color.BLUE);
		txtDireccion.setEditable(false);
		txtDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(397, 21, 343, 25);
		jpCliente.add(txtDireccion);

		txtDistrito = new JTextField();
		txtDistrito.setForeground(Color.BLUE);
		txtDistrito.setEditable(false);
		txtDistrito.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDistrito.setColumns(10);
		txtDistrito.setBounds(397, 57, 343, 25);
		jpCliente.add(txtDistrito);

		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDireccion.setBounds(318, 24, 69, 14);
		jpCliente.add(lblDireccion);

		jpFecha = new JPanel();
		jpFecha.setBorder(new TitledBorder(null, "Fecha", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpFecha.setBounds(10, 140, 750, 62);
		getContentPane().add(jpFecha);
		jpFecha.setLayout(null);

		lblDesde = new JLabel("Desde:");
		lblDesde.setBounds(10, 25, 46, 14);
		jpFecha.add(lblDesde);

		lblHasta = new JLabel("Hasta:");
		lblHasta.setBounds(285, 25, 46, 14);
		jpFecha.add(lblHasta);

		jdDesde = new JDateChooser();
		jdDesde.setBounds(54, 25, 126, 20);
		jpFecha.add(jdDesde);

		jdHasta = new JDateChooser();
		jdHasta.setBounds(322, 25, 126, 20);
		jpFecha.add(jdHasta);

		btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setBounds(497, 21, 89, 23);
		jpFecha.add(btnFiltrar);

		jpHistorial = new JPanel();
		jpHistorial.setBorder(new TitledBorder(null, "Historial", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpHistorial.setBounds(10, 213, 750, 400);
		getContentPane().add(jpHistorial);
		jpHistorial.setLayout(null);

		jsTabla = new JScrollPane();
		jsTabla.setBounds(10, 25, 712, 351);
		jpHistorial.add(jsTabla);

		tabla = new JTable();
		tabla.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column"
				}
				));
		jsTabla.setViewportView(tabla);
	}

}
