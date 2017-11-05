package com.model;

import java.io.Serializable;
import java.sql.Date;

public class BlogComment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1114897742944277027L;
	
	private int id;
	private BlogPost blogPost;
	private int isReadyToId;
	private String comment;
	private BlogUser blogUser;
	private int enabled;
	private Date date;
	public BlogComment() {
	}
	public int getIsReadyToId() {
		return isReadyToId;
	}

	public void setIsReadyToId(int isReadyToId) {
		this.isReadyToId = isReadyToId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BlogPost getBlogPost() {
		return blogPost;
	}

	public void setBlogPost(BlogPost blogPost) {
		this.blogPost = blogPost;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public BlogUser getBlogUser() {
		return blogUser;
	}

	public void setBlogUser(BlogUser blogUser) {
		this.blogUser = blogUser;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public BlogComment(int id, BlogPost blogPost, int isReadyToId, String comment, BlogUser blogUser, int enabled,
			Date date) {
		this.id = id;
		this.blogPost = blogPost;
		this.isReadyToId = isReadyToId;
		this.comment = comment;
		this.blogUser = blogUser;
		this.enabled = enabled;
		this.date = date;
	}

}