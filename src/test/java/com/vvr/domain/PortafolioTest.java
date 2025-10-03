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
public class PortafolioTest {
    
    public PortafolioTest() {
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
     * Test of getLogros method, of class Portafolio.
     */
    @Test
    public void testGetLogros() {
        System.out.println("getLogros");
        Portafolio instance = new Portafolio();
        List<Logro> expResult = null;
        List<Logro> result = instance.getLogros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogros method, of class Portafolio.
     */
    @Test
    public void testSetLogros() {
        System.out.println("setLogros");
        List<Logro> logros = null;
        Portafolio instance = new Portafolio();
        instance.setLogros(logros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOportunidadesMejora method, of class Portafolio.
     */
    @Test
    public void testGetOportunidadesMejora() {
        System.out.println("getOportunidadesMejora");
        Portafolio instance = new Portafolio();
        List<String> expResult = null;
        List<String> result = instance.getOportunidadesMejora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOportunidadesMejora method, of class Portafolio.
     */
    @Test
    public void testSetOportunidadesMejora() {
        System.out.println("setOportunidadesMejora");
        List<String> oportunidadesMejora = null;
        Portafolio instance = new Portafolio();
        instance.setOportunidadesMejora(oportunidadesMejora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarLogro method, of class Portafolio.
     */
    @Test
    public void testAgregarLogro() {
        System.out.println("agregarLogro");
        Logro logro = null;
        Portafolio instance = new Portafolio();
        instance.agregarLogro(logro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarOportunidadMejora method, of class Portafolio.
     */
    @Test
    public void testAgregarOportunidadMejora() {
        System.out.println("agregarOportunidadMejora");
        String oportunidad = "";
        Portafolio instance = new Portafolio();
        instance.agregarOportunidadMejora(oportunidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
