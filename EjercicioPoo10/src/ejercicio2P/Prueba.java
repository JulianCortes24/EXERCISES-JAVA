
package ejercicio2P;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[4];

        
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el teléfono del empleado " + (i + 1) + ": ");
            String telefono = sc.nextLine();
            empleados[i] = new Empleado(nombre, telefono);
        }

        
        System.out.println("\nDatos de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

       
        System.out.println("Número de empleados instanciados: " + Empleado.getNumeroEmpleados());

        sc.close();
    }
}
