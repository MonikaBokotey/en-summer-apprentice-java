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

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
