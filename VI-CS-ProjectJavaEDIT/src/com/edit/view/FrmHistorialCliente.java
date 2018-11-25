package com.edit.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;











public class FrmHistorialCliente extends JFrame{
	JPanel JPCliente,JPInformacion_Historial,JPFecha,JPMovimientos,JPPendientes;
	JLabel lblTipoDoc,lblNro,lblCliente,lblDireccion,lblEstado,lblCupo,lblDisponible,lblTotalDeuda,lblDeudaVencida,lblNoVencida,lblDesde,lblHasta,lblMontoTotal;
	JDateChooser JDDesde,JDHasta;
	JTextField txtTipoDoc,txtNro,txtCliente,txtDireccion,txtDireccion1,txtEstado,txtCupo,txtDisponible,txtTotalDeuda,txtDeudaVencida,txtNoVencida,txtMontoTotal;
	JScrollPane JSMovimientos,JSPendientes;
	JTable JTMovimientos,JTPendientes;
	JButton btnCobrar,btnEntregar,btnImprimir;
	RenderTable render;

	public FrmHistorialCliente() {
		render=new RenderTable();
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Historial Cliente");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setIconImage(logo);
		setSize(785,691);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JPCliente = new JPanel();
		JPCliente.setBorder(new TitledBorder(null, "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPCliente.setBounds(10, 11, 750, 86);
		getContentPane().add(JPCliente);
		JPCliente.setLayout(null);

		lblTipoDoc = new JLabel("Tipo DOC:");
		lblTipoDoc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDoc.setBounds(10, 22, 58, 14);
		JPCliente.add(lblTipoDoc);

		txtTipoDoc = new JTextField();
		txtTipoDoc.setEditable(false);
		txtTipoDoc.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTipoDoc.setText("DNI");
		txtTipoDoc.setForeground(new Color(00, 00, 66));
		txtTipoDoc.setBounds(67, 17, 67, 25);
		JPCliente.add(txtTipoDoc);
		txtTipoDoc.setColumns(10);

		lblNro = new JLabel("NRO:");
		lblNro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNro.setBounds(144, 22, 38, 14);
		JPCliente.add(lblNro);

		txtNro = new JTextField();
		txtNro.setEditable(false);
		txtNro.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtNro.setForeground(new Color(00, 00, 66));
		txtNro.setBounds(182, 17, 128, 25);
		JPCliente.add(txtNro);
		txtNro.setColumns(10);

		lblCliente = new JLabel("Cliente:");
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCliente.setBounds(10, 60, 46, 14);
		JPCliente.add(lblCliente);

		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		txtCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCliente.setForeground(new Color(00, 00, 66));
		txtCliente.setBounds(67, 53, 243, 25);
		JPCliente.add(txtCliente);
		txtCliente.setColumns(10);

		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDireccion.setBounds(341, 22, 65, 14);
		JPCliente.add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setEditable(false);
		txtDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDireccion.setForeground(new Color(00, 00, 66));
		txtDireccion.setBounds(406, 19, 343, 25);
		JPCliente.add(txtDireccion);
		txtDireccion.setColumns(10);

		txtDireccion1 = new JTextField();
		txtDireccion1.setEditable(false);
		txtDireccion1.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDireccion1.setForeground(new Color(00, 00, 66));
		txtDireccion1.setBounds(406, 53, 343, 25);
		JPCliente.add(txtDireccion1);
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

		lblCupo = new JLabel("Cupo: ");
		lblCupo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCupo.setBounds(10, 60, 46, 14);
		JPInformacion_Historial.add(lblCupo);

		lblDisponible = new JLabel("Disponible:");
		lblDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDisponible.setBounds(197, 21, 79, 14);
		JPInformacion_Historial.add(lblDisponible);

		lblTotalDeuda = new JLabel("Total Deuda:");
		lblTotalDeuda.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalDeuda.setBounds(197, 60, 79, 14);
		JPInformacion_Historial.add(lblTotalDeuda);

		lblDeudaVencida = new JLabel("Deuda Vencida:");
		lblDeudaVencida.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeudaVencida.setBounds(423, 21, 118, 14);
		JPInformacion_Historial.add(lblDeudaVencida);

		lblNoVencida = new JLabel("Deuda No Vencida:");
		lblNoVencida.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNoVencida.setBounds(423, 60, 118, 14);
		JPInformacion_Historial.add(lblNoVencida);

		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setForeground(Color.RED);
		txtEstado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtEstado.setBounds(66, 18, 91, 25);
		JPInformacion_Historial.add(txtEstado);
		txtEstado.setColumns(10);

		txtCupo = new JTextField();
		txtCupo.setEditable(false);
		txtCupo.setForeground(Color.RED);
		txtCupo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCupo.setBounds(66, 53, 91, 25);
		JPInformacion_Historial.add(txtCupo);
		txtCupo.setColumns(10);

		txtDisponible = new JTextField();
		txtDisponible.setEditable(false);
		txtDisponible.setForeground(Color.RED);
		txtDisponible.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDisponible.setBounds(282, 18, 91, 25);
		JPInformacion_Historial.add(txtDisponible);
		txtDisponible.setColumns(10);

		txtTotalDeuda = new JTextField();
		txtTotalDeuda.setEditable(false);
		txtTotalDeuda.setForeground(Color.RED);
		txtTotalDeuda.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTotalDeuda.setBounds(282, 53, 91, 25);
		JPInformacion_Historial.add(txtTotalDeuda);
		txtTotalDeuda.setColumns(10);

		txtDeudaVencida = new JTextField();
		txtDeudaVencida.setEditable(false);
		txtDeudaVencida.setForeground(Color.RED);
		txtDeudaVencida.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDeudaVencida.setBounds(551, 18, 91, 25);
		JPInformacion_Historial.add(txtDeudaVencida);
		txtDeudaVencida.setColumns(10);

		txtNoVencida = new JTextField();
		txtNoVencida.setEditable(false);
		txtNoVencida.setForeground(Color.RED);
		txtNoVencida.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNoVencida.setBounds(551, 53, 91, 25);
		JPInformacion_Historial.add(txtNoVencida);
		txtNoVencida.setColumns(10);

		JPFecha = new JPanel();
		JPFecha.setBorder(new TitledBorder(null, "Fecha", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPFecha.setBounds(10, 210, 750, 46);
		getContentPane().add(JPFecha);
		JPFecha.setLayout(null);

		lblDesde = new JLabel("Desde:");
		lblDesde.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDesde.setBounds(110, 21, 46, 14);
		JPFecha.add(lblDesde);

		JDDesde = new JDateChooser();
		JDDesde.setBounds(155, 17, 120, 20);
		JPFecha.add(JDDesde);

		lblHasta = new JLabel("Hasta: ");
		lblHasta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHasta.setBounds(413, 21, 46, 14);
		JPFecha.add(lblHasta);

		JDHasta = new JDateChooser();
		JDHasta.setBounds(469, 17, 120, 20);
		JPFecha.add(JDHasta);

		JPMovimientos = new JPanel();
		JPMovimientos.setBorder(new TitledBorder(null, "Moviemientos Anteriores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPMovimientos.setBounds(10, 267, 750, 123);
		getContentPane().add(JPMovimientos);
		JPMovimientos.setLayout(null);

		JSMovimientos = new JScrollPane();
		JSMovimientos.setBounds(10, 27, 716, 85);
		JPMovimientos.add(JSMovimientos);

		JTMovimientos = new JTable();
		JTMovimientos.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
				));
		JSMovimientos.setViewportView(JTMovimientos);

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

		btnCobrar = new JButton("Cobrar Total");
		btnCobrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCobrar.setBounds(181, 603, 102, 23);
		getContentPane().add(btnCobrar);

		btnEntregar = new JButton("Entregar");
		btnEntregar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEntregar.setBounds(348, 603, 89, 23);
		getContentPane().add(btnEntregar);

		btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnImprimir.setBounds(510, 603, 89, 23);
		getContentPane().add(btnImprimir);
		JTPendientes.setDefaultRenderer(Object.class, render);
	}
	
	
}

