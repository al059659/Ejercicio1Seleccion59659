/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion59659;

import java.util.Scanner;

/**
 *
 * @author reyap
 */
public class Ejercicio1Seleccion59659 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int número1 = 0;
        int número2 = 0;
        int número3 = 0;
        
        Scanner miConsola = new Scanner(System.in);
        
        System.out.println("Ingrese un número.");
        número1 = miConsola.nextInt();
        System.out.println("Ingrese otro número.");
        número2 = miConsola.nextInt();
        System.out.println("Ingrese un último número.");
        número3 = miConsola.nextInt();
        
         if (número1>número2 && número1>número3)
            System.out.println("El número mayor es: "+ número1);
         
        if (número2>número1 && número2>número3)
           System.out.println("El número mayor es: "+ número2);

        if (número3>número1 && número3>número2)
            System.out.println("El numero mayor es: "+ número3);        
    }
}