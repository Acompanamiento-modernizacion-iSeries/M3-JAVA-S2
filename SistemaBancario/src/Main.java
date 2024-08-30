import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Saldo = 0 ;
        boolean control = true;
        int tipo_op = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("*".repeat(50));
            System.out.print(" TIPO OPERACION \n");
            System.out.println("*".repeat(50));

            System.out.print("1. Consultar Saldo\n2. Realizar Depósitos\n3. Realizar Retiros\n4. Calcular Intereses Sobre Saldo\n\nSeleccione Opcion :");

            if (scanner.hasNextInt()) {
                tipo_op = scanner.nextInt();
                System.out.println("paso 1.");

                switch (tipo_op) {
                    case 1: // SALDFO ACTUAL
                        System.out.println("\nCONSULTA DE SALDO\n");
                        System.out.println("Saldo Actual : " + Saldo);
                        break;

                    case 2: //DEPOSITO
                        System.out.println("\nDEPOSITO\n");
                        System.out.print("Valor a Depositar : ");
                        int valor_deposito = scanner.nextInt();
                        while (valor_deposito <= 0) {
                            System.out.println("El valor ingresado no es valido.");
                            System.out.print("Valor a Depositar : ");
                            valor_deposito = scanner.nextInt();
                        }
                        Saldo = Saldo + valor_deposito;
                        System.out.println("Saldo Actual   : " + Saldo);
                        break;

                    case 3:  // RETIRO
                        System.out.println("\nRETIRO\n");
                        System.out.print("Valor a Retirar : ");
                        int valor_retiro = scanner.nextInt();
                        while (valor_retiro > Saldo || valor_retiro <= 0) {
                            System.out.println("Saldo Insuficiente o Cantidad Invalida");
                            System.out.print("Valor a Retirar : ");
                            valor_retiro = scanner.nextInt();
                        }
                        Saldo = (Saldo - valor_retiro);
                        System.out.println("Saldo Actual   : " + Saldo);
                        break;

                    case 4: //CALCULAR INTERESES
                        System.out.println("\nCALCULO INTERES\n");
                        System.out.print("Tasa Interes : ");
                        double valor_interes = scanner.nextDouble();
                        System.out.println("Saldo        : " + Saldo);
                        System.out.println("Interes      : " + (Saldo * (valor_interes / 100)));
                        System.out.println("Total        : " + (Saldo + (Saldo * (valor_interes / 100))));
                        break;

                    default:
                        System.out.println("La opción seleccionada es invalida.");
                        break;
                }
                System.out.print("Desea realizar otra operacion? S/N ");
                String fin_programa = scanner.next();

                switch (fin_programa.toUpperCase()) {
                    case "S":
                        control = true;
                        break;
                    case "N":
                        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS !!!");
                        control = false;
                        break;
                    default:
                        System.out.println("Opcion Invalida. Debe seleccions S o N");
                        break;
                }
            }else{
                System.out.println("La opción seleccionada es invalida 1.");
                return;
            }
        }while (control == true);
    }
}