
package ejercicio9P;


public abstract class Cuenta {
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

   
    public Cuenta(Persona cliente, long numeroCuenta) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0; 
    }


    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    protected void ajustarSaldo(double cantidad) {
        this.saldo += cantidad; 
    }

    public void ingresar(double x) {
        if (x > 0) {
            ajustarSaldo(x); 
        } else {
            System.out.println("El monto a ingresar debe ser mayor que 0.");
        }
    }

  
    public abstract void retirar(double x);
}

