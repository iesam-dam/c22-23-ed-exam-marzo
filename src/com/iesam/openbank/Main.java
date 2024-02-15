package com.iesam.openbank;

import com.iesam.openbank.domain.BankAccount;
import com.iesam.openbank.domain.Person.Customer;
import com.iesam.openbank.domain.Mortgage;
import com.iesam.openbank.domain.Transaction;
import com.iesam.openbank.presentation.MainBankAccount;

public class Main {
    public static void main(String[]args){
        Customer customer=new Customer(
                "888",
                "camilo",
                "zuniga",
                "Calle",
                "Avila",
                "05002"
        );
        BankAccount bankAccount=new BankAccount(
                "2",
                customer,
                1500
        );
        MainBankAccount.createCustomer(customer,bankAccount);
        BankAccount bankAccount1=new BankAccount(
                "3",
                customer,
                300
        );
        MainBankAccount.createBankAccount(bankAccount1);
        Transaction transaction= new Transaction(
                "T2",
                "2",
                "",
                -50
        );
        MainBankAccount.createTransaction(transaction);
        Transaction transaction1= new Transaction(
                "T3",
                "3",
                "",
                50
        );
        MainBankAccount.createTransaction(transaction1);
        Mortgage mortgage=new Mortgage(
                "3",
                "M2",
                "Hipoteca",
                "Hipoteca casa",
                "01-01-2024",
                2.5,
                "01-01-2044",
                18000
        );
        MainBankAccount.createMortgage(mortgage);
        MainBankAccount.getCustomer("1");
    }
}
