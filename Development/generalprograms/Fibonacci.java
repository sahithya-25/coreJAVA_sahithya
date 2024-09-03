package com.evergent.corejava.generalprograms;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,n=5,sum=0;
		if(n==1)
		{
			System.out.print(a);
		}
		if(n>=2)
		{
			System.out.print(a+" "+b);
		}
		for(int i=3;i<=n;i++)
		{
			sum=a+b;
			System.out.print(" "+sum );
			a=b;
			b=sum;
			
			
		}
		
	}

}
