package com.evergent.corejava.ram.application3;

interface EmployeeInterface
{
	public void employeeInfo();
	public void employeeAddress();
	public void employeeDetails();
}
abstract class BankAccountDetails{ 
	abstract public void accountDetails();
	public void bankDetails() {
		System.out.println("my bank is ICIC.....");
	}
}
class BankRBI{
	static {
		System.out.println("welcome to employee details");
	}
	public BankRBI(){
		System.out.println("RBI bank home loan and personal loan interest");
	}
	public BankRBI(double p, double r) {
		System.out.println(p*r/100);
	}
	public static final void getBankDetails() {
		System.out.println("home loan interest in 8.5 ");
		System.out.println("personal loan interest is 11%");
	}
}
public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface{
	
      //implementation class(main class) 
	int empno;
	String address;
	double sal;
	public void employeeInfo(int eno,float sal)throws Exception{
		empno=eno;
		this.sal=sal;
	}
	public void employeeAddress(String add)
	{
		this.address=add;
	}
	public void employeeDetails() {
		System.out.println("employee no: "+empno);
		System.out.println("employee sal: "+sal);
		System.out.println("employee Address: "+address);
	}
	public void accountDetails()
	{
		System.out.println("my account details: 12345678");
	}
	public void show()
	{
		System.out.println("this is show local method");
	}
	public static void main(String[] args) throws Exception {
		EmployeeInformation emp=new EmployeeInformation();
		emp.employeeInfo(100,50000);
		emp.employeeAddress("bangulore");
		emp.employeeDetails();
		emp.accountDetails();
		emp.bankDetails();
		BankRBI rbi=new BankRBI();
		BankRBI rbi1=new BankRBI(3.3,3.3);
		BankRBI.getBankDetails();
		emp.show();

	}
	 @Override
	public void employeeInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void employeeAddress() {
		// TODO Auto-generated method stub
		
	} 

}
