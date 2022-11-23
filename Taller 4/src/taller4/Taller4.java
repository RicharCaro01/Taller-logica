/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar un programa que calcule el valor a pagar por algunos galones de gasolina si sabemos que cada litro 
         * de gasolina vale 9.500. Imprimir la cantidad de galones, precio por galón, cantidad de litros y precio a pagar.
         */
        
        /**
         * DE:Litro 9.500
         * DS:Cantidad galones, precio por galon, cantidad de litros
         */
        int cantGalones;
        double multiplicacion1 = 0;
        double multiplicacion2 = 0;
        double multiplicacion3 = 0;
        Scanner leer = new Scanner(System.in); 
        
        
        System.out.print("Digite cantidad de galones: ");
        cantGalones = leer.nextInt();
        
        multiplicacion1 = (double) (9.500 * 3.79);
        System.out.println("El precio por galon es: "+multiplicacion1);
        
        multiplicacion2 = (double) (cantGalones * 3.79);
        System.out.println("La cantidad de litros es: "+multiplicacion2);
        
            multiplicacion3 = (double) (cantGalones * 9.500 * 3.79);
        System.out.println("El precio total a pagar es: "+multiplicacion3);
        
               
        
                
    }
    
}
