/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Models;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author leona
 */
public class ContactoMujer extends Persona implements Contacto {
    private int intencion;

    public ContactoMujer(String nombre, String telelfono, int año, int mes, int dia, int intencion) {
        super(nombre, telelfono, año, mes, dia);
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
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        return formatoFecha.format(this.getFecha().getTime());
    }
    
    @Override
    public String toString() {
        return "Mujer --> " + "nombre = " + this.getNombre() + ", telelfono = " +
                this.getTelefonoContacto() + ", fecha = " + this.getFechaContancto() +
                ", intension = " + this.getIntension();
    }
}
