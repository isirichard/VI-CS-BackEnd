package Interfaz;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class FrmRegistroPedido extends JFrame{
	
	private JPanel JPDatosCliente,JPEmpresa,JPFecha,JPTipoPago,JPEntrega,JPProducto,JPPrecio;
	private JLabel lblTipoDOC,lblNro,lblProveedor,lblDireccionPro,lblEmpresa,lblRUC,lblDireccionEmp,lblTelefono,lblEmpresaNom,lblRUCNom,lblDireccionNom,lblTelefonoNom,
	lblFechaEmision,lblFechaPago,lblPago,lblSKU,lblProducto,lblCodigoVend,lblCantidad,lblPrecioUnitario,lblPrecioxCant,
	lblPrecioVenta,lblIGV,lblPrecioTotal,lblLogo;
	private JTextField txtNro,txtProveedor,txtDireccion,txtSKU,txtProducto,txtCodigoVend,txtCantidad,txtPrecioUnitario,txtPrecioxCant,txtPrecioVenta,
	txtIGV,txtPrecioTotal;
	private JComboBox JCTipoDOC,JCPago;
	private JDateChooser JDEmision,JDPago;
	private JRadioButton JRRecibido,JRNoRecibido;
	private JButton btnBuscar, btnGuardar,btnSalir;
	private JTable JTabla;
	private JScrollPane JSTabla;
	
	public FrmRegistroPedido() {
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("Registro de Pedido");
//		setClosable(true);
//		setIconifiable(true);
		setIconImage(logo);
		setSize(829, 676);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPDatosCliente = new JPanel();
		JPDatosCliente.setBorder(new TitledBorder(null, "Datos Proveedor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPDatosCliente.setBounds(10, 11, 366, 120);
		getContentPane().add(JPDatosCliente);
		JPDatosCliente.setLayout(null);
		
		lblTipoDOC = new JLabel("Tipo DOC");
		lblTipoDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoDOC.setBounds(10, 23, 50, 14);
		JPDatosCliente.add(lblTipoDOC);
		
		lblProveedor = new JLabel("Proveedor:");
		lblProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblProveedor.setBounds(10, 57, 55, 14);
		JPDatosCliente.add(lblProveedor);
		
		lblDireccionPro = new JLabel("Direccion:");
		lblDireccionPro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDireccionPro.setBounds(10, 90, 50, 14);
		JPDatosCliente.add(lblDireccionPro);
		
		txtNro = new JTextField();
		txtNro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNro.setBounds(188, 19, 143, 22);
		JPDatosCliente.add(txtNro);
		txtNro.setColumns(10);
		
		txtProveedor = new JTextField();
		txtProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtProveedor.setColumns(10);
		txtProveedor.setEditable(false);
		txtProveedor.setBounds(66, 53, 265, 22);
		JPDatosCliente.add(txtProveedor);
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDireccion.setEditable(false);
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(66, 86, 265, 22);
		JPDatosCliente.add(txtDireccion);
		
		lblNro = new JLabel("Nro:");
		lblNro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNro.setBounds(159, 23, 34, 14);
		JPDatosCliente.add(lblNro);
		
		JCTipoDOC = new JComboBox();
		JCTipoDOC.setBounds(66, 20, 66, 20);
		JPDatosCliente.add(JCTipoDOC);
		
		JPEmpresa = new JPanel();
		JPEmpresa.setBorder(new TitledBorder(null, "Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPEmpresa.setBounds(413, 11, 390, 120);
		getContentPane().add(JPEmpresa);
		JPEmpresa.setLayout(null);
		
		lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEmpresa.setBounds(10, 23, 46, 14);
		JPEmpresa.add(lblEmpresa);
		
		lblRUC = new JLabel("RUC:");
		lblRUC.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRUC.setBounds(10, 48, 46, 14);
		JPEmpresa.add(lblRUC);
		
		lblDireccionEmp = new JLabel("Direccion:");
		lblDireccionEmp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDireccionEmp.setBounds(10, 73, 64, 14);
		JPEmpresa.add(lblDireccionEmp);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTelefono.setBounds(10, 95, 46, 14);
		JPEmpresa.add(lblTelefono);
		
		lblEmpresaNom = new JLabel("EDITH EIRL");
		lblEmpresaNom.setBounds(64, 23, 127, 14);
		JPEmpresa.add(lblEmpresaNom);
		
		lblRUCNom = new JLabel("2555555555");
		lblRUCNom.setBounds(66, 48, 125, 14);
		JPEmpresa.add(lblRUCNom);
		
		lblDireccionNom = new JLabel("Calle Pizarro 215");
		lblDireccionNom.setBounds(64, 73, 127, 14);
		JPEmpresa.add(lblDireccionNom);
		
		lblTelefonoNom = new JLabel("696969");
		lblTelefonoNom.setBounds(66, 95, 125, 14);
		JPEmpresa.add(lblTelefonoNom);
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(201, 23, 162, 86);
		JPEmpresa.add(lblLogo);
		
		JPFecha = new JPanel();
		JPFecha.setBorder(new TitledBorder(null, "Fecha", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPFecha.setBounds(10, 142, 275, 81);
		getContentPane().add(JPFecha);
		JPFecha.setLayout(null);
		
		lblFechaEmision = new JLabel("Fecha Emision:");
		lblFechaEmision.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFechaEmision.setBounds(10, 20, 83, 14);
		JPFecha.add(lblFechaEmision);
		
		lblFechaPago = new JLabel("Fecha Pago:");
		lblFechaPago.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFechaPago.setBounds(10, 50, 83, 14);
		JPFecha.add(lblFechaPago);
		
		JDEmision = new JDateChooser();
		JDEmision.setBounds(85, 20, 139, 20);
		JPFecha.add(JDEmision);
		
		JDPago = new JDateChooser();
		JDPago.setBounds(85, 50, 139, 20);
		JPFecha.add(JDPago);
		
		JPTipoPago = new JPanel();
		JPTipoPago.setBorder(new TitledBorder(null, "Tipo Pago", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPTipoPago.setBounds(295, 143, 249, 80);
		getContentPane().add(JPTipoPago);
		JPTipoPago.setLayout(null);
		
		lblPago = new JLabel("Pago: ");
		lblPago.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPago.setBounds(10, 37, 46, 14);
		JPTipoPago.add(lblPago);
		
		JCPago = new JComboBox();
		JCPago.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JCPago.setBounds(49, 34, 180, 25);
		JPTipoPago.add(JCPago);
		
		JPEntrega = new JPanel();
		JPEntrega.setBorder(new TitledBorder(null, "Entrega", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPEntrega.setBounds(554, 143, 249, 80);
		getContentPane().add(JPEntrega);
		JPEntrega.setLayout(null);
		
		JRRecibido = new JRadioButton("Recibido");
		JRRecibido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JRRecibido.setBounds(16, 21, 109, 23);
		JPEntrega.add(JRRecibido);
		
		JRNoRecibido = new JRadioButton("No Recibido");
		JRNoRecibido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JRNoRecibido.setBounds(16, 47, 109, 23);
		JPEntrega.add(JRNoRecibido);
		
		
		//panel Producto
		JPProducto = new JPanel();
		JPProducto.setBorder(new TitledBorder(null, "Producto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPProducto.setBounds(10, 235, 793, 332);
		getContentPane().add(JPProducto);
		JPProducto.setLayout(null);
		
		lblSKU = new JLabel("SKU:");
		lblSKU.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSKU.setBounds(26, 41, 59, 14);
		JPProducto.add(lblSKU);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCantidad.setBounds(26, 80, 59, 14);
		JPProducto.add(lblCantidad);
		
		txtSKU = new JTextField();
		txtSKU.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtSKU.setBounds(93, 38, 142, 25);
		JPProducto.add(txtSKU);
		txtSKU.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(93, 77, 61, 25);
		JPProducto.add(txtCantidad);
		
		lblProducto = new JLabel("Producto:");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblProducto.setBounds(298, 41, 59, 14);
		JPProducto.add(lblProducto);
		
		btnBuscar= new JButton("");
		btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
		btnBuscar.setBounds(239, 38, 30, 25);
		JPProducto.add(btnBuscar);
		
		txtProducto = new JTextField();
		txtProducto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtProducto.setEditable(false);
		txtProducto.setBounds(361, 36, 180, 25);
		JPProducto.add(txtProducto);
		txtProducto.setColumns(10);
		
		lblCodigoVend = new JLabel("Codigo Vend:");
		lblCodigoVend.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCodigoVend.setBounds(564, 41, 72, 14);
		JPProducto.add(lblCodigoVend);
		
		txtCodigoVend = new JTextField();
		txtCodigoVend.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCodigoVend.setBounds(634, 36, 64, 25);
		JPProducto.add(txtCodigoVend);
		txtCodigoVend.setColumns(10);
		
		lblPrecioUnitario = new JLabel("Precio Unitario:");
		lblPrecioUnitario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrecioUnitario.setBounds(190, 80, 79, 14);
		JPProducto.add(lblPrecioUnitario);
		
		txtPrecioUnitario = new JTextField();
		txtPrecioUnitario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPrecioUnitario.setEditable(false);
		txtPrecioUnitario.setBounds(279, 75, 80, 25);
		JPProducto.add(txtPrecioUnitario);
		txtPrecioUnitario.setColumns(10);
		

		lblPrecioxCant = new JLabel("Precio x Cant:");
		lblPrecioxCant.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrecioxCant.setBounds(381, 80, 72, 14);
		JPProducto.add(lblPrecioxCant);
		
		txtPrecioxCant = new JTextField();
		txtPrecioxCant.setEditable(false);
		txtPrecioxCant.setBounds(463, 77, 78, 25);
		JPProducto.add(txtPrecioxCant);
		txtPrecioxCant.setColumns(10);
		
		JSTabla = new JScrollPane();
		JSTabla.setBounds(26, 113, 578, 200);
		JPProducto.add(JSTabla);
		
		JTabla = new JTable();
		JTabla.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		JSTabla.setViewportView(JTabla);
		
		JPPrecio = new JPanel();
		JPPrecio.setBorder(new TitledBorder(null, "Precio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPPrecio.setBounds(614, 113, 169, 200);
		JPProducto.add(JPPrecio);
		JPPrecio.setLayout(null);
		
		lblPrecioVenta = new JLabel("Precio Venta:");
		lblPrecioVenta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrecioVenta.setBounds(10, 29, 73, 14);
		JPPrecio.add(lblPrecioVenta);
		
		lblIGV = new JLabel("IGV% :");
		lblIGV.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblIGV.setBounds(10, 67, 46, 14);
		JPPrecio.add(lblIGV);
		
		lblPrecioTotal = new JLabel("Precio Total S/.");
		lblPrecioTotal.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrecioTotal.setBounds(10, 105, 73, 14);
		JPPrecio.add(lblPrecioTotal);
		
		txtPrecioVenta = new JTextField();
		txtPrecioVenta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPrecioVenta.setBounds(85, 24, 58, 25);
		JPPrecio.add(txtPrecioVenta);
		txtPrecioVenta.setColumns(10);
		
		txtIGV = new JTextField();
		txtIGV.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtIGV.setColumns(10);
		txtIGV.setBounds(85, 64, 58, 25);
		JPPrecio.add(txtIGV);
		
		txtPrecioTotal = new JTextField();
		txtPrecioTotal.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPrecioTotal.setColumns(10);
		txtPrecioTotal.setBounds(85, 100, 58, 25);
		JPPrecio.add(txtPrecioTotal);
		
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
		btnGuardar.setBounds(262, 578, 80, 42);
		getContentPane().add(btnGuardar);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
		btnSalir.setBounds(405, 578, 80, 42);
		getContentPane().add(btnSalir);
		
	}
}
