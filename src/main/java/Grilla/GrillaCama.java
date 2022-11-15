/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grilla;

import com.mycompany.parcialfinalparadigmasiii.Objetos.Cama;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author U632698
 */
public class GrillaCama extends AbstractTableModel {
private ArrayList<Cama>camas = new ArrayList<>();
 public GrillaCama(ArrayList<Cama> datos) {
        this.camas = datos;
    }    @Override
    public int getRowCount() {

return camas.size();

    }

    @Override
    public int getColumnCount() {
return 3;


    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cama cama= camas.get(rowIndex);
         switch(columnIndex){
              case 0: return cama.getNumero();
              case 1: return cama.getEstado();
              case 2: return cama.getHabitacion();
              default: return "";
          }    }
    
     @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "NRO CAMA";
            case 1: return "ESTADO";
            case 2: return "HABITACION";
       
            default: return "";
        
        
        }
    }
public Cama getCamaFromRow(int rowIndex){
   
    return camas.get(rowIndex);    
    
    } 
}
