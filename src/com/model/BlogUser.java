/*
 * 
 */
package com.model;
// TODO: Auto-generated Javadoc

/**
 * The Class BlogUser.
 */
public class BlogUser {
	
	/** The id. */
	private int id;
	
	/** The name. */
	private String name;
	
	/** The email. */
	private String email;
	
	/** The website. */
	private String website;

	/**
	 * Instantiates a new blog user.
	 *
	 * @param id the id
	 * @param name the name
	 * @param email the email
	 * @param website the website
	 */
	public BlogUser(int id, String name, String email, String website) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.website = website;
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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the website.
	 *
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * Sets the website.
	 *
	 * @param website the new website
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * Instantiates a new blog user.
	 */
	public BlogUser() {

	}

}
