package services;

import models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
