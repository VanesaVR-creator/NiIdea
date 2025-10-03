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
public class CoordinadorTest {
    
    public CoordinadorTest() {
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
     * Test of mostrarInformacion method, of class Coordinador.
     */
    @Test
    public void testMostrarInformacion() {
        System.out.println("mostrarInformacion");
        Coordinador instance = null;
        instance.mostrarInformacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supervisarAlumnos method, of class Coordinador.
     */
    @Test
    public void testSupervisarAlumnos() {
        System.out.println("supervisarAlumnos");
        List<Alumno> alumnos = null;
        Coordinador instance = null;
        instance.supervisarAlumnos(alumnos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
