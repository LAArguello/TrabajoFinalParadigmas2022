/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.parcialfinalparadigmasiii.UI;

import Controladores.ControladorCama;
import Controladores.ControladorHabitacion;
import Controladores.ControladorInternacion;
import Controladores.ControladorUbicacion;
import Grilla.GrillaCama;
import Grilla.GrillaHabitacion;
import Grilla.GrillaInternacion;
import Grilla.GrillaUbicacion;
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
public class Habitaciones extends javax.swing.JFrame {
   Habitacion habitacion= new Habitacion();
   Ubicacion ubicacion= new Ubicacion();
   Cama cama= new Cama();
     ArrayList<Habitacion> habitaciones;
     ArrayList<Cama> camas;
     ArrayList<Ubicacion> ubicaciones;
     ControladorUbicacion controladorubicacion= new ControladorUbicacion();
     ControladorCama controladorcama=new ControladorCama();
     ControladorHabitacion controladorhabitacion= new ControladorHabitacion();
     GrillaHabitacion grillahabitacion;
     GrillaCama grillacama;
     GrillaUbicacion grillaubicacion;
     
    

    /**
     * Creates new form PanelDeInternacion
     */
    public Habitaciones() {
        initComponents();
        habitaciones= new ArrayList();
        camas= new ArrayList();
        Integer numerohabitacion;
        
        try {
            //se listan las habitaciones y camas para llenar las grillas y cbox
            habitaciones=controladorhabitacion.listar();
            grillahabitacion= new GrillaHabitacion(habitaciones);
            jtHabitacion.setModel(grillahabitacion);
            camas=controladorcama.listar();
            grillacama= new GrillaCama(camas);
            jtCamas.setModel(grillacama);
            //numero cama sirve para darle valor a la proxima cama
            Integer numerocama=camas.size() + 1;
            jl_numcama.setText(String.valueOf(numerocama));
            // este ciclo sirve para traer los numeros de habitaciones disponibles
            for(int i=0; i<habitaciones.size();i++){
                habitacion=habitaciones.get(i);
                cb_habitacion.addItem(String.valueOf(habitacion.getNumero()));
            }
// el nuevo numero de habitacion va a ser el ultimo + uno
                numerohabitacion=habitaciones.size() + 1;
                jl_numHabitacion.setText(String.valueOf(numerohabitacion));
       
            ubicaciones=controladorubicacion.listar();
            //For para traer las ubicaciones para agregar la habitacion
            for(int i=0;i<ubicaciones.size(); i++){
                ubicacion=ubicaciones.get(i);
                cb_ubicacion.addItem(ubicacion.getHospital());
            }
        } catch (Exception ex) {
            Logger.getLogger(Habitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    
       
             
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        num_internacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtHabitacion = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_ubicacion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtCamas = new javax.swing.JTable();
        jl_numHabitacion = new javax.swing.JLabel();
        jl_numcama = new javax.swing.JLabel();
        cb_habitacion = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        jtHabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jtHabitacion.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtHabitacionAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jtHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtHabitacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtHabitacion);

        jLabel2.setText("Numero de habitacion: ");

        jLabel3.setText("Ubicacion:");

        jButton1.setText("Agregar Habitacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Numero de cama:");

        jLabel8.setText("Habitacion:");

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
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtCamasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jtCamas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCamasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtCamas);

        jButton2.setText("Añadir Cama");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setText("Volver a Internaciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_numHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_internacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_numcama, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(25, 25, 25))))
            .addGroup(layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(num_internacion)
                .addGap(20, 20, 20)
                .addComponent(jButton3)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jl_numcama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cb_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jl_numHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtHabitacionAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtHabitacionAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHabitacionAncestorAdded

    private void jtHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHabitacionMouseClicked

    }//GEN-LAST:event_jtHabitacionMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

this.setVisible(false);

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jtCamasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtCamasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCamasAncestorAdded

    private void jtCamasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCamasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCamasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //creo la habitacion y empiezo a setear los valores para la misma
      Habitacion habitacion= new Habitacion();
           habitacion.setNumero(Integer.valueOf(jl_numHabitacion.getText()));
        try {
           ubicaciones=controladorubicacion.listar();
           //For para traer el id de la ubicacion
           for(int i=0;i<ubicaciones.size(); i++){
               ubicacion=ubicaciones.get(i);
               if(ubicacion.getHospital().equals(cb_ubicacion.getSelectedItem())){
                              habitacion.setUbicacion(ubicacion.getId());
               }
           }
           habitaciones.add(habitacion);
           controladorhabitacion.crear(habitacion);
          habitaciones= controladorhabitacion.listar();
           grillahabitacion=new GrillaHabitacion(habitaciones);
           jtHabitacion.setModel(grillahabitacion);
           Integer numerohabitacion=habitaciones.size() + 1;
                jl_numHabitacion.setText(String.valueOf(numerohabitacion));
                 // este ciclo sirve para traer los numeros de habitaciones disponibles
                                cb_habitacion.removeAllItems();
            for(int i=0; i<habitaciones.size();i++){
                habitacion=habitaciones.get(i);
                cb_habitacion.addItem(String.valueOf(habitacion.getNumero()));
            }
       } catch (Exception ex) {
           Logger.getLogger(Habitaciones.class.getName()).log(Level.SEVERE, null, ex);
       }
        
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//se crea un objeto tipo cama y se llenan sus valores 
        Cama cama= new Cama();
cama.setNumero(Integer.valueOf(jl_numcama.getText()));
cama.setEstado("Disponible");
Integer nhabitacion=Integer.valueOf(cb_habitacion.getSelectedItem().toString());
cama.setHabitacion(nhabitacion);
Integer ncama=cama.getNumero()+1;
jl_numcama.setText(Integer.toString(ncama));
       try {
           //se añade la cama al array para luego crearla en la base de datos, por ultimo se actualizan todas las grillas y cboxes.
           camas.add(cama);
           controladorcama.crear(cama);
           camas=controladorcama.listar();
           grillacama=new GrillaCama(camas);
           jtCamas.setModel(grillacama);
       } catch (Exception ex) {
           Logger.getLogger(Habitaciones.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.setVisible(false);
        PanelDeInternacion paneldeinternacion=new PanelDeInternacion();
        paneldeinternacion.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Habitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_habitacion;
    private javax.swing.JComboBox<String> cb_ubicacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jl_numHabitacion;
    private javax.swing.JLabel jl_numcama;
    private javax.swing.JTable jtCamas;
    private javax.swing.JTable jtHabitacion;
    private javax.swing.JLabel num_internacion;
    // End of variables declaration//GEN-END:variables
}
