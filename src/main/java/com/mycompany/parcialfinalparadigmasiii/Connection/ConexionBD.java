/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialfinalparadigmasiii.Connection;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 *
 * @author Leonel Arguello
 */
public class ConexionBD {



   static final String JDBC_DRIVER = "org.postgresql.Driver";  
   static final String DB_URL = "jdbc:postgresql://localhost:5432/bd";
   

   
   private static Connection conn = null;



   public static Connection obtenerConexion() throws SQLException, ClassNotFoundException {
     
         try {
            //Set Values from  .env configuration file
            //Properties enviromentsVaribles = Conexion.getProperties();
            final String  USER = "postgres"; 
            final String  PASS = "cymty133xn";

            Class.forName(JDBC_DRIVER);
             //STEP 3: Open a connection
      
            conn = DriverManager.getConnection(DB_URL,"postgres","cymty133xn");
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         } catch (Exception e) {
            e.printStackTrace();
         }
      
      return conn;
   }
   
   public static void cerrar() throws SQLException {
      if (conn != null) {
         conn.close();
      }
   }
   public static Properties  getProperties() throws Exception {
      FileReader reader=new FileReader(".env");
      Properties p = new Properties();
      p.load(reader);
      return p;
   }
   
 
   
   
     
      
       
}