
package ejercicio1P;

class Cuadrado extends Forma implements IFormas {
    private double lado;

    public Cuadrado(String nombre, int posicionX, int posicionY, String color, int lado) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

