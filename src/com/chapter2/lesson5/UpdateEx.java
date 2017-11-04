package com.chapter2.lesson5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sqlitetutorial.net
 */
public class UpdateEx {
	protected static Connection conn = ConnectionHelper.connect();

	public static void main(String[] args) {

		List<Employee> listBatch = new LinkedList<Employee>();
		Employee e = new Employee(1066, "Rudy", "Duterte", "02/01/1902");
		Employee e1 = new Employee(1071, "Jane", "Martin", "04/02/2000");
		Employee e2 = new Employee(1076, "Boy", "Wakwak", "05/23/2013");
		Employee e3 = new Employee(1005, "Alamat", "Saging", "10/29/1979");
		Employee e4 = new Employee(1004, "Ayaw", "Co", "07/06/1994");
		listBatch.add(e4);
		listBatch.add(e3);
		listBatch.add(e2);
		listBatch.add(e1);
		listBatch.add(e);
		DBHelper.batchUpdate(listBatch);
		
		DBHelper.displayEmployee();
		ConnectionHelper.disconnect();
	}


}
