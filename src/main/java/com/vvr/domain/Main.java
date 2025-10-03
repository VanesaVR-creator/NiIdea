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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanesa
 */
public class Main {
    public static void main(String[] args) {
        // alumno
        Alumno alumno = new Alumno("Vanesa Velázquez", "TI22110054");
        alumno.agregarCalificacion(95.0);
        alumno.agregarCalificacion(88.0);
        alumno.agregarCalificacion(60.0);

        // Registrar logros
        alumno.getPortafolio().agregarLogro(new Logro(1, "Académico", "Obtuvo 95 en Matemáticas"));
        alumno.getPortafolio().agregarLogro(new Logro(2, "Participación", "Participó en concurso de ciencias"));

        // Registrar oportunidad de mejora
        alumno.getPortafolio().agregarOportunidadMejora("Reforzar Física (60)");

        // tutor (chismoso)
        Chismoso tutor = new Chismoso("Carlos Pérez", "carlos.tutor@mail.com");
        tutor.mostrarInformacion();
        tutor.consultarAlumno(alumno);

        // coordinador
        Coordinador coord = new Coordinador("FJMP", "coordinacion@mail.com");
        coord.mostrarInformacion();

        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno);
        listaAlumnos.add(new Alumno("Juan Ramírez", "B67890"));

        coord.supervisarAlumnos(listaAlumnos);
    }
}
