
package ejercicio7P;

public class Prueba {
    public static void main(String[] args) {
        Math2 math = new Math2();

        int[] intArray = {3, 5, 1, 8, 2};
        double[] doubleArray = {2.5, 3.6, 1.1, 4.8};

        System.out.println("Mínimo (int): " + math.min(intArray)); // Output: 1
        System.out.println("Máximo (int): " + math.max(intArray)); // Output: 8
        System.out.println("Mínimo (double): " + math.min(doubleArray)); // Output: 1.1
        System.out.println("Máximo (double): " + math.max(doubleArray)); // Output: 4.8
    }
}
