import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Ingresa el nombre del estudiante: ");
        String name = scanf.nextLine();

        System.out.println("Ingresa la matricula del estudiante: ");
        String matricula = scanf.nextLine();

        System.out.println("\n\nIngresa la calificación 1: ");
        float calf1 = scanf.nextFloat();

        if (calf1 > 10 || calf1 < 0){
            System.out.println("Ingresa la calificación nuevamente." +
                    " Debe ser entre 0 y 10.");
            calf1 = scanf.nextFloat();
        }

        System.out.println("\n\nIngresa la calificación 2: ");
        float calf2 = scanf.nextFloat();

        if (calf2 > 10 || calf2 < 0){
            System.out.println("\n\nIngresa la calificación nuevamente." +
                    " Debe ser entre 0 y 10.");
            calf2 = scanf.nextFloat();
        }

        System.out.println("Ingresa la calificación 3: ");
        float calf3 = scanf.nextFloat();

        if (calf3 > 10 || calf3 < 0){
            System.out.println("Ingresa la calificación nuevamente." +
                    " Debe ser entre 0 y 10.");
            calf3 = scanf.nextFloat();
        }

                    // Istanciar
        Estudiante dami = new Estudiante(name,matricula,calf1,calf2,calf3);

        dami.calcularPromedio();
        dami.mostrarDatos();


    }
}






