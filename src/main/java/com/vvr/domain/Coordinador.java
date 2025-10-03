/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvr.domain;

import java.util.List;

/**
 *
 * @author vanesa
 */
public class Coordinador extends Usuarios {
    public Coordinador(String nombre, String correo) {
        super(nombre, correo, "Coordinador académico");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Coordinador: " + nombre + " | Correo: " + correo);
    }

    // método para revisar lista de alumnos
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
