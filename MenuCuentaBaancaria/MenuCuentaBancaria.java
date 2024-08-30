import java.util.Scanner;

public class MenuCuentaBancaria {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nombre:\n");
            String nombre = scanner.next();

            System.out.println("Cedula:\n");
            String cedula = scanner.next();

            System.out.println("Saldo:\n");
            Double saldo = scanner.nextDouble();


            while(true) {
                // menu de opciones
                System.out.println("\nMenu de opciones de tu cuenta bancaria");
                System.out.println("1.Consultar saldo");
                System.out.println("2.Realizar depositos");
                System.out.println("3.Realizar retiros");
                System.out.println("4.Calcular intereses");
                System.out.println("5.Salir");

                int opcion = scanner.nextInt();

                //logica de las opciones de menu
                switch (opcion) {
                    case 1:
                        System.out.println("El saldo total de su cuenta es: " + saldo + " pesos");
                        break;
                    case 2:
                        System.out.println("Digite el valor que desea depositar:");
                        Double deposito = scanner.nextDouble();
                        saldo = saldo + deposito;
                        System.out.println("Su nuevo saldo es " + saldo + " pesos");
                        break;
                    case 3:
                        System.out.println("Digite el valor que desea retirar:");
                        Double retiro = scanner.nextDouble();
                        if (retiro > saldo) {
                            System.out.println("Fondos insuficientes.");
                        } else {
                            saldo = saldo - retiro;
                            System.out.println("Su nuevo saldo es " + saldo + " pesos");
                        }
                        break;
                    case 4:
                        Double tasaInteres = 0.08;
                        Double intereses = saldo * tasaInteres;
                        System.out.println("Los intereses generados a su cuentan son: " + intereses + " pesos");
                        break;
                    case 5:
                        System.out.println("Adios");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion digitada no válida, intente otra vez..");
                }
            }
        }

}
