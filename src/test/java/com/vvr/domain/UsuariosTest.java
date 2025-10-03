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
 *
 * @author vanesa
 */
public class UsuariosTest {
    
    public UsuariosTest() {
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
     * Test of getNombre method, of class Usuarios.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuarios instance = new UsuariosImpl();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuarios.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuarios instance = new UsuariosImpl();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Usuarios.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Usuarios instance = new UsuariosImpl();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Usuarios.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Usuarios instance = new UsuariosImpl();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRol method, of class Usuarios.
     */
    @Test
    public void testGetRol() {
        System.out.println("getRol");
        Usuarios instance = new UsuariosImpl();
        String expResult = "";
        String result = instance.getRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRol method, of class Usuarios.
     */
    @Test
    public void testSetRol() {
        System.out.println("setRol");
        String rol = "";
        Usuarios instance = new UsuariosImpl();
        instance.setRol(rol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarInformacion method, of class Usuarios.
     */
    @Test
    public void testMostrarInformacion() {
        System.out.println("mostrarInformacion");
        Usuarios instance = new UsuariosImpl();
        instance.mostrarInformacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UsuariosImpl extends Usuarios {

        public void mostrarInformacion() {
        }
    }
    
}
