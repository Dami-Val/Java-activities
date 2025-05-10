public class Circulo extends Figura {
    double radio;
    double PI = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    void calcularPerimetro() {
        super.calcularPerimetro();
        System.out.println(radio*(PI+PI));
    }
}
