/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.Scanner;


public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Desarrollar un programa que lea el nombre y el sueldo de 20 empleados 
        y muestre el nombre y el sueldo del empleado que más gana.
        */
        
        //==>Teclado<==
        
        Scanner entradaDos = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        
        //==>Variables para guardar el mayor<==
        
        String nombre;
        double sueldo;
        int x = 0;
        
        //==>Array<==
        
        String nombreArray[] = new String[20];
        double sueldoArray[]= new double[20];
        
        //==>Leer datos por consola<==
        
        System.out.println("Lectura de nombres y sueldos de empleados: ");                                        
        System.out.print("Ingrese su nombre: ");
        nombreArray[x] = entradaDos.nextLine();
        System.out.print("Sueldo: ");
        sueldoArray[x] = entrada.nextDouble();
        
        //==>Guardamos el primer dato<==
        
        nombre = nombreArray[x];
        sueldo = sueldoArray[x];
        
        //==>Recorrer y leer datos<==
        for (int j = 0; j <nombreArray.length; j++) {
              System.out.println("Ingrese su nombre");
              nombreArray[j]= entradaDos.nextLine();
              System.out.println("Ingrese su sueldo");
              sueldoArray[j] = entrada.nextDouble();
              
              //==>Preguntar mayor sueldo<==
              
              if (sueldoArray[j]>sueldo) {
               sueldo =sueldoArray[j];
               nombre = nombreArray[j];
            }
        }
        
        //==>Imprimir resultado mayor, nombre y sueldo<==
        
        System.out.println("Nombre mayor: " + nombre);
        System.out.println("Sueldo mayor: " + sueldo);
    }
    
}
