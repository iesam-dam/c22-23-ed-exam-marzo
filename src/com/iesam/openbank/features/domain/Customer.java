package com.iesam.openbank.features.domain;

public class Customer {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String poblacion;
    private String codigoPostal;

    public Customer(String dni, String nombre, String apellidos, String direccion, String poblacion, String codigoPostal) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.codigoPostal = codigoPostal;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "dni = " + dni +
                " || nombre = " + nombre +
                " || apellidos = " + apellidos +
                " || direccion = " + direccion +
                " || poblacion = " + poblacion +
                " || codigo postal = " + codigoPostal +
                '}';
    }
}
