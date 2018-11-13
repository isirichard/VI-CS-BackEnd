package Principal;

import java.sql.*;
public class probando {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
	 System.out.println("sadl asdkln");
  try {
   Class.forName("com.mysql.jdbc.Driver").newInstance();
   System.out.println("Registro completo");
  } catch (Exception e) {
   // TODO: handle exception
   System.out.println(e.toString());
  }
  
  Connection con=null;
  
  try {
	  
      con = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/inventario2","root","");
      
      // Otros y operaciones sobre la base de datos...
      
      con.close();

  } catch (SQLException ex) {

      // Mantener el control sobre el tipo de error
      System.out.println("SQLException: " + ex.getMessage());

  }
 }

}