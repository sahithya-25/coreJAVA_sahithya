package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;

public class WrapperClassesDemo4_ArrayList {

	public static void main(String[] args) {
		int a=100;
		Integer i1=new Integer(a);
		ArrayList myList=new ArrayList(); 
		myList.add(i1); // direct object is accepting
		System.out.println(myList);
		
		myList.add("hello");
		System.out.println(myList);
		
		byte b=56; 
		Byte b1=new Byte(b);
		byte b2= b1.byteValue(); 
		myList.add(b2);   // data type value is sending
		System.out.println(myList); 
		
		ArrayList myList1=new ArrayList(); 
		myList1.add(1500); // direct object is accepting
		System.out.println(myList.get(2));
		
	}
}
