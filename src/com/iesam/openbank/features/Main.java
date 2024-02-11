package com.iesam.openbank.features;

import com.iesam.openbank.features.domain.BankAcc;
import com.iesam.openbank.features.domain.Customer;
import com.iesam.openbank.features.domain.Movements;
import com.iesam.openbank.features.domain.Producto;
import com.iesam.openbank.features.presentation.MainBanco;

public class Main {
    public static void main(String[] args){


        /*MainBanco.menu();*/
        Customer customer;
        MainBanco.createCustomer(customer =new Customer("024", "Pedro", "PeSer", "Rafaela", "Avila", "05002"));

        BankAcc cuenta1;
        MainBanco.createBankAcc(cuenta1 = new BankAcc("1234", customer, 200.00));

        cuenta1.setCustomer(customer);

        Producto hipoteca;
        MainBanco.createProduct(hipoteca = new Producto("1", "Hipoteca", "Descrp hipoteca"));

        Movements retirar;
        MainBanco.createMovements(retirar = new Movements("4", "Retirada", -40.00));

        Movements ingresar;
        MainBanco.createMovements(ingresar = new Movements("5", "Ingreso", 80.00));

        MainBanco.printBankAcc("1234");
        cuenta1.addMovements(retirar);
        MainBanco.printBankAcc("1234");
        cuenta1.addMovements(ingresar);
        MainBanco.printBankAcc("1234");
        cuenta1.addProduct(hipoteca);
        MainBanco.printBankAcc("1234");
    }
}
