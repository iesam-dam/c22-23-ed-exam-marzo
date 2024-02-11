package com.iesam.openbank.features.domain;

public class Tarjeta extends Producto{


    private String fechaCad;
    private String numeroTarj;

    public Tarjeta(String id, String nombre, String descripcion, String fechaCad, String numeroTarj) {
        super(id, nombre, descripcion);
        this.fechaCad = fechaCad;
        this.numeroTarj = numeroTarj;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public String getNumeroTarj() {
        return numeroTarj;
    }

    public void setNumeroTarj(String numeroTarj) {
        this.numeroTarj = numeroTarj;
    }
}
