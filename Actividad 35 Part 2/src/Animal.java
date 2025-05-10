public class Animal {
    String nombre;

    public Animal(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("No debe ser nulo ni vacio");
        }
        this.nombre = nombre;
    }

    void hacerSonido(){
        System.out.println("Haciendo sonido...");
    }
}

interface Domestico {
    default void serDomestico(){
        System.out.println("Haciendo cosas de ser domestico...");
    }
}