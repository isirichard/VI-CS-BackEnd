package com.edit.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.edit.controller.Coordinador;
import com.toedter.calendar.JDateChooser;


import com.edit.model.NotaPedidoCab;
import com.edit.model.NotaPedidoDet;
import com.edit.model.Proveedor;








public class FrmHistorialProveedor extends JFrame{
	JPanel JPProveedor,JPInformacion_Historial,JPFecha,JPMovimientos,JPPendientes;
	JLabel lblTipoDoc,lblNro,lblProveedor,lblDireccion,lblEstado,lblDeudaTotal,lblDeudaActual,lblDeudaAtrasada,lblDeudaVencida,lblNoVencida,lblDesde,lblHasta,lblMontoTotal;
	JDateChooser JDDesde,JDHasta;
	JTextField txtTipoDoc,txtNro,txtCliente,txtDireccion,txtDireccion1,txtEstado,txtDeudaTotal,txtDisponible,txtTotalDeuda,txtDeudaVencida,txtNoVencida,txtMontoTotal;
	JScrollPane JSMovimientos,JSPendientes;
	JTable JTMovimientos,JTPendientes;
	JButton btnPagado,btnRecibir,btnImprimir,btnBuscar,btnVerTodosMovAnt;
	RenderTable render;
	Coordinador coordi;
	Proveedor proveedor;
	int idproov;
	
