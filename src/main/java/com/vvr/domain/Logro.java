/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvr.domain;

/**
 * Representa un logro o habilidad adquirida por un alumno, que se registra 
 * mediante una evidencia.
 * * @author vanesa
 */
public class Logro {
    private int id;
    private String categoria;
    private String descripcion;

    /**
     * Constructor para inicializar un nuevo objeto Logro.
     * * @param id Identificador único del logro.
     * @param categoria La categoría a la que pertenece el logro (ej. "Académico", "Participación").
     * @param descripcion Descripción detallada del logro alcanzado.
     */
    public Logro(int id, String categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el identificador único del logro.
     * @return El ID del logro.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del logro.
     * @param id El nuevo ID a asignar.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la categoría del logro.
     * @return La categoría del logro.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del logro.
     * @param categoria La nueva categoría.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene la descripción detallada del logro.
     * @return La descripción del logro.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción detallada del logro.
     * @param descripcion La nueva descripción.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Proporciona una representación de cadena de la información del logro.
     * @return Una cadena con el formato: "Logro #ID [Categoría] - Descripción".
     */
    @Override
    public String toString() {
        return "Logro #" + id + " [" + categoria + "] - " + descripcion;
    }
}
