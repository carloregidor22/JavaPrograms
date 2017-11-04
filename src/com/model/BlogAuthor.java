/*
 * 
 */
package com.model;
// TODO: Auto-generated Javadoc

/**
 * The Class BlogAuthor.
 */
public class BlogAuthor {
	
	/** The blog author ID. */
	private int blogAuthorID;
	
	/** The display name. */
	private String displayName;
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;

	/**
	 * Instantiates a new blog author.
	 */
	public BlogAuthor() {
	}

	/**
	 * Instantiates a new blog author.
	 *
	 * @param blogAuthorID
	 *            the blog author ID
	 * @param displayName
	 *            the display name
	 * @param firstName
	 *            the first name
	 * @param lastName
	 *            the last name
	 */
	public BlogAuthor(int blogAuthorID, String displayName, String firstName, String lastName) {

		this.blogAuthorID = blogAuthorID;
		this.displayName = displayName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Gets the blog author ID.
	 *
	 * @return the blog author ID
	 */
	public int getBlogAuthorID() {
		return blogAuthorID;
	}

	/**
	 * Sets the blog author ID.
	 *
	 * @param blogAuthorID
	 *            the new blog author ID
	 */
	public void setBlogAuthorID(int blogAuthorID) {
		this.blogAuthorID = blogAuthorID;
	}

	/**
	 * Gets the display name.
	 *
	 * @return the display name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the display name.
	 *
	 * @param displayName
	 *            the new display name
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
