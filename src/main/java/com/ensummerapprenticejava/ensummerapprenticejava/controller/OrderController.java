package com.ensummerapprenticejava.ensummerapprenticejava.controller;

import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Orders;
import com.ensummerapprenticejava.ensummerapprenticejava.service.EventServiceImplementation;
import com.ensummerapprenticejava.ensummerapprenticejava.service.OrderServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

//    @PostMapping("/api/orders")
//    public ResponseEntity<Orders> registerOrder(@RequestBody OrderRequest orderRequest){
//        return new ResponseEntity<>(orderService.registerOrder(orderRequest), HttpStatus.CREATED);
//    }


}
