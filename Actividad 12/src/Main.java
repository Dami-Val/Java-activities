import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("\nBienvenido " +
                "a calculadora de Circulos." +
                "\n-----------------" +
                "-----------------------\n" +
                "\nIngrese su radio: ");
        double radio = scanf.nextDouble();

        //  Instanciar
        Circulo cir1 = new Circulo(radio);
        //  Llamar al Metodo
        cir1.calcularArea();
        cir1.calcularCircunferencia();




    }
}
