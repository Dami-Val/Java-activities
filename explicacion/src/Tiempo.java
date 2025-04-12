import java.util.Scanner;

public class Tiempo {
    int horas = 0;
    int minutos = 0;
    int segundos = 0;

    Scanner scanf = new Scanner(System.in);

    public Tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

    }

    public void sumarHoras(){
        System.out.println("\nSección de Suma de El Tiempo en Java!." +
                "\n----------------------------------------\n" +
                "\n Nota: Ingrese sus horas en formato 24hrs ejemplo:\n" +
                "13:45:23.\n\nIngrese primero las horas que va sumar: ");
        int horasSum = scanf.nextInt();
        if (horasSum < 0 || horasSum > 23 ){
            System.out.println("Error!: Ingrese una hora entre 0 y 23");
            horasSum = scanf.nextInt();
        }

        System.out.println("\nIngrese ahora los minutos que va sumar: ");
        int minutosSum = scanf.nextInt();

        if (minutosSum < 0 || minutosSum > 59 ){
            System.out.println("Error!: Ingrese un minuto entre 0 y 59");
            minutosSum = scanf.nextInt();
        }

        System.out.println("\n Finalmente, ingrese los segundos que va sumar: ");
        int segundosSum = scanf.nextInt();

        if (segundosSum < 0 || segundosSum > 59 ) {
            System.out.println("Error!: Ingrese un segundo entre 0 y 59");
            segundosSum = scanf.nextInt();
        }

        int SumHH  = horas + horasSum;
        int SumMM  = minutos + minutosSum;
        int SumSS  = segundos + segundosSum;


        System.out.println("La suma de las horas actules es las: " + SumHH + ":" + SumMM + ":" + SumSS + " ");

    }

    public void mostrarTiempo(){
        System.out.println("Son las: " + horas + ":" + minutos + ":" + segundos + " ");
    }

}
