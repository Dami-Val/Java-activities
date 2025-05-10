public class Rectangulo extends Figura {
    double largo;
    double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    void calcularPerimetro() {
        super.calcularPerimetro();
        System.out.println(2 * (largo + ancho));
    }
}
