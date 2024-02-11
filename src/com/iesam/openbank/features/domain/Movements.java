package com.iesam.openbank.features.domain;

import java.util.SplittableRandom;

public class Movements {

    private String id;
    private String descripcion;
    private Double importe;

    public Movements(String id, String descripcion, Double importe) {
        this.id = id;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }


    @Override
    public String toString() {
        return "Movimientos: {" +
                "Tipo = " + descripcion +
                " || importe = " + importe +
                '}';
    }
}
