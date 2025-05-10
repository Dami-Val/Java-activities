import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("--- GUITARRA ---");
        System.out.println("Ingrese el volumen de para la Guitarra");
        int volumenGuitarra = scanner.nextInt();
        System.out.println("Ingrese el volumen del costo de mantenimiento base de la Guitarra");
        double costoMantenimientoBaseGuitarra = scanner.nextDouble();
        Guitarra Guitarra = new Guitarra("Stratocaster", volumenGuitarra, costoMantenimientoBaseGuitarra );
        Guitarra.tocar();
        System.out.println("Volumen: " + volumenGuitarra);
        Guitarra.calcularCostoMantenimiento();



        System.out.println("--- PIANO ---");
        System.out.println("Ingrese el volumen de para el Piano");
        int volumenPiano = scanner.nextInt();
        System.out.println("Ingrese el volumen del costo de mantenimiento base de el Piano");
        double costoMantenimientoBasePiano = scanner.nextDouble();
        Piano Piano = new Piano("Yamaha k98", volumenPiano, costoMantenimientoBasePiano);
        Piano.tocar();
        Piano.calcularCostoMantenimiento();


        System.out.println("t6rfg546irf6rf586r4f58r4e54554556144466677lio  ikygu767oo77888888t6e46 ul.hj,koyiet4rf635d7w98h6");
        System.out.println("--- BATERIA ---");
        System.out.println("Ingrese el volumen de para la Bateria");
        int volumenBateria = scanner.nextInt();
        System.out.println("Ingrese el volumen del costo de mantenimiento base de la Bateria");
        double costoMantenimientoBaseBateria = scanner.nextDouble();
        scanner.close();
        Bateria Bateria = new Bateria("Core", volumenBateria, costoMantenimientoBaseBateria);
        Bateria.tocar();
        Bateria.calcularCostoMantenimiento();


    }
}