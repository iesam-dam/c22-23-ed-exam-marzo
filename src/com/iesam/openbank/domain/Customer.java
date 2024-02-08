package com.iesam.openbank.domain;

import java.util.ArrayList;

public class Customer {
    private final String dni;
    private ArrayList<BankAccount> bankAccount= new ArrayList<>();
    private String name;
    private String lastName;
    private String adress;
    private String population;
    private String postalCode;

    public Customer(String dni, String name, String lastName, String adress, String population, String postalCode) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.population = population;
        this.postalCode = postalCode;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
                "dni='" + dni + '\'' +
                ", bankAccount=\n" + bankAccount +
                ",\n name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress='" + adress + '\'' +
                ", population='" + population + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
