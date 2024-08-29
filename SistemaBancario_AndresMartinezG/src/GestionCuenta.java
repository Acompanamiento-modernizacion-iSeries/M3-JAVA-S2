import java.util.Scanner;

public class GestionCuenta {
    public static void main(String[] args) {
        System.out.println("\n *** BIENVENIDO ***");

        Scanner scanner = new Scanner(System.in);
        double saldoActual;
        int tipoTransacc;
        boolean valorValido = false;
        double vlrTransacc;
        double tasaInteres = 13.0;

        do {
            System.out.println("Ingrese el Saldo Inicial:");
            saldoActual = scanner.hasNextDouble() ? scanner.nextDouble() : -1.0;

            if (saldoActual >= 0) {
                valorValido = true;
            } else {
                System.out.println("Lo sentimos, debe ingresar un valor igual o mayor a 0!");
                scanner.next(); // Limpiar el buffer del scanner para evitar un bucle infinito
            }
        } while (!valorValido);

        while (true) {
            System.out.println("Ingrese el numero de la Transaccion a realizar:\n" +
                    " 1. Consultar saldo.\n" +
                    " 2. Realizar deposito.\n" +
                    " 3. Realizar retiro.\n" +
                    " 4. Calcular intereses sobre el saldo.\n" +
                    " 0. TERMINAR");
            tipoTransacc = scanner.nextInt();

            switch (tipoTransacc) {
                case 1:
                    System.out.println("Su saldo actual es: " + saldoActual + "\n");
                    break;
                case 2:
                    System.out.println("Ingrese el Valor del deposito:");
                    vlrTransacc = scanner.hasNextDouble() ? scanner.nextDouble() : -1.0;
                    if (vlrTransacc >= 0) {
                        saldoActual += vlrTransacc;
                        System.out.println("Deposito por " + vlrTransacc + " realizado!\n");
                    } else {
                        System.out.println("Lo sentimos, debe ingresar un valor igual o mayor a 0!");
                        scanner.next(); // Limpiar el buffer del scanner
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el Valor del retiro:");
                    vlrTransacc = scanner.hasNextDouble() ? scanner.nextDouble() : (saldoActual + 1);
                    if (vlrTransacc >= 0 && vlrTransacc <= saldoActual) {
                        saldoActual -= vlrTransacc;
                        System.out.println("Retiro por " + vlrTransacc + " realizado!\n");
                    } else {
                        System.out.println("Lo sentimos, debe ingresar un valor positivo y menor o igual al saldo disponible!");
                        scanner.next(); // Limpiar el buffer del scanner
                    }
                    break;
                case 4:
                    double intereses = saldoActual * tasaInteres / 100;
                    System.out.println("Con su saldo actual, " +
                            "y a una Tasa de Interes del " + tasaInteres + "%, " +
                            "en un año usted obtendrá un interes de " + intereses + "\n");
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestro servicio!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tipo de transaccion no reconocida!\n");
            }
        }
    }
}
