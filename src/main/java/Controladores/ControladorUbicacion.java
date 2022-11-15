/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import com.mycompany.parcialfinalparadigmasiii.Connection.ConexionBD;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Cama;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Internacion;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Ubicacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arguello Leonel
 */
public class ControladorUbicacion implements ICrud<Ubicacion> {
private Connection connection;
    
    private Statement stmt;
    
    private PreparedStatement ps;
    
    private ResultSet rs;
    
    private String sql;

    private ControladorUbicacion ControladorUbicacion;
    
    
    @Override
    public boolean crear(Ubicacion entidad) throws SQLException, Exception {
         connection = ConexionBD.obtenerConexion();
   String sql = "INSERT INTO ubicacion(id, nombre, hospital) VALUES (?,?,?) ";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.setString(2, entidad.getNombre());
            ps.setString(2, entidad.getHospital());
            ps.executeUpdate();
            connection.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(ControladorInternacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;



    }

    @Override
    public boolean eliminar(Ubicacion entidad) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ubicacion extraer(int id) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Ubicacion entidad) throws SQLException, Exception {
connection = ConexionBD.obtenerConexion();
         
        this.sql= "UPDATE ubicacion SET id=?, nombre=?, hospital=? WHERE id=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.setString(2, entidad.getNombre());
            ps.setString(3, entidad.getHospital());
            ps.setInt(4, entidad.getId());
            ps.executeUpdate();
            connection.close();
          
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInternacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }

    @Override
    public ArrayList<Ubicacion> listar() throws SQLException, Exception {
connection = ConexionBD.obtenerConexion();
        try{
            
            this.stmt = connection.createStatement();
            this.sql = "SELECT * FROM ubicacion ORDER BY id";
            this.rs   = stmt.executeQuery(sql);
            connection.close();
            
            ArrayList<Ubicacion> ubicaciones = new ArrayList();
            
            while(rs.next()){     
                Ubicacion ubicacion=new Ubicacion();
                ubicacion.setId(rs.getInt("id"));
                ubicacion.setNombre(rs.getString("nombre"));
                ubicacion.setHospital(rs.getString("hospital"));
               ubicaciones.add(ubicacion);
                                                
            }
            return ubicaciones;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;


    }
    
}
