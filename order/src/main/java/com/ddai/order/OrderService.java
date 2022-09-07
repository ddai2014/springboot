package com.ddai.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired private OrderRepository orderRepository;

    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public Order create(Order order) {
        return orderRepository.save(order);    
    }

    public Order getOrder(int id) {
        return orderRepository.findById(id).get();
    }
}
