package com.ensummerapprenticejava.ensummerapprenticejava.service;

import com.ensummerapprenticejava.ensummerapprenticejava.controller.OrderRequest;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Event;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Orders;
import com.ensummerapprenticejava.ensummerapprenticejava.model.TicketCategory;
import com.ensummerapprenticejava.ensummerapprenticejava.repository.CustomerRepository;
import com.ensummerapprenticejava.ensummerapprenticejava.repository.EventRepository;
import com.ensummerapprenticejava.ensummerapprenticejava.repository.OrderRepository;
import com.ensummerapprenticejava.ensummerapprenticejava.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImplementation implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;
    @Autowired
  private CustomerRepository customerRepository;

    public OrderServiceImplementation(OrderRepository orderRepository,TicketCategoryRepository ticketCategoryRepository,CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.ticketCategoryRepository=ticketCategoryRepository;
       this.customerRepository=customerRepository;
    }

    @Override
    public List<Orders> DisplayOrders(int custumerId){
        return orderRepository.findByCustomer_customerId(custumerId);
    }

    @Override
    public Orders registerOrder(OrderRequest orderRequest){
        TicketCategory ticketCategory = ticketCategoryRepository.findByTicketCategoryId(orderRequest.getTicketCategoryId());

        Orders order = new Orders(customerRepository.findCustomerByCustomerId(5),ticketCategory,new Date(),orderRequest.getNumberOfTickets(),ticketCategory.getPrice() * orderRequest.getNumberOfTickets());

        return orderRepository.save(order);
    }


}
