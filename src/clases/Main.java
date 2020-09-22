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
public class Main {
    public static void main(String[] args) {
        
        
        Clase_Padre_Abtracta mensajeroinicial = new ClaseHija_Consulta();
        mensajeroinicial.setSaldo(25000);
        mensajeroinicial.Operaciones();
        
    }
}
