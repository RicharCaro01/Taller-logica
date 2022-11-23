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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Dada las horas trabajadas por un empleado determinar cuanto gana semanalmente y mensualmente
         * si el trabajador debe trabajar 36 horas minimo y 56 maximo semanales se debe pedir la cantidad
         * de horas trabajadas y verificar que este dentro del rango el pago de la hora, imprimir cantidad 
         * de horas trabajadas y el pago. 
         */
        
        /**
         * De:Cuanto gana semanal y mensual
         * Ds:Cantidad de horas trabajadas y el pago
         */
        
        double cantHoras; 
        double precioHora;
        double multiplicacion1 = 0;
        double multiplicacion2 = 0;
        double multiplicacion3 = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digite la cantidad de horas trabajadas: ");
        cantHoras = leer.nextDouble();
        
        System.out.print("Digite precio por hora: ");
        precioHora = leer.nextDouble();
        
        if ((cantHoras >= 36)&&(cantHoras<=56)){
        multiplicacion1 = (double) (cantHoras * precioHora);
        System.out.println("Gana semanalmente: "+multiplicacion1 + " Dolares");
        
        multiplicacion2 = (double) (cantHoras * precioHora * 4);
        System.out.println("Gana mensualmente: "+multiplicacion2 + " Dolares");
        
        multiplicacion3 = (double) (cantHoras * 4);
        System.out.println("Las horas trabajadas mensualmente son: "+multiplicacion3 + " Horas");
        
    }
        else {
            System.out.println("Horas fuera de rango");
        }
        
    
               
               
    }
    
}
