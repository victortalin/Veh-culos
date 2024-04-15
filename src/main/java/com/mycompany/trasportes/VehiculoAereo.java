/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trasportes;

public class VehiculoAereo extends Vehiculo {
    private final int numAlas;
    
public VehiculoAereo (String marca, String modelo, int numAlas){
    super(marca,modelo);
    this.numAlas=numAlas;
}

public void mostarInfo(){
    super.mostrarInfo();
    System.out.println("Numero de Alas: " + numAlas);
}
}
