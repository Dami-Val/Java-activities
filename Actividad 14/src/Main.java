import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        // Solicitar información del coche al usuario
        System.out.println("Ingrese la marca del coche:");
        String marca = scanf.nextLine();
        System.out.println("Ingrese el modelo del coche:");
        String modelo = scanf.nextLine();
        System.out.println("Ingrese la velocidad máxima del coche (km/h):");
        double velocidadMaxima = scanf.nextDouble();
        System.out.println("Ingrese el gasto de gasolina por litro (litros/km):");
        double gastoGasolinaPorLitro = scanf.nextDouble();

        // Instanciar objeto Coche
        Coche coche = new Coche(marca, modelo, velocidadMaxima, gastoGasolinaPorLitro);

        // Mostrar información del coche
        System.out.println("\nInformación del coche:");
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad máxima: " + coche.getVelocidadMaxima() + " km/h");
        System.out.println("Gasto de gasolina por litro: " + coche.getGastoGasolinaPorLitro() + " litros/km");

        // Preguntar si el usuario desea cambiar algún atributo del coche
        System.out.println("\n¿Quieres cambiar algún atributo del coche? (si/no):");
        scanf.nextLine(); // Consumir la nueva línea
        String respuesta = scanf.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("\n¿Qué atributo te gustaría cambiar?");
            System.out.println("1. Marca");
            System.out.println("2. Modelo");
            System.out.println("3. Velocidad máxima");
            System.out.println("4. Gasto de gasolina por litro");
            System.out.print("Selecciona una opción: ");
            int opcion = scanf.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la nueva marca:");
                    scanf.nextLine(); // Consumir la nueva línea
                    coche.setMarca(scanf.nextLine());
                    break;
                case 2:
                    System.out.println("Ingresa el nuevo modelo:");
                    scanf.nextLine(); // Consumir la nueva línea
                    coche.setModelo(scanf.nextLine());
                    break;
                case 3:
                    System.out.println("Ingresa la nueva velocidad máxima (km/h):");
                    coche.setVelocidadMaxima(scanf.nextDouble());
                    break;
                case 4:
                    System.out.println("Ingresa el nuevo gasto de gasolina por litro (litros/km):");
                    coche.setGastoGasolinaPorLitro(scanf.nextDouble());
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            // Mostrar información actualizada del coche
            System.out.println("\nInformación del coche actualizada:");
            System.out.println("Marca: " + coche.getMarca());
            System.out.println("Modelo: " + coche.getModelo());
            System.out.println("Velocidad máxima: " + coche.getVelocidadMaxima() + " km/h");
            System.out.println("Gasto de gasolina por litro: " + coche.getGastoGasolinaPorLitro() + " litros/km");
        }

        // Solicitar distancia al usuario y calcular el gasto de gasolina
        System.out.println("\nIngrese una distancia (en kilómetros):");
        double distancia = scanf.nextDouble();
        double gastoTotal = coche.calcularGastoDeGasolina(distancia);
        System.out.println("El gasto total de gasolina para " + distancia + " km es: " + gastoTotal + " litros.");

        scanf.close();
    }
}