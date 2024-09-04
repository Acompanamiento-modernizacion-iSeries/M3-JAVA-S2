import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su número de cuenta:");
        String numeroCuenta = scanner.nextLine();

        System.out.println("Ingrese el saldo inicial:");
        double saldo = scanner.nextDouble();

        System.out.println("Ingrese la tasa de interés:");
        double tasaInteres = scanner.nextDouble();

        scanner.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(nombre, numeroCuenta, saldo, tasaInteres);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Calcular intereses");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo: " + cuenta.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese el monto a depositar:");
                    double montoDeposito = scanner.nextDouble();
                    scanner.nextLine();
                    cuenta.depositar(montoDeposito);
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar:");
                    double montoRetiro = scanner.nextDouble();
                    scanner.nextLine();
                    if (!cuenta.retirar(montoRetiro)) {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 4:
                    System.out.println("Intereses: " + cuenta.calcularIntereses());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}