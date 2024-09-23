package com.evergent.corejava.finalproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IRCTCDAO {

    // Existing method for booking tickets
    public void bookTicket(Ticket ticket) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String query = "INSERT INTO tickets (ticket_id, user_id, train_number, source, destination, status) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, ticket.getTicketId());
        pstmt.setInt(2, ticket.getUserId());
        pstmt.setString(3, ticket.getTrainNumber());
        pstmt.setString(4, ticket.getSource());
        pstmt.setString(5, ticket.getDestination());
        pstmt.setString(6, ticket.getStatus());
        pstmt.executeUpdate();
        connection.close();
    }

    // Method to cancel ticket
    public void cancelTicket(int ticketId) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String query = "UPDATE tickets SET status = 'CANCELLED' WHERE ticket_id = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, ticketId);
        pstmt.executeUpdate();
        connection.close();
    }

    // Method to get waiting list tickets for a train
    public List<Ticket> getWaitingList(String trainNumber) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String query = "SELECT * FROM tickets WHERE train_number = ? AND status = 'WAITING'";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, trainNumber);
        ResultSet rs = pstmt.executeQuery();
        List<Ticket> waitingList = new ArrayList<>();
        while (rs.next()) {
            Ticket ticket = new Ticket(
                rs.getInt("ticket_id"),
                rs.getInt("user_id"),
                rs.getString("train_number"),
                rs.getString("source"),
                rs.getString("destination"),
                rs.getString("status")
            );
            waitingList.add(ticket);
        }
        connection.close();
        return waitingList;
    }

    // Method to update ticket status (used for moving tickets from waiting to confirmed)
    public void updateTicketStatus(int ticketId, String status) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String query = "UPDATE tickets SET status = ? WHERE ticket_id = ?";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, status);
        pstmt.setInt(2, ticketId);
        pstmt.executeUpdate();
        connection.close();
    }

	public void addUser(User user) {
		/* 
		 *  public void addUser(User user) {
        try {
            irctcDAO.addUser(user);  // Call the addUser method in DAO
            System.out.println("User added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding user: " + e.getMessage());
        }
    } */
		
	}
}
