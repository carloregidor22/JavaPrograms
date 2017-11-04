package com.chapter2.lesson5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
	protected static Connection conn = null;
	public ConnectionHelper() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Connect to a sample database
	 */
	public static Connection connect() {
		
		try {
			// db parameters
			String url = "jdbc:mysql://127.0.0.1:3306/test";
			
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
			
			// create a connection to the database
			conn = DriverManager.getConnection(url, "root", "root");

			System.out.println("Connection to mysql has been established.");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		return conn;
	}
	
	public static void disconnect(){
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
}
