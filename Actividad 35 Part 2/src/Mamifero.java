public class Mamifero extends Animal  {
    int edad;

    public Mamifero(String nombre, int edad) {
        super(nombre);
        if (edad < 0){
            throw new IllegalArgumentException("Debe ser mayor que 0");
        }
        this.edad = edad;
    }

    void alimentarse(){
        System.out.println("Alimentandose...");
    }
}
