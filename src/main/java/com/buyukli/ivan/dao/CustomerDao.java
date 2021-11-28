package com.buyukli.ivan.dao;

import com.buyukli.ivan.entities.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerDao {
    Customer findById(Long id);
    Customer findByName(String title);
    List<Customer> findAll();
    void save(Customer customer);
    void updateNameById(Long id, String newName);
}
