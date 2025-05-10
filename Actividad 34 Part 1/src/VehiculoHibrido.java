interface Terrestre  {
    default void moverPorTierra(){
        System.out.println("Moviendose por tierra...");
    };
}
interface Aereo   {
    default void volar(){
        System.out.println("Volando...");
    };
}
interface Acutico   {
    default void navegar(){
        System.out.println("Navegando por tierra...");
    };
}

public class VehiculoHibrido implements Terrestre, Aereo , Acutico  {
    String nombre;


    public VehiculoHibrido(String nombre) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio");
        }
        this.nombre = nombre;

    }
}

