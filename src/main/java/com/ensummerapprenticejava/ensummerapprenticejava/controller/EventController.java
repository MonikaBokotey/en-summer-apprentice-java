package com.ensummerapprenticejava.ensummerapprenticejava.controller;

import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Venue;
import com.ensummerapprenticejava.ensummerapprenticejava.service.EventServiceImplementation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    private EventServiceImplementation eventService;

    public EventController(EventServiceImplementation eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/api/event")
    public List<Event> getEvents(@RequestParam(name = "venueId") int venueId,
                            @RequestParam(name = "eventType") String eventType){
        return eventService.findEventByVenueIdAndType(venueId,eventType);
    }


}
