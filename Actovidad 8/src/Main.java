import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.println("Bienvenido a este banco! Ingrese el titular de la cuenta:");
        String titular = scanf.nextLine();
        System.out.println("Ingrese su numero de cuenta:");
        String nodecuenta = scanf.nextLine();
        System.out.println("Ingrese su saldo actual ");
        double saldo = scanf.nextDouble();

        // Instanciar
        CuentaBancaria titular1 = new CuentaBancaria(titular, nodecuenta, saldo);
        // Llamar metododos
        titular1.retirar();
        titular1.depositar();
        titular1.mostrarSaldo();
    }
}
