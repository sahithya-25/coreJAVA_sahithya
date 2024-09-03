package com.evergent.corejava.studentapplication;

public class StudentService {
	// business logic
	public String addStudentService(int sid,String sname,int rank)
	{
		String branch;
		if(rank<1000)
		{
			branch="IOT";
		}
		else if(rank<20000)
		{
			branch="CSE";
		}
		else if(rank<30000)
		{
			branch="ECE";
		}
		else
		{
			branch="mech";
		}
		StudentDAO studentDAO =new StudentDAO(); 
		StudentBean studentbean=new StudentBean();
		studentbean.setSid(sid);
		studentbean.setSname(sname);
		studentbean.setRank(rank);
		studentbean.setBranch(branch);
		String updateResult=studentDAO.addStudent(studentbean);
		
		return "1";
	}
}
