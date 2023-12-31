/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Models;

/**
 *
 * @author leona
 */
public class ContactoMujer extends Persona implements Contacto {
    private int intencion;

    public ContactoMujer() {
    }

    public ContactoMujer(String nombre, String telelfono, String fecha, int intencion) {
        super(nombre, telelfono, fecha);
        this.intencion = intencion;
    }

    public int getIntension() {
        return intencion;
    }

    public void setIntension(int intension) {
        this.intencion = intension;
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
                "\", \"intencion\": " + this.getIntension() + "}";
    }

    public String toStringJSON() {
        return "{" + "\"nombre\": \"" + this.getNombre() + "\", \"telelfono\": \"" +
                this.getTelefonoContacto() + "\", \"fecha\": \"" + this.getFechaContancto() +
                "\", \"intencion\": " + this.getIntension() + "}";
    }
}
