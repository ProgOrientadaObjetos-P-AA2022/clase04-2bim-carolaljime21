/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import java.util.ArrayList;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        String placa;
        double costoGalo;
        int numeroGalo;
        double costoL;
        int numeroL;
        int tipoAuto;
        String continuar;
        double descuento;
        ArrayList<Automovil> autos = new ArrayList<>();
        boolean bandera = true;

        while (bandera) {
            System.out.println("Tipo de automovil a ingresar\n"
                    + "Ingrese (1) para Automovil gasolina"
                    + "Ingrese (2) para Automovil diesel");
            tipoAuto = entrada.nextInt();
            if (tipoAuto > 2 || tipoAuto < 1) {
                System.out.println("Dato fuera de rango");
                break;
            }
            entrada.nextLine();
            System.out.println("Ingrese su nombre");
            nombres = entrada.nextLine();
            System.out.println("Ingrese la placa del vehiculo");
            placa = entrada.nextLine();

            if (tipoAuto == 1) {
                AutomovilGasolina autoG = new AutomovilGasolina();
                System.out.println("Ingrese el número de galones");
                numeroGalo = entrada.nextInt();
                System.out.println("Ingrese el costo de cada galon");
                costoGalo = entrada.nextDouble();
                autoG.establecerNombre(nombres);
                autoG.establecerPlaca(placa);
                autoG.establecerNumGalonesMax(numeroGalo);
                autoG.establecerCostoGalon(costoGalo);
                autoG.establecerValorIva(10);
                autos.add(autoG);

            } else {
                AutomovilDiesel autoD = new AutomovilDiesel();
                System.out.println("Ingrese el número de litros");
                numeroL = entrada.nextInt();
                System.out.println("Ingrese el costo de cada litro");
                costoL = entrada.nextDouble();
                System.out.println("Ingrese el descuento (porcentaje)");
                descuento = entrada.nextDouble();
                autoD.establecerNombre(nombres);
                autoD.establecerPlaca(placa);
                autoD.establecerLitrosMaximos(numeroL);
                autoD.establecerCosteLitro(costoL);
                autoD.establecerDescuento(descuento);
                autoD.obtenerDescuento();
                autoD.obtenerValorTotal();
                autos.add(autoD);
            }
            entrada.nextLine();
            System.out.println("Ingrese Y para ingresar otro estudiante");
            continuar = entrada.nextLine();

            if (continuar.equals("Y") || continuar.equals("y")) {
                bandera = true;
            } else {
                bandera = false;
            }
        }
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < autos.size(); i++) {
            // 1.  
            autos.get(i).valorCancelar();
            
            System.out.printf("Automovil\n"
                    + "%s\n",
                    autos.get(i));

        }
    }

}