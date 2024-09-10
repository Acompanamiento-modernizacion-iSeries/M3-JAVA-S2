import java.math.BigDecimal;

// esta cuenta hereda de la clase Cuenta, por ello requiere de la palabra reservada extends seguida del nombre de la clase de la que hereda
public class CuentaAhorros extends Cuenta{
    // la clase CuentaAhorros hereda los atributos y métodos de la clase Cuenta
    // la clase CuentaAhorros es una subclase de la clase Cuenta, por lo que puede acceder a los atributos y métodos de la clase Cuenta
    // la clase CuentaAhorros puede tener atributos y métodos adicionales a los de la clase Cuenta
    // la clase CuentaAhorros puede sobreescribir los métodos de la clase Cuenta, lo que se conoce como polimorfismo y modifica el comportamiento de los métodos de la clase Cuenta
    // la clase CuentaAhorros puede tener sus propios métodos y atributos
    // la clase CuentaAhorros puede tener sus propios constructores

    // atributos de la clase CuentaAhorros
    private double tasaInteres;

    // constructor de la clase CuentaAhorros
    public CuentaAhorros(String titular, BigDecimal saldo, double tasaInteres) {
        // la palabra reservada super se utiliza para llamar al constructor de la clase padre
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    // método para calcular el interés
    public void calcularInteres() {
        // la palabra reservada super se utiliza para llamar a un método de la clase padre
        BigDecimal interes = super.saldo.multiply(new BigDecimal(tasaInteres));
        super.saldo = super.saldo.add(interes);
    }

    // método para imprimir los datos de la cuenta de ahorros
    public void imprimirDatosCuentaAhorros() {
        System.out.println("Titular: " + super.titular);
        System.out.println("Saldo: " + super.saldo);
        System.out.println("Tasa de interés: " + tasaInteres);
    }
}
