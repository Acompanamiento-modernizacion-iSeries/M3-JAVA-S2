import java.util.Scanner;

public class GestionCuentaBancatia {

        public static void main(String[] args) {
            Scanner datoscliente = new Scanner(System.in);

            //Captura el nombre del cliente
            System.out.println("Ingrese su Nombre:");
            String nombre = datoscliente.next();

            //Captura el Numero de Cuenta
            System.out.println("Ingrese su Numero de Cuenta:");
            int numerocuenta = datoscliente.nextInt();

            //Captura el saldo inicial de la Cuenta
            System.out.println("Ingrese su Saldo Inicial:");

            double saldo = datoscliente.nextDouble();

            Scanner opciones = new Scanner(System.in);
            //double saldo = 0;
            int opcion;
            while(true) {
                // Mostrar el menú
                System.out.println("\nGestión de Cuenta Bancaria");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Realizar depósito");
                System.out.println("3. Realizar retiro");
                System.out.println("4. Calcular intereses");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = opciones.nextInt();


                switch (opcion) {

                    case 1:
                        System.out.printf("Saldo actual: $%.2f\n", saldo);
                        break;
                    case 2:
                        System.out.print("Ingrese el monto a depositar: ");
                        double montodepositar = opciones.nextDouble();

                        if (montodepositar > 0) {
                            saldo += montodepositar;
                            System.out.printf("Depósito realizado. Nuevo saldo: $%.2f\n", saldo);
                        } else {
                            System.out.println("El monto debe ser positivo.");
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el monto a retirar: ");
                        double montoretirar = opciones.nextDouble();

                        if (montoretirar > 0) {
                            if (montoretirar <= saldo) {
                                saldo -= montoretirar;
                                System.out.printf("Retiro realizado. Nuevo saldo: $%.2f\n", saldo);
                            } else {
                                System.out.println("Fondos insuficientes.");
                            }
                        } else {
                            System.out.println("El monto debe ser positivo.");
                        }
                        break;
                    case 4:
                        System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
                        double tasaInteres = opciones.nextDouble();

                        if (tasaInteres > 0) {
                            double interes = saldo * (tasaInteres / 100);
                            System.out.printf("Intereses generados: $%.2f\n", interes);
                        } else {
                            System.out.println("La tasa de interés debe ser positiva.");
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa.");
                        opciones.close();
                        System.exit(0);   // Cierra completamente la aplicación
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                        break;
                }
            }
        }
    }
