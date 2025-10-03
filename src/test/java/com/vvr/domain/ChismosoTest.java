/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vvr.domain;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Chismoso.
 * Se centra en verificar la inicialización y la salida de consola de los métodos.
 * @author vanesa
 */
public class ChismosoTest {
    
    // Instancia de la clase Chismoso a probar
    private Chismoso instance;
    
    // Variables para capturar la salida de consola (System.out)
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out; // Guardar el System.out original

    private final String NOMBRE_PRUEBA = "Carlos Pérez";
    private final String CORREO_PRUEBA = "carlos.tutor@mail.com";

    public ChismosoTest() {
    }

    /**
     * Configuración ANTES de cada prueba.
     * 1. Inicializa la instancia de Chismoso.
     * 2. Redirige la salida de System.out a nuestro captor.
     */
    @BeforeEach
    public void setUp() {
        // Inicializar la instancia
        instance = new Chismoso(NOMBRE_PRUEBA, CORREO_PRUEBA);
        
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
        String expResult = "Tutor/Padre de familia";
        assertEquals(expResult, instance.getRol(), "El rol debe ser asignado en el constructor.");
        assertEquals(NOMBRE_PRUEBA, instance.getNombre(), "El nombre debe ser el de inicialización.");
    }
    
    /**
     * Prueba el método mostrarInformacion capturando la salida de consola.
     */
    @Test
    public void testMostrarInformacion() {
        System.out.println("testMostrarInformacion");
        
        // Ejecutamos el método que imprime
        instance.mostrarInformacion();
        
        // Obtenemos la salida capturada y eliminamos saltos de línea y espacios al inicio/fin
        String resultadoCapturado = outputStreamCaptor.toString().trim();
        
        // Definimos el resultado esperado
        String expResult = "Tutor: " + NOMBRE_PRUEBA + " | Correo: " + CORREO_PRUEBA;
        
        // Comparamos el resultado
        assertEquals(expResult, resultadoCapturado, 
                "La salida de consola debe coincidir con el formato esperado.");
    }

    /**
     * Prueba el método consultarAlumno. Es una prueba de integración simple 
     * para asegurar que se ejecuta sin errores y que la salida contiene datos clave.
     */
    @Test
    public void testConsultarAlumno_ContenidoBasico() {
        System.out.println("testConsultarAlumno_ContenidoBasico");
        
        // Configuramos un alumno con datos para la prueba
        Alumno alumno = new Alumno("Vanesa Velázquez", "TI22110054");
        alumno.agregarCalificacion(95.0);
        alumno.getPortafolio().agregarLogro(new Logro(1, "Académico", "Nota alta"));
        
        // Ejecutamos el método que imprime
        instance.consultarAlumno(alumno);
        
        // Obtenemos la salida capturada
        String resultadoCapturado = outputStreamCaptor.toString();
        
        // Verificamos que el reporte contenga las partes clave
        assertTrue(resultadoCapturado.contains("consulta al alumno: Vanesa Velázquez"), 
                "El reporte debe mencionar al alumno consultado.");
        assertTrue(resultadoCapturado.contains("Calificaciones: [95.0]"), 
                "El reporte debe mostrar la calificación.");
        assertTrue(resultadoCapturado.contains("[Académico] - Nota alta"), 
                "El reporte debe mostrar el logro registrado.");
    }
}
