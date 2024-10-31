
package ejercicio3P;

public class Prueba {
    public static void main(String[] args) {
        Vivienda piso = new Piso("Calle A", 80, 2, 3);
        Vivienda adosado = new Adosado("Calle B", 120, 2);
        Vivienda chalet = new Chalet("Calle C", 200, 1, true);

        System.out.println("Precio del piso: " + piso.getPrecio());
        System.out.println("Impuesto del piso: " + piso.impuestoMunicipal());

        System.out.println("Precio del adosado: " + adosado.getPrecio());
        System.out.println("Impuesto del adosado: " + adosado.impuestoMunicipal());

        System.out.println("Precio del chalet: " + chalet.getPrecio());
        System.out.println("Impuesto del chalet: " + chalet.impuestoMunicipal());
    }
}
