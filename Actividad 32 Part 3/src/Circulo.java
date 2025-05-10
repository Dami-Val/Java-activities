public class Circulo extends FiguraGeometrica{
    double radio;
    double PI = 3.1416;

    public Circulo(String color, double radio) {
        super(color);
        if (radio < 0) {
            throw new IllegalArgumentException("Debe ser mayor que 0");
        }
        this.radio = radio;
    }

    void calcularArea(){
        System.out.println("El area es: " +PI*(radio*radio));
    }
}
