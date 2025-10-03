/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvr.domain;

/**
 * Representa a un usuario que tiene permisos para consultar la información
 * de un alumno, como un Tutor o Padre de familia.
 * Extiende la clase Usuarios.
 * @author vanesa
 */
public class Chismoso extends Usuarios {
    
    /**
     * Constructor para inicializar un objeto Chismoso (Tutor o Padre).
     * El rol se establece por defecto como "Tutor/Padre de familia".
     * * @param nombre El nombre completo del tutor/padre.
     * @param correo La dirección de correo electrónico del tutor/padre.
     */
    public Chismoso(String nombre, String correo) {
        super(nombre, correo, "Tutor/Padre de familia");
    }

    /**
     * Muestra la información básica del tutor (nombre y correo) por consola.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Tutor: " + nombre + " | Correo: " + correo);
    }

    /**
     * Consulta y muestra el portafolio completo (calificaciones, logros y 
     * oportunidades de mejora) de un alumno específico.
     * * @param alumno El objeto Alumno cuya información se desea consultar.
     */
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
