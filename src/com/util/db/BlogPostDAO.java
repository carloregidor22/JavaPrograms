package com.util.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.model.BlogAuthor;
import com.model.BlogPost;

public final class BlogPostDAO {

	protected static final Connection conn = ConnectionDAO.connect();
	protected static List<BlogPost> list = selectAll();
	protected static BlogAuthor blogAuthor = getCurrentBlogAuthor();

	public static void displayBlogPost() {
		for (BlogPost e : list) {
			System.out.println(e);
		}
	}

	public static void batchDelete(List<BlogPost> listBatch) {
		for (BlogPost e : listBatch) {
			deleteOne(e);
		}
	}

	public static void deleteOne(BlogPost e) {
		int id = e.getId();
		delete(id);
	}

	public static void delete(int id) {
		String sql = "DELETE FROM blog_post WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setInt(1, id);
			// execute the delete statement
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void batchUpdate(List<BlogPost> listBatch) {
		for (BlogPost e : listBatch) {
			updateOne(e);
		}

	}

	public static void updateOne(BlogPost e) {
		int id = e.getId();
		String title = e.getTitle();
		String article = e.getArticle();
		String title_clean = e.getTitleClean();
		String file = e.getFiles();
		Date datePublish = e.getDatePublish();
		String banner_images = e.getBanner_image();
		int featured = e.getFeatured();
		int enabled = e.getEnabled();
		int comments_enabled = e.getComment_enabled();
		int views = e.getViews();

		update(id, title, article, title_clean, file, datePublish, banner_images, featured, enabled, comments_enabled,
				views);
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
	public static void update(int id, String title, String article, String title_clean, String file,
			java.sql.Date date_published, String banner_image, int featured, int enabled, int comments_enabled, int views) {
		String sql = "UPDATE blog.blog_post SET title = ?, " + "article = ?, " + "title_clean = ? " + "file = ?, "
				+ "date_published = ?, " + "banner_image = ?, " + "featured= ?, " + "enabled = ?, "
				+ "comment_enabled= ?, " + "vies = ?, " + "WHERE id = ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setString(1, title);
			pstmt.setString(2, article);
			pstmt.setString(3, title_clean);
			pstmt.setString(4, file);
			pstmt.setDate(5, date_published);
			pstmt.setString(6, banner_image);
			pstmt.setInt(7, featured);
			pstmt.setInt(8, enabled);
			pstmt.setInt(9, comments_enabled);
			pstmt.setLong(10, views);
			pstmt.setInt(11, id);
			// update
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void batchInsert(List<BlogPost> listBatch) {
		for (BlogPost e : listBatch) {
			insertOne(e);
		}
	}

	public static void insertOne(BlogPost e) {
		int blog_postid = e.getId();
		String title = e.getTitle();
		String article = e.getArticle();
		String title_clean = e.getTitleClean();
		String file = e.getFiles();
		Date datePublish = e.getDatePublish();
		String banner_images = e.getBanner_image();
		int featured = e.getFeatured();
		int enabled = e.getEnabled();
		int comments_enabled = e.getComment_enabled();
		int views = e.getViews();

		insert(blog_postid, title, article, title_clean, file, datePublish, banner_images, featured, enabled,
				comments_enabled, views);
	}
	private static void insert(Integer blog_postid, String title, String article, String title_clean, String file,
			Date date_published, String banner_image, Integer featured, Integer enabled, Integer comments_enabled,
			Integer views) {

		String sql = "INSERT INTO blog_post (id, title, article, title_clean, file, date_published, "
				+ "banner_image, featured, enabled, comment_enabled, views, author) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, blog_postid);
			pstmt.setString(2, title);
			pstmt.setString(3, article);
			pstmt.setString(4, title_clean);
			pstmt.setString(5, file);
			java.sql.Date date_publised = null;
			pstmt.setDate(6, date_publised);
			pstmt.setString(7, banner_image);
			pstmt.setInt(8, featured);
			pstmt.setInt(9, enabled);
			pstmt.setInt(10, comments_enabled);
			pstmt.setInt(11, views);
			pstmt.setInt(12, BlogPostDAO.blogAuthor.getBlogAuthorID());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static int getMaximum(List<BlogPost> list) {
		return list.size();
	}

	
	public static BlogAuthor getBlogAuthor() {
		return blogAuthor;
	}

	public static void setBlogAuthor(BlogAuthor blogAuthor) {
		BlogPostDAO.blogAuthor = blogAuthor;
	}

	@SuppressWarnings("unchecked")
	public static List<BlogPost> selectAll() {
		list = new LinkedList<BlogPost>();
		String sql = "SELECT id, title, article, title_clean, file, date_published, banner_image, featured,"
				+ "enabled, comment_enabled, views, author_id FROM blog_post";
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set
			while (rs.next()) {
				BlogPostDAO.blogAuthor = BlogAuthorDAO.selectOne(rs.getInt("author_id"));
				setBlogAuthor(BlogPostDAO.blogAuthor);
		
				BlogPost e = new BlogPost(rs.getInt("id"), rs.getString("title"), rs.getString("article"),
						rs.getString("title_clean"), rs.getString("file"), rs.getDate("date_published"),
						rs.getString("banner_image"), rs.getInt("featured"), rs.getInt("enabled"), rs.getInt("comment_enabled"),
						rs.getInt("views"), blogAuthor);
				list.add(e);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	
	public static BlogPost selectOne(int postID) {
		String sql = "SELECT id, title, article, title_clean, file, date_published, banner_image, featured,"
				+ "enabled, comment_enabled, views, author_id FROM blog_post WHERE id =" + postID;
		BlogPost e=null;
		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// loop through the result set
			while (rs.next()) {
				BlogPostDAO.blogAuthor = BlogAuthorDAO.selectOne(rs.getInt("author_id"));
				setBlogAuthor(BlogPostDAO.blogAuthor);
		
				e = new BlogPost(rs.getInt("id"), rs.getString("title"), rs.getString("article"),
						rs.getString("title_clean"), rs.getString("file"), rs.getDate("date_published"),
						rs.getString("banner_image"), rs.getInt("featured"), rs.getInt("enabled"), rs.getInt("comment_enabled"),
						rs.getInt("views"), blogAuthor);
			}
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		}
		return e;
	}
	private static BlogAuthor getCurrentBlogAuthor() {
		return BlogPostDAO.blogAuthor;
	}
	
}
