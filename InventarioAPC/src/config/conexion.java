/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author danny
 */
public class conexion {
    Connection con;
    public conexion() {
        try {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inventarioapc","root","12345");
        } catch (Exception e) {
        }
    }
    public Connection getConnection() {
        return con; 
        
    }
}
