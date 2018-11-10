package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class FrmServicioCliente extends JFrame{
		private JButton btnHistorialCliente, btnBloquearCliente,btnHistorialCambios,btnAumentarLinea,btnBuscar,btnGuardar,btnSalir;
		private JPanel JPDatosCliente, JPInformacionCuenta,JPInformacionSaldo,JPDeuda,JPDireccion;
		private JLabel lblTipoDOC,lblDocumento,lblNombre,lblApellidos,lblTipoCliente_1,lblTipoCliente,lblEstadoCliente_1,lblEstadoCliente,
		lblLineaPermitida_1,lblLinea,lblDisponible,lblSaldoDisponible,lblDeudaActual_1,lblDeudaActual,lblCalificacion_1,lblCalificacion,
		lblCalificacionDeuda,lblTelefono,lblCelular;
		private JTextField txtTipoDoc,txtDocumento,txtNombres,txtApellidos,txtTelefono,txtCelular;
		private JComboBox JCDepartamento,JCProvincia,JCDistrito;
		private JTextArea JTADireccion;

		public FrmServicioCliente() {
			Image logo=new ImageIcon(getClass().getResource("/Imagenes/logo.jpg")).getImage();
			setTitle("Servicio Al Cliente");
			setResizable(false);
			setSize(642,556);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			setIconImage(logo);
			
			btnHistorialCliente = new JButton("Historial Cliente");
			btnHistorialCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnHistorialCliente.setBounds(10, 11, 116, 38);
			getContentPane().add(btnHistorialCliente);
			
			btnBloquearCliente = new JButton("Bloquear Cliente");
			btnBloquearCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnBloquearCliente.setBounds(175, 11, 116, 38);
			getContentPane().add(btnBloquearCliente);
			
			btnHistorialCambios = new JButton("Historial Cambios");
			btnHistorialCambios.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnHistorialCambios.setBounds(343, 11, 116, 38);
			getContentPane().add(btnHistorialCambios);
			
			btnAumentarLinea = new JButton("Aumentar Linea");
			btnAumentarLinea.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnAumentarLinea.setBounds(504, 11, 116, 38);
			getContentPane().add(btnAumentarLinea);
			
			JPDatosCliente = new JPanel();
			JPDatosCliente.setForeground(Color.BLUE);
			JPDatosCliente.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			JPDatosCliente.setBounds(10, 60, 610, 108);
			getContentPane().add(JPDatosCliente);
			JPDatosCliente.setLayout(null);
			
			lblTipoDOC = new JLabel("Tipo Documento:");
			lblTipoDOC.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblTipoDOC.setBounds(10, 21, 81, 14);
			JPDatosCliente.add(lblTipoDOC);
			
			lblDocumento = new JLabel("Documento:");
			lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblDocumento.setBounds(10, 57, 81, 14);
			JPDatosCliente.add(lblDocumento);
			
			txtTipoDoc = new JTextField();
			txtTipoDoc.setEditable(false);
			txtTipoDoc.setText("DNI");
			txtTipoDoc.setFont(new Font("Tahoma", Font.PLAIN, 11));
			txtTipoDoc.setBounds(101, 16, 94, 25);
			JPDatosCliente.add(txtTipoDoc);
			txtTipoDoc.setColumns(10);
			
			txtDocumento = new JTextField();
			txtDocumento.setEditable(false);
			txtDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
			txtDocumento.setColumns(10);
			txtDocumento.setBounds(101, 52, 132, 25);
			JPDatosCliente.add(txtDocumento);
			
			btnBuscar = new JButton("");
			btnBuscar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/buscar.png")));
			btnBuscar.setBounds(200, 16, 33, 25);
			JPDatosCliente.add(btnBuscar);
			
			lblNombre = new JLabel("Nombres:");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNombre.setBounds(279, 21, 46, 14);
			JPDatosCliente.add(lblNombre);
			
			lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblApellidos.setBounds(279, 57, 46, 14);
			JPDatosCliente.add(lblApellidos);
			
			txtNombres = new JTextField();
			txtNombres.setEditable(false);
			txtNombres.setFont(new Font("Tahoma", Font.PLAIN, 11));
			txtNombres.setBounds(335, 16, 259, 25);
			JPDatosCliente.add(txtNombres);
			txtNombres.setColumns(10);
			
			txtApellidos = new JTextField();
			txtApellidos.setEditable(false);
			txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
			txtApellidos.setColumns(10);
			txtApellidos.setBounds(335, 54, 259, 25);
			JPDatosCliente.add(txtApellidos);
			
			JPInformacionCuenta = new JPanel();
			JPInformacionCuenta.setBorder(new TitledBorder(null, "Informacion Cuenta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			JPInformacionCuenta.setBounds(10, 179, 197, 127);
			getContentPane().add(JPInformacionCuenta);
			JPInformacionCuenta.setLayout(null);
			
			lblTipoCliente_1 = new JLabel("Tipo Cliente:");
			lblTipoCliente_1.setForeground(new Color(33, 00, 99));
			lblTipoCliente_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblTipoCliente_1.setBounds(10, 26, 78, 14);
			JPInformacionCuenta.add(lblTipoCliente_1);
			
			lblTipoCliente = new JLabel("CREDITO");
			lblTipoCliente.setForeground(new Color(33, 00, 99));
			lblTipoCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblTipoCliente.setBounds(109, 26, 62, 14);
			JPInformacionCuenta.add(lblTipoCliente);
			
			lblEstadoCliente_1 = new JLabel("Estado Cliente:");
			lblEstadoCliente_1.setForeground(new Color(33, 00, 99));
			lblEstadoCliente_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblEstadoCliente_1.setBounds(10, 59, 78, 14);
			JPInformacionCuenta.add(lblEstadoCliente_1);
			
			lblEstadoCliente = new JLabel("ACTIVO");
			lblEstadoCliente.setForeground(new Color(33, 00, 99));
			lblEstadoCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblEstadoCliente.setBounds(109, 59, 62, 14);
			JPInformacionCuenta.add(lblEstadoCliente);
			
			lblLineaPermitida_1 = new JLabel("Linea Permitida:");
			lblLineaPermitida_1.setForeground(new Color(33, 00, 99));
			lblLineaPermitida_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblLineaPermitida_1.setBounds(10, 90, 78, 14);
			JPInformacionCuenta.add(lblLineaPermitida_1);
			
			lblLinea = new JLabel("2000");
			lblLinea.setForeground(new Color(33, 00, 99));
			lblLinea.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblLinea.setBounds(109, 90, 62, 14);
			JPInformacionCuenta.add(lblLinea);
			
			JPInformacionSaldo = new JPanel();
			JPInformacionSaldo.setBorder(new TitledBorder(null, "Informacion Saldo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			JPInformacionSaldo.setBounds(217, 179, 206, 127);
			getContentPane().add(JPInformacionSaldo);
			JPInformacionSaldo.setLayout(null);
			
			lblSaldoDisponible = new JLabel("Saldo Disponible:");
			lblSaldoDisponible.setForeground(new Color(33, 00, 99));
			lblSaldoDisponible.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblSaldoDisponible.setBounds(10, 26, 78, 14);
			JPInformacionSaldo.add(lblSaldoDisponible);
			
			lblDeudaActual_1 = new JLabel("Deuda Actual:");
			lblDeudaActual_1.setForeground(new Color(33, 00, 99));
			lblDeudaActual_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblDeudaActual_1.setBounds(10, 59, 78, 14);
			JPInformacionSaldo.add(lblDeudaActual_1);
			
			lblCalificacion_1 = new JLabel("Calificacion:");
			lblCalificacion_1.setForeground(new Color(33, 00, 99));
			lblCalificacion_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblCalificacion_1.setBounds(10, 90, 78, 14);
			JPInformacionSaldo.add(lblCalificacion_1);
			
			lblDisponible = new JLabel("1800");
			lblDisponible.setForeground(new Color(33, 00, 99));
			lblDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblDisponible.setBounds(98, 26, 62, 14);
			JPInformacionSaldo.add(lblDisponible);
			
			lblDeudaActual = new JLabel("200");
			lblDeudaActual.setForeground(new Color(33, 00, 99));
			lblDeudaActual.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblDeudaActual.setBounds(98, 59, 62, 14);
			JPInformacionSaldo.add(lblDeudaActual);
			
			lblCalificacion = new JLabel("MALO");
			lblCalificacion.setForeground(new Color(255, 00, 00));
			lblCalificacion.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblCalificacion.setBounds(98, 90, 62, 14);
			JPInformacionSaldo.add(lblCalificacion);
			
			JPDeuda = new JPanel();
			JPDeuda.setBorder(new TitledBorder(null, "Deuda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			JPDeuda.setBounds(433, 179, 187, 127);
			getContentPane().add(JPDeuda);
			JPDeuda.setLayout(null);
			
			lblCalificacionDeuda = new JLabel("DEUDA ATRASADA");
			lblCalificacionDeuda.setForeground(new Color(255, 00, 00));
			lblCalificacionDeuda.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblCalificacionDeuda.setBounds(10, 51, 167, 24);
			JPDeuda.add(lblCalificacionDeuda);
			
			JPDireccion = new JPanel();
			JPDireccion.setBorder(new TitledBorder(null, "Direccion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			JPDireccion.setBounds(10, 317, 610, 117);
			getContentPane().add(JPDireccion);
			JPDireccion.setLayout(null);
			
			JCDepartamento = new JComboBox();
			JCDepartamento.setBounds(10, 23, 126, 25);
			JPDireccion.add(JCDepartamento);
			
			JCProvincia = new JComboBox();
			JCProvincia.setBounds(163, 23, 126, 25);
			JPDireccion.add(JCProvincia);
			
			JCDistrito = new JComboBox();
			JCDistrito.setBounds(322, 23, 126, 25);
			JPDireccion.add(JCDistrito);
			
			JTADireccion = new JTextArea();
			JTADireccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
			JTADireccion.setBounds(10, 60, 438, 44);
			JPDireccion.add(JTADireccion);
			
			lblTelefono = new JLabel("Telefono:");
			lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblTelefono.setBounds(478, 28, 46, 14);
			JPDireccion.add(lblTelefono);
			
			lblCelular = new JLabel("Celular:");
			lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblCelular.setBounds(478, 76, 46, 14);
			JPDireccion.add(lblCelular);
			
			txtTelefono = new JTextField();
			txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
			txtTelefono.setBounds(534, 25, 68, 25);
			JPDireccion.add(txtTelefono);
			txtTelefono.setColumns(10);
			
			txtCelular = new JTextField();
			txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 11));
			txtCelular.setColumns(10);
			txtCelular.setBounds(534, 70, 68, 25);
			JPDireccion.add(txtCelular);
			
			btnGuardar = new JButton("");
			btnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardar.png")));
			btnGuardar.setBounds(202, 445, 80, 42);
			getContentPane().add(btnGuardar);
			
			btnSalir = new JButton("");
			btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logout.png")));
			btnSalir.setBounds(368, 445, 80, 42);
			getContentPane().add(btnSalir);
		
	

		}
}
