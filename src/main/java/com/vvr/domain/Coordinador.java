/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvr.domain;

import java.util.List;

/**
 * Representa al Coordinador Académico. Extiende la clase Usuarios 
 * y tiene la responsabilidad de supervisar la información de un grupo de alumnos.
 * @author vanesa
 */
public class Coordinador extends Usuarios {
    
    /**
     * Constructor para inicializar un objeto Coordinador.
     * El rol se establece por defecto como "Coordinador académico".
     * @param nombre El nombre completo del coordinador.
     * @param correo La dirección de correo electrónico del coordinador.
     */
    public Coordinador(String nombre, String correo) {
        super(nombre, correo, "Coordinador académico");
    }

    /**
     * Muestra la información básica del coordinador (nombre y correo) por consola.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Coordinador: " + nombre + " | Correo: " + correo);
    }

    /**
     * Revisa una lista de alumnos e imprime por consola sus calificaciones, 
     * logros y oportunidades de mejora.
     * @param alumnos La lista de objetos Alumno a supervisar.
     */
    public void supervisarAlumnos(List<Alumno> alumnos) {
        System.out.println("\n El coordinador " + nombre + " supervisa a los alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println("\n Alumno: " + alumno.getNombre() + " (" + alumno.getNumeroControl() + ")");
            System.out.println("Calificaciones: " + alumno.getCalificaciones());

            System.out.println("Logros:");
            if (alumno.getPortafolio().getLogros().isEmpty()) {
                System.out.println("Sin logros.");
            } else {
                alumno.getPortafolio().getLogros().forEach(System.out::println);
            }

            System.out.println("Oportunidades de mejora:");
            if (alumno.getPortafolio().getOportunidadesMejora().isEmpty()) {
                System.out.println("Sin oportunidades.");
            } else {
                alumno.getPortafolio().getOportunidadesMejora().forEach(System.out::println);
            }
        }
    }
}
