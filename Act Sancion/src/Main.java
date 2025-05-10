public class Main {
    public static void main(String[] args) {

        Circulo Circulo = new Circulo(10);
        Rectangulo Rectangulo = new Rectangulo(10, 5);
        Cuadrado Cuadrado = new Cuadrado(10);

        Circulo.calcularPerimetro();
        Rectangulo.calcularPerimetro();
        Cuadrado.calcularPerimetro();

    }
}