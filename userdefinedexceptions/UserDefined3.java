package com.evergent.corejava.userdefinedexceptions;

class AgeNotSupport extends Exception{
	public AgeNotSupport(String str) {
		System.out.println("Sorry "+str);
	}
}
public class UserDefined3 {
public void myData() throws AgeNotSupport{
	int age=17;
	if(age<18) {
		throw new AgeNotSupport("You are Not Eligible");
	}
	else{
		System.out.println("Successfully Registered");
	}
}
	public static void main(String[] args) {
		try {
			UserDefined3 ud=new UserDefined3();
			ud.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle..");
		}

	}

}