/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Desarrollar un programa que pida números por teclado hasta un máximo
        pedido por teclado. Se piden y se guardan en un array los números hasta
        que se responda que no o llegue al máximo. Por último se imprimen en orden
        y se pide un número para buscar. si está se imprime la posición de dicho número
        en el array. 
         */
        
        Scanner entradaDos = new Scanner(System.in);

        Scanner entrada = new Scanner(System.in);
        String resp,no;
        int num = 0;
        int maximo, array[], vector[] = null;
        
        //==>Solicitd y lectura por tecaldo<==
        
        System.out.println("¿Cuantos numeros vas a introducir?");
        maximo = entrada.nextInt();
        
        //==>Array inicializado<==
        
        array = new int[maximo];
        
        //==>Bucle solicita y estudia la condicion<==
        
        do {
            System.out.println("Introduce los datos");
            array[num] = entrada.nextInt();
            num++;
            System.out.println("¿Quiere introducir mas numeros?");

            resp = entradaDos.nextLine();
        } while ((resp.equals("Si") || resp.equals("si")) && num < maximo);
        
        //==>SOlicita la posicion a buscar e imprime<==
        
        System.out.println("Ingrese la posicion que desea");
        int buscar = entrada.nextInt();
        System.out.println("Numero encontrado " +array[buscar]);
       
        //==>Imprime datos del array en orden inverso<==
        
        System.out.println("Orden");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
