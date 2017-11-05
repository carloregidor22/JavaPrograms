/*
 * 
 */
package com.model;
// TODO: Auto-generated Javadoc

/**
 * The Class BlogPostCategory.
 */
public class BlogPostCategory {
	
	/** The category. */
	private BlogCategory category;
	
	/** The blogpost. */
	private BlogPost blogpost;

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public BlogCategory getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(BlogCategory category) {
		this.category = category;
	}

	/**
	 * Gets the blogpost.
	 *
	 * @return the blogpost
	 */
	public BlogPost getBlogpost() {
		return blogpost;
	}

	/**
	 * Sets the blogpost.
	 *
	 * @param blogpost the new blogpost
	 */
	public void setBlogpost(BlogPost blogpost) {
		this.blogpost = blogpost;
	}

	/**
	 * Instantiates a new blog post category.
	 *
	 * @param category the category
	 * @param blogpost the blogpost
	 */
	public BlogPostCategory(BlogCategory category, BlogPost blogpost) {
		super();	
		this.category = category;
		this.blogpost = blogpost;
	}

}
