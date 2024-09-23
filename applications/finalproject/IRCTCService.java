package com.evergent.corejava.finalproject;

import java.sql.SQLException;

import java.sql.SQLException;
import java.util.List;

public class IRCTCService {

    private IRCTCDAO irctcDAO;

    public IRCTCService() {
        irctcDAO = new IRCTCDAO();
    }

    public void addUser(User user) {
        irctcDAO.addUser(user);
		System.out.println("User added successfully.");
    }

    public void bookTicket(Ticket ticket) {
        try {
            irctcDAO.bookTicket(ticket);
            System.out.println("Ticket booked successfully.");
        } catch (SQLException e) {
            System.out.println("Error booking ticket: " + e.getMessage());
        }
    }

    public void cancelTicket(int ticketId) {
        try {
            irctcDAO.cancelTicket(ticketId);
            System.out.println("Ticket cancelled successfully.");
            manageWaitingList();  // Check if there are tickets on the waiting list to confirm
        } catch (SQLException e) {
            System.out.println("Error cancelling ticket: " + e.getMessage());
        }
    }

    public void manageWaitingList() {
        try {
            // Example: You can check waiting list for specific train number
            List<Ticket> waitingList = irctcDAO.getWaitingList("12345");  // Example train number
            if (!waitingList.isEmpty()) {
                Ticket firstWaiting = waitingList.get(0);  // Get the first ticket in waiting
                irctcDAO.updateTicketStatus(firstWaiting.getTicketId(), "CONFIRMED");
                System.out.println("Ticket with ID: " + firstWaiting.getTicketId() + " has been confirmed from waiting.");
            }
        } catch (SQLException e) {
            System.out.println("Error managing waiting list: " + e.getMessage());
        }
    }
}
