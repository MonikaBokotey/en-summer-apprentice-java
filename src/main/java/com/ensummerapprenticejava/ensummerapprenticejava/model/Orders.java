package com.ensummerapprenticejava.ensummerapprenticejava.model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int orderId;

   @ManyToOne
   @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="ticket_category_id")
    private TicketCategory ticketCategory;


    @Column(name="ordered_at")
    private Date orderedAt;

    @Column(name="number_of_tickets")
    private int numberOfTickets;


    @Column(name="total_price")
    private int totalPrice;


    public Orders() {

    }


}
