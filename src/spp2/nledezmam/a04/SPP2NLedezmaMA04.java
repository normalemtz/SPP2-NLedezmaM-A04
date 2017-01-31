/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.a04;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecl = new Scanner (System.in);
        //Variables
        int opEntrada;
        double a,r;
        
        //Menu
        System.out.println("Calculadora de Funciones Trigonométricas");
        System.out.println("Introduzca la opción deseada");
        System.out.println("1. Calcular Tangente");
        System.out.println("2. Calcular Seno");
        System.out.println("3. Calcular Coseno");
        System.out.println("4. Salir.");
        opEntrada = tecl.nextInt();
        
        switch (opEntrada) {
            case 1:
                System.out.println("Cálculo de Tangente");
                r= Math.tan(intra());
                System.out.println("La tangente es igual a: " + r);
                break;
                
            case 2:    
             System.out.println("Cálculo de Seno");
                r= Math.sin(intra());
                System.out.println("El seno es igual a: " + r);
                break;
                
            case 3:    
             System.out.println("Cálculo de Coseno");
         
                r= Math.cos(intra());
                System.out.println("El coseno es igual a: " + r);
                break;  
                
            default:
                System.out.println("Adiós!");
        }
    }
    static double intra(){
        double a;
        Scanner tecl = new Scanner (System.in);
         System.out.println("Introduzca el ángulo:");
                a = tecl.nextDouble();
                a= Math.toRadians(a);
           
        return a;
    }
    
}
