package com.evergent.corejava.finalproject;

import java.util.Scanner;


public class IRCTCController {

    private static IRCTCService irctcService = new IRCTCService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add User");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addUser(scanner);
                    break;
                case 2:
                    bookTicket(scanner);
                    break;
                case 3:
                    cancelTicket(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

   
    private static void addUser(Scanner scanner) {
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();  // consume newline
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter User Email: ");
        String email = scanner.nextLine();

        User user = new User(userId, name, email);
        irctcService.addUser(user); // Call addUser in service class
    }

    
    private static void bookTicket(Scanner scanner) {
        System.out.print("Enter Ticket ID: ");
        int ticketId = scanner.nextInt();
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();  // consume newline
        System.out.print("Enter Train Number: ");
        String trainNumber = scanner.nextLine();
        System.out.print("Enter Source: ");
        String source = scanner.nextLine();
        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();

        // Here, we set status as "CONFIRMED" by default; if booking fails, handle the waiting logic
        Ticket ticket = new Ticket(ticketId, userId, trainNumber, source, destination, "CONFIRMED");
        irctcService.bookTicket(ticket);
    }

    
    private static void cancelTicket(Scanner scanner) {
        System.out.print("Enter Ticket ID to Cancel: ");
        int ticketId = scanner.nextInt();
        irctcService.cancelTicket(ticketId);
    }
}
