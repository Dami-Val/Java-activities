public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio ni nulo");
        }
        this.nombre = nombre;
        if (edad < 0) {
            throw new IllegalArgumentException("No debe ser negativo");
        }
        this.edad = edad;
    }
}


interface Estudiante  {
    default void estudiar(){
        System.out.println("Estudiando...");
    }
}

interface Trabajador   {
    default void trabajar(){
        System.out.println("Trabajando...");
    }
}


