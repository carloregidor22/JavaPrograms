package com.chapter1.lesson2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WithoutGenerics {

	public WithoutGenerics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		M m = new M();
		N n = new N();
		O o = new O();
		P p = new P();
		Q q = new Q();

		ArrayList list = new ArrayList();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(m);
		list.add(n);
		list.add(o);
		list.add(p);
		list.add(q);

		File file = new File("c:\\ESD\\txt.txt");

		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
