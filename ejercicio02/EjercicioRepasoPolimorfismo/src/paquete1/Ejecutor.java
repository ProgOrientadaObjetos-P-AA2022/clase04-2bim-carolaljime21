/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;

public class Ejecutor {

    public static void main(String[] args) {

        ArrayList<PasajeUrbano> pasajes = new ArrayList<>();
        
        Persona persona1 = new Persona("Luis Valencia", "110011", 9);
        Persona persona2 = new Persona("Ana Bustamante", "110012", 18);
        Persona persona3 = new Persona("Oscar Lima", "110013", 33);
        Persona persona4 = new Persona("Mónica Sarango", "110014", 65);
        
        double pasajeFijo = 0.4;
        
        PasajeMenorEdad pa = new PasajeMenorEdad(pasajeFijo);
        pa.establecerPersona(persona1);
        
        PasajeUniversitario pm = new PasajeUniversitario(pasajeFijo);
        pm.establecerPersona(persona2);
        
        PasajeNormal pt = new PasajeNormal(pasajeFijo);
        pt.establecerPersona(persona3);
        
        PasajeTerceraEdad pu = new PasajeTerceraEdad(pasajeFijo);
        pu.establecerPersona(persona4);
        
        pasajes.add(pa);
        pasajes.add(pm);
        pasajes.add(pt);
        pasajes.add(pu);

        for (int i = 0; i < pasajes.size(); i++) {
            
            pasajes.get(i).establecerValorPasaje();
            
        }
        
        for (int i = 0; i < pasajes.size(); i++) {
            
            System.out.printf("%s\n",
                    pasajes.get(i));
            
        }

    }
}
