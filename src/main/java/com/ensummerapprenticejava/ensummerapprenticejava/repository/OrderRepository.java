package com.ensummerapprenticejava.ensummerapprenticejava.repository;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Orders;
import jakarta.persistence.criteria.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Event, Integer>{

  //Orders findOrder(int id);

}
