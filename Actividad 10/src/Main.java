import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instanciar
        Automovil porshe911 = new Automovil("Porshe",
                "911 3.2 Carrera", 1984, 30000);
        // Llamar al Metodo
        porshe911.conducir();
        porshe911.informacion();



    }
}
