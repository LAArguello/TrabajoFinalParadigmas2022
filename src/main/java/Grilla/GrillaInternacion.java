/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grilla;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Internacion;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author U632698
 */
public class GrillaInternacion extends AbstractTableModel {
  private ArrayList<Internacion> internaciones = new ArrayList<>();
    public GrillaInternacion(ArrayList<Internacion> datos) {
        this.internaciones = datos;
    }

   
    
    @Override
    public int getRowCount() {
        
        return internaciones.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Internacion internacion= internaciones.get(rowIndex);
         switch(columnIndex){
              case 0: return internacion.getId();
              case 1: return internacion.getPaciente();
              case 2: return internacion.getFecha();
              case 3: return internacion.getDiagnostico();
              case 4: return internacion.getCama().getNumero();
              default: return "";
          }
          }
        
        
   

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "NRO INTERNACION";
            case 1: return "PACIENTE";
            case 2: return "FECHA";
            case 3: return "DIAGNOSTICO";
            case 4: return "NUMERO DE CAMA";

        
                   
            default: return "";
        
        
        } //To change body of generated methods, choose Tools | Templates.
    }
 public Internacion getInternacionFromRow(int rowIndex){
   
            return internaciones.get(rowIndex);
   
    
    
    }   
}