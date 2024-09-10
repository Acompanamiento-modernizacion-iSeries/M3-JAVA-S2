import java.math.BigDecimal;

public class Cuenta {
    // pilar uno: abstracción, las clases son plantillas para crear objetos y los objetos son instancias de una clase
    // pilar dos: encapsulamiento, los atributos de la clase son privados y los métodos son públicos, por lo que los atributos no se pueden modificar directamente
    // pilar tres: herencia, una clase puede heredar de otra clase, la clase hija hereda los atributos y métodos de la clase padre
    // pilar cuatro: polimorfismo, una clase puede tener varios métodos con el mismo nombre pero con diferentes parámetros, sirve para reutilizar código

    // atributos de la clase
    String titular;
    BigDecimal saldo;

    // constructor de la clase Cuenta sin parámetros
    public Cuenta() {
    }

    // constructor de la clase Cuenta con dos parámetros
    public Cuenta(String titular, BigDecimal saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String obtenerTitular() {
        return titular;
    }

    public void asignarTitular(String titular) {
        this.titular = titular;
    }

    public BigDecimal obtenerSaldo() {
        return saldo;
    }

    public void asignarSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void depositar(BigDecimal monto) {
        saldo = saldo.add(monto);
    }

    public void imprimirSaldo() {
        System.out.println("El saldo de la cuenta es: " + saldo);
    }

    public void imprimirTitular() {
        System.out.println("El titular de la cuenta es: " + titular);
    }

    public void imprimirDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public void transferir(Cuenta cuentaDestino, BigDecimal monto) {
        saldo = saldo.subtract(monto);
        cuentaDestino.saldo = cuentaDestino.saldo.add(monto);
    }

    public void transferir(Cuenta cuentaDestino, BigDecimal monto, BigDecimal comision) {
        saldo = saldo.subtract(monto).subtract(comision);
        cuentaDestino.saldo = cuentaDestino.saldo.add(monto);
    }

    public void imprimirTransferencia(Cuenta cuentaDestino, BigDecimal monto) {
        System.out.println("Se transfirieron " + monto + " a la cuenta de " + cuentaDestino.titular);
    }

    public void retirar(BigDecimal monto) {
        BigDecimal saldo = this.obtenerSaldo();
        if (this.saldo.compareTo(monto) == -1) {
            System.out.println("No se puede retirar el monto, saldo insuficiente");
        } else {
            this.saldo = saldo.subtract(monto);
        }
    }
}
