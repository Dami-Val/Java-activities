public class Persona {
    String nombre;
    int edad;
    double peso;
    double altura;

    public Persona(String nombre, int edad, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

    }

    public void mostrarDatos(){
        System.out.println("El nombre de la persa es: " + nombre + "\nSu edad es:" + edad + "\nSu peso es:" + peso + "\nSu altura es:" + altura);


    }
}
