package com.evergent.corejava.constructors;
//using "this" keyword----> always points to instance variable

public class Employee4 {
	int eid;
	String ename;
	float sal;
	Employee4()
	{
		System.out.println("default constructor");
	}
	/* Employee4(int eid1, String ename1,float sal1)
	{
		eid=eid1;
		ename=ename1;
		sal=sal1;
		System.out.println("eid: "+eid+"name:"+ename+"salary:"+sal);
	} */
	
	
	Employee4(int eid, String ename,float sal1)
	{
		eid=eid;
		this.ename=ename;
		sal=sal1;
		
	}
	void display()
	{
		System.out.println("eid: "+eid+"name:"+ename+"salary:"+sal);
	}
	public static void main(String[] args)
	{
		new Employee4();
		Employee4 emp2=new Employee4(767,"abc",898988);
		emp2.display();
	}
	

}
