
package ejercicio9P;


public class CuentaAhorro extends Cuenta {
    private double saldoMinimo;


    public CuentaAhorro(Persona cliente, long numeroCuenta, double saldoMinimo) {
        super(cliente, numeroCuenta);
        this.saldoMinimo = saldoMinimo;
    }


    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && (getSaldo() - x) >= saldoMinimo) {
            ajustarSaldo(-x); // Resta del saldo
        } else {
            System.out.println("No se puede retirar esa cantidad sin sobrepasar el saldo mínimo.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta Ahorro: Número de cuenta: " + getNumeroCuenta() + ", Saldo: " + getSaldo() + 
               ", Saldo mínimo: " + saldoMinimo;
    }
}
