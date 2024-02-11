package com.iesam.openbank.features.data;

import com.iesam.openbank.features.domain.Customer;
import com.iesam.openbank.features.domain.models.CustomerRepository;

import java.util.ArrayList;

public class CustomerDataRepository implements CustomerRepository {

    private ArrayList<Customer> localCustomer = new ArrayList<>();
    private static CustomerDataRepository instance = null;

    public static CustomerDataRepository newInstance() {
        if (instance == null)
            instance = new CustomerDataRepository();
        return instance;
    }

    @Override
    public Customer obtainCustomer(String id) {
        for (Customer customer : localCustomer)
            if (customer.getDni().equals(id))
                return customer;
        return null;
    }

    @Override
    public void saveCustomer(Customer customer) {
        localCustomer.add(customer);
    }
}
