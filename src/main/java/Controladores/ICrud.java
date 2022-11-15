/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controladores;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author U632698
 * @param <T>
 */
public interface ICrud<T> {
    
  public boolean crear(T entidad) throws SQLException, Exception;
    public boolean eliminar(T entidad)throws SQLException, Exception;
    public T extraer(int id)throws SQLException, Exception;
    public boolean modificar(T entidad)throws SQLException, Exception;
    public ArrayList <T> listar() throws SQLException, Exception;
    
}