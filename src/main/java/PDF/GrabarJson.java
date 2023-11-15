/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF;

import BD.PersonaDAO;
import com.google.gson.Gson;
import com.mycompany.tareatecnicas.Models.ContactoHombre;
import com.mycompany.tareatecnicas.Models.ContactoMujer;
import com.mycompany.tareatecnicas.Models.Persona;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Properties;

public class GrabarJson {

    public static void Grabar() throws IOException, ParseException {
        Gson gson = new Gson();
        String fileJson2 = "src\\resources\\info.json";

        PersonaDAO perdao = new PersonaDAO();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileJson2))) {
            bw.write("[");
            bw.newLine();

            ArrayList<Persona> personas = perdao.obtenerPersonas();
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                String infomia = persona.toString();
                Properties properties = gson.fromJson(infomia, Properties.class);
                String cal = properties.getProperty("fecha");

                if (Integer.parseInt(properties.getProperty("intencion")) >= 0) {
                    ContactoMujer person = new ContactoMujer();
                    person.setNombre(properties.getProperty("nombre"));
                    person.setTelelfono(properties.getProperty("telelfono"));
                    person.setIntension(Integer.parseInt(properties.getProperty("intencion")));
                    person.setFecha(cal);
                    infomia = person.toStringJSON();
                } else {
                    ContactoHombre person = new ContactoHombre();
                    person.setNombre(properties.getProperty("nombre"));
                    person.setTelelfono(properties.getProperty("telelfono"));
                    person.setFecha(cal);
                    infomia = person.toStringJSON();
                }

                bw.write(infomia);
                if (i < personas.size() - 1) {
                    bw.append(",");
                }
                bw.newLine();
            }

            bw.write("]");
        } catch (IOException ex) {
            // Manejar las excepciones específicas aquí
            ex.printStackTrace();
            // Puedes lanzar la excepción nuevamente si es necesario
            throw ex;
        } catch (Exception ex) {
            // Manejar excepciones generales aquí
            ex.printStackTrace();
        }
    }
}
