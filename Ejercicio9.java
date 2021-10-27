/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

import java.util.Scanner;


public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /*
        Desarrollar un programa que pase una velocidad
        en Km/h a m/s. La velocidad se lee por teclado. 
        */
       
       //==>Tecaldo<==
       
        Scanner entrada = new Scanner(System.in);
        
        //==>Variables<==
        
        double velocidad, conversion;
        
        //==>Solicitud y lectura por teclado<==
        
        System.out.println("Ingrese la velocidad en Km/h");
        velocidad = entrada.nextDouble();
        
        //==>Operacion de conversion Kmh a ms<==
        
        conversion = velocidad*1000/3600;
        
        //==>Imprimir resultado de conversion de datos<==
        
        System.out.println("m/s: " + conversion);
        
    }
    
}
