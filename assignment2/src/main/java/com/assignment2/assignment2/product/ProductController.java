package com.assignment2.assignment2.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication
public class ProductController {
     private final ProductServices productServices;
     @Autowired
    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }
     @GetMapping("api/getProducts")
    public List<Product> getProducts() {
        return productServices.getProducts();
    }
    @PostMapping("api/addProduct")
    public String addProduct(@RequestBody Product product) {
            productServices.addProduct(product);
            return ("Added Product Successfully");
}
@GetMapping("api/getProduct/{id}")
    public Optional<Product> getProductById(@PathVariable("id") int id) {
        return productServices.getProductById(id);
    }
    @PutMapping("api/changeProductName/{id}/{name}")
    public String changeName(@PathVariable("id") int id, @PathVariable("name") String name) {
        try {
            productServices.changeName(id, name);
            return ("Name changed Successfully");
        } catch (Exception e) {
            return ("There's no such ID");
        }
    }
    @DeleteMapping("api/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") int id) {
        try {
            productServices.deleteProduct(id);
            return "Product deleted successfully";
        } catch (Exception e) {
            return "There was an error deleting that product";
        }
}
}
