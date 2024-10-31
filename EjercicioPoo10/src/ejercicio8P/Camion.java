
package ejercicio8P;


public class Camion extends Vehiculo {
    private double tamañoRemolque;
    private int numeroEjes;

    public Camion(double precioCompra, String marca, double tamañoRemolque, int numeroEjes) {
        super(precioCompra, marca);
        this.tamañoRemolque = tamañoRemolque;
        this.numeroEjes = numeroEjes;
    }

    @Override
    public double precioVenta() {
        return precioCompra * 1.6 * numeroEjes;
    }
}
