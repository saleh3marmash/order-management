package com.assignment2.assignment2.customer;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assignment2.assignment2.customer.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Service
@SpringBootApplication
public class CustomerServices {
    private final CustomerRegistry customerRegistry;

    @Autowired
    public CustomerServices(CustomerRegistry customerRegistry) {
        this.customerRegistry = customerRegistry;
    }

    public List<Customer> getCustomers() {
        // get all customers
        return customerRegistry.findAll();
    }

    public void addCustomer(Customer customer) {
        // add if info is right (try and catch before checks)
        customerRegistry.save(customer);
    }

    public void deleteCustomer(int id) {
            customerRegistry.deleteById(id);
    }

    public Optional<Customer> getCustomerById(int id) {
        //find by id if exists
        Optional<Customer> customer = customerRegistry.findById(id);
        return customer;
    }

    public void changeName(int id, String name) {
        Optional<Customer> optionalCustomer = customerRegistry.findById(id);
        Customer customer = optionalCustomer.orElse(null);
         if (customer != null) {
             customer.setFirstName(name);
             customerRegistry.save(customer);
         }
    }
}
