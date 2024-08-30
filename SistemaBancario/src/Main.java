import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoFinal = 0.0;
        double tasaInteres = 0.15;
        boolean continuar = true;

        while (continuar) {
            System.out.println("===========================Bienvenido al sistema Bancario BANK===========================");
            System.out.println("=========================================================================================");
            System.out.println("===== Como cliente preferencial cuenta con una tasa de interes 0.15 sobre su saldo ======");
            System.out.println("=========================================================================================");
            System.out.println("=====================Si desea realizar Depósitos indique la opción 1 ====================");
            System.out.println("=====================Si desea realizar Retiros indique la opción 2 ======================");
            System.out.println("=====================Si desea consultar su saldo indique la opción 3 ====================");
            System.out.println("=====================Si desea calcular los intereses sobre el saldo indique la opción 4 =");
            System.out.println("=====================Si desea salir del sistema indique la opción 5 =====================");
            System.out.println("=========================================================================================");

            System.out.println("Ingrese la opción que desea usar: ");
            int opcion = 0;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor a depositar: ");
                    if (scanner.hasNextDouble()) {
                        double deposito = scanner.nextDouble();
                        saldoFinal += deposito;
                        System.out.println("Tú saldo luego del depósito es de: " + saldoFinal);
                        break;
                    } else {
                        System.out.println("Valor no valido");
                        scanner.next();
                        break;
                    }
                case 2:
                    System.out.println("Ingrese el valor a retirar: ");
                    if (scanner.hasNextDouble()) {
                        double retiro = scanner.nextDouble();
                        if (retiro > saldoFinal) {
                            System.out.println("No tienes saldo suficiente para realizar el retiro");
                            break;
                        } else {
                            saldoFinal -= retiro;
                            System.out.println("Tú saldo luego del retiro es de: " + saldoFinal);
                            break;
                        }
                    } else {
                        System.out.println("Valor no valido");
                        scanner.next();
                        break;
                    }
                case 3:
                    System.out.println("Tú saldo actual es de: " + saldoFinal);
                    break;
                case 4:
                    double intereses = saldoFinal * tasaInteres;
                    saldoFinal += intereses;
                    System.out.println("Tú saldo luego de los intereses es de: " + saldoFinal);
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro servicio");
                    continuar = false;
                    break;
                case 0:
                    System.out.println("Esta opción no existe en el menú");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }
}