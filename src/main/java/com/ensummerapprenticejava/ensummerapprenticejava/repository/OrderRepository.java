package com.ensummerapprenticejava.ensummerapprenticejava.repository;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Customer;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer>{

  List<Orders> findByCustomer_customerId(int customerId);

}
