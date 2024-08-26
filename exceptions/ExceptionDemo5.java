package com.evergent.corejava.exceptions;

public class ExceptionDemo5 {
	public void myData()
	{
		try
		{
			String s="null";
			int k=2;
			int t=10/k;
			System.out.println("one");
			System.out.println(s.length());
			System.out.println(t);
			System.out.println("end");
		
		}
		finally {
			System.out.println("try is followed by either catch or finally block");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ed=new ExceptionDemo5();
		ed.myData();
	}
}
