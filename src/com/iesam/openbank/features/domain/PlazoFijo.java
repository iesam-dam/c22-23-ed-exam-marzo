package com.iesam.openbank.features.domain;

public class PlazoFijo extends Producto{


    private String duracionMeses;
    private double interes;

    public PlazoFijo(String id, String nombre, String descripcion, String duracionMeses, double interes) {
        super(id, nombre, descripcion);
        this.duracionMeses = duracionMeses;
        this.interes = interes;
    }

    public String getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(String duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
