import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria();
        boolean salir = false;

        while (!salir) {
            System.out.println("\nSistema Bancario");
            System.out.println("--------------------");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Calcular intereses");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSaldo actual: " + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.print("\nIngrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("\nIngrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (cuenta.retirar(retiro)) {
                        System.out.println("Retiro exitoso.");
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 4:
                    System.out.print("\nIngrese la tasa de interés (en porcentaje): ");
                    double tasaInteres = scanner.nextDouble();
                    cuenta.calcularIntereses(tasaInteres);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("\nOpción no válida.");
            }
        }
        scanner.close();
    }
}

class CuentaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso.");
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    public void calcularIntereses(double tasaInteres) {
        if (tasaInteres > 0) {
            saldo += saldo * (tasaInteres / 100);
            System.out.println("Intereses calculados y añadidos al saldo.");
        } else {
            System.out.println("La tasa de interés debe ser positiva.");
        }
    }
}