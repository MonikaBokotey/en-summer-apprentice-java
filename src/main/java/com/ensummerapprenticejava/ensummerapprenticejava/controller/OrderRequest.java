package com.ensummerapprenticejava.ensummerapprenticejava.controller;

public class OrderRequest {

    private int eventId;

    private int numberOfTickets;

    private int ticketCategoryId;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(int ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public OrderRequest(int eventId, int numberOfTickets, int ticketCategoryId) {
        this.eventId = eventId;
        this.numberOfTickets = numberOfTickets;
        this.ticketCategoryId = ticketCategoryId;
    }
}
