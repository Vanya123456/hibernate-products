package com.buyukli.ivan.dao;

import com.buyukli.ivan.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductDao {
    Product findById(Long id);
    Product findByTitle(String title);
    List<Product> findAll();
    Product saveOrUpdate(Product product);
    void updateTitleById(Long id, String newTitle);
    void delete(Long id);
    void delete(Product product);

}
