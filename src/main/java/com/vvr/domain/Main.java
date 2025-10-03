/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Talles de investigación 1
 * Agosto - Diciembre 2025
 * Proyecto Ni Idea
 * Clase logro : representa una habilidad ya adquirida mediante una evidencia
 * Programador / Docente: FJMP
 * Fecha: 02/10/2025
 */
package com.vvr.domain;

/**
 *
 * @author vanesa
 */
public class Main {
    public static void main(String[] args) {
        // Crear un alumno de ejemplo
        Alumno alumno = new Alumno("Vanesa Velázquez", "A12345");

        // Agregar calificaciones de ejemplo
        alumno.agregarCalificacion(95.0);
        alumno.agregarCalificacion(88.0);
        alumno.agregarCalificacion(60.0);
        alumno.agregarCalificacion(73.5);

        // Evaluamos logros y oportunidades automáticamente
        for (double calificacion : alumno.getCalificaciones()) {
            if (calificacion >= 90) {
                alumno.getPortafolio().agregarLogro(new Logro("Excelente desempeño", calificacion));
            } else if (calificacion < 70) {
                alumno.getPortafolio().agregarOportunidadMejora("Mejorar en la materia con calificación " + calificacion);
            }
        }

        // Mostrar datos del alumno
        System.out.println("\n📌 Datos del alumno:");
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Número de control: " + alumno.getNumeroControl());
        System.out.println("Calificaciones: " + alumno.getCalificaciones());

        System.out.println("\n🏆 Logros:");
        if (alumno.getPortafolio().getLogros().isEmpty()) {
            System.out.println("Ningún logro registrado.");
        } else {
            alumno.getPortafolio().getLogros().forEach(System.out::println);
        }

        System.out.println("\n🔧 Oportunidades de mejora:");
        if (alumno.getPortafolio().getOportunidadesMejora().isEmpty()) {
            System.out.println("Ninguna oportunidad registrada.");
        } else {
            alumno.getPortafolio().getOportunidadesMejora().forEach(System.out::println);
        }
    }
}
