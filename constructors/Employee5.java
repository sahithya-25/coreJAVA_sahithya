package com.evergent.corejava.constructors;

public class Employee5 {
	int eid;
	String ename;
	Employee5(int eid)
	{
		System.out.println("first constructed");
	}
	Employee5(int eid,String ename)
	{
		this(eid);
		this.ename=ename;
		System.out.println("this keyword calling constructor");
		System.out.println("ename:"+ename);
	}
	
	public static void main(String[] args) {
		//"this" keyword is used also for calling purpose
		// we can call one constructor to the another constructor
		//within a class
		Employee5 emp=new Employee5(67);
		Employee5 emp1=new Employee5(67,"sahithya");
		
	}

}
