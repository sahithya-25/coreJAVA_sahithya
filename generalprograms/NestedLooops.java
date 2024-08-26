package com.evergent.corejava.generalprograms;
import java.util.Scanner;
public class NestedLooops {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1||i==j)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
