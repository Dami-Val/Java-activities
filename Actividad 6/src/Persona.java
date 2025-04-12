public class Persona {
    // Atributos de la clase Persona
    String nombre;
    int edad;
    double peso;
    double altura;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad, double peso, double altura) {
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    // Metodo para mostrar los datos de la persona
    public void mostrarDatos() {
        // Imprime los datos de la persona usando printf para formatear la salida
        System.out.printf("El nombre de la persona es: " + nombre + "\nSu edad es: " + edad + "\nSu peso: " + peso + " kg\nAltura: " + altura);
    }
}