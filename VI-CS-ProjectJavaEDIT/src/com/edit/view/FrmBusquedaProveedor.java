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

public class FrmBusquedaProveedor extends JFrame{
	JPanel jpFiltro,jpTabla;
	JLabel lblTipoDoc,lblNro,lblProveedor7;
	JComboBox jcTipoDoc;
	JTextField txtNro,txtProveedor;
	JScrollPane jsTabla;
	JTable jTabla;
	JButton btnBuscar;
	
	public FrmBusquedaProveedor() {
	setSize(524,409);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	getContentPane().setLayout(null);
	
	jpFiltro = new JPanel();
	jpFiltro.setBorder(new TitledBorder(null, "Filtro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	jpFiltro.setBounds(10, 11, 487, 92);
	getContentPane().add(jpFiltro);
	jpFiltro.setLayout(null);
	
	lblTipoDoc = new JLabel("Tipo DOC:");
	lblTipoDoc.setBounds(10, 21, 56, 14);
	jpFiltro.add(lblTipoDoc);
	
	jcTipoDoc = new JComboBox();
	jcTipoDoc.setBounds(66, 18, 56, 25);
	jpFiltro.add(jcTipoDoc);
	
	lblNro = new JLabel("Nro:");
	lblNro.setBounds(146, 21, 46, 14);
	jpFiltro.add(lblNro);
	
	txtNro = new JTextField();
	txtNro.setBounds(182, 18, 180, 25);
	jpFiltro.add(txtNro);
	txtNro.setColumns(10);
	
	lblProveedor7 = new JLabel("Proveedor:");
	lblProveedor7.setBounds(10, 56, 46, 14);
	jpFiltro.add(lblProveedor7);
	
	txtProveedor = new JTextField();
	txtProveedor.setEnabled(true);
	txtProveedor.setEditable(true);
	txtProveedor.setText("");
	txtProveedor.setBounds(66, 53, 296, 25);
	jpFiltro.add(txtProveedor);
	txtProveedor.setColumns(10);
	
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
