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
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.edit.controller.Coordinador;
import com.edit.model.Tipo_Producto;

public class FrmCategoriaProductos extends JFrame{
	private JPanel JPCategoria,JPtabla;
	private JLabel lblCategoria;
	private JTextField txtCategoria;
	private JTextField txtCategoriaID;
	private JTable jtabla;
	private JScrollPane JSTabla;
	private JTabbedPane JTable;
	private JButton btnGuardar,btnSalir,btnBuscar;
	private JComboBox JCEstado;
	private Coordinador miCoordinador = new Coordinador();
	public FrmCategoriaProductos() {
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Categoria Productos");
		setResizable(false);
		setSize(406, 468);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);
		
		//categoria productos
		JPCategoria=new JPanel();
		JPCategoria.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Categoria Productos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		JPCategoria.setBounds(20, 30, 350, 115);
		//20, 30, 350, 100
		getContentPane().add(JPCategoria);
		JPCategoria.setLayout(null);
		
		lblCategoria = new JLabel("ID: ");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCategoria.setBounds(30, 25, 69, 14);
		JPCategoria.add(lblCategoria);
		
		txtCategoriaID = new JTextField();
		txtCategoriaID.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCategoriaID.setBounds(100, 20, 180, 25);
		JPCategoria.add(txtCategoriaID);
		txtCategoriaID.setColumns(10);
		
		//d
		lblCategoria = new JLabel("Descripcion: ");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCategoria.setBounds(30, 55, 69, 14);
		JPCategoria.add(lblCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCategoria.setBounds(100, 50, 180, 25);
		JPCategoria.add(txtCategoria);
		txtCategoria.setColumns(10);
		//d
		
		//estado
		lblCategoria = new JLabel("Estado: ");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCategoria.setBounds(30, 85, 69, 14);
		JPCategoria.add(lblCategoria);
	
		JCEstado = new JComboBox();
		JCEstado.setBounds(100,80, 180, 25);
		JCEstado.addItem("OPCION 1");
		JCEstado.addItem("OPCION 2");
		JPCategoria.add(JCEstado);
		//estado
		
		btnBuscar=new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(290,38,37,25);
		JPCategoria.add(btnBuscar);
		
		
		//Table
		JPtabla = new JPanel();
		JPtabla.setBorder(new TitledBorder(null, "Tabla", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPtabla.setBounds(20, 141, 350, 188);
		getContentPane().add(JPtabla);
		JPtabla.setLayout(null);
		
		JSTabla = new JScrollPane();
		JSTabla.setBounds(30, 28, 300, 149);
		JPtabla.add(JSTabla);
		//JSTabla.setViewportView(JTable);
		//adasdadsadasdad
		jtabla = new JTable() {
			public boolean isCellEditable(int rowIndex,int colIndex) {
				return false;
			}
		};
		jtabla.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null},
					{null, null, null},
					{null, null, null}
					
				},
				new String[] {
						"ID", "DESCRIPCION", "ESTADO"
						}
				));
		
		JSTabla.setViewportView(jtabla);
		
		///adadasdadadsadada
		
		
		
		
		
		
		
		
		//botones
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(94, 359, 80, 42);
		getContentPane().add(btnGuardar);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGuardarAccion(e);
			}
		});
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(216, 359, 80, 42);
		getContentPane().add(btnSalir);
			
		
		
		
	}
	private void btnGuardarAccion(ActionEvent e) {
		/*
		//if(miCoordinador.validar(txtUsuario.getText())) {
			MDIPrincipal principal = new MDIPrincipal();
			principal.setVisible(true);
			setLocationRelativeTo(null);
			this.dispose();
		//}
	
		*/
		
		try {
		Tipo_Producto tp = new Tipo_Producto();
		tp.setCodigo(Integer.parseInt(txtCategoriaID.getText()));
		tp.setDescripcion(txtCategoria.getText());
		System.out.println("ASDASDASD");
		miCoordinador.setTipoProducto(tp);
		System.out.println("INGRESO");
		}catch(Exception e1) {
			System.out.println(e1);
		}
	
	}
	
}
