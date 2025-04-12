public class Coche {
    //atributos
    private String marca;
    private String modelo;
    private double velocidadMaxima;
    private double gastoGasolinaPorLitro;

    // contructor
    public Coche(String marca, String modelo, double velocidadMaxima, double gastoGasolinaPorLitro) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.gastoGasolinaPorLitro = gastoGasolinaPorLitro;
    }


    // metodos get
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getGastoGasolinaPorLitro() {
        return gastoGasolinaPorLitro;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }


    // metodos set
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setGastoGasolinaPorLitro(double gastoGasolinaPorLitro) {
        this.gastoGasolinaPorLitro = gastoGasolinaPorLitro;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para calcular el gasto de gasolina
    public double calcularGastoDeGasolina(double distancia) {
        return distancia * gastoGasolinaPorLitro;
    }
}
