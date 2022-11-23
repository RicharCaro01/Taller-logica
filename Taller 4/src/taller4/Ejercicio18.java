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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar un algoritmo que calcule el salario a pagar de un empleado según los siguientes parámetros: 
         * •Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y más Aux. de transporte= +11%.
         * •Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-6% y más Aux. de transporte= +9%.
         * •Si gana más 1.000.000y menos 1.800.00, descuento por pensión es -6%, descuento de segurode vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
         * •Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%, descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte= +8%.
         * •Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida 6%, descuento de salud =-10% y más Aux. de transporte= +9%.
         */
        
        /**
         * Ds: Parámetros
         * De:  Salario a pagar
         */
        
        double salario1 = 0;
        double multiplicacion1 = 0;
        double salario2 = 0;
        double multiplicacion2 = 0;
        double salario3 = 0;
        double multiplicacion3 = 0;
        double salario4 = 0;
        double multiplicacion4 = 0;
        double salario5 = 0;
        double multiplicacion5 = 0;
        Scanner leer = new Scanner(System.in);
      
        if (salario1 <= 700000){
        System.out.print("Digite su salario: ");
        salario1 = leer.nextDouble();
        multiplicacion1 = (salario1 * 2 );
            System.out.println("Su salario1 es: "+multiplicacion1);
        }else{
            System.out.println("Salario invalido");
       
        }
        if ((salario2 >= 741000) && (salario2 <=999999)){
            System.out.print("Digite su salario: ");
            salario2 = leer.nextDouble();
            multiplicacion2 = (salario2 * 3);
            System.out.println("Su salario2 es: "+multiplicacion2);
        }else{
            System.out.println("Salario invalido");
        }
        if ((salario3 >= 1000000) && (salario3 <=1800000)){
        System.out.print("Digite su salario: ");
        salario3 = leer.nextDouble();
        multiplicacion3 = (salario3 * 4 );
            System.out.println("Su salario3 es: "+multiplicacion3);
        }else{
            System.out.println("Salario invalido");
        }
        if ((salario4 >= 1800000) && (salario4 <=2500000)){
        System.out.print("Digite su salario: ");
        salario4 = leer.nextDouble();
        multiplicacion4 = (salario4 * 5);
            System.out.println("Su salario4 es: "+multiplicacion4);
        }else{
            System.out.println("Salario invalido");
        } 
        if (salario5 >= 2500000){
        System.out.print("Digite su salario: ");
        salario5 = leer.nextDouble();
        multiplicacion5 = (salario5 * 6 );
            System.out.println("Su salario5 es: "+multiplicacion5);
        }else{
            System.out.println("Salario invalido");
       
        }
        }
}
        

   