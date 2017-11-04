package com.chapter2.lesson1;

import static collections.StaticTestData.tuesdayTasks;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import collections.CodingTask;
import collections.PhoneTask;
import collections.Task;

public class SetEx {

	public SetEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayString = new String[4];
		for (int i = 0; i < 4; i++) {
			arrayString[i] = "Value of " + i;
		}
		p(arrayString);

		Set<String> set = new TreeSet<String>();
		for (int i = 0; i < 4; i++) {
			set.add(arrayString[i]);
		}
		p(set);
		
	    for (Iterator<String> it = set.iterator() ; it.hasNext() ; ) {
	        String t = it.next();
	        if (t instanceof String) {
	          it.remove();
	        }
	     }
	    
	    p(set);
		
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
