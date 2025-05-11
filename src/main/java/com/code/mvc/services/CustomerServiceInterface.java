package com.code.mvc.services;

import com.code.mvc.models.Customer;

import java.util.List;

public interface CustomerServiceInterface {
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(long id,Customer customer);
    public String deleteCustomer(long id);
    public Customer getCustomerById(long id);
    public List<Customer> getAllCustomer();
}
