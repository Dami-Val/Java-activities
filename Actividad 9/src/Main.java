import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Bienvenido a calculadora de rectangulos." +
                "\nIngrese su base: ");
        double base = scanf.nextDouble();
        System.out.println("Ingrese su altura: ");
        double altura = scanf.nextDouble();


        //  Instanciar
        Rectangulo rec1 = new Rectangulo(base, altura);
        //  Llamar al Metodo
        rec1.calcularArea();
        rec1.calcularPerimetro();



    }
}
