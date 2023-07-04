package com.assignment2.assignment2.order;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Order {
    public Order(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Id
    int customerId;
     LocalDateTime orderedAt;
    public Order(int id, int customerId, LocalDateTime orderedAt) {
        this.id = id;
        this.customerId = customerId;
        this.orderedAt = orderedAt;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }
    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }
}
