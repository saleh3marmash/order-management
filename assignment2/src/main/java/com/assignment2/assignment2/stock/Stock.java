package com.assignment2.assignment2.stock;

import java.time.LocalDateTime;

import com.assignment2.assignment2.product.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table
public class Stock {
    public Stock(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    
    int quantity;
    @Column(name = "date_time")
    LocalDateTime updateAt;
    @OneToOne(targetEntity=Product.class)
    @JoinColumn(name = "productId", referencedColumnName = "id",nullable = false)
    Product product;
    
    public Stock(int id, int productId, int quantity, LocalDateTime updateAt) {
        this.id = id;
        this.quantity = quantity;
        this.updateAt = updateAt;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public LocalDateTime getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
