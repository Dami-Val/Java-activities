public class Mamifero extends  Animal {
    int edad;

    public Mamifero(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }

    void alimentarse(){
        System.out.println("El mamífero se alimenta");
    }
}
