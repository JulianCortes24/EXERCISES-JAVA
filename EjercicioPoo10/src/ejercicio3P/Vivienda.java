
package ejercicio3P;

abstract class Vivienda {
    private String calle;
    private double precio;
    private int superficieEnMetros;

    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
        this.precio = calcularPrecio();
    }

    
    public double calcularPrecio() {
        return superficieEnMetros * 1000; 
    }

   
    public abstract double impuestoMunicipal();

    public String getCalle() {
        return calle;
    }

    public double getPrecio() {
        return precio;
    }

    public int getSuperficieEnMetros() {
        return superficieEnMetros;
    }
}

