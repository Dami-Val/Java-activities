public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no debe ser vacio");
        }
        this.nombre = nombre;
        if (edad < 18) {
            throw new IllegalArgumentException("Debe ser mayor o igual a 18");
        }
        this.edad = edad;
    }

    void saludar(){
        System.out.println("Hola, soy ["+nombre+"]");
    }
}
