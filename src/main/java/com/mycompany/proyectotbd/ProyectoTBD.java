/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectotbd;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author emilio
 */
public class ProyectoTBD {
    public static void main(String[] args) {
        //crear la ventana login
        Login l = new Login();
        l.setVisible(true);
        l.setDefaultCloseOperation(EXIT_ON_CLOSE);
        l.setLocationRelativeTo(null);
    }
    
}
