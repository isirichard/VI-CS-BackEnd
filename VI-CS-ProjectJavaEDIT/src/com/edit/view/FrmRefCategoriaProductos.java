package com.edit.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.edit.controller.Control_Referencial;
import com.edit.controller.LogicaReferencial;
import com.edit.model.Estado;
import com.edit.model.Referencial;
import com.edit.model.Tipo_Producto;



public class FrmRefCategoriaProductos extends JFrame{
	private JPanel JPCategoria,JPtabla;
	private JLabel lblCategoria;
	private JTextField txtCategoria;
	private JScrollPane JSTabla;
	private  JTable JTable;
	private JButton btnGuardar,btnSalir,btnBuscar;
	private LogicaReferencial controlReferencial;
	private Tipo_Producto tipoProducto;
	private Estado estado=new Estado();
	public FrmRefCategoriaProductos() {
		controlReferencial=new LogicaReferencial();
		estado=new Estado();
		tipoProducto=new Tipo_Producto();
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
		JPCategoria.setBounds(20, 30, 350, 100);
		getContentPane().add(JPCategoria);
		JPCategoria.setLayout(null);
		
		lblCategoria = new JLabel("Descripcion: ");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCategoria.setBounds(30, 41, 69, 14);
		JPCategoria.add(lblCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCategoria.setBounds(100, 38, 180, 25);
		JPCategoria.add(txtCategoria);
		txtCategoria.setColumns(10);
		
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
		JTable=new JTable();
		JSTabla.setViewportView(JTable);
		
		//botones
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(94, 359, 80, 42);
		getContentPane().add(btnGuardar);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(216, 359, 80, 42);
		getContentPane().add(btnSalir);
		mostrarTabla();
		
		btnGuardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tipoProducto.setDescripcion(txtCategoria.getText().toUpperCase());
				estado.setCodigo(1);
				tipoProducto.setEstCod(estado);
				controlReferencial.btnGuardar(tipoProducto);
				mostrarTabla();
				txtCategoria.setText("");
			}
		});
		
	}

	public JTextField getTxtCategoria() {
		return txtCategoria;
	}

	public void setTxtCategoria(JTextField txtCategoria) {
		this.txtCategoria = txtCategoria;
	}

	public JTable getJTable() {
		return JTable;
	}

	public void setJTable(JTable jTable) {
		JTable = jTable;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}
	
	
	public void mostrarTabla() {
		JTable.setModel(controlReferencial.mostrarTodoReferencial("Tipo_Producto","TipPro"));
	}
	
	
	
	
	
}
