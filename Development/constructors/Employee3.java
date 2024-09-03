package com.evergent.corejava.constructors;

public class Employee3 {
	int eid;
	String ename;   // constructor overloading
	float sal;
	Employee3()
	{
		System.out.println("default constructor");
	}
	Employee3(int eid, String ename,float sal)
	{
		System.out.println("eid: "+eid+"name:"+ename+"salary:"+sal);
	}
	public static void main(String[] args) {
		
		Employee3 emp31 =new Employee3();
		Employee3 emp32 =new Employee3(67,"sahithya",87666);
		
	}
}
