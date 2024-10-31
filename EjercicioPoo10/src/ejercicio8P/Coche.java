
package ejercicio8P;


public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(double precioCompra, String marca, int numeroPuertas) {
        super(precioCompra, marca);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double precioVenta() {
        return precioCompra * 1.6;
    }
}
