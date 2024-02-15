package com.iesam.openbank.domain.Person;

import com.iesam.openbank.domain.BankAccount;

import java.util.ArrayList;

public class Customer extends Person{
    private ArrayList<BankAccount> bankAccount= new ArrayList<>();
    private String adress;
    private String population;
    private String postalCode;

    public Customer(String dni, String name, String lastName, String adress, String population, String postalCode) {
        super(dni, name, lastName);
        this.adress = adress;
        this.population = population;
        this.postalCode = postalCode;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public ArrayList<BankAccount> getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount.add(bankAccount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "bankAccount=" + bankAccount +
                ", adress='" + adress + '\'' +
                ", population='" + population + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
