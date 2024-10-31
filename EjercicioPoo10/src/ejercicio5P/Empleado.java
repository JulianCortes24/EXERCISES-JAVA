
package ejercicio5P;

public class Empleado {
    private String nombre;
    private String dni;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        setEdad(edad);
        this.casado = casado;
        this.salario = salario;
    }

    
    public Empleado() {
        this.nombre = "";
        this.dni = "";
        this.edad = 18;
        this.casado = false;
        this.salario = 0.0;
    }

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18 && edad <= 45) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 45 años.");
        }
    }

    
    public double getSalario() {
        return salario;
    }

   
    public String clasifica() {
        if (edad <= 21) {
            return "Principiante";
        } else if (edad <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }

    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Edad: " + edad + ", Casado: " + casado + ", Salario: " + salario;
    }

    
    public void subirSalario(int porcentaje) {
        this.salario += this.salario * porcentaje / 100.0;
    }
}
