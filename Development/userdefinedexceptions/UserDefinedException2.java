package com.evergent.corejava.userdefinedexceptions;

class InsufficientFundsException extends RuntimeException
{
	public InsufficientFundsException(String message)
	{
		super(message);
	}
}
public class UserDefinedException2 {
	public static void withDraw(double amount)//throws InsufficientFundsException
	{
		double balance=500.00;
		if(amount>balance)
		{
			throw new InsufficientFundsException("insufficient funds for withdrawal");
		}else {
			System.out.println("withdrawal is succeed");
		}
	}
	public static void main(String[] args) {
		try {
			withDraw(600.00); 
		}
		catch(Exception e)
		{
			System.out.println("caught");
			System.out.println(e);
		}
		System.out.println("hiiii");
	}

}
