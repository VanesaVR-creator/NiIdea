/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vvr.domain;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vanesa
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Alumno.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Alumno instance = new Alumno();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Alumno.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Alumno instance = new Alumno();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroControl method, of class Alumno.
     */
    @Test
    public void testGetNumeroControl() {
        System.out.println("getNumeroControl");
        Alumno instance = new Alumno();
        String expResult = "";
        String result = instance.getNumeroControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroControl method, of class Alumno.
     */
    @Test
    public void testSetNumeroControl() {
        System.out.println("setNumeroControl");
        String numeroControl = "";
        Alumno instance = new Alumno();
        instance.setNumeroControl(numeroControl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalificaciones method, of class Alumno.
     */
    @Test
    public void testGetCalificaciones() {
        System.out.println("getCalificaciones");
        Alumno instance = new Alumno();
        List<Double> expResult = null;
        List<Double> result = instance.getCalificaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalificaciones method, of class Alumno.
     */
    @Test
    public void testSetCalificaciones() {
        System.out.println("setCalificaciones");
        List<Double> calificaciones = null;
        Alumno instance = new Alumno();
        instance.setCalificaciones(calificaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPortafolio method, of class Alumno.
     */
    @Test
    public void testGetPortafolio() {
        System.out.println("getPortafolio");
        Alumno instance = new Alumno();
        Portafolio expResult = null;
        Portafolio result = instance.getPortafolio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPortafolio method, of class Alumno.
     */
    @Test
    public void testSetPortafolio() {
        System.out.println("setPortafolio");
        Portafolio portafolio = null;
        Alumno instance = new Alumno();
        instance.setPortafolio(portafolio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCalificacion method, of class Alumno.
     */
    @Test
    public void testAgregarCalificacion() {
        System.out.println("agregarCalificacion");
        double calificacion = 0.0;
        Alumno instance = new Alumno();
        instance.agregarCalificacion(calificacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
