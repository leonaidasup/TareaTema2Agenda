/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Models;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author leona
 */
public class ContactoHombre extends Persona implements Contacto {
    private SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

    public ContactoHombre() {
    }
    
    public ContactoHombre(String nombre, String telelfono, int año, int mes, int dia) {
        super(nombre, telelfono, año, mes, dia);
    }
   
    @Override
    public String getNombreContacto() {
        return this.getNombre();
    }

    @Override
    public String getTelefonoContacto() {
        return this.getTelelfono();
    }

    @Override
    public String getFechaContancto() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        return formatoFecha.format(this.getFecha().getTime());
    }
 
    @Override
    public String toString() {
        return "{" + "nombre: " + this.getNombre() + ", telelfono: " +
                this.getTelefonoContacto() + ", fecha: " + this.getFechaContancto() +
                ", intencion: -1}";
    }
    
    public String toStringJSON() {
        return "{" + "\"nombre\": \"" + this.getNombre() + "\", \"telelfono\": \"" +
                this.getTelefonoContacto() + "\", \"fecha\": \"" + this.getFechaContancto() +
                "\", \"intencion\": -1}";
    }
}
