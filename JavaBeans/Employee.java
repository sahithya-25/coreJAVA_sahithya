package com.evergent.corejava.JavaBeans;
import java.io.Serializable;

public class Employee implements Serializable{
	private int epno;
	public int getEpno() {
		return epno;
	}

	public void setEpno(int epno) {
		this.epno = epno;
	}

	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public double getSal() {
		return sal;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}

	private String ename;
	private double sal;
	
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEpno(6);
		e.setEname("sahithya");
		e.setSal(600.00);
		System.out.println("employee id: "+e.getEpno());
		System.out.println("employee name: "+e.getEname());
		System.out.println("employee sal : "+e.getSal());
	}
}
