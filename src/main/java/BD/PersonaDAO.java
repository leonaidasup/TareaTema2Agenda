/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

/**
 *
 * @author yo-
 */

import com.google.gson.Gson;
import com.mycompany.tareatecnicas.Models.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JOptionPane;

public class PersonaDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    BD conexion = null;

    public void agregar(Persona p) {
        try {
            conn = conexion.getConexion();
            Statement st = conn.createStatement();
            String query = "INSERT INTO contactos (Nombre, Teléfono, Intencion, Encuentro) values (?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            Gson gson = new Gson();
            String infomia = p.toString();
            Properties properties = gson.fromJson(infomia, Properties.class);
            ps.setString(1, properties.getProperty("nombre"));
            ps.setString(2, properties.getProperty("telelfono"));
            ps.setInt(3, Integer.parseInt(properties.getProperty("intencion")));
            ps.setString(4, properties.getProperty("fecha"));
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }
    }
    
    public void eliminar(Persona p) {
        try {
            conn = conexion.getConexion();
            Statement st = conn.createStatement();
            String query = "DELETE FROM contactos WHERE Nombre=? AND Teléfono=?";
            ps = conn.prepareStatement(query);
            Gson gson = new Gson();
            String infomia = p.toString();
            Properties properties = gson.fromJson(infomia, Properties.class);
            ps.setString(1, properties.getProperty("nombre"));
            ps.setString(2, properties.getProperty("telelfono"));
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "El usuario " + p.getNombre() + " se eliminó.");
            }
            else{
                JOptionPane.showMessageDialog(null, "El usuario " + p.getNombre() + " no se eliminó.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }
    }
    
    public void actualizarPerson(Persona nueva, Persona anterior){
        try {
            conn = conexion.getConexion();
            Statement st = conn.createStatement();
            String query = "UPDATE contactos SET Nombre = ?, Teléfono = ?, Intencion = ?, Encuentro = ? WHERE Nombre = ? AND Teléfono = ?";
            ps = conn.prepareStatement(query);
            Gson gson = new Gson();
            String infomia = nueva.toString();
            Properties properties = gson.fromJson(infomia, Properties.class);
            ps.setString(1, properties.getProperty("nombre"));
            ps.setString(2, properties.getProperty("telelfono"));
            ps.setInt(3, Integer.parseInt(properties.getProperty("intencion")));
            ps.setString(4, properties.getProperty("fecha"));
            infomia = anterior.toString();
            properties = gson.fromJson(infomia, Properties.class);
            ps.setString(5, properties.getProperty("nombre"));
            ps.setString(6, properties.getProperty("telelfono"));
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* ignored */ }
        }
    }

    public ArrayList<Persona> obtenerPersonas() {
        ArrayList<Persona> personas = new ArrayList<>();
        try {
            conn = BD.getConexion();
            String query = "SELECT * FROM contactos";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                int intencion = rs.getInt("Intencion");
                String cal = rs.getString("Encuentro");
                String nombre= rs.getString("Nombre");
                String telefono = rs.getString("Teléfono");
                if (intencion >= 0) {
                    ContactoMujer persona = new ContactoMujer();
                    persona.setNombre(nombre);
                    persona.setTelelfono(telefono);
                    persona.setIntension(intencion);
                    persona.setFecha(cal);
                    personas.add(persona);
                }
                else{
                    ContactoHombre persona = new ContactoHombre();
                    persona.setNombre(nombre);
                    persona.setTelelfono(telefono);
                    persona.setFecha(cal);
                    personas.add(persona);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return personas;
    }

}
