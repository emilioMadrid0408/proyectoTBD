/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.proyectotbd;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import java.sql.Statement;
        
/**
 *
 * @author emilio
 */
public class ComboBox {
    
    public DefaultComboBoxModel llenarCombo(Connection con){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        int conta = 0;
        try {
            
            modelo.addElement("");
            String consulta = "SELECT Tipnombre FROM Tipos";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            while(rs.next()){
                conta++;
                modelo.addElement(rs.getString(1));
            }
            
                
        } catch (Exception e) {
        }
        
        
        
        return modelo;
    }
    
    
    
    
    
}
