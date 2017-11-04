package com.chapter1.lesson1;

public class G extends F {
	StringBuffer last = new StringBuffer();
	
	protected float f;
	
	public StringBuffer getLast() {
		return last;
	}
	
	public void setLast(StringBuffer last) {
		this.last = last;
	}
	
	public G() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "G [last=" + last + ", G=" + f + "]";
	}
	
}
