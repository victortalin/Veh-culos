/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trasportes;

/**
 *
 * @author vtali
 */
public class Trasportes {
        public static void main(String[] args) {
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre ("Volkswagen sedan", "wolkswagen", 4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Bmw", "Motor");
        VehiculoAereo vehiculoAereo=new VehiculoAereo ("Airbus","Airbus 737", 4);
        VehiculoEspacia vehiculoEspacial=new VehiculoEspacia ("Nasa","Atlantis", "Kaplan");

        System.out.println("Informacion del vehiculo terrestre: "); vehiculoTerrestre.mostarInfo();
        System.out.println("Informacion del vehiculo acuatico: "); vehiculoAcuatico.mostarInfo();
        System.out.println("Informacion del vehiculo aereo: "); vehiculoAereo.mostarInfo();
        System.out.println("Informacion del vehiculo espacial: "); vehiculoEspacial.mostarInfo();


    }
}
