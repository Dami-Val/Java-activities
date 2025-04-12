import java.util.Scanner;

public class Departamento {
    private String nombre;
    private int numeroEmpleados;
    private Empleado[] empleados;

    // Constructor
    public Departamento(String nombre, int numeroEmpleados) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.empleados = new Empleado[numeroEmpleados];
    }


    // Métodos get y set para cada atributo
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }
    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }


    public Empleado[] getEmpleados() {
        return empleados;
    }
    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }


    // Método para clasificar el número de empleados
    public String clasificarNumeroEmpleados() {
        int numDigitos = String.valueOf(numeroEmpleados).length();
        switch (numDigitos) {
            case 1:
                return "1 dígito";
            case 2:
                return "2 dígitos";
            case 3:
                return "3 dígitos";
            default:
                return "Más de 3 dígitos";
        }
    }


    // Método para mostrar la información del departamento
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de empleados: " + numeroEmpleados);
        System.out.println("Clasificación de empleados en el departamento: " + clasificarNumeroEmpleados());
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                empleado.mostrarDetalles();
                System.out.println();
            }
        }
    }


    // Método para cambiar los atributos del departamento
    public void cambiarAtributos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué atributo deseas cambiar?");
        System.out.println("1. Nombre");
        System.out.println("2. Número de empleados");
        System.out.println("3. Volver");
        System.out.print("Por favor, ingresa una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (opcion) {
            case 1:
                System.out.println("Por favor, ingresa el nuevo nombre:");
                setNombre(scanner.nextLine());
                break;
            case 2:
                System.out.println("Por favor, ingresa el nuevo número de empleados:");
                setNumeroEmpleados(scanner.nextInt());
                empleados = new Empleado[numeroEmpleados]; // Reiniciar el arreglo de empleados
                break;
            case 3:
                return;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}