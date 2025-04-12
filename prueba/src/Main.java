import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el nombre del alumno : ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese matrícula : ");
        String matricula = scanner.nextLine();
        System.out.println("Ingrese calificación Parcial 1 : ");
        double calif1 = scanner.nextDouble();
        System.out.println("Ingrese calificación Parcial 2 : ");
        double calif2 = scanner.nextDouble();
        System.out.println("Ingrese calificación Parcial 3 : ");
        double calif3 = scanner.nextDouble();
        Alumno alumno = new Alumno(nombre, matricula, calif1, calif2, calif3);
        alumno.mostrarInformacion();
        alumno.calcularPromedioFinal();
        alumno.mostrarEvaluacion();



        boolean salir = false;
        while (!salir) {
            System.out.println("------------------------------");
            System.out.println(" Menu de modificacion escolar ");
            System.out.println("------------------------------");
            System.out.println("[1] Nombre");
            System.out.println("[2] Matricula");
            System.out.println("[3] Calificacion Parcial 1");
            System.out.println("[4] Calificacion Parcial 2");
            System.out.println("[5] Calificacion Parcial 3");
            System.out.println("[6] Mostrar datos");
            System.out.println("[7] Salir");


            System.out.println("--------------------------------");
            System.out.println("Elija una opción para continuar: ");
            int option = scanner.nextInt();
            scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingresa el nuevo alumno:");
                    String newalumno = scanner.nextLine();
                    scanner.nextLine();
                    alumno.setNombre(newalumno);
                    break;
                case 2:
                    System.out.println("Ingresa la nueva matricula:");
                    String newmatricula = scanner.nextLine();
                    scanner.nextLine();
                    alumno.setMatricula(newmatricula);
                    break;
                case 3:

                    System.out.println("Ingresa la nueva Calificacion Parcial 1:");
                    double new1 = scanner.nextDouble();
                    alumno.setCalificacionParcial1(new1);
                    scanner.nextLine();

                    break;
                case 4:
                    System.out.println("Ingresa la nueva Calificacion Parcial 2:");
                    double new2 = scanner.nextDouble();
                    alumno.setCalificacionParcial2(new2);
                    scanner.nextLine();

                    break;
                case 5:
                    System.out.println("Ingresa la nueva Calificacion Parcial 3:");
                    double new3 = scanner.nextDouble();
                    alumno.setCalificacionParcial3(new3);
                    scanner.nextLine();

                    break;
                case 6:
                    alumno.mostrarInformacion();
                    break;
                case 7:
                    salir = true;
                    break;


            }
        }

    }
}

