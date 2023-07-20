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


}
