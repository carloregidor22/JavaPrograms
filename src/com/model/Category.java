/*
 * 
 */
package com.model;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Category.
 */
public class Category {

	/**
	 * Instantiates a new category.
	 *
	 * @param category the category
	 * @param name the name
	 * @param nameClean the name clean
	 * @param enable the enable
	 * @param dateCreated the date created
	 */
	public Category(int category, String name, String nameClean, int enable, Date dateCreated) {
		super();
		this.category = category;
		Name = name;
		this.nameClean = nameClean;
		this.enable = enable;
		this.dateCreated = dateCreated;
	}

	/** The category. */
	private int category;

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(int category) {
		this.category = category;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * Gets the name clean.
	 *
	 * @return the name clean
	 */
	public String getNameClean() {
		return nameClean;
	}

	/**
	 * Sets the name clean.
	 *
	 * @param nameClean the new name clean
	 */
	public void setNameClean(String nameClean) {
		this.nameClean = nameClean;
	}

	/**
	 * Gets the enable.
	 *
	 * @return the enable
	 */
	public int getEnable() {
		return enable;
	}

	/**
	 * Sets the enable.
	 *
	 * @param enable the new enable
	 */
	public void setEnable(int enable) {
		this.enable = enable;
	}

	/**
	 * Gets the date created.
	 *
	 * @return the date created
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * Sets the date created.
	 *
	 * @param dateCreated the new date created
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/** The Name. */
	private String Name;
	
	/** The name clean. */
	private String nameClean;
	
	/** The enable. */
	private int enable;
	
	/** The date created. */
	private Date dateCreated;

	/**
	 * Instantiates a new category.
	 */
	public Category() {

	}

}
