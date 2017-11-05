package com.util.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.model.BlogAuthor;
import com.model.BlogUser;

public final class BlogUserDAO {
	
	protected static final Connection conn = ConnectionDAO.connect();
	protected static List<BlogUser> list = selectAll();
	
	
	public static void displayBlogUser() {
		for (BlogUser e : list) {
			System.out.println(e);
		}
	}
	public static void batchDelete(List<BlogUser> listBatch) {
		for (BlogUser e : listBatch) {
			deleteOne(e);
		}
	}

	public static void deleteOne(BlogUser e) {
		int id = e.getId();
		delete(id);
	}
	
	public static void delete(int id) {
		String sql = "DELETE FROM blog_user WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setInt(1, id);
			// execute the delete statement
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void batchUpdate(List<BlogUser> listBatch) {
		for (BlogUser e : listBatch) {
			updateOne(e);
		}
		
	}

	public static void updateOne(BlogUser e) {
		Integer id = e.getId();
		String name = e.getName();
		String email = e.getEmail();
		String website = e.getWebsite();
		
		update(id, name, email, website);
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
	public static void update(int id, String name, String email, String website) {
		String sql = "UPDATE blog.blog_user SET name = ?, " + "email = ?, " + "website = ? " + "WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, website);
			pstmt.setInt(4, id);
			// update
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void batchInsert(List<BlogUser> listBatch) {
		for (BlogUser e : listBatch) {
			insertOne(e);
		}
	}
	
	public static void insertOne(BlogUser e) {
		//int id = e.getId();
		String name = e.getName();
		String email = e.getEmail();
		String  website = e.getWebsite();
		insert(name, email, website);
	}
	private static void insert(String name, String email, String website) {
		String sql = "INSERT INTO blog_user (id, name, email, website) VALUES(?,?,?,?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, website);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static int getMaximum(List<BlogUser> list) {
		return list.size();
	}
	
	@SuppressWarnings("unchecked")
	public static List<BlogUser> selectAll() {
		list = new LinkedList<BlogUser>();
		String sql = "SELECT id, name, email, website FROM blog_user";
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set
			while (rs.next()) {
				BlogUser e = new BlogUser(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("website"));
				list.add(e);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public static BlogUser selectOne(int userID) {
		String sql = "SELECT id, name, email, website FROM blog_user WHERE id = " + userID;
		BlogUser e = null;
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set
			while (rs.next()) {
				e = new BlogUser(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("website"));
			}

		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		}
		return e;
	}

}
