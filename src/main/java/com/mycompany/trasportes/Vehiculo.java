/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trasportes;

/**
 *
 * @author vtali
 */
public class Vehiculo {
  protected String marca; 
    protected String modelo;
    
    public Vehiculo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        
        
    }
    
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }  
}
