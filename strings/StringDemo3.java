package com.evergent.corejava.strings;

public class StringDemo3 {

	public static void main(String[] args) {
		String car="maruthi";
		String dog="golden retiever is super cute";
		System.out.println(car.toLowerCase());
		System.out.println(car.toUpperCase());
		System.out.println(car.length());
		System.out.println(car.toLowerCase());
		System.out.println(dog.indexOf("is"));
		System.out.println(car.concat(dog));
		System.out.println(car.concat("ms dhoni"));
		System.out.println(car+" "+dog);
		String student="vikas is very \"bright\" among students";
		System.out.println(student);
		String txt="It\'s alright";
		System.out.println(txt);
	}

}
