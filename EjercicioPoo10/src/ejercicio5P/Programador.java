
package ejercicio5P;

public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    
    public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

   
    public Programador() {
        super();
        this.lineasDeCodigoPorHora = 0;
        this.lenguajeDominante = "";
    }

   
    public double calculaSalario() {
        return 10 * lineasDeCodigoPorHora;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Líneas de Código por Hora: " + lineasDeCodigoPorHora + ", Lenguaje Dominante: " + lenguajeDominante;
    }
}
