/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tareatecnicas.View;

import com.mycompany.tareatecnicas.Control.AgregarContacto;
import com.mycompany.tareatecnicas.Models.ContactoHombre;
import com.mycompany.tareatecnicas.Models.ContactoMujer;
import javax.swing.JOptionPane;
import BD.PersonaDAO;
/**
 *
 * @author leona
 */
public class Agregar extends javax.swing.JFrame {
    public Agregar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        agregarcontactobutton = new javax.swing.JButton();
        intencionbox = new javax.swing.JComboBox<>();
        mujercheck = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        editortelefono = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editornombre = new javax.swing.JEditorPane();
        jLabel4 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        año = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(214, 227, 248));

        agregarcontactobutton.setText("Agregar");
        agregarcontactobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarcontactobuttonActionPerformed(evt);
            }
        });

        intencionbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intencion", "Muy buena", "Buena", "Neutra" }));
        intencionbox.setEnabled(false);
        intencionbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intencionboxActionPerformed(evt);
            }
        });

        mujercheck.setText("Mujer");
        mujercheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mujercheckActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de reunion");

        jScrollPane2.setViewportView(editortelefono);

        jLabel2.setText("Telefono");

        jLabel1.setText("Nombre");

        jScrollPane1.setViewportView(editornombre);

        jLabel4.setText("Agregar contacto");

        dia.setText("dia");
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        mes.setText("mes");

        año.setText("año");
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarcontactobutton)
                            .addComponent(mujercheck, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(intencionbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 29, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))))
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mujercheck)
                    .addComponent(intencionbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(agregarcontactobutton)
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void agregarcontactobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarcontactobuttonActionPerformed
        try {
            String nombre = editornombre.getText();
            if ("".equals(nombre)){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo nombre.");
            }
            String telefono = editortelefono.getText();
            if ("".equals(telefono)){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo telefono.");
            }
            int diaFecha = Integer.parseInt(dia.getText());
            if (diaFecha < 1 || diaFecha > 31 ){
                JOptionPane.showMessageDialog(null, "Los días se encuentra en un rango de 1 a 31.");
            }
            int mesFecha = Integer.parseInt(mes.getText());
            if (diaFecha < 1 || diaFecha > 12 ){
                JOptionPane.showMessageDialog(null, "Los meses se encuentra en un rango de 1 a 12.");
            }
            int añoFecha = Integer.parseInt(año.getText());
            if (mujercheck.isSelected()) {
                int intencion = intencionbox.getSelectedIndex();
                if (intencion == 0){
                    JOptionPane.showMessageDialog(null, "Decida tu intencion.");
                } else {
                    ContactoMujer contacto = new ContactoMujer(nombre, telefono, añoFecha + "-" + mesFecha + "-" + diaFecha, intencion);
                    AgregarContacto.agregarContacto(contacto);
                    new PersonaDAO().agregar(contacto);
                }               
            } else {
                ContactoHombre contacto = new ContactoHombre(nombre, telefono, añoFecha + "-" + mesFecha + "-" + diaFecha);
                AgregarContacto.agregarContacto(contacto);    
                new PersonaDAO().agregar(contacto);
            }   
            JOptionPane.showMessageDialog(null, "Se guardó al usuario " + nombre + ".");
            Menu menuFrame = new Menu();
            menuFrame.setVisible(true);
            this.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Para el campo fecha solamente se admiten enteros.");
        }
    }//GEN-LAST:event_agregarcontactobuttonActionPerformed

    private void mujercheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mujercheckActionPerformed
        intencionbox.setEnabled(mujercheck.isSelected());
    }//GEN-LAST:event_mujercheckActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoActionPerformed

    private void intencionboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intencionboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intencionboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarcontactobutton;
    private javax.swing.JTextField año;
    private javax.swing.JTextField dia;
    private javax.swing.JEditorPane editornombre;
    private javax.swing.JEditorPane editortelefono;
    private javax.swing.JComboBox<String> intencionbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mes;
    private javax.swing.JCheckBox mujercheck;
    // End of variables declaration//GEN-END:variables
}
