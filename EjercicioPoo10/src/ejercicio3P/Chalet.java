
package ejercicio3P;

class Chalet extends Vivienda {
    private int numParcela;
    private boolean conPiscina;

    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }

    @Override
    public double calcularPrecio() {
        return getSuperficieEnMetros() * 1300; 
    }

    @Override
    public double impuestoMunicipal() {
        double impuesto = getPrecio() * 0.05; 
        if (conPiscina) {
            impuesto += 200; 
        }
        return impuesto;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }
}
