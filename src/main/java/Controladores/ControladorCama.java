/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import com.mycompany.parcialfinalparadigmasiii.Connection.ConexionBD;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Cama;
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
public class ControladorCama implements ICrud<Cama> {
private Connection connection;
    
    private Statement stmt;
    
    private PreparedStatement ps;
    
    private ResultSet rs;
    
    private String sql;
   
    private ControladorCama controladorCama;

    @Override
    public boolean crear(Cama entidad) throws SQLException, Exception {
connection = ConexionBD.obtenerConexion();
   String sql = "INSERT INTO cama(numero, estado, habitacion) VALUES (?,?,?) ";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getNumero());
            ps.setString(2, entidad.getEstado());
            ps.setInt(3, entidad.getHabitacion());
            ps.executeUpdate();
            connection.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(ControladorInternacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }

    @Override
    public boolean eliminar(Cama entidad) throws SQLException, Exception {
        connection = ConexionBD.obtenerConexion();
        String sql = "DELETE FROM cama WHERE numero =?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getNumero());
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCama.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    @Override
    public Cama extraer(int id) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Cama entidad) throws SQLException, Exception {
connection = ConexionBD.obtenerConexion();
            this.sql = "UPDATE cama SET numero=?,estado=?, habitacion=? WHERE numero=?";
            try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getNumero());
            ps.setString(2, entidad.getEstado() );
            ps.setInt(3, entidad.getHabitacion());
            ps.setInt(4,entidad.getNumero() );
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCama.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;

    }
    @Override
    public ArrayList<Cama> listar() throws SQLException, Exception {
connection = ConexionBD.obtenerConexion();
        
  
            this.stmt = connection.createStatement();
            this.sql = "SELECT * FROM cama ORDER BY numero";
            this.rs   = stmt.executeQuery(sql);
            connection.close();
            ArrayList<Cama> camas =new ArrayList();
            
            while(rs.next()){     
               
                Cama cama=new Cama();
                cama.setNumero(rs.getInt("numero"));
                cama.setEstado(rs.getString("estado"));
                cama.setHabitacion(rs.getInt("habitacion"));
                camas.add(cama);
                                
            }
            return camas;
        }    
     public Cama buscarcama(Cama entidad) throws SQLException, Exception {
            Cama cama=new Cama();
           connection = ConexionBD.obtenerConexion();
            this.stmt = connection.createStatement();
            this.sql = "SELECT * FROM cama WHERE numero= " + entidad.getNumero() + ";";
            this.rs   = stmt.executeQuery(sql);
            connection.close();
             ArrayList<Cama> camas =new ArrayList();
            while(rs.next()){ 
                cama.setNumero(rs.getInt("numero"));
                cama.setEstado(rs.getString("estado"));
                cama.setHabitacion(rs.getInt("habitacion"));
                camas.add(cama);
            }
            return cama;
        }    
}