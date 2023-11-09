/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Control;
import com.mycompany.tareatecnicas.Models.ContactoHombre;
import com.mycompany.tareatecnicas.Models.ContactoMujer;
/**
 *
 * @author leona
 */
public class run {
    public static void main(String[] args) {
        ContactoMujer mujer = new ContactoMujer("mujer", "132123", 1, 1, 1, 1);
        AgregarContacto.agregarContacto(mujer);
        ContactoHombre hombre = new ContactoHombre("hombre", "132123", 1, 1, 1);
        AgregarContacto.agregarContacto(hombre);
        System.out.println(ColeccionContactos.getListaContactos());
        
        System.out.println(ColeccionContactos.buscarContacto("hombre"));
        System.out.println(ColeccionContactos.buscarContacto("mujer"));
    }
}
