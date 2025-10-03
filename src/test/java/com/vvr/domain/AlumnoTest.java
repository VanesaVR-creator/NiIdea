/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vvr.domain;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Alumno.
 * Se enfoca en verificar getters, setters, inicialización y el método agregarCalificacion.
 * @author vanesa
 */
public class AlumnoTest {
    
    // Instancia de la clase Alumno a probar
    private Alumno instance; 
    
    // Valores de prueba para la inicialización
    private final String NOMBRE_PRUEBA = "Ana García";
    private final String NUMERO_CONTROL_PRUEBA = "C123456";

    public AlumnoTest() {
    }

    /**
     * Inicializa una nueva instancia de Alumno antes de cada método de prueba.
     */
    @BeforeEach
    public void setUp() {
        // Usamos el constructor con parámetros para asegurar que se inicializan los campos
        instance = new Alumno(NOMBRE_PRUEBA, NUMERO_CONTROL_PRUEBA); 
    }

    /**
     * Limpieza después de cada prueba. (Opcional para objetos simples)
     */
    @AfterEach
    public void tearDown() {
        instance = null;
    }

    // -------------------------------------------------------------------------
    // PRUEBAS DE GETTERS Y SETTERS
    // -------------------------------------------------------------------------

    @Test
    public void testGetNombre() {
        System.out.println("testGetNombre");
        // Debe retornar el valor de inicialización
        assertEquals(NOMBRE_PRUEBA, instance.getNombre(), "El nombre retornado debe coincidir con el valor de inicialización.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("testSetNombre");
        String nuevoNombre = "Isabel Pérez";
        instance.setNombre(nuevoNombre);
        // Verificamos que el cambio se haya aplicado correctamente
        assertEquals(nuevoNombre, instance.getNombre(), "El nombre debe ser actualizado por setNombre.");
    }

    @Test
    public void testGetNumeroControl() {
        System.out.println("testGetNumeroControl");
        // Debe retornar el valor de inicialización
        assertEquals(NUMERO_CONTROL_PRUEBA, instance.getNumeroControl(), "El número de control retornado debe coincidir con el valor de inicialización.");
    }

    @Test
    public void testSetNumeroControl() {
        System.out.println("testSetNumeroControl");
        String nuevoNC = "D987654";
        instance.setNumeroControl(nuevoNC);
        // Verificamos que el cambio se haya aplicado correctamente
        assertEquals(nuevoNC, instance.getNumeroControl(), "El número de control debe ser actualizado por setNumeroControl.");
    }
    
    @Test
    public void testGetCalificaciones_InicialVacio() {
        System.out.println("testGetCalificaciones_InicialVacio");
        List<Double> result = instance.getCalificaciones();
        // Cuando se inicializa un Alumno, la lista de calificaciones debe estar vacía, no nula.
        assertNotNull(result, "La lista de calificaciones no debe ser nula.");
        assertTrue(result.isEmpty(), "La lista de calificaciones debe estar inicialmente vacía.");
    }

    @Test
    public void testGetPortafolio_InicialNoNulo() {
        System.out.println("testGetPortafolio_InicialNoNulo");
        Portafolio result = instance.getPortafolio();
        // Cuando se inicializa un Alumno, debe crearse un Portafolio, no debe ser nulo.
        assertNotNull(result, "El portafolio no debe ser nulo al inicializar el alumno.");
    }
    
    @Test
    public void testSetPortafolio() {
        System.out.println("testSetPortafolio");
        Portafolio nuevoPortafolio = new Portafolio();
        instance.setPortafolio(nuevoPortafolio);
        // Verificamos que la nueva referencia al portafolio sea la correcta
        assertEquals(nuevoPortafolio, instance.getPortafolio(), "El portafolio debe ser actualizado por setPortafolio.");
    }

    // -------------------------------------------------------------------------
    // PRUEBA DE LÓGICA DE NEGOCIO
    // -------------------------------------------------------------------------

    @Test
    public void testAgregarCalificacion() {
        System.out.println("testAgregarCalificacion");
        double calificacion1 = 95.5;
        double calificacion2 = 80.0;

        instance.agregarCalificacion(calificacion1);
        instance.agregarCalificacion(calificacion2);
        
        List<Double> resultados = instance.getCalificaciones();

        // 1. Verificamos el tamaño de la lista
        assertEquals(2, resultados.size(), "Debería haber 2 calificaciones después de agregarlas.");
        
        // 2. Verificamos que los valores se hayan agregado correctamente
        assertTrue(resultados.contains(calificacion1), "La lista debe contener la primera calificación.");
        assertTrue(resultados.contains(calificacion2), "La lista debe contener la segunda calificación.");
        
        // 3. Verificamos el valor exacto de la primera calificación
        assertEquals(calificacion1, resultados.get(0), 0.001, "El primer elemento debe ser la primera calificación agregada.");
    }
    
}
