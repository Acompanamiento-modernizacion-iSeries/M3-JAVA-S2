import java.util.Scanner;

public class MenuMantenimientoBancario {
    public static void main(String[] args) {
        int i = 0;
        int opc ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saldo inicial: \n" );
        double saldo = sc.nextDouble();
        double monto ;
        double tasa = 0.035;

        while (i < 9){
            System.out.println("Opciones: \n" );
            System.out.println("1        Consultar saldo: " );
            System.out.println("2        Realizar deposito: " );
            System.out.println("3        Retirar: " );
            System.out.println("4        Calculo interes: " );
            System.out.println("9        Salir del menu: " );
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    //consultar saldo
                    System.out.println("Saldo: \n" );
                    System.out.println(saldo);
                case 2:
                    System.out.println("Ingrese valor deposito: \n" );
                    saldo += sc.nextDouble();
                case 3:
                    System.out.println("Ingrese valor retiro: \n" );
                    monto = sc.nextDouble();
                    if (saldo < monto) {
                        System.out.println("Fondos insuficientes \n");
                    }else{
                        saldo -= monto;
                    }
                case 4:
                    System.out.println("Intereces generados: \n" );
                    System.out.println(saldo * tasa);
                case 9:
                    i = 10;
                default:
                    System.out.println("Opción no valida: \n" );
            }

        }
        sc.close();

    }

}
