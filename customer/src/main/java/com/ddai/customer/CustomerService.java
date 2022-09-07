package com.ddai.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public Customer create(Customer customer) {
        return customerRepository.save(customer);    
    }

    public Customer getCustomer(int id) {
        return customerRepository.findById(id).get();
    }
}
