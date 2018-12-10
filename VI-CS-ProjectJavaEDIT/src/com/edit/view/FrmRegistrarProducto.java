package com.edit.view;

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
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.edit.controller.LogicaPersona;
import com.edit.controller.LogicaProducto;
import com.edit.controller.LogicaReferencial;
import com.edit.model.Cliente;
import com.edit.model.Inventario;
import com.edit.model.Marca;
import com.edit.model.Producto;
import com.edit.model.Proveedor;
import com.edit.model.Tipo_Cliente;
import com.edit.model.Tipo_Documento;
import com.edit.model.Tipo_Producto;
import com.edit.model.Unidad_Medida;

public class FrmRegistrarProducto extends JFrame{
	private JPanel JPProducto;
	private JLabel lblNombreP,lblSKU,lblCategoria, lblUnidadMedida, lblPrecioCosto, lblPrecioVenta, lblMarca, lblProveedor;
	private JTextField txtNombreP,txtSKU,txtPrecioVenta,txtPrecioCosto;
	private JComboBox JCCategoria,JCUnidadMedida,JCMarca, JCProveedor;
	private JButton btnBuscar1, btnSalir,btnGuardar;
	private JTabbedPane JTableta;
	private JTextArea JTDireccion;
	private Producto producto;
	private LogicaProducto logica;
	private int Condicion=0;
	private LogicaReferencial logica2;
	
	public FrmRegistrarProducto() {
		producto = new Producto();
		logica = new LogicaProducto();
		logica2 = new LogicaReferencial();
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setSize(426, 478);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setIconImage(logo);
		getContentPane().setLayout(null);
		
		
		JPProducto = new JPanel();
		JPProducto.setBorder(new TitledBorder(null, "Datos Producto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPProducto.setBounds(10, 15, 393, 350);
		getContentPane().add(JPProducto);
		JPProducto.setLayout(null);
		
		lblSKU = new JLabel("SKU:");
		lblSKU.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSKU.setBounds(96, 20, 44, 25);
		JPProducto.add(lblSKU);
		
		lblNombreP = new JLabel("Nombre Producto:");
		lblNombreP.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNombreP.setBounds(32, 60, 88, 25);
		JPProducto.add(lblNombreP);
		
		lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCategoria.setBounds(68, 100, 58, 25);
		JPProducto.add(lblCategoria);
		
		lblUnidadMedida = new JLabel("Unidad Medida:");
		lblUnidadMedida.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUnidadMedida.setBounds(46, 140, 88, 25);
		JPProducto.add(lblUnidadMedida);
		
		lblPrecioCosto = new JLabel("Precio Costo:");
		lblPrecioCosto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrecioCosto.setBounds(56, 180, 80, 25);
		JPProducto.add(lblPrecioCosto);
		
		lblPrecioVenta = new JLabel("Precio Venta:");
		lblPrecioVenta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrecioVenta.setBounds(56, 220, 80, 25);
		JPProducto.add(lblPrecioVenta);
		
		lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma",Font.PLAIN,11));
		lblMarca.setBounds(86,260,50,25);
		JPProducto.add(lblMarca);
		
		lblProveedor = new JLabel("Proveedor:");
		lblProveedor.setFont(new Font("Tahoma",Font.PLAIN,11));
		lblProveedor.setBounds(66, 300, 60, 25);
		JPProducto.add(lblProveedor);
		
		txtSKU = new JTextField();
		txtSKU.setColumns(10);
		txtSKU.setBounds(126, 20, 200, 25);
		JPProducto.add(txtSKU);
		
		txtNombreP = new JTextField();
		txtNombreP.setBounds(126, 60, 200, 25);
		JPProducto.add(txtNombreP);
		txtNombreP.setColumns(10);
		
		JCCategoria = new JComboBox();
		JCCategoria.setBounds(126, 100, 143, 25);
		JPProducto.add(JCCategoria);
		logica2.mostrarJCombo("Tipo_Producto", "TipPro", JCCategoria);
		
		JCUnidadMedida = new JComboBox();
		JCUnidadMedida.setBounds(126, 140, 143, 25);
		JPProducto.add(JCUnidadMedida);
		
		txtPrecioCosto = new JTextField();
		txtPrecioCosto.setColumns(10);
		txtPrecioCosto.setBounds(126, 180, 139, 25);
		JPProducto.add(txtPrecioCosto);
		logica2.mostrarJCombo("Unidad_Medida", "UniMed", JCCategoria);
		
		txtPrecioVenta = new JTextField();
		txtPrecioVenta.setColumns(10);
		txtPrecioVenta.setBounds(126, 220, 139, 25);
		JPProducto.add(txtPrecioVenta);
		
		JCMarca = new JComboBox();
		JCMarca.setBounds(126,260,143,25);
		JPProducto.add(JCMarca);
		logica2.mostrarJCombo("Marca", "Mar", JCCategoria);
		
		JCProveedor = new JComboBox();
		JCProveedor.setBounds(126,300,143,25);
		JPProducto.add(JCProveedor);
		logica2.mostrarPCombo("Proveedor", "Mar", JCProveedor);
		
		btnBuscar1 = new JButton("");
		btnBuscar1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar1.setBounds(343, 20, 37, 25);
		JPProducto.add(btnBuscar1);
		
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(104, 380, 80, 42);
		getContentPane().add(btnGuardar);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(220, 380, 80, 42);
		getContentPane().add(btnSalir);
		
		btnBuscar1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Condicion = autogenerar();
				
			}
		});
		
