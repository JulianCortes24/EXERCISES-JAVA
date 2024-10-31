
package ejercicio3P;

class Adosado extends Vivienda {
    private int numPlantas;

    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    @Override
    public double impuestoMunicipal() {
        return getPrecio() * 0.05; 
    }

    public int getNumPlantas() {
        return numPlantas;
    }
}

