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
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.edit.controller.LogicaReferencial;
import com.edit.model.Estado;
import com.edit.model.Tipo_Cliente;
import com.edit.model.Tipo_Pago;

public class FrmRefTipoPago extends JFrame{
	private JPanel JPTipoPago,JPtabla;
	private JLabel lblTipoPago;
	private JTextField txtTipoPago;
	private JScrollPane JSTabla;
	private JTable JTable;
	private JButton btnGuardar,btnSalir,btnBuscar;
	private LogicaReferencial logica;
	private Tipo_Pago tipoPago;
	private Estado estado;
	
	public FrmRefTipoPago() {
		logica=new LogicaReferencial();
		estado=new Estado();
		tipoPago=new Tipo_Pago();
		JTable=new JTable();
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Tipo Pago");
		setResizable(false);
		setSize(406, 468);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);
		
		//categoria productos
		JPTipoPago=new JPanel();
		JPTipoPago.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Categoria Productos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		JPTipoPago.setBounds(20, 30, 350, 100);
		getContentPane().add(JPTipoPago);
		JPTipoPago.setLayout(null);
		
		lblTipoPago = new JLabel("Descripcion: ");
		lblTipoPago.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoPago.setBounds(30, 41, 69, 14);
		JPTipoPago.add(lblTipoPago);
		
		txtTipoPago = new JTextField();
		txtTipoPago.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTipoPago.setBounds(100, 38, 180, 25);
		JPTipoPago.add(txtTipoPago);
		txtTipoPago.setColumns(10);
		
		btnBuscar=new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(290,38,37,25);
		JPTipoPago.add(btnBuscar);
		
		
		//Table
		JPtabla = new JPanel();
		JPtabla.setBorder(new TitledBorder(null, "Tabla", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPtabla.setBounds(20, 141, 350, 188);
		getContentPane().add(JPtabla);
		JPtabla.setLayout(null);
		
		JSTabla = new JScrollPane();
		JSTabla.setBounds(30, 28, 300, 149);
		JPtabla.add(JSTabla);
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
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tipoPago.setDescripcion(txtTipoPago.getText().toUpperCase());
				estado.setCodigo(1);
				tipoPago.setEstCod(estado);
				logica.btnGuardar(tipoPago);
				mostrarTabla();
				txtTipoPago.setText("");
			}
		});	
		mostrarTabla();
		
	}
	public void mostrarTabla() {
		JTable.setModel(logica.mostrarTodoReferencial("Tipo_Pago","TipPag"));
	}
	
}