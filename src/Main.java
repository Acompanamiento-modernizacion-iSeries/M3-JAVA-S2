import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*
         Objetivo.
        Los asistentes deben crear un programa que permita a un usuario simular la gestión de una cuenta bancaria con
        las siguientes opciones: consultar saldo, realizar depósitos, realizar retiros, y calcular intereses sobre el
        saldo.

         Instrucciones.
        Crear un menú que permita seleccionar entre las opciones mencionadas.
        Usar operadores para manejar los cálculos de depósitos, retiros, y generación de intereses.
        Implementar estructuras de control (if-else, switch) para dirigir el flujo del programa basado en la selección
        del usuario.
        Asegurarse de manejar correctamente condiciones como fondos insuficientes o entradas no válidas.
        El programa debe ser interactivo, solicitando la entrada del usuario para cada operación.
        Nota: Los talleres deben entregarse por medio de la estrategia establecida para la formación, por medio de un
        Pull Request desde el repositorio Fork hacia la rama main del repositorio del taller.
     */
    public static void main(String[] args) {
        // Pedir datos del cliente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Pedir numero cuenta y saldo
        System.out.print("Ingrese su número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Ingrese un saldo inicial para su cuenta: ");
        double saldo = scanner.nextDouble();

        // Pedir transacciones
        System.out.println("Ahora vamos a proceder a realizar transacciones en su cuenta");
        System.out.println("---".repeat(20));

        menu();

        int opcion = 0;
        boolean validInput;
        while (true){
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Ingrese una opción: ");
                    opcion = scanner.nextInt();
                    validInput = true; // Entrada válida, salimos del bucle
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese una opción válida numérica del menu anterior");
                    scanner.next(); // Limpiar el buffer del scanner para evitar un bucle infinito
                    menu();
                }
            }

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    saldo += montoDeposito;
                    System.out.println("Depósito realizado exitosamente");
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    if (montoRetiro > saldo) {
                        System.out.println("Fondos insuficientes");
                    } else {
                        saldo -= montoRetiro;
                        System.out.println("Retiro realizado exitosamente");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese la tasa de interés: ");
                    double tasaInteres = scanner.nextDouble();
                    double intereses = saldo * tasaInteres / 100;
                    saldo += intereses;
                    System.out.println("Intereses generados: " + intereses);
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo");
                    System.out.println("---".repeat(20));
                    menu();
                    break;
            }
            if (opcion == 9) {
                break;
            }
        }

    }
    public static void menu(){
        System.out.println("Menú de opciones");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar depósito");
        System.out.println("3. Realizar retiro");
        System.out.println("4. Calcular intereses");
        System.out.println("9. Salir\n");

    }
}