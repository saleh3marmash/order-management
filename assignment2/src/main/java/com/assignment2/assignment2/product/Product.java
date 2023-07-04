package com.assignment2.assignment2.product;

import java.math.BigDecimal;

import com.assignment2.assignment2.product_order.Product_Order;
import com.assignment2.assignment2.stock.Stock;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
@Embeddable
public class Product {
    public Product(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(columnDefinition = "TINYTEXT")
    String slug;
    @Column(columnDefinition = "TINYTEXT")
    String name;
    @Column(columnDefinition = "TINYTEXT")
    String reference;
    @Column(columnDefinition = "DECIMAL(10,2)")
    BigDecimal price;
    @Column(columnDefinition = "DECIMAL(10,2)")
    BigDecimal vat;
    boolean stockable;

    @ElementCollection
    Stock stock;
    @ElementCollection
    Product_Order product_order;
    public Product(int id, String slug, String name, String reference, BigDecimal price, BigDecimal vat, boolean stockable) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.reference = reference;
        this.price = price;
        this.vat = vat;
        this.stockable = stockable;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    
    public boolean isStockable() {
        return stockable;
    }
    public void setStockable(boolean stockable) {
        this.stockable = stockable;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getVat() {
        return vat;
    }
    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }
    
}
