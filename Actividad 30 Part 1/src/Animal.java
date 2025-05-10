public class Animal {
    String nombre;

    public Animal(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del animal no puede ser vacío.");
        }
        this.nombre = nombre;
    }

    void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}
