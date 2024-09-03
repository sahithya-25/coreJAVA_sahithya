package com.evergent.corejava.strings;

public class StringDemo7 {

	public static void main(String[] args) {
		String str1="   fox is danger  ";
		/// removes left space 
		System.out.println(str1.trim( ));
		System.out.println(str1.replace(" ","*"));
		// the reverse() is undefined for the type string 
		//System.out.println(str1.reverse());
		        

	}

}
