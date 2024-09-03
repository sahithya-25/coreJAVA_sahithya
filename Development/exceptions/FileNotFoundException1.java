package com.evergent.corejava.exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFoundException1 {

	public static void main(String[] args) {
		try {
			File f=new File("C:/file/java.txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())// checks whether the file has any script in file or not.
				         // returns boolean
			{
				System.out.println(sc.nextLine());
// System.out.println(sc.nextLine()); ---> u'll get the script writtern in file
			}
			sc.close();
		}	
		catch(FileNotFoundException e)
		{
			System.err.println(e);
			System.out.println("i can handle: ");
			e.printStackTrace();
		}
	}
}
