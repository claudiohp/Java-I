package br.com.hotelaria.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static final String bd = "hotelaria";
	private static final String url = "jdbc:mysql://localhost/" + bd;
	private static final String user = "root";
	private static final String password = "";
	private static final String driver = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection() throws SQLException{
		
		try {
			Class.forName(driver);
			System.out.println("Conexão Criada Com sucesso.");
			return DriverManager.getConnection(url, user, password);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new SQLException(e.getMessage());
		}
		
	}
	
}
