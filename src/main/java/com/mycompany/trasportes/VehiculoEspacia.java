/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trasportes;

public class VehiculoEspacia extends Vehiculo{
    private final String Turbina;
    
    public VehiculoEspacia(String marca, String modelo, String Turbina){
    super(marca,modelo);
    this.Turbina=Turbina;
}    

public void mostarInfo(){
    super.mostrarInfo();
    System.out.println("Modelo de Turbinna: " + Turbina);
}
}
