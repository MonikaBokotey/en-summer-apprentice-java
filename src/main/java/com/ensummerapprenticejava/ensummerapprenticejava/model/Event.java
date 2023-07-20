package com.ensummerapprenticejava.ensummerapprenticejava.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "event")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int eventId;

    @ManyToOne
    @JoinColumn(name="venue_id")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name="event_type_id")
    private EventType eventType;

    @Column(name="event_description")
    private String eventDescription;

    @Column(name="event_name")
    private String eventName;

    @Column(name="start_date")
    private Date startDate;

    @Column(name="end_date")
    private Date endDate;




    public Event() {

    }


}
