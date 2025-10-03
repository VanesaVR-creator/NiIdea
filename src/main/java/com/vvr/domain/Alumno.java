/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvr.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanesa
 */
public class Alumno {
    private String nombre;
    private String numeroControl;
    private List<Double> calificaciones;
    private Portafolio portafolio;

    public Alumno() {
        this.calificaciones = new ArrayList<>();
        this.portafolio = new Portafolio();
    }

    public Alumno(String nombre, String numeroControl) {
        this.nombre = nombre;
        this.numeroControl = numeroControl;
        this.calificaciones = new ArrayList<>();
        this.portafolio = new Portafolio();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Portafolio getPortafolio() {
        return portafolio;
    }

    public void setPortafolio(Portafolio portafolio) {
        this.portafolio = portafolio;
    }

    // Método para añadir calificación
    public void agregarCalificacion(double calificacion) {
        this.calificaciones.add(calificacion);
    }
}
