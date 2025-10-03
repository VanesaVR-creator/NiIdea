/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvr.domain;

/**
 * Representa la base abstracta para todos los tipos de usuarios en el sistema 
 * (Tutor, Coordinador, etc.).
 * Proporciona campos comunes y métodos para gestionar información básica del usuario.
 * @author vanesa
 */
public abstract class Usuarios {
    
    protected String nombre;
    protected String correo;
    protected String rol;

    /**
     * Constructor por defecto (vacío).
     */
    public Usuarios() {}

    /**
     * Constructor que inicializa un objeto Usuario con todos sus atributos.
     * @param nombre El nombre completo del usuario.
     * @param correo La dirección de correo electrónico del usuario.
     * @param rol El rol asignado al usuario (ej. "Tutor" o "Coordinador").
     */
    public Usuarios(String nombre, String correo, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el usuario.
     * @param nombre El nuevo nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección de correo electrónico del usuario.
     * @return El correo electrónico.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece la dirección de correo electrónico del usuario.
     * @param correo El nuevo correo electrónico.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el rol asignado al usuario.
     * @return El rol del usuario.
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establece el rol del usuario.
     * @param rol El nuevo rol a asignar.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    // --- Método Abstracto ---

    /**
     * Método abstracto que debe ser implementado por las subclases 
     * para mostrar la información específica del usuario por consola.
     */
    public abstract void mostrarInformacion();
}
