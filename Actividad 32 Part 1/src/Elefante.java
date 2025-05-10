public class Elefante extends Animal{
    double peso;

    public Elefante(String nombre, int edad, double peso) {
        super(nombre, edad);
        if (peso < 0) {
            throw new IllegalArgumentException("El peso debe ser positivo");
        }
        this.peso = peso;
    }

        void usarTrompa(){
        System.out.println("El elefante usa su trompa");
    }
}
