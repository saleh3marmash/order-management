package com.assignment2.assignment2.product_order;

import com.assignment2.assignment2.product.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import com.assignment2.assignment2.order.Orders;
    @Entity
    @Table
public class Product_Order {
     @Id
    int id;
    @ManyToOne
    @JoinColumn(name = "productId")
    Product product;
    @JoinColumn(name = "orderId")
    @ManyToOne
    Orders orders;
    int quantity;
    @Column(columnDefinition = "DECIMAL(10,2)")
    int price;
    @Column(columnDefinition = "DECIMAL(10,2)")
    int vat;
    public Product_Order( int quantity, int price, int vat) {
       
        this.quantity = quantity;
        this.price = price;
        this.vat = vat;
    }
    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

   
    
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getVat() {
        return vat;
    }
    public void setVat(int vat) {
        this.vat = vat;
    }
    public Orders getOrder() {
        return orders;
    }
    public void setOrder(Orders orders) {
        this.orders = orders;
    }
}
