public class Circulo extends Figura{
    double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    void mostrarColor() {
        super.mostrarColor();
    }
    void calcularArea() {
        System.out.println("El area es: " + 3.1416 *(radio * radio));
    }

}
