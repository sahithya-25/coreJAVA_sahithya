package com.evergent.corejava.static1;

public class StaticDemo2 {
	static String cname="india";
	String name="krishna";
	static public void myData() {
		System.out.println("my data");
		//cannot make a static reference to the non-static field name
		//System.out.println("my data2:"+name);
	}
	static public void myData1() {
		myData();
		System.out.println("my data1");
	}
	
	// public,private,protected are permitted      static StaticDemo2(){  }

	public static void main(String[] args) {
		
		myData();
		System.out.println("name:"+cname);
	}

}
