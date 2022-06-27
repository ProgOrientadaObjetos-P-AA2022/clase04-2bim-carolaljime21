/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class PasajeUniversitario extends PasajeUrbano {
    
    public PasajeUniversitario(double pasaje){
        super(pasaje);
    }
    
    @Override
    public void establecerValorPasaje(){
        valorPasaje = valorFijo - (valorFijo * 0.30);
    }
    
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Universitario\n"
                + "%s",
                super.toString()
                );
    }
}
