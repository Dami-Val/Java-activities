import java.awt.*;

public class Perro {
    String nombre;
    double peso;
    double tamaño;


    public Perro(String nombre, double peso, double tamaño) {
        this.nombre = nombre;
        this.peso = peso;
        this.tamaño = tamaño;
    }

    public void ladrar() {
        System.out.println(this.nombre + " está ladrando. :D");
    }
    public void gruñir() {
        System.out.println(this.nombre + " está gruñiendo >:c.");
    }
    public void defecar() {
        System.out.println(this.nombre + " está defecando iuuu. >_<");
    }






}
