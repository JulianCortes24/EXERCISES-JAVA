/*
 Crear un programa que pide un nombre por Scanner y escribe en consola “buenas tardes, Sr XX”
(evidentemente, sustituyendo XX por el nombre que se escriba en consola)
 */
package excercisesjava;

import java.util.Scanner;

/**
 *
 * @author Julian Cortes
 */
public class ExerciseJavaeasy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOLA, COMO TE LLAMAS?");
        String nombre = sc.nextLine();
        System.out.println("BUENAS TARDES SR: "+ nombre);
               
    }
    
}
