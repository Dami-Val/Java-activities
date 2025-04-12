import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        float PI = 3.1416f;
        float r = 0;
        float h = 0;

    Scanner scanf = new Scanner(System.in);
    System.out.printf("Ingresa el radio: ");
    r = scanf.nextFloat();
    System.out.printf("Ingresa la altura: ");
    h = scanf.nextFloat();
    float area = 2*PI*r*(r+h);

    System.out.printf("El area del cilindro es: %f", area);

//    Salida:
//        C:\Users\damva\.jdks\openjdk-23.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.3\lib\idea_rt.jar=2926:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\damva\IdeaProjects\Actividad3\out\production\Actividad3 Main
//        Ingresa el radio: 5
//        Ingresa la altura: 10
//        El area del cilindro es: 471.239990
//        Process finished with exit code 0

    }
}
