package com.example.Task2.Repos;


import com.example.Task2.Models.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepo {

    List<Customer> customers = new ArrayList<>();

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer addNewCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public Customer getCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public Customer updateCustomer(Customer customer) {
        int id = customer.getId();
        Customer c = getCustomerById(id);
        if (c != null) {
            c.setName(customer.getName());
            c.setEmail(customer.getEmail());
            return c;
        }
        return null;
    }

    public void deleteCustomer(int id) {
        Customer customer = getCustomerById(id);
        if (customer != null) {
            customers.remove(customer);
        }
    }

    public List<Customer> getCustomersByName(String name) {
        List<Customer> newCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                newCustomers.add(customer);
            }
        }
        return newCustomers;
    }
}
