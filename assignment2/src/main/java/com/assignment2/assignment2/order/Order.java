package com.assignment2.assignment2.order;

import java.time.LocalDateTime;

import com.assignment2.assignment2.customer.Customer;
import com.assignment2.assignment2.product_order.Product_Order;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table
@Embeddable
public class Order {
    public Order(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    LocalDateTime orderedAt;
    @ElementCollection
    Product_Order product_Order;
    @OneToOne
    @JoinColumn(name = "customerId", referencedColumnName = "id",nullable = false)
    Customer customer;


     

    public Order(int id, int customerId, LocalDateTime orderedAt) {
        this.id = id;
        this.orderedAt = orderedAt;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }
    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }
}
