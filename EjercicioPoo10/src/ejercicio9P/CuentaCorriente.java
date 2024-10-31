
package ejercicio9P;


public class CuentaCorriente extends Cuenta {
    private double maximoRetirable;

    
    public CuentaCorriente(Persona cliente, long numeroCuenta, double maximoRetirable) {
        super(cliente, numeroCuenta);
        this.maximoRetirable = maximoRetirable;
    }

   
    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && x <= maximoRetirable && x <= getSaldo()) {
            ajustarSaldo(-x); // Resta del saldo
        } else {
            System.out.println("No se puede retirar esa cantidad.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta Corriente: Número de cuenta: " + getNumeroCuenta() + ", Saldo: " + getSaldo() + 
               ", Máximo Retirable: " + maximoRetirable;
    }
}
