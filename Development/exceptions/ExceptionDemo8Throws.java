package com.evergent.corejava.exceptions;

public class ExceptionDemo8Throws {
	String name=null;
	public void myData()
	{
		
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
	public void myInfo()
	{
		try {
			myData();
		}
		catch(Exception e)
		{
			System.out.println("i can handle : "+e);
		}
		System.out.println("my info methods are here..");
	}
	public static void main(String[] args) {
		//calling method
			ExceptionDemo8Throws ed=new ExceptionDemo8Throws();
			ed.myInfo();
	}

}
