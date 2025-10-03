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
 * Pruebas unitarias para la clase Portafolio.
 * Se enfoca en verificar la correcta inicialización y la funcionalidad de agregar elementos.
 * @author vanesa
 */
public class PortafolioTest {
    
    // Instancia de la clase Portafolio a probar
    private Portafolio instance; 

    public PortafolioTest() {
    }

    /**
     * Inicializa una nueva instancia de Portafolio antes de cada método de prueba.
     * Usamos el constructor por defecto, que inicializa las listas internamente.
     */
    @BeforeEach
    public void setUp() {
        instance = new Portafolio(); 
    }

    /**
     * Limpieza después de cada prueba.
     */
    @AfterEach
    public void tearDown() {
        instance = null;
    }

    // -------------------------------------------------------------------------
    // PRUEBAS DE INICIALIZACIÓN Y GETTERS
    // -------------------------------------------------------------------------

    @Test
    public void testGetLogros_InicialVacio() {
        System.out.println("testGetLogros_InicialVacio");
        List<Logro> result = instance.getLogros();
        
        // Verificamos que la lista se inicialice correctamente (no nula y vacía)
        assertNotNull(result, "La lista de logros no debe ser nula después de la inicialización.");
        assertTrue(result.isEmpty(), "La lista de logros debe estar vacía inicialmente.");
    }

    @Test
    public void testGetOportunidadesMejora_InicialVacio() {
        System.out.println("testGetOportunidadesMejora_InicialVacio");
        List<String> result = instance.getOportunidadesMejora();
        
        // Verificamos que la lista se inicialice correctamente (no nula y vacía)
        assertNotNull(result, "La lista de oportunidades no debe ser nula después de la inicialización.");
        assertTrue(result.isEmpty(), "La lista de oportunidades debe estar vacía inicialmente.");
    }

    // -------------------------------------------------------------------------
    // PRUEBAS DE SETTERS
    // -------------------------------------------------------------------------

    @Test
    public void testSetLogros() {
        System.out.println("testSetLogros");
        List<Logro> nuevaLista = new ArrayList<>();
        nuevaLista.add(new Logro(1, "Test", "Test Set"));
        
        instance.setLogros(nuevaLista);
        
        // Verificamos que la lista haya sido reemplazada
        assertEquals(1, instance.getLogros().size(), "La lista de logros debe tener un elemento después de setLogros.");
        assertEquals("Test", instance.getLogros().get(0).getCategoria(), "El logro debe ser el que acabamos de establecer.");
    }

    @Test
    public void testSetOportunidadesMejora() {
        System.out.println("testSetOportunidadesMejora");
        List<String> nuevaLista = new ArrayList<>();
        nuevaLista.add("Física avanzada");
        
        instance.setOportunidadesMejora(nuevaLista);
        
        // Verificamos que la lista haya sido reemplazada
        assertEquals(1, instance.getOportunidadesMejora().size(), "La lista de oportunidades debe tener un elemento después de setOportunidadesMejora.");
        assertTrue(instance.getOportunidadesMejora().contains("Física avanzada"), "La lista debe contener la nueva oportunidad.");
    }

    // -------------------------------------------------------------------------
    // PRUEBAS DE LÓGICA DE NEGOCIO (AGREGAR)
    // -------------------------------------------------------------------------

    @Test
    public void testAgregarLogro() {
        System.out.println("testAgregarLogro");
        Logro logro = new Logro(5, "Arte", "Dibujo técnico");
        
        // Agregamos el logro
        instance.agregarLogro(logro);
        
        // Verificamos el tamaño y el contenido
        assertEquals(1, instance.getLogros().size(), "Debe haber 1 logro después de agregarlo.");
        assertTrue(instance.getLogros().contains(logro), "El logro agregado debe estar presente en la lista.");
    }

    @Test
    public void testAgregarOportunidadMejora() {
        System.out.println("testAgregarOportunidadMejora");
        String oportunidad = "Reforzar Cálculo";
        
        // Agregamos la oportunidad
        instance.agregarOportunidadMejora(oportunidad);
        
        // Verificamos el tamaño y el contenido
        assertEquals(1, instance.getOportunidadesMejora().size(), "Debe haber 1 oportunidad después de agregarla.");
        assertTrue(instance.getOportunidadesMejora().contains(oportunidad), "La oportunidad agregada debe estar presente en la lista.");
    }
}
