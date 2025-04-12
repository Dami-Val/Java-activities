import java.util.Scanner;

public class CuentaBancaria {
    String titular;
    String numeroCuenta;
    double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }


    public void depositar(){
        Scanner scanf = new Scanner(System.in);

        System.out.println("Ingrese la cantidad que desea depositar: ");
        double cantidad1 = scanf.nextInt();

        double deposito = saldo + cantidad1;
        saldo = deposito;
        System.out.println("Usted ha hecho un depósito de: " + cantidad1 + ".\nSu saldo actual es: " + deposito);

    }


    public void retirar(){
        Scanner scanf = new Scanner(System.in);

        System.out.println("Ingrese la cantidad que desea retirar: ");
        double cantidad2 = scanf.nextInt();

        double retiro = saldo - cantidad2;
        saldo = retiro;
        System.out.println("Usted ha hecho un retiro de: " + cantidad2 + ".\nSu saldo actual es: " + saldo);
    }


    public void mostrarSaldo(){
        System.out.println("Su saldo actual es: " + saldo);
    }


}
