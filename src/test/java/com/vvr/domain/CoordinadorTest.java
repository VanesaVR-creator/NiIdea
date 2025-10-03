/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vvr.domain;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Coordinador.
 * Se enfoca en verificar la inicialización y la salida de consola de los métodos de supervisión.
 * @author vanesa
 */
public class CoordinadorTest {
    
    // Instancia de la clase Coordinador a probar
    private Coordinador instance;
    
    // Variables para capturar la salida de consola (System.out)
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out; 

    private final String NOMBRE_PRUEBA = "FJMP";
    private final String CORREO_PRUEBA = "coordinacion@mail.com";

    public CoordinadorTest() {
    }

    /**
     * Configuración ANTES de cada prueba.
     * 1. Inicializa la instancia de Coordinador.
     * 2. Redirige la salida de System.out a nuestro captor.
     */
    @BeforeEach
    public void setUp() {
        // Inicializar la instancia
        instance = new Coordinador(NOMBRE_PRUEBA, CORREO_PRUEBA);
        
        // Redirigir la salida estándar (System.out)
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Limpieza DESPUÉS de cada prueba.
     * 1. Restaura la salida de System.out a la consola original.
     */
    @AfterEach
    public void tearDown() {
        // Restaurar la salida estándar
        System.setOut(originalOut);
        instance = null;
    }

    // -------------------------------------------------------------------------
    // PRUEBAS DE COMPORTAMIENTO
    // -------------------------------------------------------------------------

    @Test
    public void testInicializacionRol() {
        System.out.println("testInicializacionRol");
        // Verifica que el rol se asigne correctamente en el constructor
        String expResult = "Coordinador académico";
        assertEquals(expResult, instance.getRol(), "El rol debe ser asignado como 'Coordinador académico'.");
    }
    
    /**
     * Prueba el método mostrarInformacion capturando la salida de consola.
     */
    @Test
    public void testMostrarInformacion() {
        System.out.println("testMostrarInformacion");
        
        instance.mostrarInformacion();
        
        // Obtenemos la salida capturada y limpiamos saltos de línea
        String resultadoCapturado = outputStreamCaptor.toString().trim();
        
        // Definimos el resultado esperado
        String expResult = "Coordinador: " + NOMBRE_PRUEBA + " | Correo: " + CORREO_PRUEBA;
        
        // Comparamos el resultado
        assertEquals(expResult, resultadoCapturado, 
                "La salida de consola debe coincidir con el formato esperado.");
    }

    /**
     * Prueba el método supervisarAlumnos con una lista de alumnos con y sin datos.
     */
    @Test
    public void testSupervisarAlumnos_ContenidoReporte() {
        System.out.println("testSupervisarAlumnos_ContenidoReporte");
        
        // 1. Configurar la lista de alumnos
        Alumno alumno1 = new Alumno("Juan López", "A111");
        alumno1.agregarCalificacion(85.0);
        alumno1.getPortafolio().agregarLogro(new Logro(1, "Académico", "Examen perfecto"));
        
        Alumno alumno2 = new Alumno("María Paz", "B222"); // Sin datos adicionales
        
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        
        // 2. Ejecutar el método de supervisión
        instance.supervisarAlumnos(alumnos);
        
        // 3. Obtener y verificar la salida capturada
        String resultadoCapturado = outputStreamCaptor.toString();
        
        // Verificaciones básicas del reporte
        assertTrue(resultadoCapturado.contains("El coordinador FJMP supervisa a los alumnos:"), 
                "El reporte debe iniciar con la línea de supervisión.");
        
        // Verifica datos del Alumno 1
        assertTrue(resultadoCapturado.contains("Alumno: Juan López (A111)"), 
                "Debe listar el primer alumno.");
        assertTrue(resultadoCapturado.contains("Calificaciones: [85.0]"), 
                "Debe mostrar las calificaciones del primer alumno.");
        assertTrue(resultadoCapturado.contains("[Académico] - Examen perfecto"), 
                "Debe mostrar el logro del primer alumno.");

        // Verifica datos del Alumno 2 (que no tiene logros)
        assertTrue(resultadoCapturado.contains("Alumno: María Paz (B222)"), 
                "Debe listar el segundo alumno.");
        assertTrue(resultadoCapturado.contains("Logros:\nSin logros."), 
                "Debe indicar la ausencia de logros para el segundo alumno.");
    }
}
