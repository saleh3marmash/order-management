package com.assignment2.assignment2.customer;

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
public class CustomerController {
     private final CustomerServices customerServices;
     @Autowired
    public CustomerController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }
     @GetMapping("api/getCustomers")
    public List<Customer> getCustomers() {
        return customerServices.getCustomers();
    }
    @PostMapping("api/addCustomer")
    public String addCustomer(@RequestBody Customer customer) {
            customerServices.addCustomer(customer);
            return ("Added Customer Successfully");
}
@GetMapping("api/getCustomer/{id}")
    public Optional<Customer> getCustomerById(@PathVariable("id") int id) {
        return customerServices.getCustomerById(id);
    }
    @PutMapping("api/changeCustomerName/{id}/{name}")
    public String changeName(@PathVariable("id") int id, @PathVariable("name") String name) {
        try {
            customerServices.changeName(id, name);
            return ("Name changed Successfully");
        } catch (Exception e) {
            return ("There's no such ID");
        }
    }
    @DeleteMapping("api/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable("id") int id) {
        try {
            customerServices.deleteCustomer(id);
            return "Customer deleted successfully";
        } catch (Exception e) {
            return "There was an error deleting that customer";
        }
}
    @GetMapping
    public String home(){
        return "This is a web-services test project";
    }
}
