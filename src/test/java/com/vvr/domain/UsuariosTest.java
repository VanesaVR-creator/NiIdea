/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vvr.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase abstracta Usuarios.
 * Utiliza la clase interna UsuariosImpl para la instanciación.
 * @author vanesa
 */
public class UsuariosTest {
    
    // Instancia de la clase a probar (usando la implementación)
    private Usuarios instance;
    
    // Valores de prueba
    private final String NOMBRE_PRUEBA = "Prueba Nombre";
    private final String CORREO_PRUEBA = "prueba@mail.com";
    private final String ROL_PRUEBA = "Test Rol";

    public UsuariosTest() {
    }

    /**
     * Inicializa una nueva instancia de UsuariosImpl antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        // Inicializamos usando el constructor con parámetros de Usuarios
        instance = new UsuariosImpl(NOMBRE_PRUEBA, CORREO_PRUEBA, ROL_PRUEBA); 
    }

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
        // Comprobar el valor inicial
        assertEquals(NOMBRE_PRUEBA, instance.getNombre(), "El nombre debe coincidir con el valor de inicialización.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("testSetNombre");
        String nuevoNombre = "Nuevo Nombre";
        instance.setNombre(nuevoNombre);
        // Comprobar que el valor se haya actualizado
        assertEquals(nuevoNombre, instance.getNombre(), "setNombre debe actualizar el valor correctamente.");
    }

    @Test
    public void testGetCorreo() {
        System.out.println("testGetCorreo");
        // Comprobar el valor inicial
        assertEquals(CORREO_PRUEBA, instance.getCorreo(), "El correo debe coincidir con el valor de inicialización.");
    }

    @Test
    public void testSetCorreo() {
        System.out.println("testSetCorreo");
        String nuevoCorreo = "nuevo@dominio.com";
        instance.setCorreo(nuevoCorreo);
        // Comprobar que el valor se haya actualizado
        assertEquals(nuevoCorreo, instance.getCorreo(), "setCorreo debe actualizar el valor correctamente.");
    }

    @Test
    public void testGetRol() {
        System.out.println("testGetRol");
        // Comprobar el valor inicial
        assertEquals(ROL_PRUEBA, instance.getRol(), "El rol debe coincidir con el valor de inicialización.");
    }

    @Test
    public void testSetRol() {
        System.out.println("testSetRol");
        String nuevoRol = "Administrador";
        instance.setRol(nuevoRol);
        // Comprobar que el valor se haya actualizado
        assertEquals(nuevoRol, instance.getRol(), "setRol debe actualizar el valor correctamente.");
    }

    // -------------------------------------------------------------------------
    // PRUEBA DEL MÉTODO ABSTRACTO
    // -------------------------------------------------------------------------

    @Test
    public void testMostrarInformacion() {
        System.out.println("testMostrarInformacion");
        // No se puede verificar la salida (se requeriría captura de System.out),
        // pero verificamos que el método se ejecute sin lanzar excepciones.
        assertDoesNotThrow(() -> instance.mostrarInformacion(), 
                           "Llamar a mostrarInformacion no debe lanzar excepciones.");
    }

    /**
     * Clase interna concreta para poder instanciar la clase abstracta Usuarios.
     * Es obligatoria para las pruebas unitarias.
     */
    public static class UsuariosImpl extends Usuarios {
        
        // Constructor para llamar al constructor de la clase abstracta
        public UsuariosImpl(String nombre, String correo, String rol) {
            super(nombre, correo, rol);
        }

        @Override
        public void mostrarInformacion() {
            // Implementación vacía o de prueba, el objetivo es que no falle
        }
    }
    
}
