/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;


public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Desarrollar un programa que lea la longitud de los catetos de un triángulo
        rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras
        */
        
        //==>Teclado<==
        
        Scanner entrada = new Scanner(System.in);
        
        //==>Variables<==
        
        double cat1, cat2, hipotenusa;
        
        //==>Solicitud y lectura por teclado<==
        
        System.out.println("Ingrese los catetos");
        cat1 = entrada.nextDouble();
        cat2 = entrada.nextDouble();
        
        /*==>Operacion, calcular hipotenusa.
        math. sqrt devuelve la raíz cuadrada
        Math. pow() retorna la base elevada al exponente<==
        */
        
        hipotenusa = Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2, 2));
        
        //==>Imprimir resultado de la operacion<==
        
        System.out.println("La hipotenusa es:" + hipotenusa);
        
    }
    
}
