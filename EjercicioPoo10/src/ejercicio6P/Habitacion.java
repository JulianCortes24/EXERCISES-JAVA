
package ejercicio6P;

public class Habitacion {
    private String nombre;
    private Alfombra[] alfombras;
    private int contador; // Para controlar el número de alfombras

    
    public Habitacion(String nombre) {
        this.nombre = nombre;
        this.alfombras = new Alfombra[10]; // Capacidad máxima de 10 alfombras
        this.contador = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public boolean agregarAlfombra(Alfombra alf) {
        if (contador < alfombras.length) {
            alfombras[contador++] = alf;
            return true; 
        }
        return false; 
    }

    
    public double calcularPrecioTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += alfombras[i].calcularPrecio();
        }
        return total;
    }

    
    public double calcularPrecioCuadradas() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            if (alfombras[i] instanceof AlfombraCuadrada) {
                total += alfombras[i].calcularPrecio();
            }
        }
        return total;
    }
}
