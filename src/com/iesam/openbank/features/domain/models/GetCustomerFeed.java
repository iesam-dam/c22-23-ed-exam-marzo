package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.Customer;
public class GetCustomerFeed {

    private CustomerRepository customerRepository;

    public GetCustomerFeed(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer execute(String idCustomer){
        return this.customerRepository.obtainCustomer(idCustomer);
    }
}
