public class Perro extends Mamifero {
    String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        if (raza == null || raza.isEmpty()) {
            throw new IllegalArgumentException("La raza del perro no puede ser vacía.");
        }
        this.raza = raza;
    }

    void ladrar(){
        System.out.println("¡Guau!");
    }
}
