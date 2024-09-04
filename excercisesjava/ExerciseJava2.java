/*
En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.
 */
package excercisesjava;

/*
 *
 * @author u20241221387 JULIAN CORTES PERDOMO
 */

import java.util.Scanner;

public class ExerciseJava2 {

    public static void main(String[] args) {
        int llantas, prllan, prllancon; //Variables de, cantidad de llantas, precio de llanatas, precio de llanats si se cumplen las condiciones
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese la canrtidad de llantas: ");
        llantas = in.nextInt();

        if (llantas < 5) {
            System.out.print("sus llanatas quedan a 100U$: ");
            prllan = (llantas * 100);

            System.out.print("su valor a pagar es " + prllan + "U$");
        } else if (llantas >= 5 && llantas <= 10) {
            System.out.print("sus llanatas quedan a 75U$ ");
            prllan = (llantas * 75);

            System.out.print("su valor a pagar es " + prllan + "U$");
        } else if (llantas > 10) {
            System.out.print("sus llanatas quedan a 50U$: ");
            prllan = (llantas * 50);
            System.out.print("Su valor a pagar es de " + prllan + "U$");
        }

    }
}
