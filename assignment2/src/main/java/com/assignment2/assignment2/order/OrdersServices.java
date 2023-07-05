package com.assignment2.assignment2.order;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Service
@SpringBootApplication
public class OrdersServices {
    private final OrdersRegistry orderRegistry;

    @Autowired
    public OrdersServices(OrdersRegistry orderRegistry) {
        this.orderRegistry = orderRegistry;
    }

    public List<Orders> getOrders() {
        // get all orders
        return orderRegistry.findAll();
    }

    public void addOrders(Orders order) {
        // add if info is right (try and catch before checks)
        orderRegistry.save(order);
    }

    public void deleteOrders(int id) {
            orderRegistry.deleteById(id);
    }

    public Optional<Orders> getOrdersById(int id) {
        //find by id if exists
        Optional<Orders> order = orderRegistry.findById(id);
        return order;
    }

}
