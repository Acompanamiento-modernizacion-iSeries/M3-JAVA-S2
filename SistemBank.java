import java.util.Scanner;

public class SistemBank {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el Nombre del dueño de la Cuenta Bancaria: ");
            String nombre = scanner.nextLine();

            int numeroCuenta;
            boolean validador = true;
            do {
                if (validador){
                    System.out.print("Ingrese su número de cuenta: ");
                }else {
                    System.out.print("Valor no válido. Ingrese su número de cuenta correcto: ");
                }
                validador= false;
                while (!scanner.hasNextInt()) {
                    System.out.print("Valor no válido. Ingrese su número de cuenta (debe ser un número positivo): ");
                    scanner.next();
                }
                numeroCuenta = scanner.nextInt();
            } while (numeroCuenta < 0);

            double saldo;
            validador = true;
            do {
                if (validador){
                    System.out.print("Ingrese su saldo inicial: ");
                }else {
                    System.out.print("Valor no válido. Ingrese un saldo correcto: ");
                }
                validador= false;
                while (!scanner.hasNextDouble()) {
                    System.out.print("Valor no válido. Ingrese su saldo inicial (debe ser un valor positivo): ");
                    scanner.next();
                }
                saldo = scanner.nextDouble();
            } while (saldo < 0);


            int opcion;
            do {
                System.out.println("\nSeleccione una opción:");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Realizar depósito");
                System.out.println("3. Realizar retiro");
                System.out.println("4. Calcular intereses sobre el saldo");
                System.out.println("5. Salir");

                System.out.print("Digite la Opción: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("La Opción digitada no es válida. Ingrese un número entre 1 y 5: ");
                    scanner.next();
                }
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Su saldo actual es: " + saldo);
                        break;

                    case 2:
                        validador = true;
                        double deposito;
                        do{
                            if (validador) {
                                System.out.print("Ingrese el monto a depositar: ");
                            }else{
                                System.out.print("Valor no válido. Ingrese un monto correcto: ");
                            }
                            validador=false;

                            while (!scanner.hasNextDouble()) {
                                System.out.print("Monto no válido. Ingrese un valor positivo: ");
                                scanner.next();
                            }
                            deposito = scanner.nextDouble();
                        } while (deposito <= 0);
                        saldo += deposito;
                        System.out.println("Depósito realizado. ");
                        break;

                    case 3:
                        validador = true;
                        double retiro;
                        do{
                        if (validador) {
                            System.out.print("Ingrese el monto a retirar: ");
                        }else{
                            System.out.print("Valor no válido. Ingrese un monto correcto: ");
                        }
                        validador=false;
                        while (!scanner.hasNextDouble()) {
                               System.out.print("Monto no válido. Ingrese un valor positivo: ");
                               scanner.next();
                        }
                        retiro = scanner.nextDouble();
                        } while (retiro <= 0);
                        if (retiro <= saldo) {
                            saldo -= retiro;
                            System.out.println("Retiro realizado. ");
                        } else {
                            System.out.println("Fondos insuficientes para realizar el retiro.");
                        }
                        break;

                    case 4:
                        validador = true;
                        double tasaInteres;
                        do{
                        if (validador) {
                            System.out.print("Ingrese la tasa de interés (por ejemplo, 5 para 5%): ");
                        }else{
                            System.out.print("Valor no válido. Ingrese una tasa correcta:");
                        }
                        validador=false;
                        while (!scanner.hasNextDouble()) {
                                System.out.print("Valor no válido. Ingrese una tasa de interés positiva: ");
                                scanner.next();
                            }
                        tasaInteres = scanner.nextDouble();
                        } while (tasaInteres <= 0);

                        double intereses = saldo * (tasaInteres / 100);
                        saldo += intereses;
                        System.out.println("Intereses calculados: " + intereses);
                        break;

                    case 5:
                        System.out.println("Gracias por utilizar el sistema bancario. ¡Hasta luego!");
                        System.out.println("Autor: Harold Choles mejia");
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción entre 1 y 5.");
                        break;
                }
                } while (opcion != 5);


            scanner.close();
        }
}


