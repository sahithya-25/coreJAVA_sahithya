package com.evergent.corejava.interface1;

interface Drawable
{
	public void draw();
}

class Circle implements Drawable{
	public void draw() {
		System.out.println("circle");
	}
}

class Rectangle implements Drawable{
	public void draw() {
		System.out.println("circle");
	}
}


public class TestInterface {

	public static void main(String[] args) {
		Drawable d=new Circle();
		// TestInterface d=new TestInterface(); --->
		
		d.draw();
	}

}
