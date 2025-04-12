import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        // Solicitar información del libro al usuario
        System.out.println("Ingrese el título del libro:");
        String titulo = scanf.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanf.nextLine();
        System.out.println("Ingrese el año de publicación del libro:");
        int anioPublicacion = scanf.nextInt();

        // Istanciar objeto Libro
        Libro libro = new Libro(titulo, autor, anioPublicacion);

        // Mostrar información del libro
        System.out.println("\nInformación del libro:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de publicación: " + libro.getAnioPublicacion());

        // Preguntar si el usuario desea cambiar algún atributo del libro
        System.out.println("\n¿Quieres cambiar algún atributo del libro? (sí/no):");
        scanf.nextLine(); // Consumir la nueva línea
        String respuesta = scanf.nextLine();

        if (respuesta.equalsIgnoreCase("sí")) {
            System.out.println("\n¿Qué atributo te gustaría cambiar?");
            System.out.println("1. Título");
            System.out.println("2. Autor");
            System.out.println("3. Año de publicación");
            System.out.print("Selecciona una opción: ");
            int opcion = scanf.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nuevo título:");
                    scanf.nextLine(); // Consumir la nueva línea
                    libro.setTitulo(scanf.nextLine());
                    break;
                case 2:
                    System.out.println("Ingresa el nuevo autor:");
                    scanf.nextLine(); // Consumir la nueva línea
                    libro.setAutor(scanf.nextLine());
                    break;
                case 3:
                    System.out.println("Ingresa el nuevo año de publicación:");
                    libro.setAnioPublicacion(scanf.nextInt());
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            // Mostrar información actualizada del libro
            System.out.println("\nInformación del libro actualizada:");
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año de publicación: " + libro.getAnioPublicacion());
        }

        // Verificar el año de publicación
        libro.verificarAnio();

        scanf.close();
    }
}