package com.util.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.model.BlogAuthor;

public final class BlogAuthorDAO {
	
	protected static final Connection conn = ConnectionDAO.connect();
	protected static List<BlogAuthor> list = selectAll();
	
	
	public static void displayBlogAuthor() {
		for (BlogAuthor e : list) {
			System.out.println(e);
		}
	}
	public static void batchDelete(List<BlogAuthor> listBatch) {
		for (BlogAuthor e : listBatch) {
			deleteOne(e);
		}
	}

	public static void deleteOne(BlogAuthor e) {
		int blog_authorid = e.getBlogAuthorID();
		delete(blog_authorid);
	}
	
	public static void delete(int blog_authorid) {
		String sql = "DELETE FROM blog_author WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setInt(1, blog_authorid);
			// execute the delete statement
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void batchUpdate(List<BlogAuthor> listBatch) {
		for (BlogAuthor e : listBatch) {
			updateOne(e);
		}
		
	}

	public static void updateOne(BlogAuthor e) {
		int blog_authorid = e.getBlogAuthorID();
		String first = e.getFirstName();
		String displayName = e.getDisplayName();
		String  lastName = e.getLastName();
		update(blog_authorid, first, lastName, displayName);
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
	public static void update(int blog_authorid, String first, String lastname, String displayName) {
		String sql = "UPDATE blog.blog_author SET display_name = ?, " + "first_name = ?, " + "last_name = ? " + "WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setString(1, displayName);
			pstmt.setString(2, first);
			pstmt.setString(3, lastname);
			pstmt.setInt(4, blog_authorid);
			// update
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void batchInsert(List<BlogAuthor> listBatch) {
		for (BlogAuthor e : listBatch) {
			insertOne(e);
		}
	}
	
	public static void insertOne(BlogAuthor e) {
		int blog_authorid = e.getBlogAuthorID();
		String first = e.getFirstName();
		String displayName = e.getDisplayName();
		String  lastName = e.getLastName();
		insert(first, lastName, displayName);
	}
	private static void insert(String first, String lastname, String displayName) {
		String sql = "INSERT INTO blog_author (display_name, first_name, last_name) VALUES(?,?,?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			//pstmt.setInt(1, blog_authorid);
			pstmt.setString(1, first);
			pstmt.setString(2, lastname);
			pstmt.setString(3, displayName);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static int getMaximum(List<BlogAuthor> list) {
		return list.size();
	}
	
	@SuppressWarnings("unchecked")
	public static List<BlogAuthor> selectAll() {
		list = new LinkedList<BlogAuthor>();
		String sql = "SELECT id, display_name, first_name, last_name FROM blog_author";
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set
			while (rs.next()) {
				BlogAuthor e = new BlogAuthor(rs.getInt("id"), rs.getString("display_name"), rs.getString("first_name"), rs.getString("last_name"));
				list.add(e);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public static BlogAuthor selectOne(int authorId) {
		String sql = "SELECT id, display_name, first_name, last_name FROM blog_author WHERE id = " + authorId;
		BlogAuthor e = null;
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set
			while (rs.next()) {
				e = new BlogAuthor(rs.getInt("id"), rs.getString("display_name"), rs.getString("first_name"), rs.getString("last_name"));
			}

		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		}
		return e;
	}

	public static BlogAuthor selectOne(String lastName) {
		String sql = "SELECT id, display_name, first_name, last_name FROM blog_author WHERE last_name LIKE '%" + lastName + "%'";
		BlogAuthor e = null;
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set
			while (rs.next()) {
				e = new BlogAuthor(rs.getInt("id"), rs.getString("display_name"), rs.getString("first_name"), rs.getString("last_name"));
			}

		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		}
		return e;
	}


}