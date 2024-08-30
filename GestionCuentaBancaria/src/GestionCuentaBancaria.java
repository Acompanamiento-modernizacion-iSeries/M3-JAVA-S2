import com.sun.source.tree.DoWhileLoopTree;

import javax.swing.*;

public class GestionCuentaBancaria {

    public static void main(String[] args) {

       String nombre,opcion;
       int cuenta=0,salirint=0;
       double saldo=0,transaccion=0,interes = 0.05,saldointeres=0;
       boolean salir = true;

        nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        cuenta= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de cuenta"));
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo de la cuenta"));
        if (saldo <=0)
            return;


        do {
            opcion = JOptionPane.showInputDialog("C:Consultar saldo\nD:Depósitos\nR:Retiros\nI:Intereses sobre el saldo");
            switch (opcion){
                case "C":
                    JOptionPane.showMessageDialog(null,"El cliente " + nombre + " con la cuenta "+cuenta+
                    " tiene un saldo total de $"+saldo);
                    System.out.println("Consultar saldo");
                    break;
                case "D":
                    transaccion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del depósito"));
                    if (transaccion>0){
                        saldo += transaccion;
                        System.out.println("Nuevo saldo->"+saldo);
                    }else {
                        JOptionPane.showMessageDialog(null,"Monto de depósito incorrecta");
                    }
                    break;
                case "R":
                    transaccion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del retiro"));
                    if (transaccion>0){
                        saldo -= transaccion;
                        System.out.println("Nuevo saldo->"+saldo);
                    }else {
                        JOptionPane.showMessageDialog(null,"Monto de retiro incorrecta");
                    }
                    break;
                case "I":
                    JOptionPane.showMessageDialog(null,"el interés es de "+interes);
                    saldointeres = saldo;
                    saldointeres *= interes;
                    JOptionPane.showMessageDialog(null,"el interés "+interes+
                            " aplicado a tu saldo actual $"+saldo+ " es de $"+saldointeres);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no válida");
                    System.out.println("Opción no válida");
                    break;
            }
            salirint = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
            salir = (salirint == JOptionPane.YES_OPTION);
        } while (salir);
    }
}
