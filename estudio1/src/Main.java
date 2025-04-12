// Importación de la clase Scanner para permitir la entrada de datos por consola
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación de un objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creación de una nueva cuenta bancaria con valores predeterminados
        CuentaBancaria cuenta = new CuentaBancaria("No Asignado", "No Asignado", 0);

        // Solicitud y lectura de datos iniciales de la cuenta
        System.out.println("Ingresa el titular");
        String titular = scanner.nextLine();

        System.out.println("Ingresa el numero de cuenta");
        String numeroCuenta = scanner.nextLine();

        System.out.println("Ingresa el saldo actual");
        double saldo = scanner.nextDouble();

        // Actualización de los datos de la cuenta con la información proporcionada
        cuenta.setTitular(titular);
        cuenta.setNumeroCuenta(numeroCuenta);
        cuenta.setSaldo(saldo);

        // Variable de control para el bucle principal del menú
        boolean salir = false;

        // Bucle principal que muestra el menú y procesa las opciones
        while (!salir){
            // Visualización del menú principal con las opciones disponibles
            System.out.println("\n---------------------------------------------");
            System.out.println("                 Menú del banco");
            System.out.println("---------------------------------------------");
            System.out.println("[1] Mostrar detalles de la cuenta");
            System.out.println("[2] Depositar dinero");
            System.out.println("[3] Retirar dinero");
            System.out.println("[4] Clasificar cuenta");
            System.out.println("[5] Cambiar titular o número de cuenta");
            System.out.println("[6] Salir");
            System.out.println("---------------------------------------------");
            System.out.println("Elija una opción para continuar: ");

            // Lectura de la opción seleccionada por el usuario
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer del scanner

            // Estructura switch para manejar las diferentes opciones del menú
            switch (opcion){
                case 1: // Opción para mostrar los detalles de la cuenta
                    cuenta.mostrarDetalles();
                    break;
                case 2: // Opción para realizar un depósito
                    System.out.println("Ingresa el monto que desea depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3: // Opción para realizar un retiro
                    System.out.println("Ingresa el monto que desea retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4: // Opción para clasificar la cuenta
                    cuenta.clasificarCuenta();
                    break;
                case 5: // Opción para modificar datos de la cuenta
                    // Variable de control para el submenú
                    boolean subsalir = false;

                    // Bucle del submenú para modificar datos
                    while (!subsalir){
                        // Visualización del submenú de modificación de datos
                        System.out.println("\n---------------------------------------------");
                        System.out.println("   Menú de modificacion de datos del banco");
                        System.out.println("---------------------------------------------");
                        System.out.println("[1] Cambiar titular");
                        System.out.println("[2] Cambiar numero de cuenta");
                        System.out.println("[3] Salir");
                        System.out.println("---------------------------------------------");
                        System.out.println("Elija una opción para continuar: ");

                        // Lectura de la opción del submenú
                        int subopcion = scanner.nextInt();
                        scanner.nextLine(); // Limpia el buffer del scanner

                        // Estructura switch para el submenú
                        switch (subopcion){
                            case 1: // Opción para cambiar el titular
                                System.out.println("Ingresa nuevo el titular: ");
                                String newtitular = scanner.nextLine();
                                cuenta.setTitular(newtitular);
                                break;
                            case 2: // Opción para cambiar el número de cuenta
                                System.out.println("Ingresa el nuevo numero de cuenta: ");
                                String newNumeroCuenta = scanner.nextLine();
                                cuenta.setNumeroCuenta(newNumeroCuenta);
                                break;
                            case 3: // Opción para salir del submenú
                                subsalir = true;
                                break;

                            default: // Manejo de opciones inválidas en el submenú
                                System.out.println("Opción no válida.");
                        }
                    }
                    break;
                case 6: // Opción para salir del programa
                    salir = true;
                    break;
                default: // Manejo de opciones inválidas en el menú principal
                    System.out.println("Opción no válida.");
            }
        }
    }
}