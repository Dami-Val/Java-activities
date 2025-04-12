public class Gato {
    public String nombre;
    public double peso;
    public double tamano;
    // Constructor de la clase Gato: inicializa los atributos al crear un objeto
    public Gato(String nombre, double peso, double tamano) {
        this.nombre = nombre;
        this.peso = peso;
        this.tamano = tamano;
    }
    public void hacerSonido() {
        System.out.println(this.nombre + " dice: ¡Miau!");
    }
    public void darComer() {
        System.out.println("Le estás dando comida a " + this.nombre);
    }
    public void ronronear() {
        System.out.println(this.nombre + " está ronroneando... ¡Mmmmmm!");
    }
}