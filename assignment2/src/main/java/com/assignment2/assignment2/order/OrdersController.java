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
public class OrdersController {
     private final OrdersServices orderServices;
     @Autowired
    public OrdersController(OrdersServices orderServices) {
        this.orderServices = orderServices;
    }
     @GetMapping("api/getOrderss")
    public List<Orders> getOrderss() {
        return orderServices.getOrderss();
    }
    @PostMapping("api/addOrders")
    public String addOrders(@RequestBody Orders order) {
            orderServices.addOrders(order);
            return ("Added Orders Successfully");
}
@GetMapping("api/getOrders/{id}")
    public Optional<Orders> getOrdersById(@PathVariable("id") int id) {
        return orderServices.getOrdersById(id);
    }
    
    @DeleteMapping("api/deleteOrders/{id}")
    public String deleteOrders(@PathVariable("id") int id) {
        try {
            orderServices.deleteOrders(id);
            return "Orders deleted successfully";
        } catch (Exception e) {
            return "There was an error deleting that order";
        }
}
}
