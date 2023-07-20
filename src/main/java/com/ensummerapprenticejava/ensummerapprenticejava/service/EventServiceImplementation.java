package com.ensummerapprenticejava.ensummerapprenticejava.service;

import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Venue;
import com.ensummerapprenticejava.ensummerapprenticejava.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImplementation implements EventService{

    @Autowired
    EventRepository eventRepository;

    public EventServiceImplementation(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
//    @Override
//    public Event findEvent(int id){
//        return eventRepository.findByEventId(id);
//    }

    @Override
    public List<Event> FindEventByVenueIdAndType(int venueId, String eventTypeName){
        return eventRepository.findByVenue_VenueIdAndEventType_EventTypeName(venueId,eventTypeName);
    }

}
