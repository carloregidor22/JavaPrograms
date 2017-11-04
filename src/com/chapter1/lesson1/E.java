package com.chapter1.lesson1;

public class E {
	private int l;
	private String rep;
	
	public String getRep() {
		return rep;
	}
	
	public void setRep(String rep) {
		this.rep = rep;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public static void poo(String[] args) {
		E object = new E();
		object.l = 123;
		System.out.println(object.getL());
		
		object.rep = "This should get printed. It should.";
		System.out.println(object.getRep());
		
		
	}
	
	public void foo(String i){
		l = Integer.parseInt(i);
	}

}
