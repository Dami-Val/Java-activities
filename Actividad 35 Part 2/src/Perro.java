public class Perro extends Mamifero implements Domestico{
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    void ladrar(){
        System.out.println("Ladrando...");
    }
}
