/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Control;
import com.mycompany.tareatecnicas.Models.Persona;
import java.util.ArrayList;
import BD.PersonaDAO;
/**
 *
 * @author leona
 */
public class ColeccionContactos {
    protected static ArrayList<Persona> listaContactos = new PersonaDAO().obtenerPersonas();

    public static String buscarContacto(String nombre){
        for (Persona contacto : listaContactos){
            if (contacto.getNombre().equals(nombre)){
                return contacto.toString();
            }
        }
        return "No se encontró el usuario.";
    }

    public static ArrayList<Persona> getListaContactos() {
        listaContactos = new PersonaDAO().obtenerPersonas();
        return listaContactos;
    }

}