		btnGuardar.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Condicion==1) {
//	Aquí se hace la persistencia del producto					
					producto.setProdDes(txtNombreP.getText());
					producto.setProSKU(Integer.parseInt(txtSKU.getText()));
					Tipo_Producto tipo = new Tipo_Producto();
					tipo.setCodigo(JCCategoria.getSelectedIndex());
					tipo.setDescripcion(JCCategoria.getSelectedItem().toString());
					producto.setTipProCod(tipo);
//					producto.setProStk(Integer.parseInt(txtStk.getText()));
					Marca marca = new Marca();
					marca.setCodigo(JCMarca.getSelectedIndex());
					marca.setDescripcion(JCMarca.getSelectedItem().toString());
					producto.setMarCod(marca);
					Unidad_Medida undMed = new Unidad_Medida();
					undMed.setCodigo(JCUnidadMedida.getSelectedIndex());
					undMed.setDescripcion(JCUnidadMedida.getSelectedItem().toString());
					producto.setUniMedCod(undMed);
//	Hasta aquí se usa solo el objeto producto
					
//	Aquí se crea un objeto Inventario y un onjeto Proveedor, para ser ingresados en la Lógica
					Inventario inv = new Inventario();
					inv.setProdCod(producto);
					Proveedor prov = new Proveedor();
					prov.setProvCod(Integer.parseInt(JCProveedor.getSelectedItem().toString()));
					inv.setProv(prov);
					inv.setProPreCom(Integer.parseInt(txtPrecioCosto.getText()));
					inv.setProPreVen(Integer.parseInt(txtPrecioVenta.getText()));
					
					logica.InsertarProducto(inv);
//					System.out.println(tipo.getCodigo());
					
				}
				if(Condicion==2) {
					
					producto.setProdDes(txtNombreP.getText());
					producto.setProSKU(Integer.parseInt(txtSKU.getText()));
					Tipo_Producto tipo = new Tipo_Producto();
					tipo.setCodigo(JCCategoria.getSelectedIndex());
					tipo.setDescripcion(JCCategoria.getSelectedItem().toString());
					producto.setTipProCod(tipo);
//					producto.setProStk(Integer.parseInt(txtStk.getText()));
					Marca marca = new Marca();
					marca.setCodigo(JCMarca.getSelectedIndex());
					marca.setDescripcion(JCMarca.getSelectedItem().toString());
					producto.setMarCod(marca);
					Unidad_Medida undMed = new Unidad_Medida();
					undMed.setCodigo(JCUnidadMedida.getSelectedIndex());
					undMed.setDescripcion(JCUnidadMedida.getSelectedItem().toString());
					producto.setUniMedCod(undMed);
					
//					logica.asignarPerCod_PerCli(producto);
//					logica.ModificarPersona(producto);
					JCUnidadMedida.setSelectedIndex(0);
					JCMarca.setSelectedIndex(0);
					JCCategoria.setSelectedIndex(0);
					
					
					
					
				}
				if(Condicion==3) {
					
					producto.setProdDes(txtNombreP.getText());
					producto.setProSKU(Integer.parseInt(txtSKU.getText()));
					Tipo_Producto tipo = new Tipo_Producto();
					tipo.setCodigo(JCCategoria.getSelectedIndex());
					tipo.setDescripcion(JCCategoria.getSelectedItem().toString());
					producto.setTipProCod(tipo);
//					producto.setProStk(Integer.parseInt(txtStk.getText()));
					Marca marca = new Marca();
					marca.setCodigo(JCMarca.getSelectedIndex());
					marca.setDescripcion(JCMarca.getSelectedItem().toString());
					producto.setMarCod(marca);
					Unidad_Medida undMed = new Unidad_Medida();
					undMed.setCodigo(JCUnidadMedida.getSelectedIndex());
					undMed.setDescripcion(JCUnidadMedida.getSelectedItem().toString());
					producto.setUniMedCod(undMed);
					
//					logica.InsertarCliente(producto);
					JCUnidadMedida.setSelectedIndex(0);
					JCMarca.setSelectedIndex(0);
					JCCategoria.setSelectedIndex(0);
					limpiar();
				}
				
			}
		});
		
		
		
	}
	
	public int autogenerar() {
		producto.setProSKU(Integer.parseInt(txtSKU.getText()));
		
		
		if(logica.validarProducto(producto) == true) {
			System.out.println("existe producto");
			llenarProducto();
			JCCategoria.setSelectedIndex(producto.getTipProCod().getCodigo());
			JCMarca.setSelectedIndex(producto.getMarCod().getCodigo());
			JCUnidadMedida.setSelectedIndex(producto.getUniMedCod().getCodigo());
			return 1;
		}else {
			if(logica.validarProducto(producto) == true) {
				System.out.println("prodcto");
				llenarProducto();
				return 2;
				
			}
			else {
				System.out.println("Producto no existe");
				return 3;
			}
		}
		//		JCTipoDOC.setSelectedIndex(cliente.getPerTipDoc().getCodigo());
		
	}
	
	public void llenarProducto() {
		
		txtNombreP.setText(producto.getProdDes());
		txtSKU.setText(producto.getProSKU()+"");
	}
	
	public void limpiar() {
		txtNombreP.setText("");
		txtSKU.setText("");
		JCCategoria.setSelectedIndex(0);
		JCUnidadMedida.setSelectedIndex(0);
		txtPrecioCosto.setText("");
		txtPrecioVenta.setText("");
		JCMarca.setSelectedIndex(0);
	}
}
