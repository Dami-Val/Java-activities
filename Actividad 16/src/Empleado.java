import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;


    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }


    // Métodos get y set para cada atributo
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    // Método para clasificar el salario
    public String clasificarSalario() {
        if (salario > 50000) {
            return "Alta";
        } else if (salario >= 10000 && salario <= 49999) {
            return "Media";
        } else {
            return "Baja";
        }
    }


    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Clasificación salarial: " + clasificarSalario());
    }


    // Método para cambiar los atributos del empleado
    public void cambiarAtributos() {
        Scanner scanf = new Scanner(System.in);
        System.out.println("¿Qué atributo deseas cambiar?");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        System.out.println("4. Volver");
        System.out.print("Por favor, ingresa una opción: ");
        int opcion = scanf.nextInt();
        scanf.nextLine(); // Consumir la nueva línea


        switch (opcion) {
            case 1:
                System.out.println("Por favor, ingresa el nuevo nombre:");
                setNombre(scanf.nextLine());
                break;
            case 2:
                System.out.println("Por favor, ingresa la nueva edad:");
                setEdad(scanf.nextInt());
                break;
            case 3:
                System.out.println("Por favor, ingresa el nuevo salario:");
                setSalario(scanf.nextDouble());
                break;
            case 4:
                return;
            default:
                System.out.println("Opción no válida.");
                break;


        }
    }
}