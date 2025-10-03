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
public class Portafolio {
    private List<Logro> logros;
    private List<String> oportunidadesMejora;

    public Portafolio() {
        this.logros = new ArrayList<>();
        this.oportunidadesMejora = new ArrayList<>();
    }

    public Portafolio(List<Logro> logros, List<String> oportunidadesMejora) {
        this.logros = logros;
        this.oportunidadesMejora = oportunidadesMejora;
    }

    public List<Logro> getLogros() {
        return logros;
    }

    public void setLogros(List<Logro> logros) {
        this.logros = logros;
    }

    public List<String> getOportunidadesMejora() {
        return oportunidadesMejora;
    }

    public void setOportunidadesMejora(List<String> oportunidadesMejora) {
        this.oportunidadesMejora = oportunidadesMejora;
    }

    public void agregarLogro(Logro logro) {
        this.logros.add(logro);
    }

    public void agregarOportunidadMejora(String oportunidad) {
        this.oportunidadesMejora.add(oportunidad);
    }
}
