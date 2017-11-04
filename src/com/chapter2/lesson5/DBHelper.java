package com.chapter2.lesson5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class DBHelper {
	
	protected static final Connection conn = ConnectionHelper.connect();
	protected static List<Employee> list = selectAll();
	
	
	public static void displayEmployee() {
		for (Employee e : list) {
			System.out.println(e);
		}
	}
	public static void batchDelete(List<Employee> listBatch) {
		for (Employee e : listBatch) {
			deleteOne(e);
		}
	}

	public static void deleteOne(Employee e) {
		int empid = e.getEmpid();
		delete(empid);
	}
	
	public static void delete(int empid) {
		String sql = "DELETE FROM emp WHERE empid = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setInt(1, empid);
			// execute the delete statement
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void batchUpdate(List<Employee> listBatch) {
		for (Employee e : listBatch) {
			updateOne(e);
		}
		
	}

	public static void updateOne(Employee e) {
		int empid = e.getEmpid();
		String first = e.getFirst();
		String lastname = e.getLastname();
		String birthdate = e.getBirthdate();
		update(empid, first, lastname, birthdate);
	}

	
	/**
	 * Update data of a warehouse specified by the id
	 *
	 * @param id
	 * @param name
	 *            name of the warehouse
	 * @param capacity
	 *            capacity of the warehouse
	 */
	public static void update(int empid, String first, String lastname, String birthdate) {
		String sql = "UPDATE test.emp SET lastname = ?, " + "first = ?, " + "birthdate = ? " + "WHERE empid = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setString(1, lastname);
			pstmt.setString(2, first);
			pstmt.setString(3, birthdate);
			pstmt.setInt(4, empid);
			// update
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void batchInsert(List<Employee> listBatch) {
		for (Employee e : listBatch) {
			insertOne(e);
		}
	}
	
	public static void insertOne(Employee e) {
		int empid = e.getEmpid();
		String first = e.getFirst();
		String lastname = e.getLastname();
		String birthdate = e.getBirthdate();
		insert(empid + 1000, first, lastname, birthdate);
	}
	private static void insert(Integer empid, String first, String lastname, String birthdate) {
		String sql = "INSERT INTO emp (empid,first,lastname, birthdate) VALUES(?,?,?,?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, empid);
			pstmt.setString(2, first);
			pstmt.setString(3, lastname);
			pstmt.setString(4, birthdate);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static int getMaximum(List<Employee> list) {
		return list.size();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Employee> selectAll() {
		list = new LinkedList<Employee>();
		String sql = "SELECT empid, first, lastname, birthdate FROM emp";
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set
			while (rs.next()) {
				Employee e = new Employee(rs.getInt("empid"), rs.getString("first"), rs.getString("lastname"),
						rs.getString("birthdate"));

				// System.out.println(rs.getInt("empid") + "\t" +
				// rs.getString("first") + "\t" + rs.getString("lastname"));

				list.add(e);
			}

			Collections.sort(list);

			/*
			 * for (Iterator<Employee> it = list.iterator(); it.hasNext();) {
			 * Employee t = it.next(); if (t instanceof Employee) {
			 * passThruInsert(t); } }
			 */
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

}
