package com.evergent.corejava.oops;
import java.util.Scanner;
public class Calculator {
	
	public float add(int a,float b)
	{
		return (a+b);
	}
	public void sub(int c,int b) {
		System.out.println("subtraction: " +(float)(c-b));
	}
	public void show()
	{
		System.out.println("showing all calculations in calculator");
	}
	public int division()
	{
		return 300;
	}
	public static void main(String[] args) 
	{
		Calculator cal =new Calculator();
		System.out.println(cal.add(43,50.5f));
		cal.sub(68, 56);
		cal.show();
		System.out.println(cal.division());
		
	}
}
