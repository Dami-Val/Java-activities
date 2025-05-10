public class Triangulo extends FiguraGeometrica {
    double base;
    double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        if (base < 0) {
            throw new IllegalArgumentException("Debe ser mayor que 0");
        }
        this.base = base;
        if (altura < 0) {
            throw new IllegalArgumentException("Debe ser mayor que 0");
        }
        this.altura = altura;
    }

    void calcularArea(){
        System.out.println("El area es: "+(base * altura) / 2);

    }
}
