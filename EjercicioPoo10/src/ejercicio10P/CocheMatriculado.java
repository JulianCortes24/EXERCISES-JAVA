
package ejercicio10P;


public class CocheMatriculado extends Coche {
    private int anioMatriculacion;
    private int mesMatriculacion;
    private double impuestoMatriculacion;


    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion, int anio,
                            String matricula, String dniTitular, int anioMatriculacion, int mesMatriculacion) {
        super(marca, color, precio, factorContaminacion, anio);
        setMatricula(matricula); 
        setDniTitular(dniTitular); 
        this.anioMatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        calculaImpuestoMatriculacion(); 
    }

   
    public void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = getPrecio() / 20; 
        int edadCoche = 2024 - getAnio(); 
        if (edadCoche > 10) {
            impuestoMatriculacion += 100; 
        }
    }

 
    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public void setAnioMatriculacion(int anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }

    public int getMesMatriculacion() {
        return mesMatriculacion;
    }

    public void setMesMatriculacion(int mesMatriculacion) {
        this.mesMatriculacion = mesMatriculacion;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion(double impuestoMatriculacion) {
        this.impuestoMatriculacion = impuestoMatriculacion; 
        calculaImpuestoMatriculacion(); 
    }

    @Override
    public String toString() {
        return "Coche Matriculado:\n" +
                "  Marca: " + getMarca() + "\n" +
                "  Color: " + getColor() + "\n" +
                "  KM: " + getKm() + "\n" +
                "  Precio: " + getPrecio() + "\n" +
                "  Factor Contaminación: " + getFactorContaminacion() + "\n" +
                "  Año: " + getAnio() + "\n" +
                "  Matrícula: " + getMatricula() + "\n" +
                "  DNI Titular: " + getDniTitular() + "\n" +
                "  Año de Matriculación: " + anioMatriculacion + "\n" +
                "  Mes de Matriculación: " + mesMatriculacion + "\n" +
                "  Impuesto de Matriculación: " + impuestoMatriculacion + "\n";
    }
}
