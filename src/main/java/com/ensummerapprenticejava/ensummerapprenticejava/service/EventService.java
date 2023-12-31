package com.ensummerapprenticejava.ensummerapprenticejava.service;

import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Venue;
import com.ensummerapprenticejava.ensummerapprenticejava.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {

List<Event> findEventByVenueIdAndType(int venueId, String typeName);

}
