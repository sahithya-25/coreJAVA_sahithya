package com.evergent.corejava.static1;
class Krishna{
	int ag1=10;
	static {
		System.out.println("hello");
	}
}
class abc{
	static {
		System.out.println("234");
	}
}
class evergent{
	static {
		System.out.println("evergent");
	}
}
public class StaticDemo4{
	
	static {
		System.out.println("hello2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Krishna sd=new Krishna();
	    System.out.println(sd.ag1);	
	    abc a=new abc();
	}

}
