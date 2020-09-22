/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Victor
 */
public class ClaseHija_Consulta extends Clase_Padre_Abtracta {
    
    @Override
    public void Transacciones(){
        System.out.println("///////////////////////////////");
        System.out.println("tu saldo actual es "+ getSaldo());
        System.out.println("///////////////////////////////");
    }
    
}
