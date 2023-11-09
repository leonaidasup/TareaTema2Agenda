/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Models;
import java.util.Calendar;

/**
 *
 * @author leona
 */
public class Persona {
    private String nombre;
    private String telelfono;
    private final Calendar fecha = Calendar.getInstance();

    public Persona(String nombre, String telelfono, int año, int mes, int dia) {
        this.nombre = nombre;
        this.telelfono = telelfono;
        this.fecha.set(año, mes, dia);
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

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(int año, int mes, int dia) {
        this.fecha.set(año, mes, dia);
    }

}
