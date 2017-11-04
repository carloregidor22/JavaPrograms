package com.chapter1.lesson2;

import com.shapter1.lesson4.Employee;

public class B extends U {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -995062411489340445L;

	public void initEmployee(){
		
		Employee e = new Employee();
		e.setID(20001);
		e.setFirstName("BRandy");
		e.setInactive(false);
		e.setManager(false);
		e.setCubicleNumber("BA19");
		e.setTelephone("B6326543129");
		e.setBirthDate("B09/09/80");
		e.setLastName("BAnda");
		e.setNickName("BRands");
		e.setSalary(250000l);
		e.setRegular(true);
		e.setProb(false);
		e.setTitle("BSupervisor");
		e.setWing("BAyala Wing");
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

}
