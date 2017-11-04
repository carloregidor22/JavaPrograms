package com.shapter1.lesson4;

public class Exeption {

	public static void main(String[] args) throws InterruptedException{
		
		
		MyOwnArrayIndexOutOfBoundsException e = new MyOwnArrayIndexOutOfBoundsException("My Own Exception - Index Out of Bounds Exception");
		try {
			//... do wait for something
			// time out occurred
			Thread.sleep(1000*60);
			//Employee emp = null;
			//emp.getBirthDate();
			//throw e;
			Math.tanh(1.2);
			
		} catch (MyOwnArrayIndexOutOfBoundsException exc) {
			System.out.println("Exception occured " + exc.getMessage());
			//e.printStackTrace();
		} catch (NullPointerException exc) {
			System.out.println("Exception occured " + exc.getMessage());
			//e.printStackTrace();
		}
	}
	
	public Exeption() {
	}

}
