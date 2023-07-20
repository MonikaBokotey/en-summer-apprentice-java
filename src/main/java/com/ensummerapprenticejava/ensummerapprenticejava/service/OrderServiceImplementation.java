package com.ensummerapprenticejava.ensummerapprenticejava.service;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Orders;
import com.ensummerapprenticejava.ensummerapprenticejava.repository.EventRepository;
import com.ensummerapprenticejava.ensummerapprenticejava.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplementation implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    public OrderServiceImplementation(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Orders> DisplayOrders(int custumerId){
        return orderRepository.findByCustomer_customerId(custumerId);
    }

}
