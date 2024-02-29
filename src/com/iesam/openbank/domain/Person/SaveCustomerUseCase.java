package com.iesam.openbank.domain.Person;

import com.iesam.openbank.domain.BankAccount;
import com.iesam.openbank.domain.BankRepository;
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
