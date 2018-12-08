package Main;

import com.edit.view.FrmBusquedaCliente;
import com.edit.view.FrmLogin;
import com.edit.view.FrmRegistrarColaborador;
import com.edit.view.FrmRegistroVenta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FrmLogin l=FrmLogin.iniciar();
		//FrmBusquedaCliente l=FrmBusquedaCliente.Iniciar();
		//FrmRegistrarColaborador l=FrmRegistrarColaborador.Iniciar();
		FrmRegistroVenta l= FrmRegistroVenta.Iniciar();
		l.setVisible(true);
	}

}
