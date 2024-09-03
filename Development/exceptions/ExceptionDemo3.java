package com.evergent.corejava.exceptions;

public class ExceptionDemo3 {
	public void myData()
	{
		try
		{
			String s="null";
			System.out.println("one");
			System.out.println(s.length());
			System.out.println("end");
		}
		catch(NullPointerException e)
		{
			System.out.println("i can handle : "+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo3 ed=new ExceptionDemo3();
		ed.myData();
	}
}
