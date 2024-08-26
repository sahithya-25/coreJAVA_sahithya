package com.evergent.corejava.generalprograms;

public class Big5 {

	public static void main(String[] args) {
		int a=20,b=45,c=30,d=89,e=25;
		if(a>b && a>c && a>d && a>e) {
			System.out.println(a);
		}
		else if(b>c && b>d && b>e) {
			System.out.println("b is bigger");
		}
		else if(c>d && c>e)
		{
			System.out.println("c is bigger");
		}
		else {
			System.out.println("d is bigger");
		}

	}

}
