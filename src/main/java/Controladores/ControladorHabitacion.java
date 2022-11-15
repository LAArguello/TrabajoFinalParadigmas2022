/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import com.mycompany.parcialfinalparadigmasiii.Connection.ConexionBD;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Cama;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Habitacion;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Ubicacion;
import java.sql.Array;
import java.sql.Connection;
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
public class ControladorHabitacion implements ICrud<Habitacion>{
private Connection connection;
    
    private Statement stmt;
    
    private PreparedStatement ps;
    
    private ResultSet rs;
    
    private String sql;
    
    private ControladorHabitacion ControladorHabitacion;
    
    @Override
    public boolean crear(Habitacion entidad) throws SQLException, Exception {
connection = ConexionBD.obtenerConexion();
   String sql = "INSERT INTO habitacion(numero, ubicacion) VALUES (?,?) ";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getNumero());
            ps.setInt(2,entidad.getUbicacion());         
            ps.executeUpdate();
            connection.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(ControladorInternacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public boolean eliminar(Habitacion entidad) throws SQLException, Exception {
 connection = ConexionBD.obtenerConexion();
        String sql = "DELETE FROM Habitacion WHERE numero =?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getNumero());
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorHabitacion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }

    @Override
    public Habitacion extraer(int id) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Habitacion entidad) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Habitacion> listar() throws SQLException, Exception {
connection = ConexionBD.obtenerConexion();
        try{
            
            this.stmt = connection.createStatement();
            this.sql = "SELECT * FROM habitacion ORDER BY numero";
            this.rs   = stmt.executeQuery(sql);
            connection.close();
            
            ArrayList<Habitacion> habitaciones = new ArrayList();
            
            while(rs.next()){    
                Habitacion habitacion=new Habitacion();
                habitacion.setNumero(rs.getInt(("numero")));
                habitacion.setUbicacion(rs.getInt("ubicacion"));
                habitaciones.add(habitacion);
                      }
            return habitaciones;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;

    }
    
}
