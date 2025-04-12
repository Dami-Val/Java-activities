import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

            int horas = 0;
            int minutos = 0;
            int segundos = 0;

        System.out.println("\nBienvenido a El Tiempo en Java!." +
                    "\n----------------------------------------\n" +
                    "\n Nota: Ingrese sus horas en formato 24hrs ejemplo:\n" +
                    "13:45:23.\n\nIngrese primero las horas: ");
            horas = scanf.nextInt();

            if (horas < 0 || horas > 23 ){
                System.out.println("Error!: Ingrese una hora entre 0 y 23");
            }

            System.out.println("\nIngrese ahora los minutos: ");
            minutos = scanf.nextInt();

            if (minutos < 0 || minutos > 59 ){
                System.out.println("Error!: Ingrese un minuto entre 0 y 59");
            }

            System.out.println("\n Finalmente, ingrese los segundos: ");
            segundos = scanf.nextInt();

            if (segundos < 0 || segundos > 59 ) {
                System.out.println("Error!: Ingrese un segundo entre 0 y 59");
            }

        Tiempo temp1 = new Tiempo(horas,minutos,segundos);

        temp1.mostrarTiempo();
        temp1.sumarHoras();
        temp1.mostrarTiempo();

    }
}

