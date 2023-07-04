package com.assignment2.assignment2.order;

import java.time.LocalDateTime;

import com.assignment2.assignment2.customer.Customer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table
public class Orders {
    public Orders(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    LocalDateTime orderedAt;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId", referencedColumnName = "id",nullable = false)
    Customer customer;

     

    public Orders(int id) {
        this.id = id;
        this.orderedAt = LocalDateTime.now();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getOrdersedAt() {
        return orderedAt;
    }
    public void setOrdersedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }
}
