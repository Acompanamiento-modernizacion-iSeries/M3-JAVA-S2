public class Persona {

    // las clases son plantillas para crear objetos, en este caso la clase Persona es una plantilla para crear objetos
    // una instancia es un objeto creado a partir de una clase
    // la diferencia entre objeto y clase es que la clase es la plantilla y el objeto es la instancia de esa plantilla
    // las clases tienen atributos y métodos, los atributos son las características de la clase y los métodos son las acciones que puede realizar la clase

    private String nombre;
    private int edad;
    private static int contadorPersonas;

    public Persona() {
        // constructor vacío
        incrementarContadorPersonas();
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        incrementarContadorPersonas();
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años");
    }

    // incrementar el contador de personas
    public static void incrementarContadorPersonas() {
        contadorPersonas++;
    }

    // obtener el contador de personas
    public static int obtenerContadorPersonas() {
        return contadorPersonas;
    }
}
