package com.assignment2.assignment2.customer;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CustomerRegistry customerRegistry){
        return args -> {
                LocalDate ld=LocalDate.of(2023, 7, 1);
                Customer customer1=new Customer(0, "Test", "Hasan",ld);
                customerRegistry.saveAll(List.of(customer1));
        };
    }
}
