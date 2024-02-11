package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.Customer;

public class SaveCustomerFeed {

    private CustomerRepository customerRepository;

    public SaveCustomerFeed(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(Customer customer){
        this.customerRepository.saveCustomer(customer);
    }
}
