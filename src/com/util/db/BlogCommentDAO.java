package com.util.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.model.BlogAuthor;
import com.model.BlogComment;
import com.model.BlogPost;
import com.model.BlogUser;

public final class BlogCommentDAO {

	protected static final Connection conn = ConnectionDAO.connect();
	protected static List<BlogComment> list = selectAll();
	protected static BlogUser blogUser = getCurrentBlogUser();

	public static BlogUser getBlogUser() {
		return blogUser;
	}

	private static BlogUser getCurrentBlogUser() {
		return null;
	}

	public static void setBlogUser(BlogUser blogUser) {
		BlogCommentDAO.blogUser = blogUser;
	}

	public static void displayBlogComment() {
		for (BlogComment e : list) {
			System.out.println(e);
		}
	}

	public static void batchDelete(List<BlogComment> listBatch) {
		for (BlogComment e : listBatch) {
			deleteOne(e);
		}
	}

	public static void deleteOne(BlogComment e) {
		int id = e.getId();
		delete(id);
	}

	public static void delete(int id) {
		String sql = "DELETE FROM blog_comment WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setInt(1, id);
			// execute the delete statement
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void batchUpdate(List<BlogComment> listBatch) {
		for (BlogComment e : listBatch) {
			updateOne(e);
		}

	}

	public static void updateOne(BlogComment e) {
		Integer id = e.getId();
		String comment = e.getComment();
		Integer enabled = e.getEnabled();
		update(id, comment, enabled);
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
	public static void update(int id, String comment, int enabled) {
		String sql = "UPDATE blog.blog_comment SET comment = ?, " + "enabled = ? " + "WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setString(1, comment);
			pstmt.setInt(2, enabled);
			pstmt.setInt(3, id);
			// update
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void batchInsert(List<BlogComment> listBatch) {
		for (BlogComment e : listBatch) {
			insertOne(e);
		}
	}

	public static void insertOne(BlogComment e) {
		int id = e.getId();
		int postId = e.getBlogPost().getId();
		int replyId = e.getIsReadyToId();
		int enabled = e.getEnabled();
		String comment = e.getComment();
		Date d = e.getDate();
		int userId = e.getBlogUser().getId();
		insert(id, postId, replyId, comment, userId, enabled, d);
	}

	private static boolean insert(Integer id, int postid, int isreplyid, String comment,
			int userid, int enabled, Date date) {
		String sql = "INSERT INTO blog_comment (id, post_id, is_reply_to_id, comment, user_id, enabled, date) VALUES(?,?,?,?,?,?,?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			pstmt.setInt(2, postid);
			pstmt.setInt(3, isreplyid);
			pstmt.setString(4, comment);
			pstmt.setInt(5, userid);
			pstmt.setInt(6, enabled);
			pstmt.setDate(7, date);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	public static int getMaximum(List<BlogComment> list) {
		return list.size();

	}

	public static BlogComment selectOne(int id) {
		String sql = "SELECT id, post_id, is_reply_to_id, comment, user_id, mark_read, enabled, date WHERE id = " + id;
		BlogComment e = null;
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set
			while (rs.next()) {

				BlogCommentDAO.blogUser = BlogUserDAO.selectOne(rs.getInt("id"));
				setBlogUser(BlogCommentDAO.blogUser);

				e = new BlogComment(rs.getInt("id"), BlogPostDAO.selectOne(rs.getInt("post_id")),
						rs.getInt("is_reply_to_id"), rs.getString("comment"), BlogCommentDAO.blogUser,
						rs.getInt("enabled"), rs.getDate("date"));

			}

		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		}
		return e;
	}

	@SuppressWarnings("unchecked")
	public static List<BlogComment> selectAll() {
		list = new LinkedList<BlogComment>();
		String sql = "SELECT id, post_id, is_reply_to_id, comment, user_id, mark_read, enabled, date FROM blog_comment";
		BlogComment e = null;
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set

			while (rs.next()) {

				BlogCommentDAO.blogUser = BlogUserDAO.selectOne(rs.getInt("id"));
				setBlogUser(BlogCommentDAO.blogUser);

				e = new BlogComment(rs.getInt("id"), BlogPostDAO.selectOne(rs.getInt("post_id")),
						rs.getInt("is_reply_to_id"), rs.getString("comment"), BlogCommentDAO.blogUser,
						rs.getInt("enabled"), rs.getDate("date"));
				list.add(e);
			}

		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		}
		return list;
	}
	
}
