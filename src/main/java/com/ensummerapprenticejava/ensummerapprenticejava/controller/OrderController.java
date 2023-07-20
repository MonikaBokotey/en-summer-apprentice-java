package com.ensummerapprenticejava.ensummerapprenticejava.controller;

import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Orders;
import com.ensummerapprenticejava.ensummerapprenticejava.service.EventServiceImplementation;
import com.ensummerapprenticejava.ensummerapprenticejava.service.OrderServiceImplementation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private OrderServiceImplementation orderService;

    public OrderController(OrderServiceImplementation orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/api/orders")
    public List<Orders> getOrders(){
        return orderService.DisplayOrders(4);
    }
}
