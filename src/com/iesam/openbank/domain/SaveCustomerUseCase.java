package com.iesam.openbank.domain;

import com.iesam.openbank.domain.Person.Customer;

public class SaveCustomerUseCase {
    private final BankRepository bankRepository;

    public SaveCustomerUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }
    public void execute(Customer customer, BankAccount bankAccount){
        this.bankRepository.createCustomer(customer, bankAccount);
    }
}
