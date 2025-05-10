public class Cuadrado extends Figura{
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    void calcularPerimetro() {
        super.calcularPerimetro();
        System.out.println(lado*4);
    }
}
