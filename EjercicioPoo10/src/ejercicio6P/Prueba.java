
package ejercicio6P;

public class Prueba {
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion("Sala de Estar");

        
        AlfombraRedonda alfombra1 = new AlfombraRedonda("Roja", 100, 2);
        AlfombraCuadrada alfombra2 = new AlfombraCuadrada("Azul", 80, 3);

        
        habitacion.agregarAlfombra(alfombra1);
        habitacion.agregarAlfombra(alfombra2);

     
        System.out.println("Precio total de las alfombras: " + habitacion.calcularPrecioTotal());

        System.out.println("Precio total de las alfombras cuadradas: " + habitacion.calcularPrecioCuadradas());
    }
}
