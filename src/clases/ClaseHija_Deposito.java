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
public class ClaseHija_Deposito extends Clase_Padre_Abtracta {
    
    @Override
    public void Transacciones(){
        System.out.print("ingrese monto a depositar ");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.print("///////////////////////////////");
        System.out.print("Se deposito " + deposito);
        System.out.print("El saldo actual es "+ getSaldo());
        System.out.print("/////////////////////////////////");
        
    }
    
}
