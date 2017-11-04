package com.chapter2.lesson1;

import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class ListEx {

	public ListEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		String[] arrayString = new String[4];
		for (int i = 0; i < 4; i++) {
			arrayString[i] = "Value of " + i;
		}
		p(arrayString);

		List<String> list = new LinkedList<String>();
		for (int i = 0; i < 4; i++) {
			list.add(arrayString[i]);
		}
		
		
		p(list);
		
	    for (Iterator<String> it = list.iterator() ; it.hasNext() ; ) {
	        String t = it.next();
	        if (t instanceof String) {
	          it.remove();
	        }
	     }
	    
	    p(list);


	}

	public static void p(String[] pp) {
		for (String s : pp) {
			System.out.println(s);
		}
	}

	public static void p(Collection p) {
		System.out.println(p);
	}

}
