import java.util.Scanner;

public class Automovil  {
    String marca;
    String modelo;
    int anio;
    double kilometraje;

    public Automovil(String marca, String modelo, int anio,
                     double kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;

    }

    public void conducir(){
        Scanner scanf = new Scanner(System.in);

        System.out.println("Ingrese la cantidad que kilometros " +
                "que condujo en su ultima rodada: ");
        double incrementokilometraje = scanf.nextInt();
        double sum = incrementokilometraje + kilometraje;
        System.out.println("Su kilometraje incrementó de "
                + kilometraje + " Km a: " + sum + " Km.");
        kilometraje = sum;

    }

    public void informacion(){
        System.out.println("Marca: [" + marca + "]," +
                " Modelo: [" + modelo + "], Año: [" + anio + "]," +
                " Kilometraje: [" + kilometraje + "] km");


    }
}
