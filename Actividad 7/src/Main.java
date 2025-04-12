import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);



        System.out.println("Hola usuario, ingresa el nombre de tu libro: ");
        String nombre = scanf.nextLine();
        System.out.println("Ingresa el nombre de su autor: ");
        String autor = scanf.nextLine();
        System.out.println("¿Cual fue su fecha de publicación?: ");
        int fecha = scanf.nextInt();

        // Instanciar
        Libro Libro1 = new Libro(nombre, autor, fecha);
        // Llamar al metodo
        Libro1.Resumen();
    }
}
