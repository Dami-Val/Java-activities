import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Empleado empleado = null;
        Departamento departamento = null;

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ingresar datos de Empleado");
            System.out.println("2. Ingresar datos de Departamento");
            System.out.println("3. Cambiar atributos de Empleado");
            System.out.println("4. Cambiar atributos de Departamento");
            System.out.println("Presiona 'Escape' para salir");
            System.out.print("Por favor, ingresa una opción: ");
            String opcion = scanf.nextLine();

            if (opcion.equalsIgnoreCase("Escape")) {
                break;
            }

            switch (opcion) {
                case "1":
                    System.out.println("Por favor, ingresa el nombre del empleado:");
                    String nombreEmpleado = scanf.nextLine();
                    System.out.println("Por favor, ingresa la edad del empleado:");
                    int edadEmpleado = scanf.nextInt();
                    System.out.println("Por favor, ingresa el salario del empleado:");
                    double salarioEmpleado = scanf.nextDouble();
                    scanf.nextLine(); // Consumir la nueva línea

                    empleado = new Empleado(nombreEmpleado, edadEmpleado, salarioEmpleado);
                    System.out.println("\nEmpleado creado:");
                    empleado.mostrarDetalles();
                    break;

                case "2":
                    System.out.println("Por favor, ingresa el nombre del departamento:");
                    String nombreDepartamento = scanf.nextLine();
                    System.out.println("Por favor, ingresa el número de empleados del departamento:");
                    int numeroEmpleados = scanf.nextInt();
                    scanf.nextLine(); // Consumir la nueva línea

                    departamento = new Departamento(nombreDepartamento, numeroEmpleados);
                    System.out.println("\nDepartamento creado:");
                    departamento.mostrarInformacion();
                    break;

                case "3":
                    if (empleado != null) {
                        empleado.cambiarAtributos();
                        System.out.println("\nEmpleado actualizado:");
                        empleado.mostrarDetalles();
                    } else {
                        System.out.println("Primero debes ingresar los datos de un empleado.");
                    }
                    break;

                case "4":
                    if (departamento != null) {
                        departamento.cambiarAtributos();
                        System.out.println("\nDepartamento actualizado:");
                        departamento.mostrarInformacion();
                    } else {
                        System.out.println("Primero debes ingresar los datos de un departamento.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanf.close();
    }
}