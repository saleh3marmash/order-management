package com.assignment2.assignment2.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class OrderConfig {
    @Bean
    CommandLineRunner commandLineRunner(OrderRegistry orderRegistry){
        return args -> {
                Order order1=new Order(0,0,LocalDateTime.now());
                orderRegistry.saveAll(List.of(order1));
        };
    }
}
