public class Vehiculo {
    String modelo;

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    void mover(){
        System.out.println("Moviendose...");
    }
}

interface Acuatico {
    default void navegar(){
        System.out.println("Navegando...");
    }
}