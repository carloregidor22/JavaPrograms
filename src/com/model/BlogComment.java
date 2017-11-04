/*
 * 
 */
package com.model;
// TODO: Auto-generated Javadoc

/**
 * The Class BlogComment.
 */
public class BlogComment {
	
	/** The id. */
	private int id;
	
	/** The blog post. */
	private BlogPost blogPost;
	
	/** The comment. */
	private String comment;
	
	/**
	 * Instantiates a new blog comment.
	 */
	public BlogComment() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new blog comment.
	 *
	 * @param id
	 *            the id
	 * @param blogPost
	 *            the blog post
	 * @param comment
	 *            the comment
	 */
	public BlogComment(int id, BlogPost blogPost, String comment) {
		this.id = id;
		this.blogPost = blogPost;
		this.comment = comment;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the blog post.
	 *
	 * @return the blog post
	 */
	public BlogPost getBlogPost() {
		return blogPost;
	}

	/**
	 * Sets the blog post.
	 *
	 * @param blogPost
	 *            the new blog post
	 */
	public void setBlogPost(BlogPost blogPost) {
		this.blogPost = blogPost;
	}

	/**
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the comment.
	 *
	 * @param comment
	 *            the new comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
