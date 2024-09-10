import java.math.BigDecimal;

public class PrincipalPoo {
    public static void main(String[] args) {
        // Crear una instancia de la clase Persona
        Persona persona1 = new Persona("Juan", 25);
        // Llamar al método saludar
        persona1.saludar();
        // Crear una instancia de la clase Persona
        Persona persona2 = new Persona("Karla", 30);
        // Llamar al método saludar
        persona2.saludar();
        // Crear una instancia de la clase Cuenta
        Cuenta cuenta1 = new Cuenta("Juan", new BigDecimal("1000"));
        // Llamar al método depositar
        cuenta1.depositar(new BigDecimal("500"));
        cuenta1.imprimirSaldo();
        cuenta1.retirar(new BigDecimal("200"));
        cuenta1.imprimirSaldo();

        // Imprimir el saldo de la cuenta
        System.out.println("El saldo de la cuenta es: " + cuenta1.saldo);

        // Crear una instancia de la clase CuentaAhorros
        CuentaAhorros cuentaAhorros1 = new CuentaAhorros("Karla", new BigDecimal("2000"), 0.05);
        // Llamar al método calcularInteres
        cuentaAhorros1.calcularInteres();
        // Imprimir los datos de la cuenta de ahorros
        cuentaAhorros1.imprimirDatosCuentaAhorros();

        // Crear una instancia de la clase CuentaAhorros
        CuentaAhorros cuentaAhorros2 = new CuentaAhorros("Pedro", new BigDecimal("3000"), 0.07);
        // Llamar al método calcularInteres
        cuentaAhorros2.calcularInteres();
        // Imprimir los datos de la cuenta de ahorros
        cuentaAhorros2.imprimirDatosCuentaAhorros();
    }
}
