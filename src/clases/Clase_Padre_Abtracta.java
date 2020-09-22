/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public abstract class Clase_Padre_Abtracta {

    protected int transacciones;
    protected int retiro;
    protected int deposito;

    private static int saldo;

    Scanner sc = new Scanner(System.in);

    public void Operaciones() {
        int Bandera = 0; //variable de ambito local
        int Seleccion = 0;
        do {
            do {
                System.out.println("Por favor Seleccione una opcion");
                System.out.println("    1. Consulta de saldo");
                System.out.println("    2. Retiro de efectivo ");
                System.out.println("    3. Deposito en efectivo");
                System.out.println("    4. Salir");
                Seleccion = sc.nextInt();
                if (Seleccion >= 1 & Seleccion <= 4) {
                    Bandera = 1;
                } else {
                    System.out.println("//////////////////////////////////////");
                    System.out.println("la seleccion ingresada no es correcta ");
                    System.out.println("//////////////////////////////////////");
                }

            } while (Bandera == 0);

            if (Seleccion == 1) {
                ////// consulta de saldo 
                Clase_Padre_Abtracta msjSaldo = new ClaseHija_Consulta();
                msjSaldo.Transacciones();
                

            } else if (Seleccion == 2) {
                ////retiro
                Clase_Padre_Abtracta msjRetiro = new ClaseHija_Retiro();
                msjRetiro.Transacciones();

            } else if (Seleccion == 3) {
                //// deposito en
                Clase_Padre_Abtracta msjDeposito = new ClaseHija_Deposito();
                msjDeposito.Transacciones();
                

            } else if (Seleccion == 4) {
                System.out.println("Gracias vuelva pronto ");
            }
        } while (Bandera != 2);
    }

    /// metotodo para solicita cantiad de retiro 
    public void Retiro() {
        retiro = sc.nextInt();

    }

    public void Deposito() {
        deposito = sc.nextInt();
    }

    // metodo abtracto 
    public abstract void Transacciones();

    //metodo seter y geter para variable privada
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;

    }

}
