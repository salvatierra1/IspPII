/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;


public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Desarrollar un programa que realice lo siguiente:
            declarar dos variables X e Y de tipo int,
            dos variables N y M de tipo double y asigna
            a cada una un valor. A continuación muestra por pantalla:
                        a. El valor de cada variable. 
                        b. La suma  X + Y
                        c. La diferencia  X - Y
                        d. El producto  X * Y
                        e. El cociente  X / Y
                        f. El resto  X % Y
                        g. La suma  N + M 
                        h. La diferencia  N - M 
                        i. El producto  N * M 
                        j. El cociente  N / M 
                        k. El resto  N % M 
                        l. La suma X + N 
                        m. El cociente Y / M 
                        n. El resto Y % M 
                        o. El doble de cada variable 
                        p. La suma de todas las variables 
                        q. El producto de todas las variables 
        */
        
        //==>Variables X e<==
        
        int X = 4, Y=2;
        
        //==>Variables N e M<==
        double N=3.3, M = 2.2;
        
        //==>Imprime operaciones de x e y<==
        
        System.out.println("Valor de varibale");
        System.out.println("X:" + X +"\nY:" + Y +"\nN:" + N +"\nM:" + M);
        System.out.println("Suma:" + (X+Y));
        System.out.println("Diferencia:"+(X-Y));
        System.out.println("Producto:"+(X*Y));
        System.out.println("Cociente:"+ (X/Y));
        System.out.println("Resto:"+(X%Y));
        
        //==>Imprime operaciones de n e m<==
        
        System.out.println("Suma:" + (N+M));
        System.out.println("Diferencia:"+(N-M));
        System.out.println("Producto:"+(N*M));
        System.out.println("Cociente:"+ (N/M));
        
        //==>Imprime Operaciones con distintas variables<==
        
        System.out.println("Suma:" + (X+N));
        System.out.println("Cociente:"+ (Y/N));
        System.out.println("Resto:"+(Y%M));
        
        //==>imprime doble de cada variable<==
        
        System.out.println("Doble de las variables");
        System.out.println("Doble X:"+ X*2 +"\nDoble Y:" + Y*2
                + "\nDoble N:" + N*2 +"\nDoble M:"+  M*2);
        
        //==>imprime suma total de las variables<==
        
        System.out.println("Suma total de las variables");
        System.out.println(X+Y+N+M);
        
        //==>imprime productos de todas las variables<==
        
        System.out.println("Productos de todas las variables");
        System.out.println(X*Y*N*M);
        


        
        

        

        
    }
    
}
