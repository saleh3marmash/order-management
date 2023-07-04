package com.assignment2.assignment2.product;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class ProductConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProductRegistry productRegistry){
        return args -> {
                Product product1=new Product(0, "hello", "Saleh", "Told you", new BigDecimal(5.00), new BigDecimal(1.00), false);
                productRegistry.saveAll(List.of(product1));
        };
    }
}
