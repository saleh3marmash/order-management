package com.assignment2.assignment2.order;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Service
@SpringBootApplication
public class OrderServices {
    private final OrderRegistry orderRegistry;

    @Autowired
    public OrderServices(OrderRegistry orderRegistry) {
        this.orderRegistry = orderRegistry;
    }

    public List<Order> getOrders() {
        // get all orders
        return orderRegistry.findAll();
    }

    public void addOrder(Order order) {
        // add if info is right (try and catch before checks)
        orderRegistry.save(order);
    }

    public void deleteOrder(int id) {
            orderRegistry.deleteById(id);
    }

    public Optional<Order> getOrderById(int id) {
        //find by id if exists
        Optional<Order> order = orderRegistry.findById(id);
        return order;
    }

}
