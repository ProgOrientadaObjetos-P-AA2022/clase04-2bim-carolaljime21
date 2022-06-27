/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    private double litrosMaximos;
    private double costeLitro;
    private double descuento;
    private double valorTotal;

    public void establecerLitrosMaximos(double c) {
        litrosMaximos = c;
    }

    public void establecerCosteLitro(double c) {
        costeLitro = c;
    }

    public void establecerDescuento(double des) {
        descuento = des / 100;
    }

    public double obtenerLitrosMaximos() {
        return litrosMaximos;
    }

    public double obtenerCosteLitro() {
        return costeLitro;
    }

    public double obtenerDescuento() {
        return descuento;
    }
    @Override
    public void valorCancelar() {
        litrosMaximos = litrosMaximos - (litrosMaximos*descuento);
        valorTotal = (costeLitro * litrosMaximos);
    }
    public double obtenerValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("Datos Automovil Diesel\n"
                + "Nombres: %s\n"
                + "Placa del vehiculo: %s\n"
                + "Numero de litros: %s\n"
                + "Costo por cada litro: %s\n"
                + "Descuento: %s\n"
                + "Valor a cancelar: %.2f\n",
                super.nombre,
                super.placa,
                litrosMaximos,
                costeLitro,
                descuento,
                valorTotal);
        return cadena;
    }
}
