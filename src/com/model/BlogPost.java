/*
 * 
 */
package com.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * The Class BlogPost.
 */
public class BlogPost implements Serializable {
	/**
	 * Instantiates a new blog post.
	 */
	public BlogPost() {

	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1344046155601763293L;

	/** The id. */
	private int id;

	/** The Title. */
	private String Title;

	/** The Article. */
	private String Article;

	/** The title clean. */
	private String titleClean;

	/** The files. */
	private String files;
	
	/** The date publish. */
	private Date datePublish;
	
	/** The banner image. */
	private String banner_image;
	
	/** The featured. */
	private int featured;

	/** The enabled. */
	private int enabled;

	/** The comment enabled. */
	private int comment_enabled;
	
	/** The Views. */
	private int Views;

	/** The author. */
	private BlogAuthor author;

	/**
	 * Gets the files.
	 *
	 * @return the files
	 */
	public String getFiles() {
		return files;
	}

	/**
	 * Sets the files.
	 *
	 * @param files
	 *            the new files
	 */
	public void setFiles(String files) {
		this.files = files;
	}

	/**
	 * Gets the banner image.
	 *
	 * @return the banner image
	 */
	public String getBanner_image() {
		return banner_image;
	}

	/**
	 * Sets the banner image.
	 *
	 * @param banner_image
	 *            the new banner image
	 */
	public void setBanner_image(String banner_image) {
		this.banner_image = banner_image;
	}

	/**
	 * Gets the enabled.
	 *
	 * @return the enabled
	 */
	public int getEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled.
	 *
	 * @param enabled
	 *            the new enabled
	 */
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the featured.
	 *
	 * @return the featured
	 */
	public int getFeatured() {
		return featured;
	}

	/**
	 * Sets the featured.
	 *
	 * @param featured the new featured
	 */
	public void setFeatured(int featured) {
		this.featured = featured;
	}
	/**
	 * Gets the comment enabled.
	 *
	 * @return the comment enabled
	 */
	public int getComment_enabled() {
		return comment_enabled;
	}

	/**
	 * Sets the comment enabled.
	 *
	 * @param comment_enabled
	 *            the new comment enabled
	 */
	public void setComment_enabled(int comment_enabled) {
		this.comment_enabled = comment_enabled;
	}

	/**
	 * Instantiates a new blog post.
	 *
	 * @param id
	 *            the id
	 * @param title
	 *            the title
	 * @param article
	 *            the article
	 * @param titleClean
	 *            the title clean
	 * @param datePublish
	 *            the date publish
	 * @param views
	 *            the views
	 * @param author
	 *            the author
	 */
	public BlogPost(int id, String title, String article, String titleClean, String file,
			Date datePublish, String banner_image, int featured, int enabled, int comments_enabled, int views,
			BlogAuthor author) {
		this.id = id;
		Title = title;
		Article = article;
		this.titleClean = titleClean;
		this.datePublish = datePublish;
		Views = views;
		this.author = author;
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
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title
	 *            the new title
	 */
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * Gets the article.
	 *
	 * @return the article
	 */
	public String getArticle() {
		return Article;
	}

	/**
	 * Sets the article.
	 *
	 * @param article
	 *            the new article
	 */
	public void setArticle(String article) {
		Article = article;
	}

	/**
	 * Gets the title clean.
	 *
	 * @return the title clean
	 */
	public String getTitleClean() {
		return titleClean;
	}

	/**
	 * Sets the title clean.
	 *
	 * @param titleClean
	 *            the new title clean
	 */
	public void setTitleClean(String titleClean) {
		this.titleClean = titleClean;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public BlogAuthor getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author
	 *            the new author
	 */
	public void setAuthor(BlogAuthor author) {
		this.author = author;
	}

	/**
	 * Gets the date publish.
	 *
	 * @return the date publish
	 */
	public Date getDatePublish() {
		return datePublish;
	}

	/**
	 * Sets the date publish.
	 *
	 * @param datePublish
	 *            the new date publish
	 */
	public void setDatePublish(Date datePublish) {
		this.datePublish = datePublish;
	}

	/**
	 * Gets the views.
	 *
	 * @return the views
	 */
	public int getViews() {
		return Views;
	}

	/**
	 * Sets the views.
	 *
	 * @param views
	 *            the new views
	 */
	public void setViews(int views) {
		Views = views;
	}

}
