import java.util.Scanner;

public class MenuPrincipal {

        public static void main(String[] args) {
            int i = 0;
            int opcion ;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el saldo inicial:" );
            double saldo = sc.nextDouble();
            double monto ;
            double tasa = 0.027;

            while (i < 5){
                System.out.println("Opciones: \n" );
                System.out.println("1        Consultar saldo: " );
                System.out.println("2        Realizar deposito: " );
                System.out.println("3        Retirar: " );
                System.out.println("4        Calculo interes: " );
                System.out.println("5        Salir del menu: " );

                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Saldo Actual: \n" );
                        System.out.println(saldo);
                        break;
                    case 2:
                        System.out.println("Ingrese valor a depositar: \n" );
                        saldo += sc.nextDouble();
                        break;
                    case 3:
                        System.out.println("Ingrese valor a retirar: \n" );
                        monto = sc.nextDouble();
                        if (saldo < monto) {
                            System.out.println("Fondos insuficientes \n");
                        }else{
                            saldo -= monto;
                        }
                        break;
                    case 4:
                        System.out.println("Intereces generados: \n" );
                        System.out.println(saldo * tasa);
                        break;
                    case 5:
                        i = 6;
                        System.out.println("Hasta Pronto!!!");
                        break;
                    default:
                        System.out.println("Opción no valida: \n" );
                }

            }
            sc.close();

        }

    }

