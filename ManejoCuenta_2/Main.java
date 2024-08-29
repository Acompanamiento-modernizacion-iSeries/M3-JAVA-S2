import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoCuenta = 0.0;
        final double tasaInteres = 0.05; // 5% de interes

        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        saldoCuenta = scanner.nextDouble();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n =======Bienvenido al Menú de su cuenta bancaria:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Calcular intereses");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + saldoCuenta);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    if (montoDeposito > 0) {
                        saldoCuenta += montoDeposito;
                        System.out.println("Depósito exitoso. Saldo actual: $" + saldoCuenta);
                    } else {
                        System.out.println("El monto del depósito debe ser mayor a cero.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    if (montoRetiro > 0 && montoRetiro <= saldoCuenta) {
                        saldoCuenta -= montoRetiro;
                        System.out.println("Retiro exitoso. Saldo actual: $" + saldoCuenta);
                    } else if (montoRetiro > saldoCuenta) {
                        System.out.println("Fondos insuficientes. Saldo actual: $" + saldoCuenta);
                    } else {
                        System.out.println("El monto del retiro debe ser mayor a cero.");
                    }
                    break;
                case 4:
                    double calculoInteres = saldoCuenta * tasaInteres;
                    saldoCuenta += calculoInteres;
                    System.out.println("Intereses calculados: $" + calculoInteres);
                    System.out.println("Nuevo saldo con intereses: $" + saldoCuenta);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar el sistema bancario.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
 }

