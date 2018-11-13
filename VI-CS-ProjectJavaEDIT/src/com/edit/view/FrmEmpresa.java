package com.edit.view;

import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class FrmEmpresa extends JFrame{
	private JPanel JPEmpresa,JPTabla;
	private JLabel lblRuc,lblGerente,lblEmpresa,lblDireccion;
	private JTextField txtRuc,txtGerenteNom,txtGerenteApe,txtEmpresa;
	private JComboBox JCDepartamento,JCProvincia, JCDistrito;
	private JTextArea JTDireccion;
	private JTable JTabla;
	private JScrollPane JSCTabla;
	private JButton btnGuardar,btnSalir,btnBuscarEmp,btnBuscarPer;
	public FrmEmpresa() {
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("EMPRESA");
		setResizable(false);
		setSize(724, 497);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);
		
		
		
		
		JPEmpresa = new JPanel();
		JPEmpresa.setBorder(new TitledBorder(null, "Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPEmpresa.setBounds(10, 11, 645, 207);
		getContentPane().add(JPEmpresa);
		JPEmpresa.setLayout(null);
		
		lblRuc = new JLabel("RUC: ");
		lblRuc.setBounds(31, 39, 46, 14);
		lblRuc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JPEmpresa.add(lblRuc);
		
		lblGerente = new JLabel("Gerente:");
		lblGerente.setBounds(31, 76, 59, 13);
		lblGerente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JPEmpresa.add(lblGerente);
		
		txtRuc = new JTextField();
		txtRuc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtRuc.setBounds(110, 33, 180, 25);
		JPEmpresa.add(txtRuc);
		txtRuc.setColumns(10);
		
		
		btnBuscarEmp=new JButton("");
		btnBuscarEmp.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Buscar.png")));
		btnBuscarEmp.setBounds(291,33,41,25);
		JPEmpresa.add(btnBuscarEmp);
		
		btnBuscarPer=new JButton("");
		btnBuscarPer.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Buscar.png")));
		btnBuscarPer.setBounds(600,70,41,25);
		JPEmpresa.add(btnBuscarPer);		
		
		txtGerenteNom = new JTextField();
		txtGerenteNom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtGerenteNom.setBounds(110, 70, 180, 25);
		JPEmpresa.add(txtGerenteNom);
		txtGerenteNom.setEditable(false);
		txtGerenteNom.setColumns(10);
		
		txtGerenteApe = new JTextField();
		txtGerenteApe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtGerenteApe.setBounds(341, 70, 258, 25);
		JPEmpresa.add(txtGerenteApe);
		txtGerenteApe.setEditable(false);
		txtGerenteApe.setColumns(10);
		
		lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setBounds(341, 39, 67, 14);
		lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JPEmpresa.add(lblEmpresa);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtEmpresa.setBounds(418, 33, 180, 25);
		JPEmpresa.add(txtEmpresa);
		txtEmpresa.setColumns(10);
		
		JCDepartamento = new JComboBox();
		JCDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JCDepartamento.setBounds(110, 110, 108, 25);
		JPEmpresa.add(JCDepartamento);
		
		JCProvincia = new JComboBox();
		JCProvincia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JCProvincia.setBounds(286, 110, 108, 25);
		JPEmpresa.add(JCProvincia);
		
		JCDistrito = new JComboBox();
		JCDistrito.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JCDistrito.setBounds(437, 110, 108, 25);
		JPEmpresa.add(JCDistrito);
		
		JTDireccion = new JTextArea();
		JTDireccion.setFont(new Font("Monospaced", Font.PLAIN, 13));
		JTDireccion.setBounds(110, 147, 488, 44);
		JPEmpresa.add(JTDireccion);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDireccion.setBounds(31, 163, 49, 13);
		JPEmpresa.add(lblDireccion);
		
		JPTabla = new JPanel();
		JPTabla.setBorder(new TitledBorder(null, "Tabla", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPTabla.setBounds(10, 238, 645, 112);
		getContentPane().add(JPTabla);
		JPTabla.setLayout(null);
		
		JSCTabla = new JScrollPane();
		JSCTabla.setBounds(10, 20, 606, 72);
		JPTabla.add(JSCTabla);
		
		JTabla = new JTable();
		JTabla.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		JSCTabla.setViewportView(JTabla);
		
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(249, 371, 80, 42);
		getContentPane().add(btnGuardar);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(388, 371, 80, 42);
		getContentPane().add(btnSalir);
		
		
		
	}
}
