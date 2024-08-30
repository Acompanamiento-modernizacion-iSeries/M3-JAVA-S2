import javax.swing.JOptionPane;

public class AdministrarCuentaBancaria {
    public static void main(String[] args) {

        double saldo = 0.0;
        boolean saldoValido = false;
        double tasa = 0.0050;

        while (!saldoValido) {
            String saldoInicialStr = JOptionPane.showInputDialog("Ingresa tu saldo inicial:");

            //Se verifica que el saldo sea un valor válido.
            try {
                saldo = Double.parseDouble(saldoInicialStr);
                saldoValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor ingresa un número.");
            }
        }

        boolean continuar = true;

        while (continuar) {
            String menu = "¡Bienvenid@!\n"
                    + "\nMenú Principal:\n"
                    + "1. Consultar Saldo\n"
                    + "2. Realizar Depósito\n"
                    + "3. Realizar Retiro\n"
                    + "4. Calcular Intereses\n"
                    + "5. Salir\n"
                    + "\nElige una opción entre (1-5):";
            String seleccion = JOptionPane.showInputDialog(menu);

            if (seleccion == null) {
                continue;
            }

            switch (seleccion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Tu saldo actual es: $" + saldo);
                    break;

                case "2":
                    String depositoStr = JOptionPane.showInputDialog("Ingresa la cantidad a depositar:");
                    //Se verifica que el valor a depositar sea válido.
                    try {
                        double deposito = Double.parseDouble(depositoStr);
                        saldo += deposito;
                        JOptionPane.showMessageDialog(null, "Depósito exitoso. Tu nuevo saldo es: $" + saldo);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor ingresa un número.");
                    }
                    break;

                case "3":
                    String retiroStr = JOptionPane.showInputDialog("Ingresa la cantidad a retirar:");
                    //Se verifica que el valor a retirar sea válido.
                    try {
                        double retiro = Double.parseDouble(retiroStr);
                        if (retiro > saldo) {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente. No se puede realizar el retiro.");
                        } else {
                            saldo -= retiro;
                            JOptionPane.showMessageDialog(null, "Retiro exitoso. Tu nuevo saldo es: $" + saldo);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor ingresa un número.");
                    }
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "Tus intereses generados son: $" + saldo*tasa);
                    break;

                case "5":
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el servicio. ¡Hasta pronto!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, selecciona una opción entre 1 y 5.");
                    break;
            }
        }

    }
}