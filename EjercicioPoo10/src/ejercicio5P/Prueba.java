
package ejercicio5P;

public class Prueba {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Perez", "12345678A", 30, false, 2500.0);
        System.out.println("Empleado 1:");
        System.out.println(empleado);
        System.out.println("Clasificación: " + empleado.clasifica());

        empleado.subirSalario(10);
        System.out.println("Salario después de aumento: " + empleado.getSalario()); // Muestra solo el salario actualizado

        Programador programador = new Programador("Ana Martinez", "87654321B", 25, true, 3000.0, 50, "Java");
        System.out.println("\nProgramador 1:");
        System.out.println(programador);
        System.out.println("Clasificación: " + programador.clasifica());

        System.out.println("Salario calculado del programador: " + programador.calculaSalario());

        programador.subirSalario(15);
        System.out.println("Salario después de aumento: " + programador.getSalario()); // Muestra solo el salario actualizado
    }
}


