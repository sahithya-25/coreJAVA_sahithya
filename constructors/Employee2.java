package com.evergent.corejava.constructors;

public class Employee2 {
	
	Employee2(int eid,String ename,float sal)
	{
		System.out.println(eid+ " "+ ename +" "+sal);
	}
	public static void main(String[] args) {
		//parametarized constructor
		new Employee2(123,"sahithya",768278);
	}

}
