package com.chapter1.lesson3;

import java.util.ArrayList;

public class TestLifeSupportSim {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		V2Radiator v2 = new V2Radiator(aList);
		V3Radiator v3 = new V3Radiator(aList);
		
		for (int z = 0; z < 20; z++) {
			RetentionBot ret = new RetentionBot(aList);
		}

		// adding this to make sure the power is correct:
		int totalPower = 0;
		for (Object o : aList) {
			totalPower += ((SimUnit) o).powerUse();
		}
		System.out.println("Total power: " + totalPower);
	}
}

class V2Radiator {
	@SuppressWarnings("rawtypes")
	V2Radiator(ArrayList list) {
		System.out.println("making a v2 radiator");
		for (int x = 0; x < 5; x++) {
			list.add(new SimUnit("V2Radiator"));
		}
		int total = 0;
		for (Object o : list) {
			total += ((SimUnit) o).powerUse();
		}
		System.out.println("Total power 1: " + total);

	}
}

class V3Radiator extends V2Radiator {
	V3Radiator(ArrayList list) {
		super(list);
		for (int g = 0; g < 10; g++) {
			list.add(new SimUnit("V3Radiator"));
		}
	}
}

class RetentionBot {
	RetentionBot(ArrayList rlist) {
		rlist.add(new SimUnit("Retention"));
	}
}

class SimUnit {
	String botType;

	SimUnit(){}
	
	SimUnit(String type) {
		botType = type;
	}

	int powerUse() {
		if ("Retention".equals(botType)) {
			return 2;
		} else {
			return 4;
		}
	}
}