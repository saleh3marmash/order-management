package com.assignment2.assignment2.stock;

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
public class StockController {
     private final StockServices stockServices;
     @Autowired
    public StockController(StockServices stockServices) {
        this.stockServices = stockServices;
    }
     @GetMapping("api/getStocks")
    public List<Stock> getStocks() {
        return stockServices.getStocks();
    }
    @PostMapping("api/addStock")
    public String addStock(@RequestBody Stock stock) {
            stockServices.addStock(stock);
            return ("Added Stock Successfully");
}
@GetMapping("api/getStock/{id}")
    public Optional<Stock> getStockById(@PathVariable("id") int id) {
        return stockServices.getStockById(id);
    }
    @PutMapping("api/changeStockQuantity/{id}/{quantity}")
    public String changeQuantity(@PathVariable("id") int id, @PathVariable("quantity") int quantity) {
        try {
            stockServices.changeQuantity(id, quantity);
            return ("Name changed Successfully");
        } catch (Exception e) {
            return ("There's no such ID");
        }
    }
    @DeleteMapping("api/deleteStock/{id}")
    public String deleteStock(@PathVariable("id") int id) {
        try {
            stockServices.deleteStock(id);
            return "Stock deleted successfully";
        } catch (Exception e) {
            return "There was an error deleting that stock";
        }
}
}
