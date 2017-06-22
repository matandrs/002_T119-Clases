/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krakish.clases;

/**
 *
 * @author andreseduardomataperez
 */
public class Principal {
    
   
    public static void main(String... args) {
        //Creamos coches
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        
        coche1.bastidor = "BA123456";
        coche2.bastidor = "CA987654";
        
        System.out.println(coche1.bastidor);
        System.out.println(coche2.bastidor);
        coche1.modelo = "Auris";
        
        System.out.println(coche1.modelo);
        System.out.println(coche2.modelo);
        
        /*coche1.arrancar();
        coche1.acelerar();
        coche1.frenar();
        coche1.apagar();*/
        
    }
    
}
