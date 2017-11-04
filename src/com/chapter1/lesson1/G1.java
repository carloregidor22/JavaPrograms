package com.chapter1.lesson1;

public class G1 extends G {

	public static void main(String[] args) {
		G1 g1 = new G1();
		g1.f = 1.2f;
		g1.getLast().append("Hello").append(" World!").append(" !!!!");
		System.out.println(g1.getLast());
	}

}
