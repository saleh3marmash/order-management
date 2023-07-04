package com.assignment2.assignment2.product_order;
public class Product_Order {
    int productId;
    int orderId;
    int quantity;
    int price;
    int vat;
    public Product_Order(int productId, int orderId, int quantity, int price, int vat) {
        this.productId = productId;
        this.orderId = orderId;
        this.quantity = quantity;
        this.price = price;
        this.vat = vat;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
}
