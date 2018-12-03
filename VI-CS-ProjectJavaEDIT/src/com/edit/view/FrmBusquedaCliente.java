package com.edit.view;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;



public class FrmBusquedaCliente extends JFrame {
	private static FrmBusquedaCliente instancia;
	JPanel jpFiltro,jpTabla;
	JLabel lblTipoDoc,lblNro,lblCliente;
	JComboBox jcTipoDoc;
	JTextField txtNro,txtCliente;
	JScrollPane jsTabla;
	JTable jTabla;
	JButton btnBuscar;
	int codigo;
//	private LogicaButtons logica;
//	private Cliente cliente=new Cliente();
	

	private FrmBusquedaCliente() {
		
//		logica=new LogicaButtons();
		
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Buscar Cliente");
		setResizable(false);
		setSize(524, 409);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);

		

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
//		logica.añadirTipoDoc(jcTipoDoc);
		jpFiltro.add(jcTipoDoc);
		jcTipoDoc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				btnEnter(e);
			}
		});

		lblNro = new JLabel("Nro:");
		lblNro.setBounds(146, 21, 46, 14);
		jpFiltro.add(lblNro);

		txtNro = new JTextField();
		txtNro.setBounds(182, 18, 180, 25);
		jpFiltro.add(txtNro);
		
		txtNro.setColumns(10);
		txtNro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				btnEnter(e);
			}
		});

		lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 56, 46, 14);
		jpFiltro.add(lblCliente);

		txtCliente = new JTextField();
		txtCliente.setEnabled(true);
		txtCliente.setEditable(true);
		txtCliente.setText("");
		txtCliente.setBounds(66, 53, 296, 25);
		jpFiltro.add(txtCliente);
		txtCliente.setColumns(10);
		txtCliente.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				btnEnter(e);
			}
		});

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(372, 17, 89, 23);
		jpFiltro.add(btnBuscar);

		jsTabla = new JScrollPane();
		jsTabla.setBounds(10, 113, 487, 200);
		getContentPane().add(jsTabla);
		
//		jTabla = new JTable(logica.mostrarTablaBuscarCliente(txtNro.getText(),txtCliente.getText(),0));
		jsTabla.setViewportView(jTabla);
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
//				jTabla.setModel(logica.mostrarTablaBuscarCliente(txtNro.getText(),txtCliente.getText(),jcTipoDoc.getSelectedIndex()));
				
			}
		});
		
//		jTabla.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//				JTable jt=(JTable) e.getSource();
//				Point point=e.getPoint();
//				int row=jt.rowAtPoint(point);
//				if(e.getClickCount()==1) {
//					codigo=(Integer.parseInt(jTabla.getValueAt(jTabla.getSelectedRow(), 0).toString()));
//					
//					
//					
//					
//					
//					
////					System.out.println("tabla:"+cliente.getCliCod());
//					
////					System.out.println(cliente.getPerDir());
////					dispose();
//					
//				}
//				if(e.getClickCount()==2) {
//					dispose();
//				}
//			}
//		});
		
		

	}
//	public Cliente getCliente() {
		
//		return cliente;
//	}
	public JTable getTabla() {
		return jTabla;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public static FrmBusquedaCliente Iniciar() {
		if(instancia==null) {
			instancia=new FrmBusquedaCliente();
		}
		return instancia;
	}
	
	private void btnEnter(KeyEvent e) {
		char tecla=e.getKeyChar();
		
		if(tecla==KeyEvent.VK_ENTER) {
			btnBuscar.doClick();
		}
	}

	
}
