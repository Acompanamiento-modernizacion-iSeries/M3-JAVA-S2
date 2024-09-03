import java.util.InputMismatchException;
import java.util.Scanner;

public class SimuladorCuentaBancaria {
    private static Scanner scanner = new Scanner(System.in);
    private static double saldo;

    public static void main(String[] args) {
        boolean cerrar = true;
        while (cerrar) {
            mostrarMenu();
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    realizarRetiro();
                    break;
                case 4:
                    intereses();
                    break;
                case 5:
                    cerrar = false;
                    System.out.println("Sesion finalizada exitosamente!");
                    break;
                default:
                    System.out.println("\nOpción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }
    private static void mostrarMenu() {
        System.out.println("\nSimulador Sistema Bancario");;
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar depósito");
        System.out.println("3. Realizar retiro");
        System.out.println("4. Calcular intereses");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
    private static int leerOpcion() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opción no valida.");
                scanner.next();
            }
        }
    }
    private static void consultarSaldo() {
        System.out.println("\nSaldo actual: " + saldo);
    }
    private static void realizarDeposito() {
        System.out.print("\nIngrese el valor a depositar: ");
        double deposito = leerMonto();
        depositar(deposito);
    }
    private static void realizarRetiro() {
        System.out.print("\nIngrese el valor a retirar: ");
        double retiro = leerMonto();
        if (retirar(retiro)) {
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
    private static void intereses() {
        System.out.print("\nIngrese la tasa de interés (en porcentaje): ");
        double tasaInteres = leerMonto();
        calcularIntereses(tasaInteres);
    }
    private static double leerMonto() {
        while (true) {
            try {
                double monto = scanner.nextDouble();
                if (monto >= 0) {
                    return monto;
                } else {
                    System.out.println("El valor ingresado no puede ser negativo. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor ingrese un número.");
                scanner.next();
            }
        }
    }
    public static void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso.");
        } else {
            System.out.println("El valor ingresado debe ser positivo.");
        }
    }
    public static boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }
    public static void calcularIntereses(double tasaInteres) {
        if (tasaInteres > 0) {
            saldo += saldo * (tasaInteres / 100);
            System.out.println("Intereses calculados sobre la cuenta");
        } else {
            System.out.println("La tasa de interés ingresada debe ser positiva.");
        }
    }
}