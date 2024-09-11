/*
Crear un programa que pide un número por Scanner y escribe en consola “el numero es XX”
(evidentemente, sustituyendo XX por el número que se escriba en consola)
 */
package excercisesjava;

import java.util.Scanner;

/**
 *
 * @author Julian Cortes
 */
public class ExerciseJavaesay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        int numero = sc.nextInt();
        System.out.println("SU NUMERO ES : "+numero);
        
        
        
    }
    
}
