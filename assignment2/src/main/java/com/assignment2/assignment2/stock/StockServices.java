package com.assignment2.assignment2.stock;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Service
@SpringBootApplication
public class StockServices {
    private final StockRegistry stockRegistry;

    @Autowired
    public StockServices(StockRegistry stockRegistry) {
        this.stockRegistry = stockRegistry;
    }

    public List<Stock> getStocks() {
        // get all stocks
        return stockRegistry.findAll();
    }

    public void addStock(Stock stock) {
        // add if info is right (try and catch before checks)
        stockRegistry.save(stock);
    }

    public void deleteStock(int id) {
            stockRegistry.deleteById(id);
    }

    public Optional<Stock> getStockById(int id) {
        //find by id if exists
        Optional<Stock> stock = stockRegistry.findById(id);
        return stock;
    }

    public void changeQuantity(int id, int quantity) {
        Optional<Stock> optionalStock = stockRegistry.findById(id);
        Stock stock = optionalStock.orElse(null);
         if (stock != null) {
             stock.setQuantity(quantity);
             stockRegistry.save(stock);
         }
    }
}
