package com.chapter1.lesson2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import com.shapter1.lesson4.Employee;

public class WithGenerics {

	public WithGenerics() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		List<Z> list = new ArrayList<Z>();
		Z zz = new Z();
		zz.initEmployee();
		
		list.add(zz);
		
		A a = new A();
		a.initEmployee();
		list.add(a);
		
		B b = new B();
		b.initEmployee();
		list.add(b);
		
		File file = new File("c:\\ESD\\gen.txt");

		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			fos.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			FileInputStream fos = new FileInputStream(file);
			ObjectInputStream ios = new ObjectInputStream(fos);
			try {
				ArrayList<Z> listZ = (ArrayList<Z>) ios.readObject();
				for(Z z : listZ){
					Employee[] emps = z.emps;
					for (Employee employee : emps ){
						System.out.println(employee);
					}
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fos.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
