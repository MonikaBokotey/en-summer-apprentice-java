package com.ensummerapprenticejava.ensummerapprenticejava.repository;

import com.ensummerapprenticejava.ensummerapprenticejava.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

        //List<Orders> findByCustomer_customerId(int customerId);

//@Query("select o.customer from orders o where o.customer.customerId=?1")
  Customer findCustomerByCustomerId(int customerId);

          }
