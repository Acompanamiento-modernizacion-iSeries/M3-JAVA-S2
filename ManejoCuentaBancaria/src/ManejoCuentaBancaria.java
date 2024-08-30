import java.util.Scanner;

public class ManejoCuentaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Captura datos cliente
        System.out.println("Ingrese los datos del cliente \n");
        System.out.println("Nombre: ");
        String nombre = scanner.next();
        System.out.println("Numero de cuenta: ");
        int cuenta = scanner.nextInt();
        System.out.println("Saldo inicial: ");
        double saldo = scanner.nextDouble();

        while (true){

            System.out.println("\n Seleccione opcion: \n");
            System.out.println("1. Consultar saldo. ");
            System.out.println("2. Realizar depósito. ");
            System.out.println("3. Realizar retiro. ");
            System.out.println("4. Calcular interes. ");
            System.out.println("5. Salir. \n");
            System.out.println("Opcion:");
            int Op = scanner.nextInt();
            double interes = 0.03;
            double intsaldo;

            switch (Op) {
                case 1:
                    System.out.println("Saldo actual: " + saldo);
                    break;
                case 2:
                    System.out.println("\n Valor deposito: ");
                    double valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.println("Se realizo depósito");
                    break;
                case 3:
                    System.out.println("\n Valor retiro: ");
                    double valor1 = scanner.nextDouble();
                    if(valor1 > saldo){
                    System.out.println("Fondos insuficientes");
                }else{
                    saldo -= valor1;
                    System.out.println("Se realizo retiro");
                }
                    break;
                case 4:
                    intsaldo = saldo * interes;
                    System.out.println("intereses generados son de: " + intsaldo);
                    break;
                case 5:
                    System.out.println("Adios");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida \n");
            }
        }
    }
}
