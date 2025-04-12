import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el titular de la cuenta: ");
        String titular = scanner.nextLine();

        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        CuentaBancaria cuenta = new CuentaBancaria(titular, numeroCuenta, saldo);

        boolean salir = false;

        while (!salir) {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar detalles de la cuenta");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Clasificar cuenta");
            System.out.println("5. Cambiar titular o número de cuenta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1:
                    cuenta.mostrarDetalles();
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    try {
                        cuenta.depositar(montoDeposito);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    try {
                        cuenta.retirar(montoRetiro);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    cuenta.clasificarCuenta();
                    break;
                case 5:
                    System.out.println("1. Cambiar titular");
                    System.out.println("2. Cambiar número de cuenta");
                    System.out.print("Seleccione una opción: ");
                    int subopcion = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (subopcion) {
                        case 1:
                            System.out.print("Ingrese el nuevo titular: ");
                            String nuevoTitular = scanner.nextLine();
                            try {
                                cuenta.setTitular(nuevoTitular);
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.print("Ingrese el nuevo número de cuenta: ");
                            String nuevoNumeroCuenta = scanner.nextLine();
                            try {
                                cuenta.setNumeroCuenta(nuevoNumeroCuenta);
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}