package com.buyukli.ivan.dao;

import com.buyukli.ivan.entities.Customer;
import org.hibernate.Session;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao{
    private SessionFactoryUtils sessionFactoryUtils;

    public CustomerDaoImpl(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    @Override
    public Customer findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            Customer customer = session.get(Customer.class, id);
            session.getTransaction().commit();
            return customer;
        }
    }

    @Override
    public Customer findByName(String title) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            Customer customer = session.get(Customer.class, title);
            session.getTransaction().commit();
            return customer;
        }
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void updateNameById(Long id, String newName) {

    }
}
