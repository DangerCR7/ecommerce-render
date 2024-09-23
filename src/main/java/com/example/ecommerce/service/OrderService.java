package com.example.ecommerce.service;



import com.example.ecommerce.model.OrderEntity;
import com.example.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderEntity getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public OrderEntity placeOrder(OrderEntity order) {
        return orderRepository.save(order);
    }
    public void placeOrder(String username, String productName, BigDecimal price) {
        OrderEntity order = new OrderEntity();
        order.setUsername(username);
        order.setProductName(productName);
        order.setPrice(price);
        orderRepository.save(order);
    
}
    
    
}
