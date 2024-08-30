import java.util.Scanner;
public class AdministracionCuentaBancaria {
    public static void main(String[] args) {
            int i = 0;
            int opc ;
            Scanner sc = new Scanner(System.in);
            System.out.println("Saldo inicial: \n" );
            double saldo = sc.nextDouble();
            double monto ;
            double tasa = 0.023;

            while (i < 9){
                System.out.println("Opciones: \n" );
                System.out.println("1        Consultar Saldo: " );
                System.out.println("2        Realizar Abonos: " );
                System.out.println("3        Realizar Retiros: " );
                System.out.println("4        Calcular interes: " );
                System.out.println("9        Salir del Sistema: " );
                opc = sc.nextInt();
                switch (opc){
                    case 1:
                        //consultar saldo
                        System.out.println("Saldo: \n" );
                        System.out.println(saldo);
                        break;
                    case 2:
                        System.out.println("Ingrese valor deposito: \n" );
                        saldo += sc.nextDouble();
                        break;
                    case 3:
                        System.out.println("Ingrese valor retiro: \n" );
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
                    case 9:
                        i = 10;
                        break;
                    default:
                        System.out.println("Opción no valida: \n" );
                        break;
                }

            }
            sc.close();

        }

    }
