package com.iesam.openbank.domain.Person;

import com.iesam.openbank.domain.BankRepository;
import com.iesam.openbank.domain.Person.Customer;

public class GetCustomerUseCase {
    private final BankRepository bankRepository;

    public GetCustomerUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }
    public Customer execute(String dni){
        return this.bankRepository.getCustomer(dni);
    }
}
