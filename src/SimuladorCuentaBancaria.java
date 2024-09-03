import java.util.Scanner;

public class SimuladorCuentaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de Cliente ===");
        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Número de cuenta: ");
        int numeroDeCuenta = scanner.nextInt();

        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Menú de Opciones ===");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Realizar Retiro");
            System.out.println("4. Calcular Intereses");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Consultar saldo
                    System.out.println("Saldo actual: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    if (montoDeposito > 0) {
                        saldo += montoDeposito;
                        System.out.println("Depósito realizado exitosamente.");
                    } else {
                        System.out.println("Monto inválido. Intente nuevamente.");
                    }
                    System.out.println("Saldo actual: $" + saldo);
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    if (montoRetiro > 0) {
                        if (montoRetiro <= saldo) {
                            saldo -= montoRetiro;
                            System.out.println("Retiro realizado exitosamente.");
                        } else {
                            System.out.println("Saldo insuficiente para realizar el retiro.");
                        }
                    } else {
                        System.out.println("Monto inválido. Intente nuevamente.");
                    }
                    System.out.println("Saldo actual: $" + saldo);
                    break;

                case 4:
                    System.out.print("Ingrese la tasa de interés anual (en %): ");
                    double tasaInteres = scanner.nextDouble();
                    if (tasaInteres > 0) {
                        double intereses = saldo * (tasaInteres / 100);
                        System.out.println("Intereses calculados sobre el saldo: $" + intereses);
                        saldo += intereses;
                        System.out.println("Saldo actual después de aplicar intereses: $" + saldo);
                    } else {
                        System.out.println("Tasa de interés inválida. Intente nuevamente.");
                    }
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Ha salido del simulador, gracias!!");
                    break;

                default:
                    System.out.println("Digite una opcion valida por favor");
            }
        }

        scanner.close();
    }
}
