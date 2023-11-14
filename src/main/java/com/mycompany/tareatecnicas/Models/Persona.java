/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Models;

/**
 *
 * @author leona
 */
public class Persona {
    private String nombre;
    private String telelfono;
    private String fecha;

    public Persona() {
    }
    
    public Persona(String nombre, String telelfono, String fecha) {
        this.nombre = nombre;
        this.telelfono = telelfono;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelelfono() {
        return telelfono;
    }

    public void setTelelfono(String telelfono) {
        this.telelfono = telelfono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
