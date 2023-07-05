package com.assignment2.assignment2.order;

import java.time.LocalDateTime;
import java.util.List;

import com.assignment2.assignment2.customer.Customer;
import com.assignment2.assignment2.product.Product;
import com.assignment2.assignment2.product_order.Product_Order;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table
public class Orders {
    public Orders(){
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    LocalDateTime orderedAt;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    Customer customer;
     @OneToMany(mappedBy = "orders")
    List<Product_Order> product_order;

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
   
    public List<Product_Order> getProduct_order() {
        return product_order;
    }
    public void setProduct_order(List<Product_Order> product_order) {
        this.product_order = product_order;
    }
}
