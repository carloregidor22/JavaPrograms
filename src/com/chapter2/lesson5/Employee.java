package com.chapter2.lesson5;

import java.util.Comparator;

public class Employee implements Comparator<Employee>, Comparable<Employee> {
	private int empid;
	private String first;
	private String lastname;
	private String birthdate;

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", first=" + first + ", lastname=" + lastname + ", birthdate=" + birthdate
				+ "]";
	}

	public Employee(int empid, String first, String lastname, String birthdate) {
		super();
		this.empid = empid;
		this.first = first;
		this.lastname = lastname;
		this.birthdate = birthdate;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.lastname.compareTo(o2.lastname);
	}

	@Override
	public int compareTo(Employee o) {
		Employee that = (Employee) o;
		return this.lastname.compareTo(that.lastname);
	}

}
