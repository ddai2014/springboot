package com.ddai.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired private CustomerService customerService;

    public void setOrderService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        System.out.println("Customer is " + customer);
        return customerService.create(customer);
    }
}
