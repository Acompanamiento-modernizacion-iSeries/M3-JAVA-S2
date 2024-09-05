import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        double saldo = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            //Menu
            System.out.println("=================================");
            System.out.println("***Cuenta Bancaria***");
            System.out.println("=================================");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Hacer deposito");
            System.out.println("3. Hacer retiro");
            System.out.println("4. Calcular intereses");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            double tasa = 0.05;

            switch (opcion) {

                case 1:
                   //consultar saldo
                    System.out.println("Saldo de la cuenta: " + saldo);
                    break;
                case 2:
                    //realizar depósitos
                    System.out.println("ingrese el valor del deposito: ");
                    saldo += sc.nextDouble();
                    System.out.println("Deposito exitoso");
                    break;
                case 3:
                    //realizar retiros
                    System.out.println("ingrese el valor del retiro: ");
                    double retiro = sc.nextDouble();
                    if (retiro <= saldo)
                    {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso");
                    }else{
                        System.out.println("Saldo insuficiente para el retiro");
                    }

                    break;
                case 4:
                    //calcular intereses sobre el saldo
                    if (saldo > 0) {
                        double interes = saldo * tasa;
                        saldo += interes;
                        System.out.println("Intereses generados " + interes);
                    }else{
                        System.out.println("no tiene saldo disponible para generar intereses. ");
                    }
                    break;
                case 5:
                    //Salir
                    System.out.println("Gracias por usar nuestros servicios");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor seleccione una opción valida");
                    break;
            }
        }
    }
}
