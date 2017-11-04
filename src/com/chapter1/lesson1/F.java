package com.chapter1.lesson1;

public class F extends E {
	String name;
	int intID;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIntID() {
		return intID;
	}
	public void setIntID(int intID) {
		this.intID = intID;
	}
	@Override
	public String toString() {
		return "F [name=" + name + ", intID=" + intID + "]";
	}
	
}
