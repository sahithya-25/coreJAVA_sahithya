package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo2 {

	public static void main(String[] args) {
		float f1=4.5f;
		int i1=100; //primitive data type is not allowed/ supported in 1.44 version for collections framework.
		Integer t1=new Integer(i1);// datatypes are converted into object.
		
		int t2=t1.intValue();// objects are converted into datatypes
		
		double d=56.01;
		Double d1=new Double(d);
		
		double d2=d1.doubleValue();
		
		char ch='a';
		Character ch1=new Character(ch);
		
		char ch2=ch1.charValue();
		System.out.println("integer value: "+i1);
		System.out.println("object value: "+ t1);
		System.out.println("data value: "+t2);
		System.out.println("double data value: "+ d);
		System.out.println("object value: "+d1);
		System.out.println("data value: "+ d2);
		System.out.println("char value: "+ch);
		System.out.println("object value: "+ ch1);
		System.out.println("data value: "+ch2);
	}

}
