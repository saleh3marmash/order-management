package com.assignment2.assignment2.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication
public class OrderController {
     private final OrderServices orderServices;
     @Autowired
    public OrderController(OrderServices orderServices) {
        this.orderServices = orderServices;
    }
     @GetMapping("api/getOrders")
    public List<Order> getOrders() {
        return orderServices.getOrders();
    }
    @PostMapping("api/addOrder")
    public String addOrder(@RequestBody Order order) {
            orderServices.addOrder(order);
            return ("Added Order Successfully");
}
@GetMapping("api/getOrder/{id}")
    public Optional<Order> getOrderById(@PathVariable("id") int id) {
        return orderServices.getOrderById(id);
    }
    
    @DeleteMapping("api/deleteOrder/{id}")
    public String deleteOrder(@PathVariable("id") int id) {
        try {
            orderServices.deleteOrder(id);
            return "Order deleted successfully";
        } catch (Exception e) {
            return "There was an error deleting that order";
        }
}
}
