package com.chapter2.lesson1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class MapEx {

	public MapEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
/*		String[] keys = new String[999999];
		for (int i = 0; i < 2099999999; i++) {
			keys[i] = "Key!@#$*@#)$*@#)*$#@*)" + i;
		}

		StringBuffer[] value = new StringBuffer[2099999999];
		for (int i = 0; i < 2099999999; i++) {
			value[i] = new StringBuffer("Value of " + i);
		}*/

		Map<Integer, Long> map = new HashMap<Integer, Long>();
/*		for (int i = 0; i < 2099999999; i++) {
			map.putIfAbsent(keys[i], value[i]);
		}*/
		
		for (int i = 0; i < 999999999; i++) {
			Integer ii = new Integer(i);
			map.put(ii,  new Long(ii));
		}

		Set<Integer> setKeys = map.keySet();
		
		Integer[] arr = new Integer[setKeys.size()];
		setKeys.toArray(arr);
		
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		
		p(list);
		for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
			Integer t = it.next();
			if (t instanceof Integer) {
				System.out.println("Key :" + t + " - Value: " + map.get(t));
			}
		}

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
