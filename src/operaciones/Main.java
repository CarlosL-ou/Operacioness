/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Carlos.L
 * @version 1.0
 * @since 19/05/2021
 */
public class Main {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
    /**
     * Envia el valor de las variable int, los recive resuletos y 
     * los muestra por consola.
     * @param resultado Integer
     */    
        //prueba sumarPar:
        int resultado = operaciones.sumarPar(4,4);    
        System.out.println(resultado);
    /**
     * Envia el valor de las variable int, los recive resuletos y 
     * los muestra por consola.
     * @param resultado2 Integer
     */    
        //prueba mayor:
        int resultado2 = operaciones.mayor(8,8);    
        System.out.println(resultado2);
    /**
     * Envia el valor de las variable int, los recive resuletos y 
     * los muestra por consola.
     * @param vector Array de integer
     * @param resultado3 Integer
     */    
        //prueba sumarVector:
        int[] vector = {4,2,4,6};
        int resultado3 = operaciones.sumarVector(vector);    
        System.out.println(resultado3);
        
    }
    
}