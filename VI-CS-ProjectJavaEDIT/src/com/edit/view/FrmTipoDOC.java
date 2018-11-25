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
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.edit.controller.Coordinador;

public class FrmTipoDOC extends JFrame{
	private JPanel JPTipoDOC,JPtabla;
	private JLabel lblTipoDOCDes,lblTipoDOCCod,lblTipoDOCER;
	private JTextField txtTipoDOCDes,txtTipoDOC2Cod;
	private JScrollPane JSTabla;
	private JTabbedPane JTable;
	private JButton btnGuardar,btnSalir,btnBuscar;
	private Coordinador miCoordinador = new Coordinador();
	
	public FrmTipoDOC() {
		
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Tipo DOC");
		setResizable(false);
		setSize(406, 468);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);
		
		//categoria productos
		JPTipoDOC=new JPanel();
		JPTipoDOC.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo DOC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		JPTipoDOC.setBounds(20, 30, 350, 100);
		getContentPane().add(JPTipoDOC);
		JPTipoDOC.setLayout(null);
		
		lblTipoDOCCod=new JLabel("Codigo: ");
		lblTipoDOCCod.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoDOCCod.setBounds(30, 20, 69, 14);
		JPTipoDOC.add(lblTipoDOCCod);
		
		
		lblTipoDOCDes = new JLabel("Descripcion: ");
		lblTipoDOCDes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoDOCDes.setBounds(30, 51, 69, 14);
		JPTipoDOC.add(lblTipoDOCDes);
		
		lblTipoDOCER = new JLabel("Estado Registro:  A ");
		lblTipoDOCER.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoDOCER.setBounds(30, 81, 119, 14);
		JPTipoDOC.add(lblTipoDOCER);
		
		
		
		txtTipoDOC2Cod=new JTextField();
		txtTipoDOC2Cod.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTipoDOC2Cod.setBounds(100, 8, 180, 25);
		JPTipoDOC.add(txtTipoDOC2Cod);
		txtTipoDOC2Cod.setColumns(10);
		
		txtTipoDOCDes = new JTextField();
		txtTipoDOCDes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTipoDOCDes.setBounds(100, 38, 180, 25);
		JPTipoDOC.add(txtTipoDOCDes);
		txtTipoDOCDes.setColumns(10);
		
		
		btnBuscar=new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(290,38,37,25);
		JPTipoDOC.add(btnBuscar);
		
		
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
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtTipoDOC2Cod.getText()+txtTipoDOCDes.getText());
				String a=txtTipoDOC2Cod.getText();
				String a2=txtTipoDOCDes.getText();
				miCoordinador.agregar(a,a2);
			
				//miCoordinador.registrarTipoDoc(a,a2);
				//System.out.println(txtTipoDOC2Cod.getText());
			}
		});
		
	}
	
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}
	
	
}
