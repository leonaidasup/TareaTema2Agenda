/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareatecnicas.Control;
import com.mycompany.tareatecnicas.Models.Persona;
/**
 *
 * @author leona
 */
public class AgregarContacto {
    public static void agregarContacto(Persona contacto){
        ColeccionContactos.addListaContactos(contacto);
    }
}
