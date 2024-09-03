package com.evergent.corejava.strings;

public class StringDemo8 {

	public static void main(String[] args) {
		String str1="mirror";
		StringBuffer sb=new StringBuffer(str1).reverse();
		System.out.println(sb);
		// once check toString()
		System.out.println(sb.toString());  
		System.out.println(sb.append(" mirror"));
		System.out.println(sb.capacity());
		System.out.println(sb.replace(2,5,"w"));
		System.out.println(sb.delete(0,3));
		System.out.println(sb.indexOf("mi"));
		System.out.println(sb.insert(0,"hi"));
		System.out.println(sb.length());

	}

}
