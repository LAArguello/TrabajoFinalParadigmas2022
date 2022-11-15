/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import com.mycompany.parcialfinalparadigmasiii.Connection.ConexionBD;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Cama;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.parcialfinalparadigmasiii.Objetos.Internacion;


/**
 *
 * @author U632698
 */
public class ControladorInternacion implements ICrud<Internacion>  {
private Connection connection;
    
    private Statement stmt;
    
    private PreparedStatement ps;
    
    private ResultSet rs;
    
    private String sql;
    
    
    private ControladorInternacion controladorInternacion;
    
    
    
    
    @Override
    public boolean crear(Internacion entidad) throws SQLException, Exception {
         connection = ConexionBD.obtenerConexion();
         
        String sql = "INSERT INTO internacion(id, paciente, fecha, diagnostico, cama) VALUES (? ,?, ?, ?, ?);";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.setString(2, entidad.getPaciente());
            ps.setDate(3, (Date) entidad.getFecha());
            ps.setString(4, entidad.getDiagnostico());
            ps.setInt(5, entidad.getCama().getNumero());
            ps.executeUpdate();
            connection.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(ControladorInternacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
        
    }

    @Override
    public boolean eliminar(Internacion entidad) throws SQLException, Exception {
connection = ConexionBD.obtenerConexion();
        String sql = "DELETE FROM internacion WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInternacion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;    }

public boolean desocuparCama(Internacion entidad) throws SQLException, Exception {
connection = ConexionBD.obtenerConexion();
        String sql = "DELETE FROM internacion WHERE cama = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getCama().getNumero());
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInternacion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;    }
    

    @Override
    public Internacion extraer(int id) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Internacion entidad) throws SQLException, Exception {
connection = ConexionBD.obtenerConexion();
         
        this.sql= "UPDATE internacion SET paciente=?, fecha=?, diagnostico=?, cama=? WHERE id=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, entidad.getPaciente());
            ps.setDate(2, (Date) entidad.getFecha());
            ps.setString(3, entidad.getDiagnostico());
            ps.setInt(4, entidad.getCama().getNumero());
            ps.setInt(5, entidad.getId());
            ps.executeUpdate();
            connection.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(ControladorInternacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        

    }

    @Override
    public ArrayList<Internacion> listar() throws SQLException, Exception {
       connection = ConexionBD.obtenerConexion();
        try{
            
            this.stmt = connection.createStatement();
            this.sql = "SELECT * FROM internacion ORDER BY id";
            this.rs   = stmt.executeQuery(sql);
            connection.close();
            
            ArrayList<Internacion> internaciones = new ArrayList();
            
            while(rs.next()){     
                Internacion internacion= new Internacion();
                Cama cama=new Cama();
                cama.setNumero(rs.getInt("cama"));
                internacion.setId(rs.getInt("id"));
                internacion.setPaciente(rs.getString("paciente"));
                internacion.setFecha(rs.getDate("fecha"));
                internacion.setDiagnostico(rs.getString("diagnostico"));
                internacion.setCama(cama);
                
                internaciones.add(internacion);
                                
            }
            return internaciones;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    




    }
    
    
}
