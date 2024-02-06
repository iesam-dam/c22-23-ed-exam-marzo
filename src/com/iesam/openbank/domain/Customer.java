package com.iesam.openbank.domain;

public class Customer {
    private final String dni;
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
}
