package com.shapter1.lesson4;

import java.io.Serializable;
import java.util.Arrays;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6841646814989483572L;
	private int ID;
	private String firstName;
	private String lastName;
	private String nickName;
	private String birthDate;
	private String title;
	private String wing;
	private String cubicleNumber;
	private String telephone;
	private boolean isManager;

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", nickName=" + nickName
				+ ", birthDate=" + birthDate + ", title=" + title + ", wing=" + wing + ", cubicleNumber="
				+ cubicleNumber + ", telephone=" + telephone + ", isManager=" + isManager + ", isRegular=" + isRegular
				+ ", isProb=" + isProb + ", isInactive=" + isInactive + ", salary=" + salary + ", dependents="
				+ Arrays.toString(dependents) + "]";
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}

	public String getCubicleNumber() {
		return cubicleNumber;
	}

	public void setCubicleNumber(String cubicleNumber) {
		this.cubicleNumber = cubicleNumber;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

	public boolean isRegular() {
		return isRegular;
	}

	public void setRegular(boolean isRegular) {
		this.isRegular = isRegular;
	}

	public boolean isProb() {
		return isProb;
	}

	public void setProb(boolean isProb) {
		this.isProb = isProb;
	}

	public boolean isInactive() {
		return isInactive;
	}

	public void setInactive(boolean isInactive) {
		this.isInactive = isInactive;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String[] getDependents() {
		return dependents;
	}

	public void setDependents(String[] dependents) {
		this.dependents = dependents;
	}

	private boolean isRegular;
	private boolean isProb;
	private boolean isInactive;
	private long salary;
	private String[] dependents;

	public Employee() {
		super();
	}

}
