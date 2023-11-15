/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Models;

/**
 *
 * @author leona
 */
public class ContactoHombre extends Persona implements Contacto {

    public ContactoHombre() {
    }

    public ContactoHombre(String nombre, String telelfono, String fecha) {
        super(nombre, telelfono, fecha);
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
        return this.getFecha();
    }

    @Override
    public String toString() {
        return "{" + "\"nombre\": \"" + this.getNombre() + "\", \"telelfono\": \"" +
                this.getTelefonoContacto() + "\", \"fecha\": \"" + this.getFechaContancto() +
                "\", \"intencion\": -1}";
    }

    public String toStringJSON() {
        return "{" + "\"nombre\": \"" + this.getNombre() + "\", \"telelfono\": \"" +
                this.getTelefonoContacto() + "\", \"fecha\": \"" + this.getFechaContancto() +
                "\", \"intencion\": -1}";
    }
}
