/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vvr.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba unitaria para la clase Logro.
 * @author vanesa
 */
public class LogroTest {
    
    // 1. Declarar la instancia fuera de los métodos para que todos la vean
    private Logro instance; 
    
    // Datos de prueba
    private final int ID_PRUEBA = 10;
    private final String CAT_PRUEBA = "Deporte";
    private final String DESC_PRUEBA = "Ganó medalla de oro";
    
    public LogroTest() {
    }

    // Métodos de configuración globales (no necesitan modificación)
    @BeforeAll
    public static void setUpClass() throws Exception { }

    @AfterAll
    public static void tearDownClass() throws Exception { }

    // 2. Usar @BeforeEach para inicializar la instancia ANTES de cada test
    @BeforeEach
    public void setUp() throws Exception {
        // Creamos una nueva instancia limpia para cada prueba
        instance = new Logro(ID_PRUEBA, CAT_PRUEBA, DESC_PRUEBA); 
    }

    @AfterEach
    public void tearDown() throws Exception {
        // Limpiamos la instancia después de cada prueba si es necesario (opcional para POJOs)
        instance = null; 
    }
    
    // --- Pruebas funcionales corregidas ---

    @Test
    public void testGetId() {
        System.out.println("testGetId");
        int expResult = ID_PRUEBA; // Esperamos el ID que pusimos en setUp()
        int result = instance.getId();
        assertEquals(expResult, result, "El ID retornado debe ser el ID de inicialización.");
    }

    @Test
    public void testSetId() {
        System.out.println("testSetId");
        int nuevoId = 20;
        instance.setId(nuevoId);
        // Verificamos que el cambio se haya aplicado
        assertEquals(nuevoId, instance.getId(), "El ID debe cambiar después de llamar a setId."); 
    }

    @Test
    public void testGetCategoria() {
        System.out.println("testGetCategoria");
        String expResult = CAT_PRUEBA; 
        String result = instance.getCategoria();
        assertEquals(expResult, result, "La categoría debe coincidir con la de inicialización.");
    }

    @Test
    public void testSetCategoria() {
        System.out.println("testSetCategoria");
        String nuevaCategoria = "Liderazgo";
        instance.setCategoria(nuevaCategoria);
        // Verificamos que el cambio se haya aplicado
        assertEquals(nuevaCategoria, instance.getCategoria(), "La categoría debe cambiar después de llamar a setCategoria."); 
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("testGetDescripcion");
        String expResult = DESC_PRUEBA; 
        String result = instance.getDescripcion();
        assertEquals(expResult, result, "La descripción debe coincidir con la de inicialización.");
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("testSetDescripcion");
        String nuevaDescripcion = "Logró un puntaje de 90%";
        instance.setDescripcion(nuevaDescripcion);
        // Verificamos que el cambio se haya aplicado
        assertEquals(nuevaDescripcion, instance.getDescripcion(), "La descripción debe cambiar después de llamar a setDescripcion."); 
    }

    @Test
    public void testToString() {
        System.out.println("testToString");
        String expResult = "Logro #" + ID_PRUEBA + " [" + CAT_PRUEBA + "] - " + DESC_PRUEBA;
        String result = instance.toString();
        // Aseguramos que el formato de salida sea el correcto
        assertEquals(expResult, result, "El método toString no devuelve el formato esperado."); 
    }
    
}
