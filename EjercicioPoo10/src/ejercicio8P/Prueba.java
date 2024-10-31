
package ejercicio8P;


public class Prueba {
    public static void main(String[] args) {
      
        Vehiculo[] camiones = new Camion[3];
        camiones[0] = new Camion(20000, "MarcaA", 15, 2);
        camiones[1] = new Camion(25000, "MarcaB", 20, 3);
        camiones[2] = new Camion(30000, "MarcaC", 10, 4);

        
        System.out.println("Precios de venta de los camiones:");
        for (Vehiculo camion : camiones) {
            System.out.println(camion.precioVenta());
        }

     
        Vehiculo[] furgonetas = new Furgoneta[2];
        furgonetas[0] = new Furgoneta(15000, "MarcaD", 12);
        furgonetas[1] = new Furgoneta(18000, "MarcaE", 8);

      
        System.out.println("\nPrecios de venta de las furgonetas:");
        for (Vehiculo furgoneta : furgonetas) {
            System.out.println(furgoneta.precioVenta());
        }

        
        Vehiculo[] vehiculos = new Vehiculo[5];
        System.arraycopy(camiones, 0, vehiculos, 0, camiones.length);
        System.arraycopy(furgonetas, 0, vehiculos, camiones.length, furgonetas.length);

      
        System.out.println("\nPrecios de venta de todos los vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.precioVenta());
        }
    }
}
