/*
En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.

*/
package excercisesjava;

/*
 *
 * @author u20241221387 JULIAN CORTES PERDOMO
 */


import java.util.Scanner;


public class Excercisesjava {
      
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese el número de computadoras que desea comprar: "); // pido al ususario que ingrese el # de computadoras
        int numeroDeComputadoras = sc.nextInt(); 

        int precioPorComputadora = 500; // precio de cada computadora
        double descuento = 0; // el descuento
        int total1; // total sin descuento
        int total2; // el descuento que recibe
        int total3; // total con descuento
       

        //a partir de aqui empiezan las operaciones, lo hice solo con if, no se si este mal pero recuerdo que en clase nos dijo que no siempre es necesario usar el "else"
        if (numeroDeComputadoras < 5) {
            descuento = 0.10; 
        }
        else if (numeroDeComputadoras >= 5 && numeroDeComputadoras < 10) {
            descuento = 0.20; 
        } 
        if (numeroDeComputadoras > 10){
            descuento = 0.40; 
                    
        }

        // Calcular el total después del descuento
        total1 = ( numeroDeComputadoras * precioPorComputadora);
        total2 =(int) ( total1 * descuento);// hago la resta del 1 - descuento porque estoy usando decimales es como decir que le quito al 100% el descuento
        total3 = (int) total1 - total2; 
       System.out.println("El total sin descuento es " + total1 );
       System.out.println("Usted recibe un descuento de "+ total2);
       System.out.println("El total después del descuento es " + total3);
    }
}
