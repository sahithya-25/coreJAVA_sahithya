package com.evergent.corejava.studentapplication;

import java.util.ArrayList;
public class StudentDAO {
	public String addStudent(StudentBean studentbean)
	{
		try {
			ArrayList mylist=new ArrayList();
			mylist.add(studentbean.getSid());
			mylist.add(studentbean.getSname());
			mylist.add(studentbean.getRank());
			mylist.add(studentbean.getBranch());
			System.out.println("studnet id: "+ studentbean.getSid());
			System.out.println("studnet id: "+ studentbean.getSname());
			System.out.println("studnet id: "+ studentbean.getRank());
			System.out.println("studnet id: "+ studentbean.getBranch());
			return "1";
		}
		 catch(Exception e)
		{
			 System.out.println(e);
			 return "0";
		}
	}
}
