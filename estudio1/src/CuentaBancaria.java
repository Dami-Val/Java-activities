// Importación de la clase Scanner para entrada de datos por consola
import java.util.Scanner;

// Definición de la clase CuentaBancaria que modela una cuenta bancaria básica
public class CuentaBancaria {
    // Atributos privados que almacenan la información de la cuenta
    private String titular;         // Nombre del titular de la cuenta
    private String numeroCuenta;    // Número identificador de la cuenta
    private double saldo;          // Saldo actual de la cuenta

    // Constructor que inicializa una nueva cuenta con los datos básicos
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Métodos getter y setter para el titular de la cuenta
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Métodos getter y setter para el número de cuenta
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    // Setter que valida que el número de cuenta tenga al menos 5 caracteres
    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && !numeroCuenta.isEmpty() && numeroCuenta.length() >= 5) {
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println(" - Error: Puede que el número de cuenta esté vacío o tenga menos de 5 caracteres. Vuelva a ingresar el dato.");
        }
    }

    // Métodos getter y setter para el saldo
    public double getSaldo() {
        return saldo;
    }
    // Setter que valida que el saldo no sea negativo
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println(" - Error: No se permite saldo negativo. Vuelva a ingresar el dato. Se mostrará 0.");
        }
    }

    // Metodo que muestra los detalles actuales de la cuenta
    public void mostrarDetalles() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    // Metodo para realizar depósitos, verifica que el monto sea positivo
    public void depositar(double monto){
        if (monto >0){
            saldo += monto;
            System.out.println("Su deposito ha sido realizado correctamente. Su saldo ahora es de: " + saldo);
        } else {
            System.out.println("Error en la opereacion! Necesita ingresar un monto positivo.");
        }
    }

    // Metodo para realizar retiros, verifica que haya saldo suficiente
    public void retirar(double monto){
        if (saldo > monto){
            saldo -= monto;
            System.out.println("Su retiro ha sido realizado correctamente. Su saldo ahora es de: " + saldo);
        } else {
            System.out.println("Error en la opereacion! Saldo insuficiente.");
        }
    }

    // Metodo que clasifica la cuenta según su saldo en tres categorías: Platinum, Gold o Basic
    public void clasificarCuenta(){
        if (saldo > 100000){
            System.out.println("Su cuenta tiene un saldo mayor a 100,000 por tanto es Platinum.");
        } else if (saldo >= 10000 && saldo <= 99999) {
            System.out.println("Su cuenta tiene un saldo entre 10,000 y 99,999 por tanto es Gold.");
        } else {
            System.out.println("Su cuenta tiene un saldo menor a 10,000 por tanto es Basic.");
        }


    }
}