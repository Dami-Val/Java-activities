import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        float calf1;
        float calf2;
        float calf3;
        float calf4;
        float calf5;

        Scanner scanf = new Scanner(System.in);
        System.out.printf("Ingresa la calificación 1: ");
        calf1 = scanf.nextFloat();
        System.out.printf("Ingresa la calificación 2: ");
        calf2 = scanf.nextFloat();
        System.out.printf("Ingresa la calificación 3: ");
        calf3 = scanf.nextFloat();
        System.out.printf("Ingresa la calificación 4: ");
        calf4 = scanf.nextFloat();
        System.out.printf("Ingresa la calificación 5: ");
        calf5 = scanf.nextFloat();

        float media = (calf1 + calf2 + calf3 + calf4 + calf5)/5;

        System.out.printf("Su promedio es: %f\n", media);
        if (calf1 == 0){
            System.out.printf("Necesitas recursar el semestre.\n");
        }
        else if (calf2 == 0) {
            System.out.printf("Necesitas recursar el semestre.\n");
        }
        else if (calf3 == 0) {
            System.out.printf("Necesitas recursar el semestre.\n");
        }
        else if (calf4 == 0) {
            System.out.printf("Necesitas recursar el semestre.\n");
        }
        else if (calf5 == 0) {
            System.out.printf("Necesitas recursar el semestre.\n");
        }

        if (media >= 6){
            System.out.printf("Aprobaste la materia.\n");
        }
        else
            System.out.printf("No aprobaste la materia.\n");





    }
}

// SALIDA:
//C:\Users\damva\.jdks\openjdk-23.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.3\lib\idea_rt.jar=3273:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\damva\IdeaProjects\Actividad 4\out\production\Actividad 4" Main
//Ingresa la calificación 1: 9
//Ingresa la calificación 2: 8
//Ingresa la calificación 3: 6
//Ingresa la calificación 4: 5
//Ingresa la calificación 5: 9
//Su promedio es: 7.400000
//Aprobaste la materia.
