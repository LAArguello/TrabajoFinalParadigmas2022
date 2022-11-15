/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grilla;

import com.mycompany.parcialfinalparadigmasiii.Objetos.Habitacion;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author U632698
 */
public class GrillaHabitacion extends AbstractTableModel  {
private ArrayList<Habitacion> habitaciones = new ArrayList();
public GrillaHabitacion(ArrayList<Habitacion>datos){
    this.habitaciones=datos;
}
        
    @Override
    public int getRowCount() {
return habitaciones.size();
    }

    @Override
    public int getColumnCount() {
return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Habitacion habitacion= habitaciones.get(rowIndex);
         switch(columnIndex){
              case 0: return habitacion.getNumero();
              case 1: return habitacion.getUbicacion();
              case 2: return habitacion.getCama();
              default: return "";
          }
    }
     @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "NRO HABITACION";
            case 1: return "UBICACION";
            case 2: return "CAMAS";
      
            default: return "";
        
        
        }}
     public Habitacion getHabitacionFromRow(int rowIndex){
  
            return habitaciones.get(rowIndex);
   
    
    
    }   
    
}
