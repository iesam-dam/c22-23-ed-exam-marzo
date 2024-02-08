package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.Customer;

public interface CustomerRepository {
    Customer obtainCustomer(String id);

    void saveCustomer(Customer customer);
}
