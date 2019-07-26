package com.db.employeemanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public final static String USER_NAME = "root";
	public final static String PASSWORD = "12345678";
	public final static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public final static String URI = "jdbc:mysql://localhost:3306/sample";
	// we have to load the driver class
	// get the connection from getConnection method of driverManager class
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URI, USER_NAME, PASSWORD);
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
}
