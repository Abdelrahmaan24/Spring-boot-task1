package com.example.Task2.Services;

import com.example.Task2.Models.Customer;
import com.example.Task2.Repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {

    @Autowired
    CustomerRepo customerRepo;

    public List<Customer> getALlCustomers() {
        return customerRepo.getAllCustomers();
    }

    public Customer addNewCustomer(Customer customer) {
        return customerRepo.addNewCustomer(customer);
    }

    public Customer getCustomerById(int id) {
        return customerRepo.getCustomerById(id);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepo.updateCustomer(customer);
    }

    public void deleteCustomer(int id) {
        customerRepo.deleteCustomer(id);
    }

    public List<Customer> getCustomersByName(String name) {
        return customerRepo.getCustomersByName(name);
    }
}
