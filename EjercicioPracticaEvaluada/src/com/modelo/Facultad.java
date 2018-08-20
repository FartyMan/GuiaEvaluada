package com.modelo;

/**
 * Nombre de la Clase: Facultad
 * Version: 1.0
 * Fecha de Creación: 18 de Agosto de 2018
 * CopyRight: ITCA-FEPADE
 * @author Benjamín Ramirez
 */
public class Facultad {
    
    private int codigoFacultad;
    private String nombre;
    private String telefono;

    public Facultad() {
    }

    public Facultad(int codigoFacultad, String nombre, String telefono) {
        this.codigoFacultad = codigoFacultad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getCodigoFacultad() {
        return codigoFacultad;
    }

    public void setCodigoFacultad(int codigoFacultad) {
        this.codigoFacultad = codigoFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
