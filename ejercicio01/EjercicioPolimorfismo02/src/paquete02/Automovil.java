/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {

    protected String nombre;
    protected String placa;
    protected double valorCancelar;


    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerPlaca(String c) {
        placa = c;
    }

    public abstract void valorCancelar();

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerPlaca() {
        return placa;
    }

}
