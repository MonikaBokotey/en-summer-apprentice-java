package com.ensummerapprenticejava.ensummerapprenticejava.model;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ticket_category")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ticketCategoryId;

    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private int price;



    public TicketCategory() {

    }

    public int getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(int ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
