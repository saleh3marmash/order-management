package com.assignment2.assignment2.customer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRegistry extends JpaRepository<Customer,Integer> {
  
}
