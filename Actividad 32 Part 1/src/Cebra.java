public class Cebra extends Animal{
    int rayas;

    public Cebra(String nombre, int edad, int rayas) {
        super(nombre, edad);
        if (rayas < 0) {
            throw new IllegalArgumentException("El numero de rayas debe ser positivo");
        }
        this.rayas = rayas;
    }

    void correr(){
        System.out.println( "La cebra corre rápidamente");
    }
}
