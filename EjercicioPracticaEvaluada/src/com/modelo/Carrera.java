package com.modelo;

/**
 * Nombre de la Clase: Carrera
 * Versión: 1.0
 * Fecha de Creacion: 18 de Agosto de 2018
 * CopyRight: ITCA-FEPADE
 * @author Benjamín Ramirez
 */
public class Carrera {

    private int codigoCarrera;
    private String nombre;
    private int cantidadMaterias;
    private int codigoFacultad;

    public Carrera() {
    }

    public Carrera(int codigoCarrera, String nombre, int cantidadMaterias, int codigoFacultad) {
        this.codigoCarrera = codigoCarrera;
        this.nombre = nombre;
        this.cantidadMaterias = cantidadMaterias;
        this.codigoFacultad = codigoFacultad;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(int cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    public int getCodigoFacultad() {
        return codigoFacultad;
    }

    public void setCodigoFacultad(int codigoFacultad) {
        this.codigoFacultad = codigoFacultad;
    }
    
}
