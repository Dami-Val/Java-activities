public class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no debe ser vacio.");
        }
        this.nombre = nombre;
        if (edad < 0) {
            throw new IllegalArgumentException("El numero debe ser positivo");
        }
        this.edad = edad;
    }
    void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}
