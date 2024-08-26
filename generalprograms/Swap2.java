package com.evergent.corejava.generalprograms;

public class Swap2 {

	public static void main(String[] args) {
		int a=20,b=50;
		if(a==b)
		{
			System.out.println("no noeed to swap");
		}
		else {
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a+" "+b);
		}
	}

}
