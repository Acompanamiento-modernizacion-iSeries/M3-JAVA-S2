import java.util.Scanner;

public class SimuladorCuentaBancaria {
    public static void main(String[] args) {
        String separador;
        String nombre;
        int cuenta;
        int tipoTransaccion;
        double saldo;
        double monto;
        int numTrx;

        separador = "-".repeat(100);

        Scanner sacanner = new Scanner(System.in);

        System.out.println(separador);
        System.out.println("Ingrese el Nombre:");
        nombre = sacanner.next();

        System.out.println("Ingrese el numero de cuenta:");
        cuenta = sacanner.nextInt();

        System.out.println("Ingrese el Saldo Inicial:");
        saldo = sacanner.nextDouble();
        System.out.println(separador);

        System.out.println("Hola " + nombre + ", tu cuenta No. " + cuenta +
                           "\n Tienes derecho a 5 transacciones el día de hoy." +
                           "\n Inicias con un Saldo: "+ saldo);
        System.out.println(separador);



        // ------------------------------------------
        numTrx = 0;
        for (int i = 0; i < 5; i++) {
            numTrx++;
            System.out.println(separador);
            System.out.println("   Transacción No." + numTrx);
            System.out.println(separador);

            // Asegura un Tipo de transacción valido
            tipoTransaccion = 0;
            while (tipoTransaccion == 0){
                System.out.println("Elija el Tipo de Transacción (1=deposito  2=Retiro)");
                tipoTransaccion = sacanner.nextInt();
                // Valida que se ingrese un tipo valido de transacción
                if (tipoTransaccion != 1 && tipoTransaccion != 2){
                    System.out.println("\n *** *** ALERTA - Tipo de Transacción "+tipoTransaccion+
                                       " NO es valido. *** *** \n");
                    tipoTransaccion = 0;
                }
            }

            monto =0;
            switch (tipoTransaccion){
                case 1 :
                    System.out.println("Ingrese el Monto a Depositar: ");
                    monto = sacanner.nextDouble();
                    if (monto<=0){
                        System.out.println("\n *** *** ALERTA -- Transacción No exitosa, " +
                                           "El monto ingresado debe ser mayor a Cero (0). *** *** \n");
                        continue;
                    }
                    saldo = saldo + monto;
                    break;
                case 2:
                    System.out.println("Ingrese el Monto a Retirar: ");
                    monto = sacanner.nextDouble();
                    if (monto<=0){
                        System.out.println("\n *** *** ALERTA - Transacción No exitosa, " +
                                           "El monto ingresado debe ser mayor a Cero (0). *** *** \n");
                        continue;
                    }
                    if (monto > saldo){
                        System.out.println("\n *** *** ALERTA - Transacción No exitosa, " +
                                           "Saldo Insuficiente. *** *** \n");
                        continue;
                    }
                    saldo = saldo - monto;
                    break;
            }
        }
        System.out.println("Tú Saldo final es:  $"+ saldo);
        // Cerrar el scanner al finalizar
        sacanner.close();
    }
}

