package com.shapter1.lesson4;

import java.util.Arrays;

public class EX {
	
	public static void main(String[] args){
		for(int i =0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
		
		foo();
		bazz();
		
		EX ex = new EX();
		ex.initEmployee();
		//ex.printEmployee(ex.emps);
		ex.cloneArrayEmployee();
	}
	
	public static void foo(){
		int [] arrayInt = new int[10];
		System.out.println(arrayInt.length);
		
		arrayInt[0] = 1;
		arrayInt[1] = 1;
		arrayInt[2] = 1;
		arrayInt[3] = 1;
		arrayInt[4] = 1;
		arrayInt[5] = 1;
		arrayInt[6] = 1;
		arrayInt[7] = 1;
		arrayInt[8] = 1;
		arrayInt[9] = 1;
		
		System.out.println(Arrays.toString(arrayInt));
	}
	
	public static void bazz(){
		int arrayInt[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int [] cloned = arrayInt.clone();
		for (int i : cloned){
			System.out.println("Cloned Index : " + new Integer(i).toString());
		}
		
	}
	
	private Employee[] emps = new Employee[3];
	
	public void initEmployee(){
		
		Employee e = new Employee();
		e.setID(20001);
		e.setFirstName("Randy");
		e.setInactive(false);
		e.setManager(false);
		e.setCubicleNumber("A19");
		e.setTelephone("6326543129");
		e.setBirthDate("09/09/80");
		e.setLastName("Anda");
		e.setNickName("Rands");
		e.setSalary(250000l);
		e.setRegular(true);
		e.setProb(false);
		e.setTitle("Supervisor");
		e.setWing("Ayala Wing");
		String [] dependents = {"Brenda Anda", "Bryan Anda", "Myla Anda", "Caloy Anda", "Siri Anda", "Junior Anda"};
		e.setDependents(dependents);
		
		emps[0] = e;
		
		e = new Employee();
		e.setID(10001);
		e.setFirstName("Bry");
		e.setInactive(false);
		e.setManager(false);
		e.setCubicleNumber("A18");
		e.setTelephone("6326543129");
		e.setBirthDate("09/07/81");
		e.setLastName("Anda");
		e.setNickName("AntiCristo");
		e.setSalary(250000l);
		e.setRegular(true);
		e.setProb(false);
		e.setTitle("Supervisor");
		e.setWing("Ayala Wing");
		String dependents1[] = {"Brenda AntiCristo", "Bryan AntiCristo", "Myla AntiCristo", "Caloy AntiCristo", "Siri AntiCristo", "Junior AntiCristo"};
		e.setDependents(dependents1);
		
		emps[1] = e;

		e = new Employee();
		e.setID(30001);
		e.setFirstName("Candy");
		e.setInactive(false);
		e.setManager(false);
		e.setCubicleNumber("A10");
		e.setTelephone("6326543129");
		e.setBirthDate("02/09/78");
		e.setLastName("Palaquis");
		e.setNickName("Candy");
		e.setSalary(150000l);
		e.setRegular(true);
		e.setProb(false);
		e.setTitle("QA Tester");
		e.setWing("Ayala Wing");
		String [] dependents2 = {"Brenda Palaquis", "Bryan Palaquis", "Myla Palaquis", "Caloy Palaquis", "Siri Palaquis", "Junior Palaquis"};
		e.setDependents(dependents2);

		emps[2] = e;
	}
	
	public void printEmployee(Employee[] employees){
		for(Employee e: employees)
			System.out.println(e);
	}
	
	private void cloneArrayEmployee(){
		Employee[] employees = emps.clone();
		for(Employee e: employees)
			System.out.println(e);
	}

}
