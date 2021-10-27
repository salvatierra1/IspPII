/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import java.util.Scanner;


public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Desarrollar un programa que guarde datos de una persona: 
        nombre, edad y salario. Sin utilizar objetos. 
        Luego buscar por el nombre y mostrar edad y salario 
        */
        
        //==>Teclado<==
        
        Scanner entradaDos = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        
        //==>Variables<==
        
        String nombre, buscar;
        int edad,salario;
        
        //==>Solicitud y lectura por teclado<==
        
        System.out.println("Ingrese su nombre:");
        nombre = entradaDos.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese su salario");
        salario = entrada.nextInt();
        
        //==>Solicitud de nombre realizar la busqueda<==
        
        System.out.println("---Buscar persona por nombre---");
        buscar = entradaDos.nextLine();
        
        //==>Comparar datos con equals e imprimir datos<==
        
        if (buscar.equals(nombre)) {
            System.out.println("Nombre:" + nombre);
            System.out.println("Edad:" + edad);
            System.out.println("Salario:" + salario);
        }else{
            System.out.println("Persona no existe");
        }
    }
    
}
