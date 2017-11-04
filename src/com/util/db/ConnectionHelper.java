/*
 * 
 */
package com.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.util.resource.Resource;

// TODO: Auto-generated Javadoc
/**
 * The Class ConnectionHelper.
 */
public class ConnectionHelper {
	
	/** The conn. */
	protected static Connection conn = null;

	/**
	 * Instantiates a new connection helper.
	 */
	public ConnectionHelper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Connect.
	 *
	 * @return the connection
	 */
	public static Connection connect() {

		try {
			// db parameters

			Class.forName(Resource.Drivername).newInstance();
			// create a connection to the database
			conn = DriverManager.getConnection(Resource.url, Resource.username, Resource.password);
			System.out.println(Resource.ConnectionEstablish);

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

	/**
	 * Disconnect.
	 */
	public static void disconnect() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
