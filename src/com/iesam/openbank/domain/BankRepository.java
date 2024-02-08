package com.iesam.openbank.domain;

public interface BankRepository {
    void createBankAccount(BankAccount bankAccount);
    void createCustomer(Customer customer, BankAccount bankAccount);
    void createMortgage(Mortgage mortgage);
    void createTransaction(Transaction transaction);
    Customer getCustomer(String dni);
}
