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
public class PanelDeInternacion extends javax.swing.JFrame {
    Habitacion habitacion= new Habitacion();
    Cama cama= new Cama();
    
              ArrayList<Internacion> internaciones;
              ArrayList<Cama> camas;
        ControladorCama controladorcama= new ControladorCama();

    ControladorInternacion controladorinternacion=new ControladorInternacion();
    GrillaCama grillacama;
    GrillaInternacion grillainternacion;
    

    /**
     * Creates new form PanelDeInternacion
     */
    public PanelDeInternacion() {
        initComponents();
        try {
            //creo las grillas de la ui y se verifica las camas disponibles al iniciar
            internaciones = new ArrayList(); 
            internaciones = controladorinternacion.listar();
            camas= new ArrayList(); 
            camas=controladorcama.listar();
            grillainternacion = new GrillaInternacion(internaciones);
            grillacama= new GrillaCama(camas);
            jtCamas.setModel(grillacama);
           jtInternaciones.setModel(grillainternacion);
           
            for (int i = 0; i<camas.size(); i++) {
                Cama cama = camas.get(i);
                String disponibilidad= cama.getEstado();
                if(disponibilidad.equals("Disponible")){
                 String numcama=String.valueOf(cama.getNumero());
                   cb_Cama.addItem(numcama);
                }
            }

        } catch (Exception e) {
            e.printStackTrace ();
        } 
    
        //el if es para saber el numero id de internacion 
               if (grillainternacion.getRowCount()==0){
                 num_internacion.setText(String.valueOf(0));

               }else{
               Internacion internacion= new Internacion();
      //       internacion=grillainternacion.getInternacionFromRow(jtListadoCliente.getWidth());
          num_internacion.setText(String.valueOf(grillainternacion.getRowCount()));
          
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtf_Fecha = new javax.swing.JTextField();
        jtf_Nombre = new javax.swing.JTextField();
        jtf_Diagnostico = new javax.swing.JTextField();
        b_desocuparcama = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInternaciones = new javax.swing.JTable();
        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel6 = new javax.swing.JLabel();
        cb_Cama = new javax.swing.JComboBox<>();
        num_internacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCamas = new javax.swing.JTable();
        b_AgregarPaciente1 = new javax.swing.JButton();
        b_editar = new javax.swing.JButton();
        b_habitaciones = new javax.swing.JButton();

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

        jLabel1.setText("N Y A del Paciente:");

        jLabel2.setText("Fecha de Internacion:");

        jLabel3.setText("Diagnostico (Obligatorio)");

        jtf_Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_FechaActionPerformed(evt);
            }
        });

        jtf_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_NombreActionPerformed(evt);
            }
        });

        jtf_Diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_DiagnosticoActionPerformed(evt);
            }
        });

        b_desocuparcama.setBackground(new java.awt.Color(255, 153, 0));
        b_desocuparcama.setText("Desocupar Camas");
        b_desocuparcama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_desocuparcamaActionPerformed(evt);
            }
        });

        jtInternaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jtInternaciones.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtInternacionesAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jtInternaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtInternacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtInternaciones);

        jLabel6.setText("Cama:");

        cb_Cama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_CamaActionPerformed(evt);
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
        jScrollPane2.setViewportView(jtCamas);

        b_AgregarPaciente1.setText("Agregar Paciente");
        b_AgregarPaciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_AgregarPaciente1ActionPerformed(evt);
            }
        });

        b_editar.setText("Editar");
        b_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editarActionPerformed(evt);
            }
        });

        b_habitaciones.setBackground(new java.awt.Color(255, 255, 0));
        b_habitaciones.setText("Habitaciones & Ubicaciones");
        b_habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_habitacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num_internacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_Fecha))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtf_Nombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_Diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addComponent(cb_Cama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_AgregarPaciente1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                        .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(313, 313, 313))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_desocuparcama)
                            .addComponent(b_habitaciones))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jtf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(num_internacion))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jtf_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jtf_Diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(cb_Cama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(b_editar)
                                        .addComponent(b_AgregarPaciente1)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(b_habitaciones)
                                .addGap(32, 32, 32)
                                .addComponent(b_desocuparcama)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_FechaActionPerformed

    private void jtf_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_NombreActionPerformed

    private void jtf_DiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_DiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_DiagnosticoActionPerformed

    private void b_desocuparcamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_desocuparcamaActionPerformed
        // TODO add your handling code here:
Desocupar desocuparcamas= new Desocupar();
desocuparcamas.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_b_desocuparcamaActionPerformed

    private void jtInternacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtInternacionesMouseClicked
//Accion que va a servir para cuando quieramos editar un registro ya que seleccionamos una columna
        Internacion internacion= new Internacion();
        internacion=grillainternacion.getInternacionFromRow(jtInternaciones.getSelectedRow());
        jtf_Nombre.setText(internacion.getPaciente());
        String date=String.valueOf(internacion.getFecha());
        jtf_Diagnostico.setText(internacion.getDiagnostico());
        jtf_Fecha.setText(date);

    }//GEN-LAST:event_jtInternacionesMouseClicked

    private void jtInternacionesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtInternacionesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtInternacionesAncestorAdded

    private void jtCamasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtCamasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCamasAncestorAdded

    private void jtCamasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCamasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCamasMouseClicked

    private void cb_CamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_CamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_CamaActionPerformed

    private void b_AgregarPaciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_AgregarPaciente1ActionPerformed
        //Creamos una internacion y vamos pasando valores, al igual que una cama para la misma
 Internacion internacion= new Internacion();
