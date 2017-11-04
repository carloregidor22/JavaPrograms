package com.chapter2.lesson5;

import java.util.LinkedList;
import java.util.List;

public class SelectEx {

	public static void main(String[] args) {


		List<Employee> listEmp = DBHelper.selectAll();

		Employee e = new Employee(DBHelper.getMaximum(listEmp) + 1, "Gene", "Roxas", "09/01/1979");
		Employee e1 = new Employee(DBHelper.getMaximum(listEmp) + 1, "Gene1", "Roxas1", "09/08/1979");
		Employee e2 = new Employee(DBHelper.getMaximum(listEmp) + 1, "Gene2", "Roxas2", "08/09/1979");
		Employee e3 = new Employee(DBHelper.getMaximum(listEmp) + 1, "Gene3", "Roxas3", "09/29/1979");
		Employee e4 = new Employee(DBHelper.getMaximum(listEmp) + 1, "Gene4", "Roxas4", "09/19/1979");

		List<Employee> listBatch = new LinkedList<Employee>();
		listBatch.add(e4);
		listBatch.add(e3);
		listBatch.add(e2);
		listBatch.add(e1);
		DBHelper.batchInsert(listBatch);

		// per Object
		DBHelper.insertOne(e);
		
		DBHelper.displayEmployee();
		ConnectionHelper.disconnect();
	}


}
