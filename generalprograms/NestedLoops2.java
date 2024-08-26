package com.evergent.corejava.generalprograms;

public class NestedLoops2 {

	public static void main(String[] args) {
		int n=5,i,j,c=25;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print(c-- +" ");
			}
			System.out.println();
		}

	}

}
