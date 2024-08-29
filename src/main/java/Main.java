import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var opcion = 0;
        var opcionSalir = 5;

        SistemaBancario sistemaBancario = new SistemaBancario();

        Scanner scanner = new Scanner(System.in);

        sistemaBancario.solicitarInfo(scanner);

        while (opcion < opcionSalir){
            System.out.println("Hola");
            System.out.println("Por favor seleccione unas de las siguientes opciones:");
            System.out.println("- Consultar saldo:      1");
            System.out.println("- Realizar deposito:    2");
            System.out.println("- Realizar retiro:      3");
            System.out.println("- Calcular interes:     4");
            System.out.println("- Consultar salir:      " + opcionSalir);

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Su saldo total es: " + sistemaBancario.findSaldo());
                    break;
                case 2:
                    sistemaBancario.ingresarTransaccion(scanner, "depósito");
                    break;
                case 3:
                    sistemaBancario.ingresarTransaccion(scanner, "retiro");
                    break;
                case 4:
                    System.out.println("El interes mensual para el saldo: " + sistemaBancario.findSaldo() +
                            " es: " + sistemaBancario.calcularInteres());
                    break;
                case 5:
                    System.out.println("Que tenga un buen día.");
                    break;
                default:
                    break;
            }
        }
    }
}
