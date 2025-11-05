/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectotbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author emilio
 */public class Conexion {
     //constructor para la conexion
    public static Connection getConexion(String servidor, String bd, String usuario, String contrasena) throws SQLException {
        
        //cadena de conexion
        String conexionURL = "jdbc:sqlserver://" + servidor + ";"
                + "database=" + bd + ";"
                + "user =" + usuario + ";"
                + "password=" + contrasena + ";"
                + "loginTimeout=30;"
                + "TrustServerCertificate=True;";
        
        Connection con = DriverManager.getConnection(conexionURL);
        //retornan la cadena de conexion
        return con;
    }
}

