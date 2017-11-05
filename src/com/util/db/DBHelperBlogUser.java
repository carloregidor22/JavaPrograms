package com.util.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.model.BlogUser;

public final class DBHelperBlogUser {
	
	protected static final Connection conn = ConnectionHelper.connect();
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
	
	public static void delete(int blog_authorid) {
		String sql = "DELETE FROM blog_user WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setInt(1, blog_authorid);
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
		int blog_authorid = e.getBlogUserID();
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
	
	public static void batchInsert(List<BlogUser> listBatch) {
		for (BlogUser e : listBatch) {
			insertOne(e);
		}
	}
	
	public static void insertOne(BlogUser e) {
		int blog_authorid = e.getBlogUserID();
		String first = e.getFirstName();
		String displayName = e.getDisplayName();
		String  lastName = e.getLastName();
		insert(blog_authorid, first, lastName, displayName);
	}
	private static void insert(Integer blog_authorid, String first, String lastname, String displayName) {
		String sql = "INSERT INTO blog_author (id, display_name, first_name, last_name) VALUES(?,?,?,?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, blog_authorid);
			pstmt.setString(2, first);
			pstmt.setString(3, lastname);
			pstmt.setString(4, displayName);
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
		String sql = "SELECT id, display_name, first_name, last_name FROM blog_author";
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set
			while (rs.next()) {
				BlogUser e = new BlogUser(rs.getInt("id"), rs.getString("display_name"), rs.getString("first_name"), rs.getString("last_name"));
				list.add(e);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

}
