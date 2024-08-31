import java.util.Scanner;
public class MenuFinanciero
{
    public static void main(String[] args)
    {
        int K = 0, salir=0  ;
        int seleccion, plazo;
        double saldo = 0.0;
        double tasa = 0.0 ;
        double movimiento = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(30));
        System.out.println("  Menú financiero - JMSL -\n");
        System.out.println("=".repeat(30));
        System.out.println("Ingrese saldo inicial del cliente :\n");
        saldo = sc.nextDouble();

        do
        {
            System.out.println("=".repeat(30));
            System.out.println(" MENU \n");
            System.out.println("Opciones: \n" );
            System.out.println("1. Consultar saldo" );
            System.out.println("2. Realizar deposito" );
            System.out.println("3. Retirar" );
            System.out.println("4. Calculo de intereses" );
            System.out.println("5  Salir del menu: " );

        seleccion = sc.nextInt();
        switch (seleccion)
         {
            case 1:
                //consultar saldo
                System.out.println("Saldo: "+saldo );
                break;
            case 2:
                //deposito
                System.out.println("Valor deposito: " );
                movimiento  = sc.nextDouble();
                saldo += movimiento;
                break;
            case 3:
                //retiro
                System.out.println("Valor retiro " );
                movimiento  = sc.nextDouble();
                if (movimiento > saldo)
                {
                    System.out.println("Saldo insuficiente... " );
                }
                else
                {
                    saldo -= movimiento;
                }
                break;
            case 4:
                System.out.println("Ingrese valor porcentaje intereses: \n" );
                tasa  = sc.nextDouble();
                System.out.println("Ingrese plazo intereses: \n" );
                plazo  = sc.nextInt();
                System.out.println("Valor interese es : " +saldo * tasa * plazo);
                break;
            case 5:
                salir = 1 ;
                break;
            default:
                System.out.println("Opción especificada no es correcta: " );
                break;
         }
        } while (salir != 1);
        sc.close();
    }
}
