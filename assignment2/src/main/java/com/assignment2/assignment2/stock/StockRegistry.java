package com.assignment2.assignment2.stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRegistry extends JpaRepository<Stock,Integer> {
  
}
