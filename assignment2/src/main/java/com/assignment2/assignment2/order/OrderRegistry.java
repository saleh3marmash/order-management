package com.assignment2.assignment2.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRegistry extends JpaRepository<Product,Integer> {
  
}
