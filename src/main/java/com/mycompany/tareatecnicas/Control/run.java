/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Control;
import BD.PersonaDAO;
import com.mycompany.tareatecnicas.Models.ContactoHombre;
import com.mycompany.tareatecnicas.Models.ContactoMujer;
import java.util.Properties;
import com.google.gson.Gson;
import com.mycompany.tareatecnicas.Models.Persona;
/**
 *
 * @author leona
 */
public class run {
    
    public static void main(String[] args) {  
        ContactoHombre hombre = new ContactoHombre("mariano", "7777", 2025, 5, 5);
        PersonaDAO perdao = new PersonaDAO();
        perdao.agregar(hombre);
        System.out.println(perdao.obtenerPersonas());
        
        /*ContactoMujer mujer = new ContactoMujer("mujer", "132123", 1, 1, 1, 1);
        AgregarContacto.agregarContacto(mujer);
        ContactoHombre hombre = new ContactoHombre("hombre", "132123", 1, 1, 1);
        AgregarContacto.agregarContacto(hombre);
        System.out.println(ColeccionContactos.getListaContactos());
        
        String a = ColeccionContactos.buscarContacto("hombre").toString();
        String b = ColeccionContactos.buscarContacto("mujer").toString();
        System.out.println(a);
        System.out.println(b);*/
        
    }
}
