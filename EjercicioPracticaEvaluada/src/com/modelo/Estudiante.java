package com.modelo;

/**
 * Nombre de la Clase: Estudiante
 * Versión: 1.0
 * Fecha de Creación: 18 de Agosto de 2018
 * CopyRight: ITCA-FEPADE
 * @author Benjamín Ramírez
 */
public class Estudiante {
    
    private int codigoEstudiante;
    private String nombre;
    private int edad;
    private String genero;

    public Estudiante() {
    }

    public Estudiante(int codigoEstudiante, String nombre, int edad, String genero) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
