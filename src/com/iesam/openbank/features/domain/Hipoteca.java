package com.iesam.openbank.features.domain;

public class Hipoteca extends Producto{

    private String fechaInicio;
    private double interes;
    private String fechaFin;
    private Double importe;

    public Hipoteca(String id, String nombre, String descripcion, String fechaInicio, double interes, String fechaFin, Double importe) {
        super(id, nombre, descripcion);
        this.fechaInicio = fechaInicio;
        this.interes = interes;
        this.fechaFin = fechaFin;
        this.importe = importe;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
}
