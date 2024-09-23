// Updated Ticket.java
package com.evergent.corejava.finalproject;

public class Ticket {
    private int ticketId;
    private int userId;
    private String trainNumber;
    private String source;
    private String destination;
    private String status;  // New field to store booking status

    public Ticket(int ticketId, int userId, String trainNumber, String source, String destination, String status) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.status = status;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
