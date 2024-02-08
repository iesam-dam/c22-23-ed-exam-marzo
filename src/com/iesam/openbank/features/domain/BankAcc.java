package com.iesam.openbank.features.domain;

import java.util.ArrayList;

public class BankAcc {

    private String numeroCuenta;
    private Customer customer;
    private ArrayList<Movements> movements;
    private Producto producto;
    private Double saldo;

    public BankAcc(String numeroCuenta, Customer customer, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.customer = customer;
        this.movements = new ArrayList<>();
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Movements> getMovements() {
        return movements;
    }

    public void setMovements(ArrayList<Movements> movements) {
        this.movements = movements;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void addMovements(Movements transacciones){
        movements.add(transacciones);
        setSaldo(getSaldo() + transacciones.getImporte());
    }

    public void contratar (Producto productoCont){
        this.producto = productoCont;
    }

    @Override
    public String toString() {
        return "BankAcc{" +
                "numero de cuenta = " + numeroCuenta +
                " || cliente = " + customer +
                " || movimiento = " + movements +
                " || producto = " + producto +
                " || saldo = " + saldo +
                '}';
    }
}
