

public class CuentaBancaria {
    private String nombre;
    private String numeroCuenta;
    private double saldo;
    private double tasaInteres;

    public CuentaBancaria(String nombre, String numeroCuenta, double saldo, double tasaInteres) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto > saldo) {
            return false;
        } else {
            saldo -= monto;
            return true;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double calcularIntereses() {
        return saldo * tasaInteres;
    }
}