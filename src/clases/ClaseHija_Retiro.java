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
public class ClaseHija_Retiro extends Clase_Padre_Abtracta {

    @Override
    public void Transacciones() {

        System.out.println("¿cuando desea retirar ");
        Retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("///////////////////////////");
            System.out.println("Retiro  : " + retiro);
            System.out.println("El nuevo Saldo es   : " + getSaldo());
            System.out.println("///////////////////////////");
        }else{
            System.out.println("///////////////////////////");
            System.out.println("Saldo insuficiente ........");
            System.out.println("///////////////////////////");
        }
    }

}
