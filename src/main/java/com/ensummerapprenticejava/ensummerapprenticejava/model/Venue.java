package com.ensummerapprenticejava.ensummerapprenticejava.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "venue")
public class Venue implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int venueId;
    @Column(name="location")
    private String  location;
    @Column(name="type")
    private String  type;
    @Column(name="capacity")
    private int  capacity;


    public Venue() {

    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }
}
