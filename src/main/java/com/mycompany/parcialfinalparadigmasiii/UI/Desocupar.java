/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.parcialfinalparadigmasiii.UI;

import Controladores.ControladorCama;
import Controladores.ControladorInternacion;
import Grilla.GrillaCama;
import Grilla.GrillaInternacion;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Cama;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Habitacion;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Internacion;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Ubicacion;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author U632698
 */
public class Desocupar extends javax.swing.JFrame {
   Cama cama= new Cama();
   Cama camaedicion=new Cama();

     ArrayList<Cama> camas;
        ControladorCama controladorcama= new ControladorCama();
    GrillaCama grillacama;
    

    /**
     * Creates new form PanelDeInternacion
     */
    public Desocupar() {
        initComponents();
         camas= new ArrayList(); 
        try {
            camas=controladorcama.listar();
             grillacama= new GrillaCama(camas);
            jtCamas.setModel(grillacama);
        } catch (Exception ex) {
            Logger.getLogger(Desocupar.class.getName()).log(Level.SEVERE, null, ex);
        }
    
       
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        b_desocuparcama = new javax.swing.JButton();
        num_internacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCamas = new javax.swing.JTable();
        b_Volver = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        b_desocuparcama.setText("Desocupar Cama");
        b_desocuparcama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_desocuparcamaActionPerformed(evt);
            }
        });

        jtCamas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4","Title 5"
            }
        ));
        jtCamas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtCamasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jtCamas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCamasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCamas);

        b_Volver.setText("Volver");
        b_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(num_internacion))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(b_desocuparcama)
                        .addGap(18, 18, 18)
                        .addComponent(b_Volver)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(num_internacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_desocuparcama)
                    .addComponent(b_Volver))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_desocuparcamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_desocuparcamaActionPerformed
        // TODO add your handling code here:
    camaedicion=grillacama.getCamaFromRow(jtCamas.getSelectedRow());
    System.out.println(camaedicion.getEstado());
       try {
           camaedicion.setEstado("Disponible");
           controladorcama.modificar(camaedicion);
           
           } catch (Exception ex) {
           Logger.getLogger(Desocupar.class.getName()).log(Level.SEVERE, null, ex);
       }
       ControladorInternacion controladorinternacion= new ControladorInternacion();
       Internacion internacion= new Internacion();
       internacion.setCama(camaedicion);
       try {
           //eliminamos la internacion desocupando la cama y se actualiza la grilla visual y de bd
           controladorinternacion.desocuparCama(internacion);
           camas=controladorcama.listar();
           grillacama= new GrillaCama(camas);
           jtCamas.setModel(grillacama);
       } catch (Exception ex) {
           Logger.getLogger(Desocupar.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_b_desocuparcamaActionPerformed

    private void jtCamasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtCamasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCamasAncestorAdded

    private void jtCamasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCamasMouseClicked

    }//GEN-LAST:event_jtCamasMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

this.setVisible(false);

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void b_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_VolverActionPerformed
this.setVisible(false);
PanelDeInternacion panel= new PanelDeInternacion();
panel.setVisible(true);
    }//GEN-LAST:event_b_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(Desocupar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desocupar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desocupar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desocupar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desocupar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Volver;
    private javax.swing.JButton b_desocuparcama;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtCamas;
    private javax.swing.JLabel num_internacion;
    // End of variables declaration//GEN-END:variables
}