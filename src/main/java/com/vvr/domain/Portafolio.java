/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvr.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa el portafolio de un alumno, manteniendo un registro de sus logros 
 * adquiridos y sus oportunidades de mejora o áreas de refuerzo.
 * @author vanesa
 */
public class Portafolio {
    private List<Logro> logros;
    private List<String> oportunidadesMejora;

    /**
     * Constructor por defecto. 
     * Inicializa las listas de logros y oportunidades de mejora como listas vacías.
     */
    public Portafolio() {
        this.logros = new ArrayList<>();
        this.oportunidadesMejora = new ArrayList<>();
    }

    /**
     * Constructor que inicializa el portafolio con listas preexistentes.
     * @param logros La lista inicial de objetos Logro.
     * @param oportunidadesMejora La lista inicial de descripciones de oportunidades de mejora.
     */
    public Portafolio(List<Logro> logros, List<String> oportunidadesMejora) {
        this.logros = logros;
        this.oportunidadesMejora = oportunidadesMejora;
    }

    // --- Getters y Setters ---

    /**
     * Obtiene la lista de logros registrados en el portafolio.
     * @return Una lista de objetos Logro.
     */
    public List<Logro> getLogros() {
        return logros;
    }

    /**
     * Establece la lista completa de logros del portafolio.
     * @param logros La nueva lista de logros.
     */
    public void setLogros(List<Logro> logros) {
        this.logros = logros;
    }

    /**
     * Obtiene la lista de descripciones de oportunidades de mejora.
     * @return Una lista de Strings con las oportunidades.
     */
    public List<String> getOportunidadesMejora() {
        return oportunidadesMejora;
    }

    /**
     * Establece la lista completa de oportunidades de mejora.
     * @param oportunidadesMejora La nueva lista de oportunidades de mejora.
     */
    public void setOportunidadesMejora(List<String> oportunidadesMejora) {
        this.oportunidadesMejora = oportunidadesMejora;
    }

    // --- Métodos de Lógica ---

    /**
     * Añade un nuevo objeto Logro a la lista del portafolio.
     * @param logro El objeto Logro a añadir.
     */
    public void agregarLogro(Logro logro) {
        this.logros.add(logro);
    }

    /**
     * Añade una nueva descripción de oportunidad de mejora a la lista.
     * @param oportunidad La descripción (String) de la oportunidad de mejora.
     */
    public void agregarOportunidadMejora(String oportunidad) {
        this.oportunidadesMejora.add(oportunidad);
    }
}
