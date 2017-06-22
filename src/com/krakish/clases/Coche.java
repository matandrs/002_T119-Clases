/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krakish.clases;

import java.util.Date;

/**
 *
 * @author andreseduardomataperez
 */
public class Coche {
    
    //Atributos o variables
    //Características
    static String modelo;
    
    String color;
    String matricula;
    String bastidor;
    int potencia;
    Date fecha;
    boolean enMarcha;
    boolean esEncendido;
    
    //Constructores
    Coche() {
       
    }
    
    //Funciones
    void acelerar() {
        System.out.println("Estoy acelerando...");
    }
    
    void frenar() {
        System.out.println("Estoy frenando...");
    }
    
    void arrancar() {
        System.out.println("Estoy arrancando...");
    }
    
    void apagar() {
        System.out.println("Me estoy apagando");
    }
    
}
