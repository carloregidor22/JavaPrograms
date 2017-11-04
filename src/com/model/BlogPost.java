/*
 * 
 */
package com.model;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class BlogPost.
 */
public class BlogPost {
	
	/** The id. */
	private int id;
	
	/** The Title. */
	private String Title;
	
	/** The Article. */
	private String Article;
	
	/** The title clean. */
	private String titleClean;
	
	/** The date publish. */
	private Date datePublish;
	
	/** The Views. */
	private int Views;
	
	/** The author. */
	private BlogAuthor author;

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
	public BlogPost(int id, String title, String article, String titleClean, Date datePublish, int views,
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
	 * Instantiates a new blog post.
	 */
	public BlogPost() {

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
	 * @param id the new id
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
	 * @param article the new article
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
	 * @param titleClean the new title clean
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
	 * @param author the new author
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
	 * @param datePublish the new date publish
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
	 * @param views the new views
	 */
	public void setViews(int views) {
		Views = views;
	}

}
