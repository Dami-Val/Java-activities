public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser vacio.");
        }
        this.nombre = nombre;
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor que 0");
        }
        this.edad = edad;
    }

    void mostrarDatos(){
        System.out.println("Nombre: [" + nombre + "] \nEdad : [" + edad +"]");
    }
}
