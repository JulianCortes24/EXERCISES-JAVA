
package ejercicio9P;


public class Prueba {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan Pérez", "12345678A");
        Persona persona2 = new Persona("María López", "87654321B");

       
        CuentaCorriente cuentaCorriente = new CuentaCorriente(persona1, 1001, 500);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(persona2, 2001, 300);

       
        cuentaCorriente.ingresar(1000);
        System.out.println(cuentaCorriente);
        cuentaCorriente.retirar(400);
        System.out.println(cuentaCorriente);
        cuentaCorriente.retirar(700); // Debe dar error
        System.out.println(cuentaCorriente);

        cuentaAhorro.ingresar(600);
        System.out.println(cuentaAhorro);
        cuentaAhorro.retirar(250);
        System.out.println(cuentaAhorro);
        cuentaAhorro.retirar(400); // Debe dar error
        System.out.println(cuentaAhorro);
    }
}
