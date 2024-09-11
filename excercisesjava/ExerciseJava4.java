/*
Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.bb
 */
package excercisesjava;

import java.util.Scanner;

/**
 *
 * @author Julian Cortes
 */
public class ExerciseJava4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE KILOS");
        double kilos = sc.nextDouble();
           
        if (kilos >=0 && kilos<=2){
            System.out.println("NO OBTIENE DESCUENTO");}
        
        else if (kilos>=2.01 && kilos<=5){
            System.out.println("OBTIENE UN 10% DE DESCUENTO");
        double kilosdescu = kilos*0.10;
        double kilostotal = kilos-kilosdescu;
        System.out.println("SU TOTAL A PAGAR ES : "+kilostotal);  } 
        
         else if (kilos>=5.01 && kilos<=10){
            System.out.println("OBTIENE UN 15% DE DESCUENTO");
        double kilosdescu = kilos*0.15;
        double kilostotal = kilos-kilosdescu;
        System.out.println("SU TOTAL A PAGAR ES : "+kilostotal);  } 
        
         else if (kilos>=10.01){
            System.out.println("OBTIENE UN 20% DE DESCUENTO");
        double kilosdescu = kilos*0.20;
        double kilostotal = kilos-kilosdescu;
        System.out.println("SU TOTAL A PAGAR ES : "+kilostotal);  } 
        

    }
    
}
