package com.iesam.openbank.domain;

import com.iesam.openbank.domain.BankProducts.Mortgage;
import com.iesam.openbank.domain.Person.Customer;

import java.util.ArrayList;

public class BankAccount {
    private final String numberAccount;
    private final Customer customer;
    private ArrayList<Transaction> transaction=new ArrayList<>();
    private ArrayList<Mortgage> mortgages=new ArrayList<>();
    private double amount;

    public BankAccount(String numberAccount, Customer customer, double amount) {
        this.numberAccount = numberAccount;
        this.customer = customer;
        this.amount = amount;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction.add(transaction);
    }

    public ArrayList<Mortgage> getMortgages() {
        return mortgages;
    }

    public void setMortgages(Mortgage mortgages) {
        this.mortgages.add(mortgages);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "numberAccount='" + numberAccount + '\'' +
                ", customer=" + customer + '\'' +
                ", transaction=\n" + transaction +
                ",\n mortgages=\n" + mortgages +
                ",\n amount=" + amount +
                '}';
    }

}