	public FrmHistorialProveedor() {
		proveedor = new Proveedor();
		render=new RenderTable();
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Historial Proveedor");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		coordi = new Coordinador();
		setIconImage(logo);
		setSize(785,691);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JPProveedor = new JPanel();
		JPProveedor.setBorder(new TitledBorder(null, "Proveedor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPProveedor.setBounds(10, 11, 750, 86);
		getContentPane().add(JPProveedor);
		JPProveedor.setLayout(null);

		lblTipoDoc = new JLabel("Tipo DOC:");
		lblTipoDoc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDoc.setBounds(10, 22, 58, 14);
		JPProveedor.add(lblTipoDoc);

		txtTipoDoc = new JTextField();
		txtTipoDoc.setEditable(false);
		txtTipoDoc.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTipoDoc.setText("RUC");
		txtTipoDoc.setForeground(new Color(00, 00, 66));
		txtTipoDoc.setBounds(67, 17, 67, 25);
		JPProveedor.add(txtTipoDoc);
		txtTipoDoc.setColumns(10);

		lblNro = new JLabel("NRO:");
		lblNro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNro.setBounds(144, 22, 38, 14);
		JPProveedor.add(lblNro);

		txtNro = new JTextField();
		txtNro.setEditable(false);
		txtNro.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtNro.setForeground(new Color(00, 00, 66));
		txtNro.setBounds(182, 17, 128, 25);
		JPProveedor.add(txtNro);
		txtNro.setColumns(10);

		lblProveedor = new JLabel("Empresa:");
		lblProveedor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProveedor.setBounds(10, 60, 60, 14);
		JPProveedor.add(lblProveedor);

		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		txtCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCliente.setForeground(new Color(00, 00, 66));
		txtCliente.setBounds(67, 53, 243, 25);
		JPProveedor.add(txtCliente);
		txtCliente.setColumns(10);

		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDireccion.setBounds(341, 22, 65, 14);
		JPProveedor.add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setEditable(false);
		txtDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDireccion.setForeground(new Color(00, 00, 66));
		txtDireccion.setBounds(406, 19, 343, 25);
		JPProveedor.add(txtDireccion);
		txtDireccion.setColumns(10);

		txtDireccion1 = new JTextField();
		txtDireccion1.setEditable(false);
		txtDireccion1.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDireccion1.setForeground(new Color(00, 00, 66));
		txtDireccion1.setBounds(406, 53, 343, 25);
		JPProveedor.add(txtDireccion1);
		txtDireccion1.setColumns(10);

		JPInformacion_Historial = new JPanel();
		JPInformacion_Historial.setBorder(new TitledBorder(null, "Informacion de Historial", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPInformacion_Historial.setBounds(10, 108, 750, 91);
		getContentPane().add(JPInformacion_Historial);
		JPInformacion_Historial.setLayout(null);

		lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstado.setBounds(10, 21, 46, 14);
		JPInformacion_Historial.add(lblEstado);

		lblDeudaTotal = new JLabel("Deuda Total: ");
		lblDeudaTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeudaTotal.setBounds(10, 60, 100, 14);
		JPInformacion_Historial.add(lblDeudaTotal);

		lblDeudaActual = new JLabel("Deuda Actual:");
		lblDeudaActual.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeudaActual.setBounds(197, 21, 79, 14);
		JPInformacion_Historial.add(lblDeudaActual);

		lblDeudaAtrasada = new JLabel("Deuda Atrasada:");
		lblDeudaAtrasada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeudaAtrasada.setBounds(197, 60, 100, 14);
		JPInformacion_Historial.add(lblDeudaAtrasada);

//		lblDeudaVencida = new JLabel("Deuda Vencida:");
//		lblDeudaVencida.setFont(new Font("Tahoma", Font.BOLD, 11));
//		lblDeudaVencida.setBounds(423, 21, 118, 14);
//		JPInformacion_Historial.add(lblDeudaVencida);
//
//		lblNoVencida = new JLabel("Deuda No Vencida:");
//		lblNoVencida.setFont(new Font("Tahoma", Font.BOLD, 11));
//		lblNoVencida.setBounds(423, 60, 118, 14);
//		JPInformacion_Historial.add(lblNoVencida);

		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setForeground(Color.RED);
		txtEstado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtEstado.setBounds(90, 18, 91, 25);
		JPInformacion_Historial.add(txtEstado);
		txtEstado.setColumns(10);

		txtDeudaTotal = new JTextField();
		txtDeudaTotal.setEditable(false);
		txtDeudaTotal.setForeground(Color.RED);
		txtDeudaTotal.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDeudaTotal.setBounds(90, 53, 91, 25);
		JPInformacion_Historial.add(txtDeudaTotal);
		txtDeudaTotal.setColumns(10);

		txtDisponible = new JTextField();
		txtDisponible.setEditable(false);
		txtDisponible.setForeground(Color.RED);
		txtDisponible.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDisponible.setBounds(300, 18, 91, 25);
		JPInformacion_Historial.add(txtDisponible);
		txtDisponible.setColumns(10);

		txtTotalDeuda = new JTextField();
		txtTotalDeuda.setEditable(false);
		txtTotalDeuda.setForeground(Color.RED);
		txtTotalDeuda.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTotalDeuda.setBounds(300, 53, 91, 25);
		JPInformacion_Historial.add(txtTotalDeuda);
		txtTotalDeuda.setColumns(10);

//		txtDeudaVencida = new JTextField();
//		txtDeudaVencida.setEditable(false);
//		txtDeudaVencida.setForeground(Color.RED);
//		txtDeudaVencida.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		txtDeudaVencida.setBounds(551, 18, 91, 25);
//		JPInformacion_Historial.add(txtDeudaVencida);
//		txtDeudaVencida.setColumns(10);
//
//		txtNoVencida = new JTextField();
//		txtNoVencida.setEditable(false);
//		txtNoVencida.setForeground(Color.RED);
//		txtNoVencida.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		txtNoVencida.setBounds(551, 53, 91, 25);
//		JPInformacion_Historial.add(txtNoVencida);
//		txtNoVencida.setColumns(10);

		JPFecha = new JPanel();
		JPFecha.setBorder(new TitledBorder(null, "Fecha", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPFecha.setBounds(10, 210, 750, 46);
		getContentPane().add(JPFecha);
		JPFecha.setLayout(null);

		lblDesde = new JLabel("Desde:");
		lblDesde.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDesde.setBounds(110, 21, 46, 14);
		JPFecha.add(lblDesde);
		
		// PRIMER CHOOSER
		JDDesde = new JDateChooser();
		JDDesde.setBounds(155, 17, 120, 20);
		JPFecha.add(JDDesde);

		lblHasta = new JLabel("Hasta: ");
		lblHasta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHasta.setBounds(413, 21, 46, 14);
		JPFecha.add(lblHasta);

		// SEGUNDO CHOOSER
		JDHasta = new JDateChooser();
		JDHasta.setBounds(469, 17, 120, 20);
		JPFecha.add(JDHasta);

		btnBuscar=new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(700,15,37,25);
		JPFecha.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBuscarAccion(e);
			}
		});
		
		
		
		
		
		JPMovimientos = new JPanel();
		JPMovimientos.setBorder(new TitledBorder(null, "Moviemientos Anteriores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPMovimientos.setBounds(10, 267, 750, 135);
		getContentPane().add(JPMovimientos);
		JPMovimientos.setLayout(null);

		JSMovimientos = new JScrollPane();
		JSMovimientos.setBounds(10, 20, 716, 85);
		JPMovimientos.add(JSMovimientos);

		JTMovimientos = new JTable(){
			public boolean isCellEditable(int rowIndex,int colIndex) {
				return false;
			}
			
		};
		
		
		
		
		JTMovimientos.setModel(new DefaultTableModel(
				new Object[][] {
					{		"15/01/2018", "16/01/2018", "PAGADO", "RECIBIDO", "CERA SAPOLIO", "48787456", "250.00", "250.00"},
					{		"EMISION", "VENCIMIENTO", "ESTADO", "RECIBIDO", "PRODUCTO", "DOCUMENTO", "TOTAL", "MONTO"
					},
				},
				new String[] {
						"EMISION", "VENCIMIENTO", "ESTADO", "RECIBIDO", "PRODUCTO", "DOCUMENTO", "TOTAL", "MONTO"
				}
				));
		JSMovimientos.setViewportView(JTMovimientos);
		mostrarTabla(datosDefault());
		
		btnVerTodosMovAnt = new JButton("Ver Todos Movimientos");
		btnVerTodosMovAnt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnVerTodosMovAnt.setBounds(300, 108, 170, 23);
		JPMovimientos.add(btnVerTodosMovAnt);
		btnVerTodosMovAnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVerTodosMovAntAccion(e);
			}
		});
		
		JPPendientes = new JPanel();
		JPPendientes.setBorder(new TitledBorder(null, "Pendientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPPendientes.setBounds(10, 401, 750, 172);
		getContentPane().add(JPPendientes);
		JPPendientes.setLayout(null);

		JSPendientes = new JScrollPane();
		JSPendientes.setBounds(10, 25, 712, 109);
		JPPendientes.add(JSPendientes);

		JTPendientes = new JTable();
		JTPendientes.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column", "New column"
				}
				) {
			Class[] columnTypes = new Class[] {
					Boolean.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		JSPendientes.setViewportView(JTPendientes);

		lblMontoTotal = new JLabel("Monto Total:");
		lblMontoTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMontoTotal.setBounds(556, 147, 72, 14);
		JPPendientes.add(lblMontoTotal);

		txtMontoTotal = new JTextField();
		txtMontoTotal.setEditable(false);
		txtMontoTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtMontoTotal.setBounds(636, 145, 86, 20);
		JPPendientes.add(txtMontoTotal);
		txtMontoTotal.setColumns(10);

		btnPagado = new JButton("Pagar Total");
		btnPagado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPagado.setBounds(181, 603, 102, 23);
		getContentPane().add(btnPagado);

		btnRecibir = new JButton("Recibir");
		btnRecibir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRecibir.setBounds(348, 603, 89, 23);
		getContentPane().add(btnRecibir);

		btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnImprimir.setBounds(510, 603, 89, 23);
		getContentPane().add(btnImprimir);
		JTPendientes.setDefaultRenderer(Object.class, render);
	}
	
	private void btnVerTodosMovAntAccion(ActionEvent e) {
		mostrarTabla(datosDefault());
	}
	
	private void btnBuscarAccion(ActionEvent e) {
		mostrarTabla(datosEntre());
	}
	
	private void mostrarTabla(String [][] datos) {
		JTMovimientos.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"F. EMISION", "F. RECIBIDO", "ESTADO", "RECIBIDO", "PRODUCTO", "DOCUMENTO", "TOTAL", "MONTO"
				}
				));
		JSMovimientos.setViewportView(JTMovimientos);
		
	}
	
	
	private String [][] datosDefault(){
		ArrayList <NotaPedidoCab> movAnterioresCol = (ArrayList<NotaPedidoCab>) coordi.mostrarTodosMovAnterioresColCod(1);
		ArrayList <NotaPedidoDet> detallesProv = (ArrayList<NotaPedidoDet>) coordi.mostrarTodosMovAnterioresPorProv(idproov);
		String datos [][] = new String [movAnterioresCol.size()+3][8];
		for (int i = 0; i < movAnterioresCol.size(); i++) {
			datos[i][0]= movAnterioresCol.get(i).getFechaEmision();
			datos[i][1]= movAnterioresCol.get(i).getFechaRecibido();
			//datos[i][2]= movAnterioresCol.get(i).getFechaPagado();
			datos[i][2] = ""+coordi.getEstadoPagoDescripcionPorId(movAnterioresCol.get(i).getPagCoc());
			datos[i][3] = ""+coordi.getEstadoRecibidoDescripcionPorId(movAnterioresCol.get(i).getRecCod());
			datos[i][4] = coordi.getDescripcionProductoPorId(detallesProv.get(i).getProdCod());
			datos[i][5] = "DOCUMENTO";
			datos[i][6] = ""+detallesProv.get(i).getNotPedTot();
			datos[i][7] = ""+detallesProv.get(i).getNotPedTot();
			
		}
		return datos;
	}

	private String [][] datosEntre(){
		int k=0;
		ArrayList <NotaPedidoCab> movAnterioresCol = (ArrayList<NotaPedidoCab>) coordi.mostrarTodosMovAnterioresColCod(1);
		ArrayList <NotaPedidoDet> detallesProv = (ArrayList<NotaPedidoDet>) coordi.mostrarTodosMovAnterioresPorProv(idproov);
		String datos [][] = new String [movAnterioresCol.size()+3][8];
		for (int i = 0; i < movAnterioresCol.size(); i++) {
			System.out.println(movAnterioresCol.get(i).getNotPedFecRecDia()+"DIAAAA");
			System.out.println(movAnterioresCol.get(i).getNotPedFecRecMes()+"MESSSS");
			System.out.println(movAnterioresCol.get(i).getNotPedFecRecAño()+"AÑOOOO");
			
			System.out.println(entre(movAnterioresCol.get(i).getNotPedFecRecDia(),movAnterioresCol.get(i).getNotPedFecRecMes(),movAnterioresCol.get(i).getNotPedFecRecAño()));
			if(entre(movAnterioresCol.get(i).getNotPedFecRecDia(),movAnterioresCol.get(i).getNotPedFecRecMes(),movAnterioresCol.get(i).getNotPedFecRecAño())) {
			datos[k][0]= movAnterioresCol.get(i).getFechaEmision();
			datos[k][1]= movAnterioresCol.get(i).getFechaRecibido();
			//datos[i][2]= movAnterioresCol.get(i).getFechaPagado();
			datos[k][2] = ""+coordi.getEstadoPagoDescripcionPorId(movAnterioresCol.get(i).getPagCoc());
			datos[k][3] = ""+coordi.getEstadoRecibidoDescripcionPorId(movAnterioresCol.get(i).getRecCod());
			datos[k][4] = coordi.getDescripcionProductoPorId(detallesProv.get(i).getProdCod());
			datos[k][5] = "DOCUMENTO";
			datos[k][6] = ""+detallesProv.get(i).getNotPedTot();
			datos[k][7] = ""+detallesProv.get(i).getNotPedTot();
			k++;
			}
		}
		System.out.println("HECHO");
		return datos;
	}
	/**
	 * este metodo se encargara de llenar las ajas de texto
	 * con los datos del proveedor seleccionado
	 * @param proveedor - este parametro tendra todos los datos del proveedor seleccionado
	 */
	public void llenarText(Proveedor proveedor) {
	    //System.out.println(proveedor.getPerNom());
		//this.txtTipoDoc.setText(proveedor.getPerTipDoc().getDescripcion());
		this.proveedor=proveedor;
		this.txtNro.setText(proveedor.getPerNumDoc());
	
		idproov=proveedor.getProvCod();
		this.txtDireccion.setText(proveedor.getPerDir());
		this.txtMontoTotal.setText(""+proveedor.getProDeuAtr());
	    this.txtDisponible.setText(""+proveedor.getProDeuAct());
		this.txtDeudaTotal.setText(""+proveedor.getProDeuTot());
		
	
	}

	
	private boolean entre(int dia,int mes,int ano) {
		
		int diaI = JDDesde.getDate().getDate();
		int mesI = JDDesde.getDate().getMonth()+1;
		int anoI = JDDesde.getDate().getYear()+1900;
		
		int diaF = JDHasta.getDate().getDate();
		int mesF = JDHasta.getDate().getMonth()+1;
		int anoF = JDHasta.getDate().getYear()+1900;
		
	//	System.out.println(diaI +"\t"+mesI+"\t"+anoI);
	//	System.out.println(diaF +"\t"+mesF+"\t"+anoF);
		
		if(ano>=anoI && ano<=anoF)
			if(mes==mesI && mes==mesF) {
				if(dia>=diaI && dia<=diaF)
					return true;
			}else {
				if(mesI<=mes && mesF>=mes) {
					return true;
				}
			}
				
		
		
		return false;
	}
	
	
	
	
}

