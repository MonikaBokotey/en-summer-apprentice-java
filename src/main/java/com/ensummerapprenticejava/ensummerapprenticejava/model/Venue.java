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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
