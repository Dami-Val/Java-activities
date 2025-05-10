

interface Carnivoro  {
    default void comerCarne(){
        System.out.println("Comiendo Carne...");
    };
}
interface Herbivoro  {
    default void comerPlantas(){
        System.out.println("Comiendo plantas...");
    };
}

interface Omnivoro  {
    default void comerDeTodo(){
        System.out.println("Comiendo carne, plantas e insectos...");
    };
}

class Animal {
    String nombre;

    public Animal(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("No debe ser vacio");
        }
        this.nombre = nombre;
    }
}


public class AnimalOmnivoro  extends Animal implements Carnivoro, Herbivoro, Omnivoro {
    public AnimalOmnivoro(String nombre) {
        super(nombre);
    }
}


