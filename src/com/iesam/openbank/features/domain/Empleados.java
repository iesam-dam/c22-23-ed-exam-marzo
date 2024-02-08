package com.iesam.openbank.features.domain;

public class Empleados {

    private String dni;
    private String nombre;
    private String apellidos;
    private String numeroSS;

    public Empleados(String dni, String nombre, String apellidos, String numeroSS) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroSS = numeroSS;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(String numeroSS) {
        this.numeroSS = numeroSS;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroSS='" + numeroSS + '\'' +
                '}';
    }
}
