import java.util.Scanner;

public class SistemaBancario {

    private static String nombre = "";
    private static int numeroCuenta = 0;
    private static double saldo = 0.0;
    private static double interesMensual = 0.83;

    public void solicitarInfo(Scanner scanner){
        System.out.println("Ingrese Nombre:");
        nombre = scanner.nextLine();

        System.out.println("Ingrese Numero de cuenta:");
        numeroCuenta = scanner.nextInt();

        System.out.println("Ingrese Saldo de cuenta:");
        saldo = scanner.nextDouble();
    }

    public void ingresarTransaccion(Scanner scanner, String tipo){
        System.out.println("Ingrese Valor de transacción:");
        double valor  = scanner.nextDouble();

        if("depósito".equals(tipo)){
            saldo += valor;
        } else if("retiro".equals(tipo)){
            saldo -= valor;
        }
        System.out.println("Su saldo es: " + saldo);
    }

    public double findSaldo(){
        return saldo;
    }

    public double calcularInteres(){
        return saldo * (interesMensual/100);
    }
}
