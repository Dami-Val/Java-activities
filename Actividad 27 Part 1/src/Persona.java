public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
