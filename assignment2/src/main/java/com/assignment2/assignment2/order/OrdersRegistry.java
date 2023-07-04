package com.assignment2.assignment2.order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRegistry extends JpaRepository<Orders,Integer> {
  
}
