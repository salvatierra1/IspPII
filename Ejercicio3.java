/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Desarrollar un programa que simule ser una calculadora que muestre un menú
            con las opciones sumar, restar, multiplicar, dividir y salir. Cada opción será:  
            Suma: se le pasan los números e imprime el resultado de la suma. 
            Resta: se le pasan los números y devuelve el resultado de la resta 
            Multiplicación: pide los números por teclado y devuelve el resultado de
            la multiplicación 
            División: pide los números por teclado e imprime el resultado de la división 
         */
        
        //==>Teclado<==
        
        Scanner entrada = new Scanner(System.in);
        
        //==>Variables<==
        
        int a, b, suma, resta, multiplicacion, division;
        
        //==>Imprime operaciones<==
        
        System.out.println("---Suma---");
        System.out.println("---Resta---");
        System.out.println("---Multiplicacion---");
        System.out.println("---Division---");
        System.out.println("---Salir---");
        
        //==>Solicitud de operacion a realizar<==
        
        System.out.println("Ingrese la operacion a realizar");
        String operacion = entrada.nextLine();
        
        //==>Estudia cada operacion a realizar<==
        
        switch (operacion) {
            case "suma":
                System.out.print("Ingrese el primer numero:");
                a = entrada.nextInt();
                System.out.print("Ingrese el segundo numero:");
                b = entrada.nextInt();
                suma = a + b;
                System.out.println("La suma es:" + suma);
                break;   
            case "resta":
                System.out.print("Ingrese el primer numero:");
                a = entrada.nextInt();
                System.out.print("Ingrese el segundo numero:");
                b = entrada.nextInt();
                resta = a - b;
                System.out.println("La resta es:" + resta);
                break;
            case "multiplicacion":
                System.out.print("Ingrese el primer numero:");
                a = entrada.nextInt();
                System.out.print("Ingrese el segundo numero:");
                b = entrada.nextInt();
                multiplicacion = a * b;
                System.out.println("La multiplicacion es:" + multiplicacion);
                break;
            case "division":
                System.out.print("Ingrese el primer numero:");
                a = entrada.nextInt();
                System.out.print("Ingrese el segundo numero:");
                b = entrada.nextInt();
                division = a / b;
                System.out.println("La division es:" + division);
                break;
            case "salir":
            default:
                break;
        }

    }

}
