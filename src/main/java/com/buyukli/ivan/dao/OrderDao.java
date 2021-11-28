package com.buyukli.ivan.dao;

import com.buyukli.ivan.entities.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderDao {
    Order findById(Long id);
    List<Order> findAll();
    void save(Order order);
}
