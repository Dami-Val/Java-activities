import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String name;
        int age;
        float height;
        char civilState;
        boolean under18YearsOld;

        Scanner scanf = new Scanner(System.in);
        System.out.printf("Ingresa: Nombre completo: ");
        name = scanf.nextLine();
        System.out.printf("Ingresa: Edad: ");
        age = scanf.nextInt();
        System.out.printf("Ingresa: Altura: ");
        height =  scanf.nextFloat();
        System.out.printf("Ingresa: Estado civil: ");
        civilState = scanf.next().charAt(0);
        System.out.printf("Ingresa: Es mayor de edad: (true/false)");
        under18YearsOld = scanf.nextBoolean();





        System.out.printf("Nombre completo: %s\n", name);
        System.out.printf("Edad: %d\n", age);
        System.out.printf("Altura: %f\n", height);
        System.out.printf("Estado civil: %c\n", civilState);
        System.out.printf("Es mayor de edad: %s\n", under18YearsOld);
        System.out.printf("Mensaje inspirador: Yo %s, con la edad %s, pasaré con 10 la materia.\n", name, age);



    }
}