/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvr.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un estudiante dentro del sistema, manteniendo sus datos personales,
 * sus calificaciones académicas y su portafolio de logros y oportunidades de mejora.
 * * @author vanesa
 */
public class Alumno {
    private String nombre;
    private String numeroControl;
    private List<Double> calificaciones;
    private Portafolio portafolio;

    /**
     * Constructor por defecto. 
     * Inicializa las listas de calificaciones y el portafolio.
     */
    public Alumno() {
        this.calificaciones = new ArrayList<>();
        this.portafolio = new Portafolio();
    }

    /**
     * Constructor que inicializa el Alumno con nombre y número de control.
     * También inicializa las listas de calificaciones y el portafolio.
     * * @param nombre El nombre completo del alumno.
     * @param numeroControl El número de control o identificador único del alumno.
     */
    public Alumno(String nombre, String numeroControl) {
        this.nombre = nombre;
        this.numeroControl = numeroControl;
        this.calificaciones = new ArrayList<>();
        this.portafolio = new Portafolio();
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el nombre completo del alumno.
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre completo del alumno.
     * @param nombre El nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de control del alumno.
     * @return El número de control.
     */
    public String getNumeroControl() {
        return numeroControl;
    }

    /**
     * Establece el número de control del alumno.
     * @param numeroControl El nuevo número de control.
     */
    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    /**
     * Obtiene la lista de todas las calificaciones registradas para el alumno.
     * @return Una lista de calificaciones (valores Double).
     */
    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    /**
     * Establece la lista completa de calificaciones del alumno. 
     * (Usar con precaución, normalmente se usa agregarCalificacion).
     * @param calificaciones La nueva lista de calificaciones.
     */
    public void setCalificaciones(List<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    /**
     * Obtiene el portafolio asociado al alumno, que contiene logros y mejoras.
     * @return El objeto Portafolio del alumno.
     */
    public Portafolio getPortafolio() {
        return portafolio;
    }

    /**
     * Asigna un objeto Portafolio al alumno.
     * @param portafolio El objeto Portafolio a asignar.
     */
    public void setPortafolio(Portafolio portafolio) {
        this.portafolio = portafolio;
    }

    // --- Método de Lógica ---

    /**
     * Agrega una nueva calificación a la lista del alumno.
     * @param calificacion El valor double de la calificación a añadir.
     */
    public void agregarCalificacion(double calificacion) {
        this.calificaciones.add(calificacion);
    }
}
