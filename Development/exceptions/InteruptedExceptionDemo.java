
package com.evergent.corejava.exceptions;

public class InteruptedExceptionDemo {
	//Interupted Exception

	public static void main(String[] args) {
		try {
			System.out.println("I am going to sleep mode for 3 seconds");
			Thread t=new Thread();
			t.sleep(3000);
			System.out.println("I woke up Just Now");
		}
		catch(InterruptedException e) {
			System.out.println("Caught Exception: "+e.getMessage());
		}

	}

}
