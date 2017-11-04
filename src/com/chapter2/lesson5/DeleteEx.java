package com.chapter2.lesson5;

import java.util.LinkedList;
import java.util.List;

public class DeleteEx {
	public static void main(String[] args) {

		//selectAll();
		
		Employee e = new Employee(1003, "Gene", "Roxas", "09/01/1979");
		Employee e1 = new Employee(1005, "Gene1", "Roxas1", "09/08/1979");
		Employee e2 = new Employee(1070, "Gene2", "Roxas2", "08/09/1979");
		Employee e3 = new Employee(2001, "Gene3", "Roxas3", "09/29/1979");
		Employee e4 = new Employee(2002, "Gene4", "Roxas4", "09/19/1979");

		List<Employee> listBatch = new LinkedList<Employee>();
		listBatch.add(e);
		listBatch.add(e4);
		listBatch.add(e3);
		listBatch.add(e2);
		listBatch.add(e1);
		
		
		DBHelper.batchDelete(listBatch);

		DBHelper.displayEmployee();
		ConnectionHelper.disconnect();
	}

	

}
