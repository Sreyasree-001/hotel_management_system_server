package com.code.mvc.services;

import com.code.mvc.models.Customer;
import com.code.mvc.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CustomerServiceInterface{
    @Autowired
    CustomerRepository customerRepo;

    @Override
    public Customer createCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    @Override
    public Customer updateCustomer(long id, Customer customer) {
        Optional<Customer> existingCustomer = customerRepo.findById(id);
        if (existingCustomer.isPresent()) {
            Customer updatedCustomer = existingCustomer.get();
            updatedCustomer.setCustomerName(customer.getCustomerName());
            updatedCustomer.setCustomerEmail(customer.getCustomerEmail());
            updatedCustomer.setPhoneNo(customer.getPhoneNo());
            updatedCustomer.setAddress(customer.getAddress());
            return customerRepo.save(updatedCustomer);
        }
        return null;
    }


    @Override
    public String deleteCustomer(long id){
        Optional<Customer> customer = customerRepo.findById(id);
        if(customer.isPresent()){
            Customer c = customer.get();
            //delete
            customerRepo.delete(c);
            return "Customer is deleted successfully";
        }
        return "Customer with id " + id + "is not found!";
    }

    @Override
    public Customer getCustomerById(long id){
        Optional<Customer> opCustomer = customerRepo.findById(id);
        return (Customer) opCustomer.orElse(null);
    }

    @Override
    public List<Customer> getAllCustomer(){
        return customerRepo.findAll();
    }
}
