public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        setTitular(titular);
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
    }


    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacío.");
        }
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (titular == null || titular.isEmpty() || numeroCuenta.length() < 5) {
            throw new IllegalArgumentException("El número de cuenta no puede estar vacío y debe tener al menos 5 caracteres.");
        }
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
    }


    public void mostrarDetalles() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser positivo.");
        }
        if (saldo < monto) {
            throw new IllegalArgumentException("No hay suficiente saldo en la cuenta.");
        }
        saldo -= monto;
    }

        public void clasificarCuenta () {
            if (saldo > 100000) {
                System.out.println("La cuenta es Premium.");
            } else if (saldo >= 10000 && saldo <= 99999) {
                System.out.println("La cuenta es Estándar.");
            } else if (saldo < 10000) {
                System.out.println("La cuenta es Básica.");
            }
        }

}
