package com.example.ecommerce.controller;



import com.example.ecommerce.model.OrderEntity;
import com.example.ecommerce.service.OrderService;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public OrderEntity getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

   
    @PostMapping
    public String placeOrder(@RequestBody OrderEntity order) {
        orderService.placeOrder(order.getUsername(), order.getProductName(), order.getPrice());
        return "Order placed successfully!";
    }
    @PostMapping("/place")
    public String placeOrder(@RequestParam String username,
                             @RequestParam String productName,
                             @RequestParam BigDecimal price) {
        orderService.placeOrder(username, productName, price);
        return "Order placed successfully!";
    }


    
    
    
}

