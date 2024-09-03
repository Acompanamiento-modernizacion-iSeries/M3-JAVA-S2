package main;
import java.util.Scanner;


public class Main {

    private static double saldo = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                scanner.next();
                System.out.print("Seleccione una opción: ");
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    realizarDeposito(scanner);
                    break;
                case 3:
                    realizarRetiro(scanner);
                    break;
                case 4:
                    calcularIntereses(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Seleccione una opción del menú.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar depósito");
        System.out.println("3. Realizar retiro");
        System.out.println("4. Calcular intereses");
        System.out.println("5. Salir");
    }

    private static void consultarSaldo() {
        System.out.printf("El saldo actual es: $%.2f%n", saldo);
    }

    private static void realizarDeposito(Scanner scanner) {
        System.out.print("Ingrese la cantidad a depositar: $");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Ingrese un número válido.");
            scanner.next();
            System.out.print("Ingrese la cantidad a depositar: $");
        }
        double cantidad = scanner.nextDouble();

        if (cantidad <= 0) {
            System.out.println("La cantidad a depositar debe ser positiva.");
        } else {
            saldo += cantidad;
            System.out.printf("Depósito realizado. Nuevo saldo: $%.2f%n", saldo);
        }
    }

    private static void realizarRetiro(Scanner scanner) {
        System.out.print("Ingrese la cantidad a retirar: $");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            scanner.next();
            System.out.print("Ingrese la cantidad a retirar: $");
        }
        double cantidad = scanner.nextDouble();

        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo -= cantidad;
            System.out.printf("Retiro realizado. Nuevo saldo: $%.2f%n", saldo);
        }
    }

    private static void calcularIntereses(Scanner scanner) {
        System.out.print("Ingrese la tasa de interés anual (en %): ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            scanner.next();
            System.out.print("Ingrese la tasa de interés anual (en %): ");
        }
        double tasaInteres = scanner.nextDouble();

        if (tasaInteres <= 0) {
            System.out.println("La tasa de interés debe ser positiva.");
        } else {
            double intereses = saldo * (tasaInteres / 100);
            System.out.printf("Los intereses generados sobre el saldo de $%.2f a una tasa de %.2f%% son: $%.2f%n", saldo, tasaInteres, intereses);
        }
    }
}


