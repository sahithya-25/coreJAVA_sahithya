package com.evergent.corejava.userdefinedexceptions;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
public class UserDefinedException {
	public static void checkAge(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("age must be 18 or older");
		}else{
			System.out.println("access granted you are old enough");
		}
	}
	public static void main(String[] args) {
		try {
			checkAge(16);
		}
		catch(Exception e)
		{
			System.out.println("caught the excution: "+e.getMessage());
			System.out.println(e);
		}
	}

}
