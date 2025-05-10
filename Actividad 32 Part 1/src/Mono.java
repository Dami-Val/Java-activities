public class Mono extends Animal {
    String tipo;

    public Mono(String nombre, int edad, String tipo) {
        super(nombre, edad);
        if (tipo.isEmpty()) {
            throw new IllegalArgumentException("El tipo de mono no debe ser vacio.");
        }
        tipo = tipo;
    }

    void trepar(){
        System.out.println("El mono trepa árboles");
    }
}
