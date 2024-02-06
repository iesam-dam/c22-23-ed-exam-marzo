package com.iesam.openbank.domain;

import java.util.ArrayList;

public class BankAccount {
    private final String numberAccount;
    private final Customer customer;
    private ArrayList<Transaction> transaction;
    private ArrayList<Mortgage> mortgages;
    private double amount;

    public BankAccount(String numberAccount, Customer customer, ArrayList<Transaction> transaction, ArrayList<Mortgage> mortgages, double amount) {
        this.numberAccount = numberAccount;
        this.customer = customer;
        this.transaction = transaction;
        this.mortgages = mortgages;
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

    public void setTransaction(ArrayList<Transaction> transaction) {
        this.transaction = transaction;
    }

    public ArrayList<Mortgage> getMortgages() {
        return mortgages;
    }

    public void setMortgages(ArrayList<Mortgage> mortgages) {
        this.mortgages = mortgages;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
