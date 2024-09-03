package com.evergent.corejava.static1;

public class Person6 {
	int age=25;
	static String name="krishna";
	
	String address="hyderabad";
	public  void display() {
		
		System.out.println("name: "+name); //we can direct access variable bcz we 
		//r printing/acessing in that method only 
		System.out.println("address: "+address);
		System.out.println("age : "+age);
	}
	public static void show() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Person6 p=new Person6();
		System.out.println("name: "+name);
		// here we have to access through object creation
		p.display();
		show();
	}

}
