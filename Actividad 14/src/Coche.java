public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;
    private double gastoGasolinaPorLitro;

    // Constructor
    public Coche(String marca, String modelo, double velocidadMaxima, double gastoGasolinaPorLitro) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.gastoGasolinaPorLitro = gastoGasolinaPorLitro;
    }


    // Métodos get y set para cada atributo
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    public double getGastoGasolinaPorLitro() {
        return gastoGasolinaPorLitro;
    }
    public void setGastoGasolinaPorLitro(double gastoGasolinaPorLitro) {
        this.gastoGasolinaPorLitro = gastoGasolinaPorLitro;
    }


    // Método para calcular el gasto de gasolina
    public double calcularGastoDeGasolina(double distancia) {
        return distancia * gastoGasolinaPorLitro;
    }
}

