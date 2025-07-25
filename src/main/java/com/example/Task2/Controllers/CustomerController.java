package com.example.Task2.Controllers;

import com.example.Task2.Models.Customer;
import com.example.Task2.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerServices customerServices;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerServices.getALlCustomers();
    }

    @PostMapping
    public Customer addNewCustomer(@RequestBody Customer customer) {
        return customerServices.addNewCustomer(customer);
    }

    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable int id) {
        return customerServices.getCustomerById(id);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerServices.updateCustomer(customer);
    }


    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerServices.deleteCustomer(id);
    }


    @GetMapping("name")
    public List<Customer> getCustomersByName(@RequestParam String name) {
        return customerServices.getCustomersByName(name);
    }
}

