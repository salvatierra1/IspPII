/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;


public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Desarrollar un programa que pida 2 números por teclado y
        calcule la potencia del primero elevado al segundo,
        pero sin utilizar multiplicación ni otros métodos.
         */
        
        //==>Teclado<==
        
        Scanner entrada = new Scanner(System.in);
        
        //==>Variables<==
        
        int num1, num2, producto, aux;
        
        //==>Solicitud y lectura por teclado<==
        
        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextInt();
        producto = num1;
        
        //==>Recorrer iniciando en 1 hasta num2 y asignar valor aux<==
        
        for (int i = 1; i < num2; i++) {
            aux = producto;
            for (int j = 1; j < num1; j++) {
                producto += aux;
            }
        }
        
        //==>Imprimir resultado del producto<==
        
        System.out.println("La potencia es: " + producto);
    }
}
