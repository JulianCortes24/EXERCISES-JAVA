/*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%.*/
package excercisesjava;

import java.util.Scanner;

/**
 *
 * @author Julian Cortes
 */
public class Exercisejava33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL PRECIO DE LOS REPRODUCTORES");
        double precio = sc.nextDouble();
        System.out.println("INGRESE LA MARCA");
        String marca = sc.next();

        double descuento = 0;
        double descuento2 = 0;

        if (precio >= 500) {
            descuento = precio * 0.10;
            
            }
            double precioConDescuento = precio - descuento;
        
        double iva=precio*0.19;
        double precioConIva= precioConDescuento + iva;
        
        if (marca.equals("NOSY")) {
                double precioFinal = precioConIva * 0.05;
                
            double precioFinal2=precioConIva-precioFinal;
        
            System.out.println("EL PRECIO FINAL ES :U$ " + precioFinal2);
        }
    }
}
