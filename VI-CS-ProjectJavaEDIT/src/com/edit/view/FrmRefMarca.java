package com.edit.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

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
import javax.swing.table.DefaultTableModel;

import com.edit.controller.LogicaReferencial;
import com.edit.model.Estado;
import com.edit.model.Marca;
import com.edit.model.Referencial;



public class FrmRefMarca extends JFrame{

	private JPanel JPMarca,JPtabla;
	private JLabel lblMarca;
	private JTextField txtMarca;
	private JScrollPane JSTabla;
	private  JTable JTabla;
	private JButton btnGuardar,btnSalir,btnBuscar;
	private Marca marca;
	private LogicaReferencial logica;
	private Estado estado;
	

	public FrmRefMarca() {
		marca=new Marca();
		logica=new LogicaReferencial();
		estado=new Estado();
		
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("MARCA");
		setResizable(false);
		setSize(406, 468);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);

		//categoria productos
		JPMarca=new JPanel();
		JPMarca.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Marca", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		JPMarca.setBounds(20, 30, 350, 100);
		getContentPane().add(JPMarca);
		JPMarca.setLayout(null);

		lblMarca = new JLabel("Descripcion: ");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMarca.setBounds(30, 41, 69, 14);
		JPMarca.add(lblMarca);

		txtMarca = new JTextField();
		txtMarca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtMarca.setBounds(100, 38, 180, 25);
		JPMarca.add(txtMarca);
		txtMarca.setColumns(10);

		btnBuscar=new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(290,38,37,25);
		JPMarca.add(btnBuscar);


		//Table
		JPtabla = new JPanel();
		JPtabla.setBorder(new TitledBorder(null, "Tabla", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPtabla.setBounds(20, 141, 350, 188);
		getContentPane().add(JPtabla);
		JPtabla.setLayout(null);

		JSTabla = new JScrollPane();
		JSTabla.setBounds(30, 28, 300, 149);
		JPtabla.add(JSTabla);

		JTabla =new JTable(logica.mostrarTodoReferencial("Marca","mar"));

		JSTabla.setViewportView(JTabla);

		//botones
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(94, 359, 80, 42);
		getContentPane().add(btnGuardar);

		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(216, 359, 80, 42);
		getContentPane().add(btnSalir);

		//		logica.btnSalir(btnSalir);
		//		
		//		Estado est=new Estado();
		//		est.setCodigo(1);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//				


				marca.setDescripcion(txtMarca.getText().toUpperCase());
				estado.setCodigo(1);
				marca.setEstCod(estado);
				logica.btnGuardar(marca);
				mostrarTabla();
				txtMarca.setText("");
			}
		});
		mostrarTabla();
	
	}
	public void mostrarTabla() {
		JTabla.setModel(logica.mostrarTodoReferencial("Marca","Mar"));
	}


}
