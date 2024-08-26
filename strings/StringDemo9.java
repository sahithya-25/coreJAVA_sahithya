package com.evergent.corejava.strings;

public class StringDemo9 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="World";
		String str3="hi";
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		// System.out.println(sb1.toString());
		// System.out.println(sb2.toString());
		System.out.println(sb1.append('d'));
		System.out.println(sb1.append(str2));
		System.out.println(sb1.delete(2, 3));//0 - n-1
		System.out.println(sb1.deleteCharAt(0));
		System.out.println(sb1.capacity()); //sb2 also check
		System.out.println(sb1.compareTo(sb2));// doubt
		System.out.println(sb1.insert(4,"ff"));
		System.out.println(sb1.capacity());
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode());// 9 numbers
		System.out.println(sb2.reverse()); // doubt
		System.out.println(sb1.replace(3, 5, "oo"));
	}

}
