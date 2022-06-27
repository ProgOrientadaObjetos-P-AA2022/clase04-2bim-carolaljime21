/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    int numGalonesMax;
    double costoGalon;
    double valorIva;
    double valorCancelar;

    public void establecerNumGalonesMax(int x) {
        numGalonesMax = x;
    }

    public void establecerCostoGalon(double x) {
        costoGalon = x;
    }

    public void establecerValorIva(double c) {
        valorIva = c / 100;
    }

    @Override
    public void valorCancelar() {
        valorCancelar = (costoGalon) * (numGalonesMax)
                + ((costoGalon) * (numGalonesMax)) * (valorIva);
    }

    public int obtenerNumGalonesMax() {
        return numGalonesMax;
    }

    public double obtenerCostoGalon() {
        return costoGalon;
    }

    public double obtenerValorIva() {
        return valorIva;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("Datos Estudiante Distancia\n"
                + "Nombres: %s\n"
                + "Placa del vehiculo: %s\n"
                + "Numero de galones: %s\n"
                + "Costo por cada galon: %s\n"
                + "IVA: %s\n"
                + "Valor a cancelar: %.2f\n",
                super.nombre,
                super.placa,
                numGalonesMax,
                costoGalon,
                valorIva,
                valorCancelar);
        return cadena;
    }
}