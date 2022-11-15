/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grilla;

import com.mycompany.parcialfinalparadigmasiii.Objetos.Ubicacion;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author U632698
 */
public class GrillaUbicacion extends AbstractTableModel {
    private ArrayList<Ubicacion> ubicaciones = new ArrayList();
public GrillaUbicacion(ArrayList<Ubicacion>datos){
    this.ubicaciones=datos;
}
        
    @Override
    public int getRowCount() {
return ubicaciones.size();
    }

    @Override
    public int getColumnCount() {
return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ubicacion ubicacion=ubicaciones.get(rowIndex);
         switch(columnIndex){
              case 0: return ubicacion.getId();
              case 1: return ubicacion.getHospital();
              case 2: return ubicacion.getNombre();
              default: return "";
          }
    }
     @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "ID UBICACION";
            case 1: return "HOSPITAL";
            case 2: return "NOMBRE";      
            default: return "";
        
        
        }}
     public Ubicacion getUbicacionFromRow(int rowIndex){
  
            return ubicaciones.get(rowIndex);
   
    
     }
}
