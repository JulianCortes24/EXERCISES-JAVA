
package ejercicio3P;

class Piso extends Vivienda {
    private int planta;
    private int puerta;

    public Piso(String calle, int superficieEnMetros, int planta, int puerta) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    @Override
    public double impuestoMunicipal() {
        return getPrecio() * 0.05; // 5% del precio
    }

    public int getPlanta() {
        return planta;
    }

    public int getPuerta() {
        return puerta;
    }
}
