package Interfaz;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

public class MDIPrincipal extends JFrame {
	private JScrollPane scroll;
	private JPanel JPModulos,
	JPMaestro,  JPCategoria_Producto,JPTipoDoc,JPEmpresa,JPTipoCliente,JPTipoPago,JPRol,
	JPRegistrar, JPCliente,JPProveedor,JPProducto,JPColaborador,
	JPVenta_Pedido,JPVenta,JPPedido,
	JPCliente_Proveedor,JPServicioCliente,JPServicioProveedor;
	private JButton btnMaestro,btnRegistrar,btnVenta_Pedido,btnCliente_Proveedor,btnCategoriaProducto,btnTipoDoc,btnRol,btnEmpresa,btnTipoCliente,btnTipoPago,
	btnCliente,btnProveedor,btnProducto,btnColaborador,
	btnNotaVenta,btnNotaPedido,btnRegVenta,btnAnularVenta,btnHistorialVenta,btnRegPedido,btnAnularPedido,btnHistorialPedido,
	btnSCliente,btnSProveedor,btnServicioCliente,btnAumentoLinea,btnServicioProveedor,
	btnIngresar,btnModificar,btnEliminar;
	private Image fondo;
	private JLabel lblFondo;
	private JDesktopPane JDEscritorio;
	public MDIPrincipal() {
		
		Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
		setTitle("COMERCIALIZADORA EDITH EIRL");
		//setExtendedState(MAXIMIZED_BOTH);
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		setResizable(false);
		setSize(849,412);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setIconImage(logo);
		
		lblFondo=new JLabel();
		scroll=new JScrollPane();
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(0, 0, 200, 373);
		getContentPane().add(scroll);
		

		JPModulos=new JPanel();
		JPModulos.setLayout(null);


		btnMaestro = new JButton("maestro");
		btnMaestro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMaestro.setBounds(32, 31, 130, 50);
		JPModulos.add(btnMaestro);

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegistrar.setBounds(32, 151, 130, 50);
		JPModulos.add(btnRegistrar);

		btnVenta_Pedido = new JButton("Venta/Pedido");
		btnVenta_Pedido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnVenta_Pedido.setBounds(32, 283, 130, 50);
		JPModulos.add(btnVenta_Pedido);

		btnCliente_Proveedor = new JButton("Cliente/Proveedor");
		btnCliente_Proveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCliente_Proveedor.setBounds(32, 409, 130, 50);
		JPModulos.add(btnCliente_Proveedor);
		lblFondo.setSize(new Dimension(200,500));
		JPModulos.add(lblFondo);
		JPModulos.setPreferredSize(new Dimension(200, 500));
		scroll.setViewportView(JPModulos);
		//lblFondo.setSize(new Dimension(200,500));
		//JPModulos.add(lblFondo);
		lblFondo.setSize(new Dimension(200,500));
		lblFondo.setBounds(0, 0, 1008, 362);
		JPModulos.add(lblFondo);
		JPMaestro = new JPanel();
		JPRegistrar=new JPanel();
		JPVenta_Pedido=new JPanel();
		JPCliente_Proveedor=new JPanel();
		JPCategoria_Producto=new JPanel();
		JPTipoDoc=new JPanel();
		JPRol=new JPanel();
		JPEmpresa=new JPanel();
		JPTipoCliente=new JPanel();
		JPTipoPago=new JPanel();
		JPCliente=new JPanel();
		JPProveedor=new JPanel();
		JPProducto=new JPanel();
		JPColaborador=new JPanel();
		JPCliente=new JPanel();
		JPProveedor=new JPanel();
		JPProducto=new JPanel();
		JPColaborador=new JPanel();
		JPVenta=new JPanel();
		JPPedido=new JPanel();
		JPServicioCliente=new JPanel();
		JPServicioProveedor=new JPanel();
		
		//inciando los modulos

		ocultarTodo();
		btnMaestro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionMaestro(e);
			}
		});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionRegistrar(e);
			}
		});
		btnVenta_Pedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionVenta_Pedido(e);
			}
		});
		btnCliente_Proveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionCliente_Proveedor(e);
			}
		});



		btnCategoriaProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionCategoriaProducto(e);
			}
		});
		btnTipoDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionTipoDOC(e);
			}
		});
		btnRol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionRol(e);
			}
		});
		btnEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionEmpresa(e);
			}
		});
		btnTipoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionTipoCliente(e);
			}
		});
		btnTipoPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionTipoPago(e);
			}
		});
		
		
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionCliente(e);
			}
		});
		btnProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionProveedor(e);
			}
		});
		btnProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionProducto(e);
			}
		});
		btnColaborador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionColaborador(e);
			}
		});
		btnNotaVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionNotaVenta(e);
				
				
			}
		});
		
		btnNotaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionNotaPedido(e);
			}
		});
		btnSCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionServicioCliente(e);
			}
		});
		btnSProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionServicioProveedor(e);
			}
		});
		ImageIcon imagen=new ImageIcon("/Imagenes/Fondo.jpg");
		lblFondo.setSize(new Dimension(200,500));
		Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(),Image.SCALE_DEFAULT));
		lblFondo.setIcon(icono);
		this.repaint();
		btnProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Dasda");
				//accionBTNREGISTROVENTA(e);
			}
		});

	}
	private void mostrarJPMaestro(boolean v) {
		JPMaestro.setBounds(210, 0, 613, 373);
		getContentPane().add(JPMaestro);
		JPMaestro.setLayout(null);

		btnCategoriaProducto = new JButton("Categoria Producto");
		btnCategoriaProducto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCategoriaProducto.setBounds(40, 28, 130, 50);
		JPMaestro.add(btnCategoriaProducto);

		btnTipoDoc = new JButton("Tipo DOC");
		btnTipoDoc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTipoDoc.setBounds(244, 28, 130, 50);
		JPMaestro.add(btnTipoDoc);

		btnRol = new JButton("ROL");
		btnRol.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRol.setBounds(456, 28, 130, 50);
		JPMaestro.add(btnRol);

		btnEmpresa = new JButton("Empresa");
		btnEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEmpresa.setBounds(40, 153, 130, 50);
		JPMaestro.add(btnEmpresa);

		btnTipoCliente = new JButton("Tipo Cliente");
		btnTipoCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTipoCliente.setBounds(244, 153, 130, 50);
		JPMaestro.add(btnTipoCliente);

		btnTipoPago = new JButton("Tipo Pago");
		btnTipoPago.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTipoPago.setBounds(456, 153, 130, 50);
		JPMaestro.add(btnTipoPago);
		
		
		lblFondo.setBounds(456, 153, 130, 50);
		
		ImageIcon imagen=new ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"));
		
//		lblimagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Usuario.png")));
		Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(),Image.SCALE_DEFAULT));
		lblFondo.setIcon(icono);
		JPMaestro.add(lblFondo);
		JPMaestro.setVisible(v);
		
		JDEscritorio =new JDesktopPane();
		getContentPane().add(JDEscritorio);


	}







	private void mostrarJPRegistrar(boolean v) {
		JPRegistrar.setBounds(210, 0, 613, 373);
		getContentPane().add(JPRegistrar);
		JPRegistrar.setLayout(null);

		btnCliente = new JButton("Cliente");
		btnCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCliente.setBounds(40, 28, 130, 50);
		JPRegistrar.add(btnCliente);

		btnProveedor = new JButton("Proveedor");
		btnProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnProveedor.setBounds(244, 28, 130, 50);
		JPRegistrar.add(btnProveedor);

		btnProducto = new JButton("Producto");
		btnProducto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnProducto.setBounds(456, 28, 130, 50);
		JPRegistrar.add(btnProducto);

		btnColaborador = new JButton("Colaborador");
		btnColaborador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnColaborador.setBounds(40, 153, 130, 50);
		JPRegistrar.add(btnColaborador);


		JPRegistrar.setVisible(v);
	}








	private void mostrarJPVenta_Pedido(boolean v) {
		JPVenta_Pedido.setBounds(210, 0, 613, 373);
		getContentPane().add(JPVenta_Pedido);
		JPVenta_Pedido.setLayout(null);

		btnNotaVenta = new JButton("Nota Venta");
		btnNotaVenta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNotaVenta.setBounds(40, 28, 130, 50);
		JPVenta_Pedido.add(btnNotaVenta);

		btnNotaPedido = new JButton("Nota Pedido");
		btnNotaPedido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNotaPedido.setBounds(456, 28, 130, 50);
		JPVenta_Pedido.add(btnNotaPedido);
		JPVenta_Pedido.setVisible(v);
	}


	private void mostrarJPVenta(boolean v) {
		JPVenta.setBounds(210, 0, 613, 373);
		getContentPane().add(JPVenta);
		JPVenta.setLayout(null);

		btnRegVenta = new JButton("Registro de Venta");
		btnRegVenta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegVenta.setBounds(40, 28, 130, 50);
		JPVenta.add(btnRegVenta);
		btnRegVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNREGISTROVENTA(e);
				
			}
		});
		

		btnAnularVenta = new JButton("Anular Venta");
		btnAnularVenta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAnularVenta.setBounds(244, 28, 130, 50);
		JPVenta.add(btnAnularVenta);

		btnHistorialVenta = new JButton("Historial Venta");
		btnHistorialVenta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnHistorialVenta.setBounds(456, 28, 130, 50);
		JPVenta.add(btnHistorialVenta);
		btnHistorialVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNHISTORIALVENTA(e);
				
			}
		});
		JPVenta.setVisible(v);
		
		
		
	}
	private void mostrarJPPedido(boolean v) {
		JPPedido.setBounds(210, 0, 613, 373);
		getContentPane().add(JPPedido);
		JPPedido.setLayout(null);

		btnRegPedido = new JButton("Registro de Pedido");
		btnRegPedido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegPedido.setBounds(40, 28, 130, 50);
		JPPedido.add(btnRegPedido);
		btnRegPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionRegistroNotaPedido(e);
				
				
			}
		});
		btnAnularPedido = new JButton("Anular Pedido");
		btnAnularPedido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAnularPedido.setBounds(244, 28, 130, 50);
		JPPedido.add(btnAnularPedido);

		btnHistorialPedido = new JButton("Historial Pedido");
		btnHistorialPedido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnHistorialPedido.setBounds(456, 28, 130, 50);
		JPPedido.add(btnHistorialPedido);
		btnHistorialPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionHistorialPedido(e);
				
				
			}
		});
		JPPedido.setVisible(v);
	}



	private void mostrarJPCliente_Proveedor(boolean v) {
		JPCliente_Proveedor.setBounds(210, 0, 613, 373);
		getContentPane().add(JPCliente_Proveedor);
		JPCliente_Proveedor.setLayout(null);

		btnSCliente = new JButton("Cliente");
		btnSCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSCliente.setBounds(40, 28, 130, 50);
		JPCliente_Proveedor.add(btnSCliente);

		btnSProveedor = new JButton("Proveedor");
		btnSProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSProveedor.setBounds(456, 28, 130, 50);
		JPCliente_Proveedor.add(btnSProveedor);
		JPCliente_Proveedor.setVisible(v);
	}




	private void mostrarJPCategoria_Productos(boolean v) {

		mostrarCRUD("Categoria Producto",JPCategoria_Producto, v);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNINGRESARCATEGORIAPRODUCTO(e);
			}
		});

	}

	private void mostrarJPTipoDOC(boolean v) {

		mostrarCRUD("Tipo DOC",JPTipoDoc,v);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNINGRESARTIPODOC(e);
			}
		});
	}
	private void mostrarJPEmpresa(boolean v) {

		mostrarCRUD("Empresa",JPEmpresa,v);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNINGRESAREMPRESA(e);
			}
		});
	}
	private void mostrarJPTipoCliente(boolean v) {

		mostrarCRUD("Tipo Cliente",JPTipoCliente,v);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNINGRESARTIPOCLIENTE(e);
			}
		});
	}
	private void mostrarJPTipoPago(boolean v) {

		mostrarCRUD("Tipo Pago",JPTipoPago,v);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNINGRESARTIPOPAGO(e);
			}
		});
	}
	private void mostrarJPRol(boolean v) {

		mostrarCRUD("ROL",JPRol,v);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNINGRESARROL(e);
				
			}
		});
	}
	private void mostrarCliente(boolean v) {
		
		mostrarCRUD("Cliente",JPCliente,v);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNINGRESARCLIENTE(e);
				
			}
		});
		
	}
	private void mostrarProveedor(boolean v) {
		mostrarCRUD("Proveedor", JPProveedor, v);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNINGRESARPROVEEDOR(e);
				
			}
		});
	}
	private void mostrarProducto(boolean v) {
		mostrarCRUD("Producto", JPProducto, v);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNINGRESARPRODUCTO(e);
				
			}
		});
	}
	private void mostrarColaborador(boolean v) {
		mostrarCRUD("Colaborador", JPColaborador, v);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBTNINGRESARCOLABORADOR(e);
				
			}
		});
	}
	private void mostrarCRUD(String title,JPanel jp,boolean v) {
		jp.setBounds(210, 0, 613, 373);
		getContentPane().add(jp);
		jp.setLayout(null);
		jp.setBorder(new TitledBorder(null, title, TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnIngresar.setBounds(40, 28, 130, 50);
		jp.add(btnIngresar);

		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnModificar.setBounds(244, 28, 130, 50);
		jp.add(btnModificar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEliminar.setBounds(456, 28, 130, 50);
		jp.add(btnEliminar);
		jp.setVisible(v);
	}
	
	
	
	private void mostrarJPServicioCliente(boolean v) {
		JPServicioCliente.setBounds(210, 0, 613, 373);
		getContentPane().add(JPServicioCliente);
		JPServicioCliente.setLayout(null);

		btnServicioCliente = new JButton("Servicio Cliente");
		btnServicioCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnServicioCliente.setBounds(40, 28, 130, 50);
		JPServicioCliente.add(btnServicioCliente);
		btnServicioCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBtnServicioCliente(e);
				
			}
		});

		btnAumentoLinea = new JButton("Aumento de Linea");
		btnAumentoLinea.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAumentoLinea.setBounds(456, 28, 130, 50);
		JPServicioCliente.add(btnAumentoLinea);
		JPServicioCliente.setVisible(v);
	}
	private void mostrarJPServicioProveedor(boolean v) {
		JPServicioProveedor.setBounds(210, 0, 613, 373);
		getContentPane().add(JPServicioProveedor);
		JPServicioProveedor.setLayout(null);

		btnServicioProveedor = new JButton("Servicio Proveedor");
		btnServicioProveedor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnServicioProveedor.setBounds(40, 28, 130, 50);
		JPServicioProveedor.add(btnServicioProveedor);

		JPServicioProveedor.setVisible(v);
	}

	private void accionMaestro(ActionEvent e) {

		ocultarTodo();
		mostrarJPMaestro(true);


	}
	private void accionRegistrar(ActionEvent e) {
		ocultarTodo();

		mostrarJPRegistrar(true);

	}
	private void accionVenta_Pedido(ActionEvent e) {
		ocultarTodo();

		mostrarJPVenta_Pedido(true);

	}
	private void accionCliente_Proveedor(ActionEvent e) {
		ocultarTodo();

		mostrarJPCliente_Proveedor(true);

	}
	private void accionCategoriaProducto(ActionEvent e) {
		ocultarTodo();

		mostrarJPCategoria_Productos(true);
		

	}
	private void accionTipoDOC(ActionEvent e) {
		ocultarTodo();

		mostrarJPTipoDOC(true);
		

	}
	private void accionRol(ActionEvent e) {
		ocultarTodo();

		mostrarJPRol(true);

	}
	private void accionEmpresa(ActionEvent e) {
		ocultarTodo();

		mostrarJPEmpresa(true);
		

	}
	private void accionTipoCliente(ActionEvent e) {
		ocultarTodo();

		mostrarJPTipoCliente(true);
		

	}
	private void accionTipoPago(ActionEvent e) {
		ocultarTodo();

		mostrarJPTipoPago(true);
		

	}
	private void accionCliente(ActionEvent e) {
		ocultarTodo();
		mostrarCliente(true);
	}
	private void accionProveedor(ActionEvent e) {
		ocultarTodo();
		mostrarProveedor(true);
	}
	private void accionProducto(ActionEvent e) {
		ocultarTodo();
		mostrarProducto(true);
	}
	private void accionColaborador(ActionEvent e) {
		ocultarTodo();
		mostrarColaborador(true);
	}
	private void accionNotaVenta(ActionEvent e) {
		ocultarTodo();
		mostrarJPVenta(true);
	}
	private void accionNotaPedido(ActionEvent e) {
		ocultarTodo();
		mostrarJPPedido(true);
	}
	private void accionServicioCliente(ActionEvent e) {
		ocultarTodo();
		mostrarJPServicioCliente(true);
	}
	private void accionServicioProveedor(ActionEvent e) {
		ocultarTodo();
		mostrarJPServicioProveedor(true);
	}
	
	private void accionBTNREGISTROVENTA(ActionEvent e) {
		FrmRegistroVenta Rventa=new FrmRegistroVenta();
		Rventa.setVisible(true);
		
	}
	private void accionBTNHISTORIALVENTA(ActionEvent e) {
		FrmHistorialVenta Hventa=new FrmHistorialVenta();
		Hventa.setVisible(true);
	}
		

	private void ocultarTodo() {
		//modulos
		mostrarJPMaestro(false);
		mostrarJPRegistrar(false);
		mostrarJPVenta_Pedido(false);
		mostrarJPCliente_Proveedor(false);

		//modulo maestro
		mostrarJPCategoria_Productos(false);
		mostrarJPTipoDOC(false);
		mostrarJPRol(false);
		mostrarJPEmpresa(false);
		mostrarJPTipoCliente(false);
		mostrarJPTipoPago(false);

		//modulo Registrar
		mostrarCliente(false);
		mostrarProveedor(false);
		mostrarProducto(false);
		mostrarColaborador(false);
		
		//modulo venta/pedido
		mostrarJPVenta(false);
		mostrarJPPedido(false);
		
		//modulo ServicioCliente/Proveedor
		mostrarJPServicioCliente(false);
		mostrarJPServicioProveedor(false);
		
		

	}
	
	private void accionBTNINGRESARCATEGORIAPRODUCTO(ActionEvent e) {
		FrmCategoriaProductos categoriaProductos=new FrmCategoriaProductos();
		categoriaProductos.setVisible(true);
	}
	private void accionBTNINGRESARTIPODOC(ActionEvent e) {
		FrmTipoDOC tipodoc=new FrmTipoDOC();
		tipodoc.setVisible(true);
	}
	
	private void accionBTNINGRESARTIPOCLIENTE(ActionEvent e) {
		FrmTipoCliente tipocli=new FrmTipoCliente();
		tipocli.setVisible(true);
	}
	private void accionBTNINGRESARROL(ActionEvent e) {
		FrmRol rol=new FrmRol();
		rol.setVisible(true);
	}
	private void accionBTNINGRESAREMPRESA(ActionEvent e) {
		FrmEmpresa empresa=new FrmEmpresa();
		empresa.setVisible(true);
	}
	
	private void accionBTNINGRESARTIPOPAGO(ActionEvent e) {
		FrmTipoPago tipopag=new FrmTipoPago();
		tipopag.setVisible(true);
	}
	private void accionBTNINGRESARCLIENTE(ActionEvent e) {
		FrmRegistroCliente Rcliente=new FrmRegistroCliente();
		Rcliente.setVisible(true);
	}
	private void accionBTNINGRESARPROVEEDOR(ActionEvent e) {
		FrmRegistrarProveedor Rproveedor=new FrmRegistrarProveedor();
		Rproveedor.setVisible(true);
	}
	private void accionBTNINGRESARPRODUCTO(ActionEvent e) {
		FrmRegistrarProducto Rproducto=new FrmRegistrarProducto();
		Rproducto.setVisible(true);
	}
	private void accionBTNINGRESARCOLABORADOR(ActionEvent e) {
		FrmRegistrarColaborador Rcolaborador=new FrmRegistrarColaborador();
		Rcolaborador.setVisible(true);
	}
	private void accionRegistroNotaPedido(ActionEvent e) {
		FrmRegistroPedido pedido=new FrmRegistroPedido();
		pedido.setVisible(true);
	}
	private void accionHistorialPedido(ActionEvent e) {
		FrmHistorialPedido pedido=new FrmHistorialPedido();
		pedido.setVisible(true);
	}
	private void accionBtnServicioCliente(ActionEvent e) {
		FrmServicioCliente cliente=new FrmServicioCliente();
		cliente.setVisible(true);
	}
}
