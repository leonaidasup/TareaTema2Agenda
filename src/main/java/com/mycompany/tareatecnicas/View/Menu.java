/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tareatecnicas.View;

import com.mycompany.tareatecnicas.Control.PruebaPDF;
import com.google.gson.reflect.TypeToken;
import com.mycompany.tareatecnicas.Models.ContactoMujer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.mycompany.tareatecnicas.Control.ColeccionContactos;
import com.mycompany.tareatecnicas.Models.Persona;
import PDF.GrabarJson;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import BD.PersonaDAO;

/**
 *
 * @author leona
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        actualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregarbutton = new javax.swing.JButton();
        crearpdfbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        buscarcontactobutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        actualizarbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        eliminarbutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(142, 202, 230));

        jPanel1.setBackground(new java.awt.Color(214, 227, 248));

        jLabel1.setText("Agenda Portable");

        jLabel2.setText("Agregar contacto");

        jLabel4.setText("Generar PDF");

        agregarbutton.setText("Agregar");
        agregarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarbuttonActionPerformed(evt);
            }
        });

        crearpdfbutton.setText("Generar");
        crearpdfbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearpdfbuttonActionPerformed(evt);
            }
        });

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Manuel", "324", "0", null}
            },
            new String [] {
                "Nombre", "Telefono", "Estado", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tb);

        jLabel3.setText("Buscar contacto");

        buscarcontactobutton.setText("Buscar");
        buscarcontactobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarcontactobuttonActionPerformed(evt);
            }
        });

        jLabel5.setText("Actualizar");

        actualizarbutton.setText("Actualizar");
        actualizarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarbuttonActionPerformed(evt);
            }
        });

        jLabel6.setText("Eliminar");

        eliminarbutton.setText("Eliminar");
        eliminarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbuttonActionPerformed(evt);
            }
        });

        jLabel7.setText("Generar Json");

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eliminarbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buscarcontactobutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actualizarbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crearpdfbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(agregarbutton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(actualizarbutton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(buscarcontactobutton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(eliminarbutton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(crearpdfbutton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarbuttonActionPerformed
        Agregar agregarFrame = new Agregar();
        agregarFrame.setVisible(true);
    }//GEN-LAST:event_agregarbuttonActionPerformed
    
    private void actualizar(){
        DefaultTableModel model = (DefaultTableModel)tb.getModel();
        model.setRowCount(0);
        for (Persona contacto: ColeccionContactos.getListaContactos()){
            int intencion = -1;
            if (contacto instanceof ContactoMujer contactoMujer){
                intencion = contactoMujer.getIntension();
            }
            model.addRow(new Object[]{contacto.getNombre(), contacto.getTelelfono(), contacto.getTelelfono(), intencion});
        }   
    }
    
    private String leerContenidoJsonDesdeArchivo(String archivo) {
    StringBuilder contenidoJson = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            contenidoJson.append(linea);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return contenidoJson.toString();
    }
     
    private void crearpdfbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearpdfbuttonActionPerformed
        String contenidoJson = leerContenidoJsonDesdeArchivo("resources/info.json");

        java.lang.reflect.Type listType = new TypeToken<List<ContactoMujer>>(){}.getType();

        PruebaPDF.crearTablaDesdeJSON(contenidoJson, listType);
    }//GEN-LAST:event_crearpdfbuttonActionPerformed

    private void buscarcontactobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarcontactobuttonActionPerformed
        JOptionPane.showMessageDialog(null, ColeccionContactos.buscarContacto(JOptionPane.showInputDialog("Ingrese nombre:")));
    }//GEN-LAST:event_buscarcontactobuttonActionPerformed

    private void actualizarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarbuttonActionPerformed
       actualizar();
    }//GEN-LAST:event_actualizarbuttonActionPerformed

    private void eliminarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbuttonActionPerformed
        new PersonaDAO().eliminar(new Persona(JOptionPane.showInputDialog("Ingrese nombre:"),
                                    JOptionPane.showInputDialog("Ingrese telefono:"), "0000-00-00"));
    }//GEN-LAST:event_eliminarbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            GrabarJson.Grabar();
            JOptionPane.showMessageDialog(null, "Se guardó en .Json con exito.");
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarbutton;
    private javax.swing.JButton agregarbutton;
    private javax.swing.JButton buscarcontactobutton;
    private javax.swing.JButton crearpdfbutton;
    private javax.swing.JButton eliminarbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}
