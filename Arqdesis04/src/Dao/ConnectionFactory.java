package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Driver de JDBC nao encontrado");
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(
				"jdbc:mysql://localhost/servicedesk?user=alunos&password=alunos");
		
	}

}
