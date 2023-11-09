/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Control;
import com.mycompany.tareatecnicas.Models.Persona;
import java.util.ArrayList;
/**
 *
 * @author leona
 */
public class ColeccionContactos {
    private static final ArrayList<Persona> listaContactos = new ArrayList<>();

    public static Persona buscarContacto(String nombre){
        for (Persona contacto : listaContactos){
            if (contacto.getNombre().equals(nombre)){
                return contacto;
            }
        }
        return null;
    }

    public static ArrayList<Persona> getListaContactos() {
        return listaContactos;
    }

    public static void addListaContactos(Persona contacto) {
        ColeccionContactos.listaContactos.add(contacto);
    }
    
}
