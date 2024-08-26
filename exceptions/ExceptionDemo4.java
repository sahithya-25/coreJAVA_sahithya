package com.evergent.corejava.exceptions;

public class ExceptionDemo4 {
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
		catch(NullPointerException e)
		{
			System.out.println("i can handle : "+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("i can handle : "+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo4 ed=new ExceptionDemo4();
		ed.myData();
	}
}
