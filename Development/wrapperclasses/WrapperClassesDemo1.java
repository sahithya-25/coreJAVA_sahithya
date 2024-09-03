package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo1 {

	public static void main(String[] args) {
		int a=100;
		Integer i=new Integer(a);//converted to object
		System.out.println(i);
		
		int a1=i.intValue();
		System.out.println(a);  
		
	}

}
