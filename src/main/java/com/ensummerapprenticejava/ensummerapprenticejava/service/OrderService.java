package com.ensummerapprenticejava.ensummerapprenticejava.service;

import com.ensummerapprenticejava.ensummerapprenticejava.controller.OrderRequest;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Orders;
import com.ensummerapprenticejava.ensummerapprenticejava.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

     List<Orders> DisplayOrders(int customerId);

    Orders registerOrder(OrderRequest orderRequest);




}
