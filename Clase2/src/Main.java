import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = sc.next();
        System.out.println("Hola " + nombre);
        System.out.println("Ingrese su número de cuenta:");
        String numeroCuenta = sc.next();
        System.out.println("El número de cuenta ingresado es: " + numeroCuenta);
        System.out.println("Ingrese su saldo inicial:");
        double saldoInicial =  sc.nextDouble();
        double interes = 0.3;

        System.out.println("______________________________________________________________________________");
        System.out.println("Si desea consultar el saldo seleccione 1\nSi desea realizar un depósito seleccione 2\nSi desea realizar un retiro seleccione 3\nSi desea calcular intereses seleccion 4\nSi desea salir selecciona 5");
        while (true){
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("El saldo actual es de: $" + saldoInicial);
                    break;
                case 2:
                    System.out.println("Vas a realizar un DEPÓSITO, digite la cantidad a depositar:");
                    double dep = sc.nextDouble();
                    saldoInicial += dep;
                    System.out.println("Su depósito fue de: $" + dep + " Su saldo actual es de: $" + saldoInicial);
                    break;
                case 3:
                    System.out.println("Vas a realizar un RETIRO, digite la cantidad a retirar:");
                    double ret = sc.nextDouble();
                    if(saldoInicial < ret){
                        System.out.println("Su saldo es insuficiente");
                    }else {
                        saldoInicial -= ret;
                        System.out.println("Su retiro fue de: $" + ret + " Su saldo actual es de: $" + saldoInicial);
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el número de meses para calcular los intereses:");
                    int meses = sc.nextInt();
                    if (meses < 0) {
                        System.out.println("Entrada no válida. Los meses no pueden ser negativos.");
                    } else {
                        double tasaInteresMensual = interes / 12;
                        double interesGenerado = saldoInicial * tasaInteresMensual * meses;
                        saldoInicial += interesGenerado;
                        System.out.println("El cálculo de intereses sobre su saldo es de: $" + interesGenerado + ". Su saldo total es de: $" + saldoInicial);
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Seleccionaste una opción incorrecta");
            }

        }
    }
}
