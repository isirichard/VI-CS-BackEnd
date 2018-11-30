package com.edit.view;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class FrmInventario extends JFrame{
	private JPanel jpFiltro,jpTabla;
	private JLabel lblTipoProducto,lblMarca,lblNombreProducto,lblProveedor;
	private JTextField txtNombreProducto;
	private JButton btnBuscar;
	private JComboBox jcTipoProducto,jcMarca,jcProveedor;
	private JScrollPane jstabla;
	private JTable jtabla;
	

	public FrmInventario() {
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Inventario");
		setResizable(false);
		setSize( 629, 443);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);
		
		

		jpFiltro = new JPanel();
		jpFiltro.setBorder(new TitledBorder(null, "Filtro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpFiltro.setBounds(10, 11, 578, 112);
		getContentPane().add(jpFiltro);
		jpFiltro.setLayout(null);

		lblTipoProducto = new JLabel("Tipo Producto:");
		lblTipoProducto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoProducto.setBounds(10, 27, 78, 14);
		jpFiltro.add(lblTipoProducto);

		lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMarca.setBounds(10, 60, 46, 14);
		jpFiltro.add(lblMarca);

		jcTipoProducto = new JComboBox();
		jcTipoProducto.setBounds(83, 24, 148, 20);
		jpFiltro.add(jcTipoProducto);

		jcMarca = new JComboBox();
		jcMarca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		jcMarca.setBounds(83, 57, 148, 20);
		jpFiltro.add(jcMarca);

		lblNombreProducto = new JLabel("Nombre:");
		lblNombreProducto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNombreProducto.setBounds(241, 27, 46, 14);
		jpFiltro.add(lblNombreProducto);

		txtNombreProducto = new JTextField();
		txtNombreProducto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNombreProducto.setBounds(307, 24, 230, 20);
		jpFiltro.add(txtNombreProducto);
		txtNombreProducto.setColumns(10);

		lblProveedor = new JLabel("Proveedor:");
		lblProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblProveedor.setBounds(241, 60, 73, 14);
		jpFiltro.add(lblProveedor);

		jcProveedor = new JComboBox();
		jcProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		jcProveedor.setBounds(307, 57, 230, 20);
		jpFiltro.add(jcProveedor);

		btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(FrmInventario.class.getResource("/Imagenes/buscar.png")));
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBuscar.setBounds(539, 23, 30, 23);
		jpFiltro.add(btnBuscar);

		jpTabla = new JPanel();
		jpTabla.setBorder(new TitledBorder(null, "Tabla", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpTabla.setBounds(10, 134, 578, 259);
		getContentPane().add(jpTabla);
		jpTabla.setLayout(null);

		jstabla = new JScrollPane();
		jstabla.setBounds(10, 25, 558, 223);
		jpTabla.add(jstabla);

		jtabla = new JTable();
		jstabla.setViewportView(jtabla);
	}



}
