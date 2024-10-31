
package ejercicio10P;


public class Prueba {
    public static void main(String[] args) {
   
        Coche coche1 = new Coche("Toyota", "Rojo", 20000, 0.05, 2015);
        coche1.setDniTitular("12345678A");

        Coche coche2 = new Coche("Ford", "Azul", 15000, 0.03, 2010);
        coche2.setDniTitular("87654321B");

       
        coche1.comprarCoche(coche2);
        System.out.println("DNI Titular del coche1 después de comprar: " + coche1.getDniTitular());

       
        CocheMatriculado cocheMatriculado = new CocheMatriculado("Volkswagen", "Verde", 22000, 0.04,
                2018, "1234ABC", "11223344C", 2018, 3);

        // Mostrar información del coche matriculado//
        System.out.println(cocheMatriculado);
    }
}
