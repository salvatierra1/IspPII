
package ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        
        /*
            Desarrollar un programa que pida 5 números por teclado,
            los sume y los guarde en un array, 
            luego imprima por pantalla la suma y los números en orden inverso
        */
        
        //==>Teclado<==
        
        Scanner entrada = new Scanner(System.in);
        
        //==>Variables<==
        
        int num1, num2, num3, num4, num5;
        int suma;
        
        //==>Solicitud y lectura por teclado<==
        
        System.out.println("Ingrese cinco numeros");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        num4 = entrada.nextInt();
        num5 = entrada.nextInt();
        
        //==>Realiza operacion suma y imprime<==
        
        suma = num1 + num2 + num3 + num4 + num5;
         System.out.println("El sultado de la suma es: " + suma);
         
        //==>Array inicializado<==
        
        int array [] = new int[]{num1, num2, num3, num4, num5};
        
        //==>Recorre array e imprime en orden inverso<==
        
        for (int i = array.length-1; i >=0; i--) {
            System.out.println("Orden inverso: " + array[i]);
        }
        
        
        
    }
    
}
