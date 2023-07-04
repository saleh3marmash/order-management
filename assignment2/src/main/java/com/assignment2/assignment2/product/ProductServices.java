package com.assignment2.assignment2.product;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assignment2.assignment2.product.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Service
@SpringBootApplication
public class ProductServices {
    private final ProductRegistry productRegistry;

    @Autowired
    public ProductServices(ProductRegistry productRegistry) {
        this.productRegistry = productRegistry;
    }

    public List<Product> getProducts() {
        // get all products
        return productRegistry.findAll();
    }

    public void addProduct(Product product) {
        // add if info is right (try and catch before checks)
        productRegistry.save(product);
    }

    public void deleteProduct(int id) {
            productRegistry.deleteById(id);
    }

    public Optional<Product> getProductById(int id) {
        //find by id if exists
        Optional<Product> product = productRegistry.findById(id);
        return product;
    }

    public void changeName(int id, String name) {
        Optional<Product> optionalProduct = productRegistry.findById(id);
        Product product = optionalProduct.orElse(null);
         if (product != null) {
             product.setName(name);
             productRegistry.save(product);
         }
    }
}
