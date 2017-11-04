package com.chapter2.lesson1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public QueueEx() {
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

		Queue<String> q = new PriorityQueue<String>();
		for (int i = 0; i < 4; i++) {
			q.add(arrayString[i]);
		}
		
		
		p(q);
		
	    for (Iterator<String> it = q.iterator() ; it.hasNext() ; ) {
	        String t = it.next();
	        if (t instanceof String) {
	          it.remove();
	        }
	     }
	    
	    p(q);


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
