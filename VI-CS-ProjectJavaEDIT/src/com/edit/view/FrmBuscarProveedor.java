package com.edit.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.edit.controller.Logica_Pedido;

public class FrmBuscarProveedor extends JFrame{
	private JPanel JPDatos,JPTabla;
	private JLabel lblProveedor;
	private JTextField txtProveedor;
	private JTable tabla;
	private JScrollPane JSCTabla;
	private Logica_Pedido logica;
	private String RUC="";
	private int TipoDOC=0;
	public FrmBuscarProveedor() {
		logica= new Logica_Pedido();
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Buscar Proveedor");
		setResizable(false);
		setSize(700, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);

		JPDatos = new JPanel();
		JPDatos.setBorder(new TitledBorder(null, "Datos Proveedor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPDatos.setBounds(10, 11, 650, 59);
		getContentPane().add(JPDatos);
		JPDatos.setLayout(null);

		lblProveedor = new JLabel("Proveedor:");
		lblProveedor.setBounds(10, 23, 69, 14);
		JPDatos.add(lblProveedor);

		txtProveedor = new JTextField();
		txtProveedor.setBounds(89, 18, 450, 25);
		JPDatos.add(txtProveedor);
		txtProveedor.setColumns(10);

		JPTabla = new JPanel();
		JPTabla.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Proveedores", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		JPTabla.setBounds(10, 81, 650, 158);
		getContentPane().add(JPTabla);
		JPTabla.setLayout(null);

		JSCTabla = new JScrollPane();
		JSCTabla.setBounds(10, 25, 630, 122);
		JPTabla.add(JSCTabla);

		tabla = new JTable();
		JSCTabla.setViewportView(tabla);
		tabla.setModel(logica.buscar(""));
		txtProveedor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				muestraTodaTabla(txtProveedor.getText());
				

			}
		});
		tabla.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JTable jt=(JTable) e.getSource();
				Point point=e.getPoint();
				int row=jt.rowAtPoint(point);
				if(e.getClickCount()==2) {
					RUC=tabla.getValueAt(tabla.getSelectedRow(), 2).toString();
					dispose();
					if(RUC.length()==11) {
						TipoDOC=2;
					}
					if(RUC.length()==8) {
						TipoDOC=1;
					}
					System.out.println(RUC.length()+" "+TipoDOC);
					
					//					

				}
			}
		});
	

	}
	public void muestraTodaTabla(String s) {
		tabla.setModel(logica.buscar(s));
	}
	public String getRuc() {
		return RUC;
	}
	public int getTipoDOC() {
		return TipoDOC;
	}



}
