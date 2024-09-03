package com.evergent.corejava.static1;

public class StaticDemo5 {
	static String name="krishna";
	int age=56;
	public void display() {
		name="radha";
		System.out.println(name);
		System.out.println(age);
		System.out.println("displaying");
	}
	 public void show(){
		System.out.println(name);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo5 sd=new StaticDemo5();
		
		sd.show();
		
		System.out.println(sd.name);
		sd.display();
		
		StaticDemo5 sd1=new StaticDemo5();
		System.out.println( sd1.name);
		
	}

}
