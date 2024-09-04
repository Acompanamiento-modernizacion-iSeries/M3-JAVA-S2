import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaBancario cuenta = new SistemaBancario(1000, 0.02); // saldo inicial y tasa de interés

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Calcular intereses");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: " + cuenta.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar:");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a retirar:");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    cuenta.calcularInteres();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Gracias por usar el sistema bancario.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        scanner.close();
    }
}
