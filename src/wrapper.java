import java.math.BigDecimal;

public class wrapper {

    public static void main(String[] args) {
        // los objetos wrapper son objetos que representan tipos primitivos y sirven para encapsularlos
        // el auto-boxing es la conversión automática de un tipo primitivo a un objeto wrapper
        Integer saldo = 1000; // auto-boxing (se convierte el primitivo a objeto) en este caso se convierte a Integer
        Double tasaInteres = 0.05; // este wrapper es para el tipo primitivo double
        Boolean esElegibleParaCredito = true; // este wrapper es para el tipo primitivo boolean

        // BigDecimals no son wrappers, pero son objetos que representan números decimales con precisión arbitraria
        BigDecimal saldoGrande = new BigDecimal("1000");

        int nuevoSaldo = saldo + 1000; // se realiza un downcasting (se convierte el objeto a primitivo)

//        if (esElegibleParaCredito) {
//            System.out.println("Eres elegible para un crédito");
//        } else {
//            System.out.println("No eres elegible para un crédito");
//        }

        esElegibleParaCredito(esElegibleParaCredito);

        // instanciar un objeto de la clase Persona
        Persona persona = new Persona();
        Persona elGoku = new Persona("Goku", 30);
        Persona elVegeta = new Persona("Vegeta", 35);

        persona.saludar();
        elGoku.saludar();
        elVegeta.saludar();

        System.out.println("El número de personas es: " + Persona.obtenerContadorPersonas());

    }

    public static void esElegibleParaCredito(boolean esElegibleParaCredito) {
        if (esElegibleParaCredito) {
            System.out.println("Eres elegible para un crédito");
        } else {
            System.out.println("No eres elegible para un crédito");
        }
    }

}
