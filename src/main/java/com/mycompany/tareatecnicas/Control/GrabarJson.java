/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareatecnicas.Control;

import BD.PersonaDAO;
import com.google.gson.Gson;
import com.mycompany.tareatecnicas.Models.ContactoHombre;
import com.mycompany.tareatecnicas.Models.ContactoMujer;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;
import com.mycompany.tareatecnicas.Models.Persona;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

/**
 *
 * @author margot.lopez
 */
public class GrabarJson {

    public static void main(String[] args) throws IOException, ParseException {
      
        Gson gson = new Gson(); 
        String fileJson2 = "src\\main\\java\\Datos\\info.json";
        PersonaDAO perdao = new PersonaDAO();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileJson2))) {
            bw.write("[");
            bw.newLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        ArrayList<Persona> personas = perdao.obtenerPersonas();
        for (int i=0; i < personas.size();i++) {
            Persona persona = personas.get(i);
            String infomia = persona.toString();
            Properties properties = gson.fromJson(infomia, Properties.class);
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            Date dataFormateada = formato.parse(properties.getProperty("fecha"));
            Calendar cal = Calendar.getInstance();
            cal.setTime(dataFormateada);
            if (Integer.parseInt(properties.getProperty("intencion"))  >= 0) {
                    ContactoMujer person = new ContactoMujer();
                    person.setNombre(properties.getProperty("nombre"));
                    person.setTelelfono(properties.getProperty("telelfono"));
                    person.setIntension(Integer.parseInt(properties.getProperty("intencion")));
                    person.setFecha(cal);
                    infomia = person.toStringJSON();
                }
                else{
                    ContactoHombre person = new ContactoHombre();
                    person.setNombre(properties.getProperty("nombre"));
                    person.setTelelfono(properties.getProperty("telelfono"));
                    person.setFecha(cal);
                    infomia = person.toStringJSON();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileJson2,true))) {
                bw.write(infomia);
                if (i < personas.size()-1) {
                    bw.append(",");
                }
                bw.newLine();
            } catch (IOException ex) {
                System.out.println(ex);
                //Logger.getLogger(ArchivosJSON.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileJson2,true))) {
            bw.write("]");
        } catch (IOException ex) {
            System.out.println(ex);
        }
   }
}
