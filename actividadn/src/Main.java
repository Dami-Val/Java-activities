



import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 0;
//        int sum = 0;
//
//        for (int i = 11;i >= 1; i--){
//            System.out.printf("i = %s\n", i);
//        }
//
//
//
//
//
//    }
//}




//public class Main {
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 0;
//        int sum = 0;
//
//        for (int i = 11;i >= 1; i--){
//            System.out.printf("i = %s\n", i);
//        }
//
//
//
//
//
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        int n_start = 0;
//        int n_end = 0;
//
//        Scanner scanf = new Scanner(System.in);
//        System.out.println("Ingrese un el primer numero");
//        n_start = scanf.nextInt();
//        System.out.println("Ingrese un el ultimo numero");
//        n_end = scanf.nextInt();
//
//        for (int i = n_start;i <= n_end; i++){
//            System.out.printf("%s\n", i);
//        }
//
//
//    }
//}




import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        int n_start = 0;
//        int n_end = 0;
//
//        Scanner scanf = new Scanner(System.in);
//        System.out.println("Ingrese un el primer numero");
//        n_start = scanf.nextInt();
//        System.out.println("Ingrese un el ultimo numero");
//        n_end = scanf.nextInt();
//
//        for (int i = n_start;i >= n_end; i--){
//            if (i <= n_end) {
//                System.out.printf("error: el numero debe ser menor %s\n", i);
//
//            }
//            else System.out.printf("%s\n", i);
//
//        }
//
//    }
//}

//Falto RESOLVER


//public class Main {
//    public static void main(String[] args) {
//        int n_start = 0;
//        int n_end = 0;
//
//        Scanner scanf = new Scanner(System.in);
//        System.out.println("Ingrese el primer numero:");
//        n_start = scanf.nextInt();
//        System.out.println("Ingrese el ultimo numero:");
//        n_end = scanf.nextInt();
//
//        // Verificar y ajustar el orden de los números si es necesario
//        if (n_start > n_end) {
//            int temp = n_start;
//            n_start = n_end;
//            n_end = temp;
//        }
//
//        // Imprimir los números en el rango
//        for (int i = n_start; i <= n_end; i++) {
//            if (i == n_end){
//                System.out.println("Error no se puede porque es el mismo numero");
//            }
//            else
//                System.out.printf("%d\n", i);
//        }
//    }
//}
//
//



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float note1 = 0;
        float note2 = 0;
        float note3 = 0;
        float note4 = 0;
        float media = 0;

        Scanner scanf = new Scanner(System.in);
        System.out.printf("Ingrese su calificación 1:");
        note1 = scanf.nextFloat();
        System.out.printf("Ingrese su calificación 2:");
        note2 = scanf.nextFloat();
        System.out.printf("Ingrese su calificación 3:");
        note3 = scanf.nextFloat();
        System.out.printf("Ingrese su calificación 4:");
        note4 = scanf.nextFloat();
        media = (note1 + note2 + note3 + note4) / 4;

        if (media == 10) {
            System.out.println("Excelente");
        } else if (media >= 7 && media <= 9.9) {
            System.out.println("Bien");
        } else if (media >= 6 && media <= 6.9) {
            System.out.println("Estudia más");
        } else {
            System.out.println("Haz una plana");
        }
    }
}