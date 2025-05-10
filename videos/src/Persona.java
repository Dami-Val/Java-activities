public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void mostrarDatos(){
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
    }

}
