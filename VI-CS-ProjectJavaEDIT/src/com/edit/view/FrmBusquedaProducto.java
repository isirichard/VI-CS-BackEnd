package com.edit.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class FrmBusquedaProducto extends JFrame{

	JPanel jpFiltro,jpTabla;
	JLabel lblCodigo,lblSKU,lblProducto;
	
	JTextField txtSKU,txtProducto,txtCodigo;;
	JScrollPane jsTabla;
	JTable jTabla;
	JButton btnBuscar;
	public FrmBusquedaProducto() {
	setSize(524,409);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	getContentPane().setLayout(null);
	
	jpFiltro = new JPanel();
	jpFiltro.setBorder(new TitledBorder(null, "Filtro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	jpFiltro.setBounds(10, 11, 487, 92);
	getContentPane().add(jpFiltro);
	jpFiltro.setLayout(null);
	
	lblCodigo = new JLabel("Codigo:");
	lblCodigo.setBounds(10, 21, 56, 14);
	jpFiltro.add(lblCodigo);
	
	txtCodigo = new JTextField();
	txtCodigo.setBounds(66, 18, 56, 25);
	jpFiltro.add(txtCodigo);
	
	lblSKU = new JLabel("SKU:");
	lblSKU.setBounds(146, 21, 46, 14);
	jpFiltro.add(lblSKU);
	
	txtSKU = new JTextField();
	txtSKU.setBounds(182, 18, 180, 25);
	jpFiltro.add(txtSKU);
	txtSKU.setColumns(10);
	
	lblProducto = new JLabel("Producto:");
	lblProducto.setBounds(10, 56, 55, 14);
	jpFiltro.add(lblProducto);
	
	txtProducto = new JTextField();
	txtProducto.setEnabled(true);
	txtProducto.setEditable(true);
	txtProducto.setText("");
	txtProducto.setBounds(66, 53, 296, 25);
	jpFiltro.add(txtProducto);
	txtProducto.setColumns(10);
	
	btnBuscar = new JButton("Buscar");
	btnBuscar.setBounds(372, 17, 89, 23);
	jpFiltro.add(btnBuscar);
	
	jsTabla = new JScrollPane();
	jsTabla.setBounds(10, 113, 487, 200);
	getContentPane().add(jsTabla);
	
	jTabla = new JTable();
	jsTabla.setViewportView(jTabla);

	}

}
