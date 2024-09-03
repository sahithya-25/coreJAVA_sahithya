package com.evergent.corejava.static1;

public class StaticDemo3 {
	static String cname="india";
	String name="krishna";
	//non-static methods can access static methods & static variables
	static public void myData() {
		System.out.println("my data");
		
	}
	public void show() {
		myData();
		System.out.println("showing method");
		System.out.println("static variable: "+cname);
		System.out.println("non-static variable: "+name);
		
	}
	
	

	public static void main(String[] args) {
		
		myData();
		System.out.println("name:"+cname);
		StaticDemo3 sd3=new StaticDemo3();
		
		/* The method println(boolean) in the type PrintStream 
		is not applicable for the arguments (void)  
		System.out.println(sd3.show());   */
		
		sd3.show();
		
	}

}
