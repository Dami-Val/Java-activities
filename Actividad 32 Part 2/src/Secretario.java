public class Secretario extends Persona{
    String oficina;

    public Secretario(String nombre, int edad, String oficina) {
        super(nombre, edad);
        if (oficina.isEmpty()) {
            throw new IllegalArgumentException("La oficina no debe ser vacia");
        }
        this.oficina = oficina;
    }
    void atender(){
        System.out.println("El secretario atiende en la oficina");
    }
}

