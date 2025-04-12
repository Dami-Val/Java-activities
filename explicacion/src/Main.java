import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroVehicular registro = new RegistroVehicular();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nuevo vehículo");
            System.out.println("2. Buscar vehículo por placa");
            System.out.println("3. Mostrar todos los vehículos registrados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Ingrese el modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Ingrese el año: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese la placa: ");
                    String placa = sc.nextLine();

                    Vehiculo nuevoVehiculo = new Vehiculo(marca, modelo, anio, placa);
                    registro.agregarVehiculo(nuevoVehiculo);
                    break;

                case 2:
                    System.out.print("Ingrese la placa del vehículo: ");
                    String placaBuscar = sc.nextLine();
                    Vehiculo encontrado = registro.buscarVehiculoPorPlaca(placaBuscar);
                    if (encontrado != null) {
                        encontrado.mostrarDetalles();
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;

                case 3:
                    registro.mostrarTodosVehiculos();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}