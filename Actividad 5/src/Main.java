import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número para la tabla de multiplicar: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: El número debe ser un entero positivo.");
            return;
        }

        System.out.print("Ingrese el inicio del rango: ");
        int start = scanner.nextInt();
        System.out.print("Ingrese el fin del rango: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Error: El inicio del rango debe ser menor o igual al fin del rango.");
            return;
        }

        System.out.println("--- Tabla de Multiplicar del " + n + " ---");
        for (int i = start; i <= end; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }
}

// SALIDA:

//        C:\Users\damva\.jdks\openjdk-23.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.3\lib\idea_rt.jar=22268:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\damva\IdeaProjects\Actividad 5\out\production\Actividad 5" Main
//        Ingrese el número para la tabla de multiplicar: 5
//        Ingrese el inicio del rango: 1
//        Ingrese el fin del rango: 8
//        --- Tabla de Multiplicar del 5 ---
//        5 x 1 = 5
//        5 x 2 = 10
//        5 x 3 = 15
//        5 x 4 = 20
//        5 x 5 = 25
//        5 x 6 = 30
//        5 x 7 = 35
//        5 x 8 = 40
//
//        Process finished with exit code 0