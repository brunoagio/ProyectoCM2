package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
	
	public Conexion() {
		//Registrar JDBC_DRIVER
		//JDBC nombre del driver y URL de la BDD
		 final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		 final String DB_URL="jdbc:mysql://localhost:3306/world";
		//Credenciales de la BDD
		 final String USER="root";
		 final String PASS="";
		// Connection conn = null;
		// Statement stmt = null;
		 try {
				//paso2: Registrar JDBC driver
				Class.forName(JDBC_DRIVER);
				//paso3: Abrir una conexion
				System.out.println("Conectadno a la base de datos");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				//paso4 ejecuta consulta SQL
				
		 }catch(Exception e) {
				//Resolver errores para Class.forName
				e.printStackTrace();
		 }
	}
	public ResultSet devuelveConsulta(String sql) {
		
		System.out.println("CCreando consulta...");
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);//en rs tenemos todos los valores
		return rs;
	}
}
