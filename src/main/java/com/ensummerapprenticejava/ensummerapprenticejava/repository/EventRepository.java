package com.ensummerapprenticejava.ensummerapprenticejava.repository;

import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer>{


     List<Event> findByVenue_VenueIdAndEventType_EventTypeName(int venueId, String eventTypeName);


}
