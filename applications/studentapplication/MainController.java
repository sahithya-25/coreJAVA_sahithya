package com.evergent.corejava.studentapplication;

import java.util.Scanner;

import com.evergent.corejava.bookapplication.BookService;

public class MainController {

	public static void main(String[] args) {
		int sid;
		String sname;
		int rank;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student ID");
		sid=sc.nextInt();
		System.out.println(("Enter student name"));
		sname = sc.next();
		System.out.println("Enter rank ");
		rank = sc.nextInt();
		
		StudentService studentService = new StudentService();
		
		String updeateCount=studentService.addStudentService(sid,sname,rank);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record sahithya Success");
		
	}

}
