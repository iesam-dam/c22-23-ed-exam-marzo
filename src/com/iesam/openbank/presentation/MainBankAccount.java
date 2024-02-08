package com.iesam.openbank.presentation;

import com.iesam.openbank.data.BankDataRepository;
import com.iesam.openbank.domain.*;

public class MainBankAccount {
    public static void createBankAccount(BankAccount bankAccount){
        SaveBankAccountUseCase bankAccountUseCase= new SaveBankAccountUseCase(BankDataRepository.newInstance());
        bankAccountUseCase.execute(bankAccount);
    }
    public static void createCustomer(Customer customer, BankAccount bankAccount){
        SaveCustomerUseCase saveCustomerUseCase= new SaveCustomerUseCase(BankDataRepository.newInstance());
        saveCustomerUseCase.execute(customer,bankAccount);
    }
    public static void createTransaction(Transaction transaction){
        SaveTransactionUseCase saveTransactionUseCase= new SaveTransactionUseCase(BankDataRepository.newInstance());
        saveTransactionUseCase.execute(transaction);
    }
    public static void createMortgage(Mortgage mortgage){
        SaveMortgageUseCase saveMortgageUseCase=new SaveMortgageUseCase(BankDataRepository.newInstance());
        saveMortgageUseCase.execute(mortgage);
    }
    public static void getCustomer(String dni){
        GetCustomerUseCase getCustomerUseCase= new GetCustomerUseCase(BankDataRepository.newInstance());
        Customer customer=getCustomerUseCase.execute(dni);
        System.out.println(customer.toString());

    }
}
