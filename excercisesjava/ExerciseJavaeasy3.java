/*
. Crear un programa que pide dos numero por Scanner y escribe en consola “los números son X e Y”
 */
package excercisesjava;

import java.util.Scanner;

/**
 *
 * @author Julian Cortes
 */
public class ExerciseJavaeasy3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("HOLA,INGRESA UN NUMERO");
        int numero1 = sc.nextInt();
        System.out.println("HOLA,INGRESA SEGUNDO NUMERO");
        int numero2 = sc.nextInt();
        System.out.println("LOS NUMEROS SON " + numero1 + " y " + numero2);
    }
    
}
