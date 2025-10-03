/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvr.domain;

/**
 *
 * @author vanesa
 */
public class Chismoso extends Usuarios {
    public Chismoso(String nombre, String correo) {
        super(nombre, correo, "Tutor/Padre de familia");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tutor: " + nombre + " | Correo: " + correo);
    }

    // método para consultar el portafolio de un alumno
    public void consultarAlumno(Alumno alumno) {
        System.out.println("\n El tutor " + nombre + " consulta al alumno: " + alumno.getNombre());
        System.out.println("Calificaciones: " + alumno.getCalificaciones());

        System.out.println("\n Logros:");
        if (alumno.getPortafolio().getLogros().isEmpty()) {
            System.out.println("Sin logros registrados.");
        } else {
            alumno.getPortafolio().getLogros().forEach(System.out::println);
        }

        System.out.println("\n Oportunidades de mejora:");
        if (alumno.getPortafolio().getOportunidadesMejora().isEmpty()) {
            System.out.println("Sin oportunidades registradas.");
        } else {
            alumno.getPortafolio().getOportunidadesMejora().forEach(System.out::println);
        }
    }
}
