import java.util.Scanner;

public class CuentaBancaria {
    String titular;
    String numeroCuenta;
    double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void retirar(){
        Scanner scanf = new Scanner(System.in);

        System.out.println("Ingrese la cantidad que desea retirar: ");
        double cantidad1 = scanf.nextInt();

        double retiro = saldo - cantidad1;
        saldo = retiro;
        System.out.println("Usted ha hecho un retiro de: " + cantidad1 + ".\nSu saldo actual tras el retiro es: " + saldo);

    }

    public void depositar(){
        Scanner scanf = new Scanner(System.in);

        System.out.println("Ingrese la cantidad que desea depositar: ");
        double cantidad2 = scanf.nextInt();

        double deposito = saldo + cantidad2;
        saldo = deposito;

        System.out.println("Usted ha hecho un deposito de: " + cantidad2 + ".\nSu saldo actual tras el deposito es: " + saldo);

    }

    public void mostrarSaldo(){
        System.out.println("Su saldo actual es: " + saldo);
    }





}
