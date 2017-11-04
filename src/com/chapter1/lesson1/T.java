package com.chapter1.lesson1;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F object = new F(); 
		object.setName("Ryan Gosling");
		object.setIntID(200);
		G g = new G();
		
		System.out.println(object);
		
	}
	public static void passthru(String[] args){
		main(args);
	
	}
}
