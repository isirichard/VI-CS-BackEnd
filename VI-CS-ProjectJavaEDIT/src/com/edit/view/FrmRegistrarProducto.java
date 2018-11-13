package com.edit.view;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class FrmRegistrarProducto extends JFrame{
	private JPanel JPProducto;
	private JLabel lblNombreP,lblSKU,lblCategoria;
	private JTextField txtNombreP,txtSKU,txtPrecioVenta,txtPrecioCosto;
	private JComboBox JCCategoria,JCUnidadMedida;
	private JButton btnSalir,btnGuardar;
	
	public FrmRegistrarProducto() {
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setSize(426, 478);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setIconImage(logo);
		getContentPane().setLayout(null);
		
		
		JPProducto = new JPanel();
		JPProducto.setBorder(new TitledBorder(null, "Datos Producto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPProducto.setBounds(10, 11, 393, 312);
		getContentPane().add(JPProducto);
		JPProducto.setLayout(null);
		
		lblNombreP = new JLabel("Nombre Producto:");
		lblNombreP.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNombreP.setBounds(28, 22, 88, 14);
		JPProducto.add(lblNombreP);
		
		lblSKU = new JLabel("SKU:");
		lblSKU.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSKU.setBounds(28, 57, 46, 14);
		JPProducto.add(lblSKU);
		
		lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCategoria.setBounds(28, 100, 59, 14);
		JPProducto.add(lblCategoria);
		
		JLabel lblUnidadMedida = new JLabel("Unidad Medida");
		lblUnidadMedida.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUnidadMedida.setBounds(28, 142, 88, 14);
		JPProducto.add(lblUnidadMedida);
		
		JLabel lblPrecioCosto = new JLabel("Precio Costo:");
		lblPrecioCosto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrecioCosto.setBounds(28, 188, 88, 14);
		JPProducto.add(lblPrecioCosto);
		
		JLabel lblPrecioVenta = new JLabel("Precio Venta:");
		lblPrecioVenta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrecioVenta.setBounds(28, 245, 88, 14);
		JPProducto.add(lblPrecioVenta);
		
		txtNombreP = new JTextField();
		txtNombreP.setBounds(126, 17, 256, 25);
		JPProducto.add(txtNombreP);
		txtNombreP.setColumns(10);
		
		txtSKU = new JTextField();
		txtSKU.setColumns(10);
		txtSKU.setBounds(126, 54, 256, 25);
		JPProducto.add(txtSKU);
		
		JCCategoria = new JComboBox();
		JCCategoria.setBounds(126, 97, 143, 25);
		JPProducto.add(JCCategoria);
		
		JCUnidadMedida = new JComboBox();
		JCUnidadMedida.setBounds(126, 139, 143, 25);
		JPProducto.add(JCUnidadMedida);
		
		txtPrecioCosto = new JTextField();
		txtPrecioCosto.setColumns(10);
		txtPrecioCosto.setBounds(126, 185, 139, 25);
		JPProducto.add(txtPrecioCosto);
		
		txtPrecioVenta = new JTextField();
		txtPrecioVenta.setColumns(10);
		txtPrecioVenta.setBounds(126, 242, 139, 25);
		JPProducto.add(txtPrecioVenta);
		
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(104, 334, 80, 42);
		getContentPane().add(btnGuardar);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(220, 334, 80, 42);
		getContentPane().add(btnSalir);
		
	}
}
