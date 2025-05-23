package com.code.mvc.controllers;

import com.code.mvc.models.Customer;
import com.code.mvc.services.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer/")
public class CustomerController {

    @Autowired
    CustomerServiceInterface customerService;

    @GetMapping(value = "/")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @GetMapping(value = "{id}")
    public Customer getCustomerById(@PathVariable("id") long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping(value = "create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    // Update endpoint: include the 'id' in the URL to identify the customer
    @PutMapping(value = "update/{id}")
    public Customer updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteCustomer(@PathVariable("id") long id) {
        return customerService.deleteCustomer(id);
    }
}
