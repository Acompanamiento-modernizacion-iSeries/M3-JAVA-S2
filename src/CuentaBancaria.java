import java.util.Scanner;

public class CuentaBancaria {
    private static double saldo = 0;
    private static final double TASA_INTERES = 0.05; // 5% de interés

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = obtenerOpcionValida(sc);

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    realizarDeposito(sc);
                    break;
                case 3:
                    realizarRetiro(sc);
                    break;
                case 4:
                    calcularIntereses();
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n------------------------------------------");
        System.out.println("--- Menú Gestión Cuenta Bancaria ---");
        System.out.println("------------------------------------------");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar depósito");
        System.out.println("3. Realizar retiro");
        System.out.println("4. Calcular intereses");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int obtenerOpcionValida(Scanner scanner) {
        int opcion = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            String entrada = scanner.nextLine();
            if (esNumero(entrada)) {
                opcion = Integer.parseInt(entrada);
                entradaValida = true;
            } else {
                System.out.print("Por favor, ingrese un número válido: ");
            }
        }

        return opcion;
    }

    private static boolean esNumero(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private static void consultarSaldo() {
        System.out.printf("Su saldo actual es: $%.2f%n", saldo);
    }

    private static void realizarDeposito(Scanner scanner) {
        System.out.print("Ingrese la cantidad a depositar: $");
        double cantidad = obtenerCantidadValida(scanner);
        saldo += cantidad;
        System.out.printf("Depósito realizado. Nuevo saldo: $%.2f%n", saldo);
    }

    private static void realizarRetiro(Scanner scanner) {
        System.out.print("Ingrese la cantidad a retirar: $");
        double cantidad = obtenerCantidadValida(scanner);
        if (cantidad > saldo) {
            System.out.println("Fondos insuficientes. No se puede realizar el retiro.");
        } else {
            saldo -= cantidad;
            System.out.printf("Retiro realizado. Nuevo saldo: $%.2f%n", saldo);
        }
    }

    private static void calcularIntereses() {
        double intereses = saldo * TASA_INTERES;
        saldo += intereses;
        System.out.printf("Intereses calculados y añadidos. Nuevo saldo: $%.2f%n", saldo);
    }

    private static double obtenerCantidadValida(Scanner scanner) {
        double cantidad = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            String entrada = scanner.nextLine();
            if (esNumero(entrada)) {
                cantidad = Double.parseDouble(entrada);
                entradaValida = true;
            } else {
                System.out.print("Por favor, ingrese una cantidad válida: $");
            }
        }
        return cantidad;
    }

}