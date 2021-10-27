/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.Scanner;


public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Desarrollar un programa que pida por teclado un intervalo entre 2 números.
        Luego imprima por pantalla todo el intervalo diciendo los que son primos
        y los que no.
        */
        
        //==>Tecaldo<==
        
        Scanner entrada = new Scanner(System.in);
        
        //==>Variables<==
        
        int num1, num2;
        
        //==>Solicitud y lectura por teclado<==
        
        System.out.println("Ingrese el intervalo entre dos numero");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        //==>Imprimir intervalos, iniciando i en num1 hasta num2<==
        
        for (int i = num1; i <=num2; i++) {
            
            System.out.print("[" + i +"]");
            
        }
             
    }
    
}
