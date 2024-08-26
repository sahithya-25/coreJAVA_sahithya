package com.evergent.corejava.sahithya.application2;

import java.io.IOException;
import java.util.Scanner;


public class DeMartManagementSystem {
	static int itemcost;
	static int amount;
	static int countofdresses;
	enum Floors{F,P,Q};
	enum Floorspecification{F1,F2,F3,F4,M};
	enum Paymentsection{T,S,M};
	enum Subsection{A,B};
	public static void main(String[] args) throws IOException {
			  String option = null;
		Scanner sc =new Scanner(System.in);
	    
	    System.out.println("\n\t\t \t\t Welcome To DEMART MANAGEMENT SYSTEM");
	    
		while(true)
		{

		System.out.println("======================");
		System.out.println(" De-Mart Management System ");
		System.out.println("======================");
		System.out.println("F- Floors ");
		System.out.println("P- Payment Module");
		System.out.println("Q- Quit ");
		System.out.println("======================");
	    System.out.println("please !! choose the module (F,P,Q) : ");
	    option=sc.nextLine();
	    System.out.println("You have choosen  : " ); 
		switch(Floors.valueOf(option))
		{
		case F:
			
			System.out.println(" FLoors Module");
			System.out.println("======================");
			System.out.println("F1- Floor1 for kidsware");
			System.out.println("F2- Floor2 for girlsware & boysware");
			System.out.println("F3- Floor3 for womenware");
			System.out.println("F4- Floor4 for Mensware");
			System.out.println("M-Return to Main Menu");
			System.out.println("======================");
			
			System.out.println("please !! choose the module (F1,F2,F3,F4,MF) : ");
		    option=sc.nextLine();
			switch(Floorspecification.valueOf(option))
			{

			case F1:
				System.out.println("===============================================");
				System.out.println("Floor for kidsware ");
				System.out.println("===============================================");
				System.out.println("section \t Dresstype         \t\t Price ");
				System.out.println(" A \t\t frocks \n\t\t jeans \n\t\t t-shirts  \t\t\t  MRP 257.00");
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" B \t\t shoes \n\t\t caps \n\t\t toys        \t\t\t  MRP 174.00");
				System.out.println("Enter your subsection code (A,B) : ");
				option=sc.nextLine();
				switch(Subsection.valueOf(option))
				{

				case A:
					itemcost=257;
					break;
				case B:
					itemcost=174;
					break;
				}
				System.out.println("Enter the number of dresses :");
				
				countofdresses =Integer.parseInt( sc.nextLine());
				System.out.println("you selected no of dresses are "+countofdresses);
				 System.out.println(amount=itemcost*countofdresses);
				
			break;
			case F2:
				System.out.println("===============================================");
				System.out.println("Floor for Girlsware & Boysware ");
				System.out.println("===============================================");
				System.out.println("section \t Dresstype            \t\t Price ");
				System.out.println(" A \t\t tops \n\t\t jeans \n\t\t t-shirts\n\t\t leggins \n\t\t formals \n\t\t partywares \n\t\t dressmaterials \n\t\t lehengas       \t\t\t\t  MRP 599.00");
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" B \t\t scarfs\n\t\t cosmetics \n\t\t watches \n\t\t footwear \n\t\t belts \n\t\t caps \n\t\t accessories \n\t\t readymade blouses    \t\t\t\t  MRP 215.00");
				System.out.println("Enter your subsection code (A,B) : ");
				option=sc.nextLine();
				switch(Subsection.valueOf(option))
				{

				case A:
					itemcost=399;
					break;
				case B:
					itemcost=215;
					break;
				}
				System.out.println("Enter the number of dresses");
				
				countofdresses =Integer.parseInt( sc.nextLine());
				System.out.println("you selected no of dresses are "+countofdresses);
				 amount=itemcost*countofdresses;
			break;
			case F3:
				System.out.println("===============================================");
				System.out.println("Floor for Womenware ");
				System.out.println("===============================================");
				System.out.println("section \t Dresstype             \t\t Price ");
				System.out.println(" A \t\t kanchepattu sarees \n\t\t kadwalsarees  \n\t\t kalankari sarees \n\t\t partyware sarees \t\t\t MRP 799.00");
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" B  \t\t casuals sarees \n\t\t cotton sarees \n\t\t Banaras sarees                               \t\t\t MRP 499.00");
				System.out.println("Enter your subsection code (A,B) : ");
				option=sc.nextLine();
				switch(Subsection.valueOf(option))
				{

				case A:
					itemcost=799;
					break;
				case B:
					itemcost=499;
					break;
				}
				System.out.println("Enter the number of dresses");
				
				countofdresses =Integer.parseInt( sc.nextLine());
				System.out.println("you selected no of dresses are "+countofdresses);
				 amount=itemcost*countofdresses;
			break;
			case F4:
				System.out.println("===============================================");
				System.out.println("Floor for Gentsware ");
				System.out.println("===============================================");
				System.out.println("section \t Dresstype             \t\t Price ");
				System.out.println(" A \t\t casuals \n\t\t t-shirts \n\t\t cotton materials  \t\t\t MRP 399.00 ");
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(" B \t\t formals \n\t\t footware \n\t\t boxers            \t\t\t MRP 699.00");
				System.out.println("Enter your subsection code (A,B) : ");
				option=sc.nextLine();
				switch(Subsection.valueOf(option))
				{

				case A:
					itemcost=399;
					break;
				case B:
					itemcost=699;
					break;
				}
				System.out.println("Enter the number of dresses");
				
				countofdresses =Integer.parseInt( sc.nextLine());
				System.out.println("you selected no of dresses are "+countofdresses);
				 amount=itemcost*countofdresses;
				 System.out.println("Amount for selected dresses are Rs"+amount);
			break;
			}
			break;
		case P:
			System.out.println("======================");
			System.out.println(" Payment Module");
			System.out.println("======================");
			System.out.println("T-to display total amount to be paid");
			
			System.out.println("M-Return to Main Menu");
			
			System.out.println("Enter your Module code (T,P,M) : ");
			
			option=sc.nextLine();
			switch(Paymentsection.valueOf(option))
			{

			case T:
				System.out.println("Total Amount to be Paid : Rs"+(amount));
				
			break;
			case S:
				System.out.println("Summary Of Order");
				System.out.println(" number of dresses : "+countofdresses+ "total amount to be paid: "+amount);
				break;
			}
			break;
		case Q:
			System.out.println("Quit Module");
			System.exit(0);
				break;

		
			}
		}
	}

}
