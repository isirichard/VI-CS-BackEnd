package Pricipal;

import Interfaz.FrmCategoriaProductos;
import Interfaz.FrmEmpresa;
import Interfaz.FrmHistorialVenta;
import Interfaz.FrmLogin;
import Interfaz.FrmRegistrarColaborador;
import Interfaz.FrmRegistrarProducto;
import Interfaz.FrmRegistrarProveedor;
import Interfaz.FrmRegistroCliente;
import Interfaz.FrmRegistroPedido;
import Interfaz.FrmRegistroVenta;
import Interfaz.FrmServicioCliente;

public class Principal {
	public static void main(String args[]) {
		FrmLogin l=new FrmLogin();
		l.setVisible(true);
	}
}
