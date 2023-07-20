package com.ensummerapprenticejava.ensummerapprenticejava.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "event_type")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int event_type_id;

    @Column(name="event_type_name")
    private String  eventTypeName;


    public EventType() {

    }


}
