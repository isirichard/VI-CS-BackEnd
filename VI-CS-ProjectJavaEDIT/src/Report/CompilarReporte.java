package Report;

import java.io.File;
import java.sql.Connection;

import com.edit.dao.Conexion;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class CompilarReporte {
	private Connection con=Conexion.conectar();

	public void ReporteNotaPedido() {
		try {
		JasperPrint jasperPrint=JasperFillManager.fillReport(new File(".").getAbsolutePath()+"/src/Report/Nota_Pedido.jasper",null,con);
		JasperViewer jasperViewer=new JasperViewer(jasperPrint);
		jasperViewer.setVisible(true);
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
