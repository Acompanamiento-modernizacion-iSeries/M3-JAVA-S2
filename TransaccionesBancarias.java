import javax.swing.*;

public class TransaccionesBancarias {
    public static void main(String[] args) {

        String usuario = "";
        String Cuenta = "";
        double saldo = 0;
        double valordeposito;
        double vaorretiro;
        double tasaInteres = 0.09;
        while (usuario.isEmpty()) {
            usuario = JOptionPane.showInputDialog("Por favor ingresa tu usuario");
            if (usuario.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }
        }

        while (Cuenta.isEmpty()) {
            Cuenta = JOptionPane.showInputDialog("Por favor ingresa tu número de cuenta");
            if (Cuenta.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Número de cuenta bancaria");
            }
        }

        while (saldo <= 0) {
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingresa el saldo actual"));
            if (saldo <= 0) {
                JOptionPane.showMessageDialog(null, "Ingrese un saldo cotrrecto");
            }
        }

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(" 1 - consultar saldo\n" +
                    " 2 - realizar depósitos\n" +
                    " 3 - realizar retiros\n" +
                    " 4 - calcular intereses sobre el saldo\n" +
                    " 5 - Salir"));
            switch (opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "El saldo de su cuenta es " + saldo);
                    break;
                case 2:
                    valordeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del depósito"));
                    saldo += valordeposito;
                    JOptionPane.showMessageDialog(null, "Depósito realizado correctamente");
                    break;
                case 3:
                    vaorretiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del retiro"));
                    saldo -= vaorretiro;
                    if (saldo < 0){
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                    }else{
                        JOptionPane.showMessageDialog(null, "retiro realizado correctamente");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El valor de interes sobre el sados es de " +
                            saldo * tasaInteres);
                    break;
                case 5:
                    break;
                default: JOptionPane.showMessageDialog(null, "Opción incorrecta");
            }
            if (opcion == 5){
                break;
            }

        }
    }
}