Integer id=Integer.valueOf(num_internacion.getText())+ 1;
internacion.setId(id);
num_internacion.setText(String.valueOf(id));
Cama cama= new Cama();
String numcama=cb_Cama.getSelectedItem().toString();
Integer num=Integer.parseInt(numcama);
cama.setNumero(num);
        try {
            cama=controladorcama.buscarcama(cama);
        } catch (Exception ex) {
            Logger.getLogger(PanelDeInternacion.class.getName()).log(Level.SEVERE, null, ex);
        }
cama.setEstado("Ocupada");
internacion.setPaciente(jtf_Nombre.getText());
internacion.setDiagnostico(jtf_Diagnostico.getText());
internacion.setCama(cama);
//Verificamos que no se ingrese un diagnostico vacio
if(internacion.getDiagnostico().equals("")){
    jOptionPane1.showMessageDialog(jOptionPane1, "El ingreso de diagnostico es obligatorio");
} else{
String fecha=jtf_Fecha.getText();
            Date date=Date.valueOf(fecha);
            internacion.setFecha(date);
        cb_Cama.removeAllItems();
}
Integer contador=internaciones.size();
//if para el primer ingreso cuando el tamaño del array es 0 por el for de mas abajo
   if(internaciones.size()==0){
     try {
         //creamos la internacion en la bd y actualizamos la grilla ui
         internaciones.add(internacion);
         controladorinternacion.crear(internacion);
         controladorinternacion.listar();
         grillainternacion=new GrillaInternacion(internaciones);
         jtInternaciones.setModel(grillainternacion);
         //actualizamos las listas de camas e internaciones una vez guardada una nueva internacion
         controladorcama.modificar(cama);
         camas=controladorcama.listar();
         //
         //le actualizamos los datos a la grilla de la ui
         grillacama=new GrillaCama(camas);
         jtCamas.setModel(grillacama);
         //para actualizar las camas disponibles una vez que ocupamos una cama nueva
         for (int z = 0; z<camas.size(); z++) {
             cama = camas.get(z);
             String disponibilidad= cama.getEstado();
             if(disponibilidad.equals("Disponible")){
                 String numerocama=String.valueOf(cama.getNumero());
                 cb_Cama.addItem(numerocama);
             }}
     } catch (Exception ex) {
         Logger.getLogger(PanelDeInternacion.class.getName()).log(Level.SEVERE, null, ex);
     }
       
   } else{//cuando el ingreso no es el primero en la bd, ingresa por aca 

       String ayuda = null;
       //ciclo para verificar los nombres repetidos ya que el paciente no puede ser ingresado dos veces
        for(int i=0; i<internaciones.size();i++){
            Internacion internado=internaciones.get(i);
            String nombre=internado.getPaciente();
            if(nombre.equals(internacion.getPaciente())){
          jOptionPane1.showMessageDialog(jOptionPane1, "El paciente ya existe en el sistema");
           ayuda= "el paciente existe";
           //para actualizar las camas disponibles cuando se toca el boton agregar paciente
                    for (int z = 0; z<camas.size(); z++) {
                        cama = camas.get(z);
                        String disponibilidad= cama.getEstado();
                        if(disponibilidad.equals("Disponible")){
                            String numerocama=String.valueOf(cama.getNumero());
                            cb_Cama.addItem(numerocama);
                        }}
          break;
            } else if(i<contador){
            }
                          ayuda="el paciente no existe";
        }
        //una vez que salimos del for verificamos definitivamente que el paciente no exista
        //con un string y si no existe procedemos a registrar la internacion
if(ayuda.equals("el paciente no existe")){
            try {
                    //se agrega la internacion a la lista de internaciones
                    internaciones.add(internacion);
                    //se agrega la internacion a la base de datos
                    controladorinternacion.crear(internacion);
                    //listamos la nueva base de datos con la internacion agregada
                    controladorinternacion.listar();
                   // actualizamos la grilla de la UI
                    grillainternacion=new GrillaInternacion(internaciones);
                    jtInternaciones.setModel(grillainternacion);
                    //actualizamos las listas de camas e internaciones una vez guardada una nueva internacion
                    controladorcama.modificar(cama);
                    camas=controladorcama.listar();
                    //le actualizamos los datos a la grilla de la ui
                    grillacama=new GrillaCama(camas);
                    jtCamas.setModel(grillacama);
                    //para actualizar las camas disponibles una vez que ocupamos una cama nueva
                    for (int z = 0; z<camas.size(); z++) {
                        cama = camas.get(z);
                        String disponibilidad= cama.getEstado();
                        if(disponibilidad.equals("Disponible")){
                            String numerocama=String.valueOf(cama.getNumero());
                            cb_Cama.addItem(numerocama);
                        }}
                } catch (Exception ex) {
                    Logger.getLogger(PanelDeInternacion.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
          
}     
    }//GEN-LAST:event_b_AgregarPaciente1ActionPerformed

    private void b_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarActionPerformed
//if para comprobar que se seleccione una internacion para ser editada
        if(jtf_Diagnostico.getText().equals("")){
    jOptionPane1.showMessageDialog(jOptionPane1, "Para editar primero seleccione una de las internaciones de la grilla");  
} 


//Creamos una internacion y vamos pasando valores, al igual que una cama para la misma
 Internacion internacion= new Internacion();
 internacion=grillainternacion.getInternacionFromRow(jtInternaciones.getSelectedRow());
String numcama=cb_Cama.getSelectedItem().toString();
Integer num=Integer.parseInt(numcama);
internacion.setDiagnostico(jtf_Diagnostico.getText());
//Verificamos que no se ingrese un diagnostico vacio
if(internacion.getDiagnostico().equals("")){
    jOptionPane1.showMessageDialog(jOptionPane1, "El ingreso de diagnostico es obligatorio");
} else{
String fecha=jtf_Fecha.getText();
            Date date=Date.valueOf(fecha);
            internacion.setFecha(date);
}

            try {
                    //se edita la internacion a la lista de internaciones
                    controladorinternacion.modificar(internacion);
                    //listamos la nueva base de datos con la internacion agregada
                    controladorinternacion.listar();
                   // actualizamos la grilla de la UI
                    grillainternacion=new GrillaInternacion(internaciones);
                    jtInternaciones.setModel(grillainternacion);
            
                    
                } catch (Exception ex) {
                    Logger.getLogger(PanelDeInternacion.class.getName()).log(Level.SEVERE, null, ex);
                }
        

    }//GEN-LAST:event_b_editarActionPerformed

    private void b_habitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_habitacionesActionPerformed
Habitaciones habitaciones=new Habitaciones();
habitaciones.setVisible(true);
this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_b_habitacionesActionPerformed

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
            java.util.logging.Logger.getLogger(PanelDeInternacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelDeInternacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelDeInternacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelDeInternacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelDeInternacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_AgregarPaciente1;
    private javax.swing.JButton b_desocuparcama;
    private javax.swing.JButton b_editar;
    private javax.swing.JButton b_habitaciones;
    private javax.swing.JComboBox<String> cb_Cama;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtCamas;
    private javax.swing.JTable jtInternaciones;
    private javax.swing.JTextField jtf_Diagnostico;
    private javax.swing.JTextField jtf_Fecha;
    private javax.swing.JTextField jtf_Nombre;
    private javax.swing.JLabel num_internacion;
    // End of variables declaration//GEN-END:variables
}
