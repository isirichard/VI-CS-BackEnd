package com.edit.dao;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexion {
	protected static Connection cx;
	public static Connection conectar(){
		if(cx != null){
			return cx;
		}
		
		InputStream inputStream = Conexion.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties = new Properties();
		
		try{
			
			properties.load(inputStream);
			String driver = properties.getProperty("com.mysql.jdbc.Driver");
			String url = properties.getProperty("jdbc:mysql://localhost:3360/prueba");
			String user = properties.getProperty("root");
			String password = properties.getProperty("");
			Class.forName(driver);
			cx = DriverManager.getConnection(url, user, password);
			System.out.println("Me concte");
		}catch(Exception e){
			e.printStackTrace();
		}				
		return cx;
	}
	
	public static void desconectar(){
		if(cx == null){
			return;
		}
		
		try{
			cx.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
