import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mascota mascota = null;
        boolean salir = false;

        while (!salir){
            System.out.println("Menu\n---------------");
            System.out.println("[1] Crear una nueva mascota");
            System.out.println("[2] Ver los detalles de la mascota");
            System.out.println("[3] Cambiar nombre, especie, edad o peso");
            System.out.println("[4] Clasificar el peso");
            System.out.println("[5] Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la mascota");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el especie de la mascota");
                    String especie = scanner.nextLine();
                    System.out.println("Ingrese la edad de la mascota");
                    int edad = scanner.nextInt();
                    System.out.println("Ingrese el peso de la mascota");
                    double peso = scanner.nextDouble();
                    mascota = new Mascota(nombre, especie, edad, peso);
                    break;
                case 2:
                    if (mascota != null) {
                        mascota.mostrarDetalles();
                    }
                    else {
                        System.out.println("No hay mascota creada.");
                    }
                    break;
                case 3:
                    if (mascota != null) {
                        System.out.print("Ingrese el nuevo nombre de la mascota: ");
                        mascota.setNombre(scanner.nextLine());
                        System.out.print("Ingrese la nueva especie de la mascota: ");
                        mascota.setEspecie(scanner.nextLine());
                        System.out.print("Ingrese la nueva edad de la mascota: ");
                        mascota.setEdad(scanner.nextInt());
                        System.out.print("Ingrese el nuevo peso de la mascota: ");
                        mascota.setPeso(scanner.nextDouble());
                    } else {
                        System.out.println("No hay mascota creada.");
                    }
                case 4:
                    if (mascota != null) {
                        mascota.clasificarPeso();
                    } else {
                        System.out.println("No hay mascota creada.");
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}