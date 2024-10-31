
package ejercicio1P;


public class Prueba {
    public static void main(String[] args) {
        Forma[] formas = new Forma[4];
        
        
        formas[0] = new Cuadrado("Cuadrado1", 0, 0, "Rojo", 4);
        formas[1] = new Cuadrado("Cuadrado2", 0, 0, "Verde", 5);
        formas[2] = new Triangulo("Triángulo1", 0, 0, "Azul", 6, 8);
        formas[3] = new Triangulo("Triángulo2", 0, 0, "Amarillo", 4, 3);

        double sumaAreas = 0;
        double sumaCuadrados = 0;
        int contadorCuadrados = 0;

        for (Forma forma : formas) {
            sumaAreas += forma.calcularArea();
            if (forma instanceof Cuadrado) {
                sumaCuadrados += forma.calcularArea();
                contadorCuadrados++;
            }
        }

        System.out.println("Suma de las áreas de todas las formas: " + sumaAreas);
        if (contadorCuadrados > 0) {
            double mediaCuadrados = sumaCuadrados / contadorCuadrados;
            System.out.println("Media de las áreas de los cuadrados: " + mediaCuadrados);
        } else {
            System.out.println("No hay cuadrados en el array.");
        }

       
        double sumaPerimetros = 0;
        for (Forma forma : formas) {
            sumaPerimetros += ((IFormas) forma).calcularPerimetro();
        }

        System.out.println("Suma de los perímetros de todas las formas: " + sumaPerimetros);
    }
}
