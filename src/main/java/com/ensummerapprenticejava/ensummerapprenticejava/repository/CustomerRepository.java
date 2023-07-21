package com.ensummerapprenticejava.ensummerapprenticejava.repository;

import com.ensummerapprenticejava.ensummerapprenticejava.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {


  Customer findCustomerByCustomerId(int customerId);

          }
